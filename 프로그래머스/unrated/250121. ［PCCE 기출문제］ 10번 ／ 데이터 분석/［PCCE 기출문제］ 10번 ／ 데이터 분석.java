import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        ArrayList<int[]> list = new ArrayList<int[]>();
        int con = StrToInt(ext); // 정보 기준 index
        int sort = StrToInt(sort_by); // 정렬 기준 index
        for(int i = 0; i < data.length; i++) {
            if(data[i][con] < val_ext) {
                list.add(data[i]);
            }
        }
        answer = new int[list.size()][4];
        int size=0;
        for(int[] temp : list){
            answer[size++] = temp;
        }
        Arrays.sort(answer, Comparator.comparingInt((int[] o) -> o[sort]));
        return answer;
    }
    
    public int StrToInt(String Str) {
        int i = 0;
        switch(Str) {
            case "code": i = 0; break;
            case "date": i = 1; break;
            case "maximum": i = 2; break;
            case "remain": i = 3; break;
        }
        return i;
    }
    
}