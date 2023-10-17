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

    static void recursFizzBuzz(int n) {
        if (n==0) {
            return;
        }
        recursFizzBuzz(n-1);
        if (n%3==0 && n%5==0) {
            System.out.print("FizzBuzz ");
        }
        else if (n%5==0) {
            System.out.print("Buzz ");
        }
        else if (n%3==0) {
            System.out.print("Fizz ");
        }
        else {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        fizzBuzz(15);
        System.out.println();
        recursFizzBuzz(15);
    }
}
