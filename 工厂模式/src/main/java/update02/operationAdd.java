package update02;

/**
 * 加法类
 */
public class operationAdd extends Operation{
    @Override
    double getResult() {
        double result = 0;
        result = getNumberA() + get_NumberB();
        return result;
    }
}
