public class LongestUniqueSubstring {

    static void main() {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s){
        StringBuilder builder = new StringBuilder();
        builder.append(s.substring(0,1));
        System.out.println(builder);
        for(int count = 0; count < s.length() - 1; count++){
            char c = s.charAt(count + 1);
            if(!builder.toString().contains(String.valueOf(c))){
                builder.append(c);
            }

        }
        return builder.length();
    }
}
