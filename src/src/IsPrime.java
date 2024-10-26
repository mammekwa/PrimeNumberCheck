import java.util.Scanner;
    public class IsPrime {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            do{
                boolean isPrimeNum = isPrime(num);
                System.out.println(isPrimeNum ? num + " is a prime number" : num + " is not a prime number");
                System.out.print("Enter a number (Press 1 to End): ");
                num = sc.nextInt();
            }while(num != 1);
        }

        static boolean isPrime(int num) {
            int c = 2;
            boolean isPrimeNum = true;
            while (c < num) {
                if (num % c == 0) {
                    isPrimeNum = false;
                    break;
                }
                c++;
            }
            return isPrimeNum;

        }
    }
