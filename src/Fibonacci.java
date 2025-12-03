import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Enter a number to print fibonacci series :");
        int i1 = 5;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int firstterm = 0; int secondterm = 1;

        for(int i=0; i<=n; i++)
        {
            System.out.print(firstterm + " ");

            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;

        }


    }
}


