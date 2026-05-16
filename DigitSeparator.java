import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitSeparator {

    static void main() {
        int[] nums = {13,25,77,89};
        System.out.println(Arrays.toString(separateDigits(nums)));
    }

    public static int[] separateDigits(int[] nums){
        List<Integer> result = new ArrayList<>();
        String s;

        for(int count = 0; count < nums.length; count++){
            s = "" + nums[count];
            char[] number = s.toCharArray();

            for(int index = 0; index < number.length; index++){
                result.add(Integer.valueOf(number[index]) - 48);
            }


        }

        int[] output = new int[result.size()];

        for(int i = 0; i < result.size(); i++){
            output[i] = result.get(i);
        }

        return output;
    }
}
