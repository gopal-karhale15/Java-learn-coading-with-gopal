import java.util.Scanner;
class FactorialOfNumber {

    public static void main(String[] args) {

        System.out.println("Enter Number Of Factorial :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=n; i++)
        {
            fact *= i;
        }
        System.out.println("The Factorial Of Current Number Is :" +fact);
    }
}
