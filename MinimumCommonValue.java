import java.util.Arrays;

public class MinimumCommonValue {

    static void main(String[] args) {
        int[] nums1 = {6,13,18,18,28,34,37,39,46,50,52,54,62,63,65,66,75,80,97,98};
        int[] nums2 = {10,13,13,19,27,33,40,41,43,46,56,61,69,72,78,79,82,88,91,94};

        System.out.println(getCommon(nums1,nums2));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if (nums1[0] > nums2[0]) {
            for (int count = 0; count < nums1.length; count++) {
                for(int index = 0; index < nums2.length; index++){
                    if (nums1[count] == nums2[index]) return nums2[index];
                }
            }
        }
        if (nums2[0] > nums1[0]) {
            for (int count = 0; count < nums2.length; count++) {
                for(int index = 0; index < nums1.length; index++){
                    if (nums2[count] == nums1[index]) return nums1[index];
                }
            }
        }
        return -1;
    }
}
