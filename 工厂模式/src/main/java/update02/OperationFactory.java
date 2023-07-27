package update02;

public class OperationFactory {
    public static Operation creatOperate(String operate){
        Operation oper = null;
        switch(operate){
            case "+":
                oper = new operationAdd();
                break;
            case "-":
                oper = new operationSub();
                 break;
            case "*":
                oper = new operationMul();
                break;
            case "/":
                oper = new operationDev();
                break;
            }
        return oper;
    }
}
