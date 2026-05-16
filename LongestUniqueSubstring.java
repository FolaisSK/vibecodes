public class LongestUniqueSubstring {

    static void main() {
        System.out.println(lengthOfLongestSubstring("ohomm"));
    }
    public static int lengthOfLongestSubstring(String s){
        int largest = 1;
        StringBuilder builder = new StringBuilder();
        builder.append(s.substring(0,1));
        for(int index = 0; index < s.length(); index++){
            for(int count = index; count < s.length() - 1; count++) {
                char c = s.charAt(count + 1);
                if (!builder.toString().contains(String.valueOf(c))) {
                    builder.append(c);
                    if (builder.length() > largest) largest = builder.length();
                } else {
                    builder = new StringBuilder();
                    builder.append(s.substring(count, count + 1));
                }
            }

        }
        return largest;
    }
}
