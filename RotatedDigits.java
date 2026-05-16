import java.util.stream.IntStream;

public class RotatedDigits {


    static void main() {
        int number = IntStream.rangeClosed(1, 10).sum();
        System.out.println(number);

        int sum = 0;
        for(int count = 1; count <= 10; count++){
            if(count % 2 == 0){
                number = count * 3;
                sum += number;
            }
        }
        System.out.println(sum);

        System.out.println(number = IntStream.rangeClosed(1, 10)
                .filter(n -> n % 2 == 0)
                .map(n -> n*3)
                .sum()
        );

    }
}
