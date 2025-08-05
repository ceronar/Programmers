import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        HashMap<Integer, Integer> mapX = new HashMap();
        HashMap<Integer, Integer> mapY = new HashMap();
        char[] arrX = X.toCharArray();
        char[] arrY = Y.toCharArray();
        for(int i = 0; i < arrX.length; i++) {
            if(mapX.containsKey((int)(arrX[i]-'0'))){
                int count = (int)mapX.get((int)(arrX[i]-'0'));
                mapX.put((int)(arrX[i]-'0'), count + 1);
            } else {
                mapX.put((int)(arrX[i]-'0'), 1);
                System.out.print((int)(arrX[i]-'0'));
            }
        }
        for(int i = 0; i < arrY.length; i++) {
            if(mapY.containsKey((int)(arrY[i]-'0'))){
                int count = (int)mapY.get((int)(arrY[i]-'0'));
                mapY.put((int)(arrY[i]-'0'), count + 1);
            } else {
                mapY.put((int)(arrY[i]-'0'), 1);
            }
        }
        for(int i = 9; i >= 0; i--) {
            if(mapX.containsKey(i) && mapY.containsKey(i)) {
                int count = Math.min((int)mapX.get(i), (int)mapY.get(i));
                for(int j = 0; j < count; j++) {
                    answer.append(i);
                }
            }
        }
        if(answer.toString().isEmpty()) {
            answer = new StringBuilder("-1");
        } else if(answer.toString().matches("^0+$")){
            answer = new StringBuilder("0");
        }
        return answer.toString();
    }
}