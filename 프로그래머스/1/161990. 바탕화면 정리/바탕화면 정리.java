class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int minX = 100, maxX = 0, minY = 100, maxY = 0;
        for(int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].contains("#")){
                minX = Math.min(minX, i);
                maxX = Math.max(maxX, i+1);
                minY = Math.min(minY, wallpaper[i].indexOf("#"));
                maxY = Math.max(maxY, wallpaper[i].lastIndexOf("#")+1);
            }
        }
        answer = new int[]{minX, minY, maxX, maxY};
        return answer;
    }
}