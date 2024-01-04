import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int count1 = 0; // 5문제마다 반복 1,2,3,4,5 (5로 나눈 나머지 값 +1)
        int count2 = 0; // 8문제마다 반복 2,1,2,3,2,4,2,5 (짝수 2, 홀수 1,3,4,5)
        int count3 = 0; // 10문제마다 반복 3,3,1,1,2,2,4,4,5,5 (8로 나눈 나머지값을 2로 나눈 몫이 0=3,1=1,2=2,3=4,4=5)
        for(int i = 0; i < answers.length; i++) {
            int a = answers[i];
            if(first(a, i)) count1++;
            if(second(a, i)) count2++;
            if(third(a, i)) count3++;
        }
        // 최대 점수 구하기
        int max = Math.max(count1, Math.max(count2, count3));
        // 최대 점수를 가진 수포자 리스트 생성
        List<Integer> list = new ArrayList<Integer>();
        if(max == count1) list.add(1);
        if(max == count2) list.add(2);
        if(max == count3) list.add(3);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public boolean first(int a, int i) {
        int temp = (i % 5) + 1;
        if(a == temp) {
            return true;
        }
        return false;
    }
    public boolean second(int a, int i) {
        int temp = (i % 8);
        if(temp % 2 != 0) {
            temp /= 2;
            temp++;
            if(temp > 1) {
                temp++;
            }
        } else {
            temp = 2;
        }
        if(a == temp) {
            return true;
        }
        return false;
    }
    public boolean third(int a, int i) {
        int temp = i % 10;
        switch(temp / 2) {
            case 0: if(a == 3) return true; break;
            case 1: if(a == 1) return true; break;
            case 2: if(a == 2) return true; break;
            case 3: if(a == 4) return true; break;
            case 4: if(a == 5) return true; break;
        }
        return false;
    }
}