public class RotateString {

    static void main() {
        System.out.println(rotateString("abcde", "cdeab"));
    }
    public static boolean rotateString(String s, String goal) {
        String word = s;

        for(int count = 0; count < s.length(); count++){
            char c = word.charAt(0);
            char[] group = word.toCharArray();
            String w = shifter(group, c);

            if(w.equals(goal)) return true;
            word = charToString(group);
        }
        return false;
    }

    public static String charToString(char[] array){
        StringBuilder builder = new StringBuilder();
        for(char c : array){
            builder.append(c);
        }
        return String.valueOf(builder);
    }

    public static String shifter(char[] array, char last){
        for(int count = 0; count < array.length - 1; count++){
            array[count] = array[count + 1];
        }
        array[array.length - 1] = last;

        return String.valueOf(array);
    }
}
