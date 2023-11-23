class Solution {
    public String solution(String[] seoul) {
        int location = 0;
        for(int i = 0; i < seoul.length; i++) {
            System.out.println(seoul[i]);
            if(seoul[i].equals("Kim")) {
                location = i;
                break;
            }
        }
        return "김서방은 " + location + "에 있다";
    }
}