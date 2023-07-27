package update02;

import java.util.Scanner;

public class client {
    public static void main(String[] args) {

        System.out.println("请输入数字A：");
        Scanner strNumberA = new Scanner(System.in);
        Double numberA = strNumberA.nextDouble();

        System.out.println("请输入数字B：");
        Scanner strNumberB = new Scanner(System.in);
        double numberB = strNumberB.nextDouble();


        System.out.println("请选择运算符：+ - * /");
        Scanner strOperate = new Scanner(System.in);
        String operate = strOperate.next();

        Operation operation = OperationFactory.creatOperate(operate);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);

        double result = operation.getResult();
        System.out.println(result);


    }
}
