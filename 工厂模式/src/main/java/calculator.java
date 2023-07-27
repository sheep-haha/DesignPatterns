import java.util.Scanner;

/**
 * 简单实现计算器
 * 设计：依次输入数字A，运算符号，数字B
 */
public class calculator {
    public static void main(String[] args) {

        System.out.println("请输入数字A：");
        Scanner strNumberA = new Scanner(System.in);
        Double numberA = strNumberA.nextDouble();

        System.out.println("请选择运算符：+ - * /");
        Scanner strOperate = new Scanner(System.in);
        String operate = strOperate.next();

        System.out.println("请输入数字B：");
        Scanner strNumberB = new Scanner(System.in);
        double numberB = strNumberA.nextDouble();

        //计算
        switch(operate){
            case "+":
                System.out.println(numberA + numberB);
                break;
            case "-":
                System.out.println(numberA - numberB);
                break;
            case "*":
                System.out.println(numberA * numberB);
                break;
            case "/":
                System.out.println(numberA / numberB);
                break;

        }

    }
}
