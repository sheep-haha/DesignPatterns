package update02;

/**
 * 除法类
 */
public class operationDev extends Operation{
    @Override
    double getResult() {
        double result = 0;
        //除数不等于0
        if(get_NumberB()!= 0){
            result = getNumberA() / get_NumberB();
        }
        return result;
    }
}
