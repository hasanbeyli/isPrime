public class Main {
    public static void main(String[] args) {

        int number = 24;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("The number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }
}
