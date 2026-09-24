/*import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数字: ");
        long num1 = scanner.nextLong();
        System.out.print("请输入操作符 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("请输入第二个数字: ");
        long num2 = scanner.nextLong();
        long result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("运算结果: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("运算结果: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("运算结果: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("错误：除数不能为 0！");
                } else {
                    result = num1 / num2;
                    System.out.println("运算结果: " + num1 + " / " + num2 + " = " + result);
                }
                break;
                
            default:
                System.out.println("错误：无效的操作符！请输入 +, -, *, / 中的一个。");
                break;
        }
        scanner.close();
    }
}*/
/*import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
System.out.println(Long.MAX_VALUE+1);
    }}*/
   /*import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数字: ");
        long num1 = scanner.nextLong();
         System.out.print("请输入第二个数字: ");
        long num2 = scanner.nextLong();
        if (num1 > 0 && num2 > 0 && num1 > Long.MAX_VALUE - num2) {
    System.out.println("错误：计算溢出！");
} else {
 long result = num1 + num2;
      System.out.println("运算结果是: " + result);
        }scanner.close();
    }
}*/
/*public class FloatTest {
    public static void main(String[] args) {
        double result1 = 0.01 * 100;
        System.out.println("直接乘法的结果: " + result1);
        double result2 = 0;
        for (int i = 0; i < 100; i++) {
            result2 += 0.01; 
        }
        System.out.println("循环相加的结果: " + result2);
    }
}
*/