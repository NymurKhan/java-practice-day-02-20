import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the numbers =");
        int num1 = input.nextInt();
        float num2 = input.nextFloat();

        float  sum = num1 + num2;
        System.out.println("sum = " + sum);


    }
}
