package update01;

/**
 * 计算部分
 */

public class calculator01 {
    public void getOpertion(double numberA,double numberB,String operate){
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
