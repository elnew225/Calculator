
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("num1");
        float x = scanner.nextFloat();
        System.out.println("num2");
        float y = scanner.nextFloat();
        System.out.println("Выберите операцию: 1.Выч 2.Сум 3.Умн 4.Дел");
        Scanner scanner1 =new Scanner(System.in);
        int num = scanner1.nextInt();
        System.out.println("result");
        if (num==1) System.out.println(x - y);
        if (num==2) System.out.println(x + y);
        if (num==3) System.out.println(x * y);
        if (num==4) System.out.println(x / y);


    }
}
