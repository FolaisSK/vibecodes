import java.util.Arrays;

public class PrefixCommonArray {

    static void main(String[] args) {
        int[] a = {1,3,2,4};
        int[] b = {3,1,2,4};

        System.out.println(Arrays.toString(findThePrefixCommonArray(a,b)));
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] result = new int[n];

        for(int currentIndex = 0; currentIndex < n; currentIndex++){

            int common = 0;

            for(int count = 0; count <= currentIndex; count++){
                for (int index = 0; index <= currentIndex; index++){
                    if(A[count] == B[index]){
                        common++;
                        break;
                    }
                }
            }

            result[currentIndex] = common;
        }

        return result;

    }
}
