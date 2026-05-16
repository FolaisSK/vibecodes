import java.util.Arrays;

public class SortedArrayMedian {

    static void main() {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] numbers = new int[nums1.length+nums2.length];
        for(int count = 0; count < numbers.length; count++){
            if(count < nums1.length)numbers[count] = nums1[count];
            if(count >= nums1.length) numbers[count] = nums2[count - nums1.length];
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        if(numbers.length % 2 == 0) return ((double) numbers[numbers.length / 2] + numbers[numbers.length/2 - 1]) / 2;
        return numbers[numbers.length / 2 ];
    }
}
