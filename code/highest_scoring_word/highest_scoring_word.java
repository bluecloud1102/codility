import java.util.*;

public class Kata {

    public static String high(String s) {
        int result = 0;
        int result_index = 0;
        List<String> words = new ArrayList<String>(Arrays.asList(s.split(" ")));
        int index = 0;
        for(String word : words){
            int r = 0;
            for(int i=0; i< word.length(); i++){
                char c = word.charAt(i);
                r += (Integer.valueOf(c) - 96);
            }
            if(result < r){
                result = r;
                result_index = index;
            }
            index++;
        }
        return words.get(result_index);
    }
}