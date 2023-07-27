package update02;

/**
 * 减法类
 */
public class operationSub extends Operation{
    @Override
    double getResult() {
        double result = 0;
        result = getNumberA() - get_NumberB();
        return result;
    }
}
