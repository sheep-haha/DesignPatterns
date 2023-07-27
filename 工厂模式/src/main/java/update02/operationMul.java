package update02;

/**
 * 乘法类
 */
public class operationMul extends Operation{
    @Override
    double getResult() {
        double result = 0;
        result = getNumberA() * get_NumberB();
        return result;
    }
}
