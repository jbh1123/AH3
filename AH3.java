public class AH3
{

    static void fizzBuzz(int n) {
        for (int i=1; i <= n; i++) {
            if (i%3==0 && i%5==0) {
                System.out.print("FizzBuzz ");
            }
            else if (i%5==0) {
                System.out.print("Buzz ");
            }
            else if (i%3==0) {
                System.out.print("Fizz ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        fizzBuzz(15);
    }
}
