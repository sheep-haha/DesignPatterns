package 策略模式_工厂模式;

/**
 * 不打折，不优惠
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCashSuper(double money) {
        //正常收费，原价返回
        return money;
    }
}
