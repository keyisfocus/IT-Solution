import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var scan = new Scanner(System.in)) {
            var n = scan.nextInt();

            var lessThan = 10;
            var d = 1;
            var count = 0;

            for (var i = 0L; count < n; i++) {
                if (i == lessThan) {
                    lessThan *= 10;
                    d++;
                }
                if (i % d == 0) {
                    System.out.print(i);
                    count++;
                }
            }
        }
    }
}