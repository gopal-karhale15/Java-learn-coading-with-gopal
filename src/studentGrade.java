import java.util.Scanner;

class studentgrade {
    public static void main(String[] args) {


        int total;
        float per;
        System.out.println("Enter marks of 5 subject :");
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        total = a + b + c + d + e;
        System.out.println("the total marks of 5 subject is :" + total);
        per = (float) total / 5;
        System.out.println("the percentage of :" + per);

        if (a >= 35) {
            System.out.println("sub a is clear");
        } else {
            System.out.println("sub a is unclear");
        }
        if (b >= 35) {
            System.out.println("sub b is clear");
        } else {
            System.out.println("sub b is unclear");
        }
        if (c >= 35) {
            System.out.println("sub c is clear");
        } else {
            System.out.println("sub c is unclear");
        }
        if (d >= 35) {
            System.out.println("sub d is clear");
        } else {
            System.out.println("sub d is unclear");
        }
        if (e >= 35) {
            System.out.println("sub e is clear");
        } else {
            System.out.println("sub e is unclear");
        }

        if (a >= 35 && b >= 35 && c >= 35 && d >= 35 && e >= 35) {
            System.out.println("the result is pass:");
        } else {
            System.out.println("the result is fail");
        }
    }
}




