import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] empty = new String[1];
        empty[0] = "EMPTY";
        String[] results = myStr.split("[a-c]");
        List<String> strList = new ArrayList<>(Arrays.asList(results));
        strList.removeAll(Arrays.asList("", null));
        results = strList.toArray(new String[strList.size()]);
        if(results.length == 0) {
            return empty;
        } else {
            return results;
        }
    }
}