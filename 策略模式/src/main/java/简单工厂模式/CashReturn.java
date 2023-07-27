package 简单工厂模式;

/**
 * 优惠券
 */
public class CashReturn extends CashSuper{

    //满moneyIn 返 moneyOut
    public double moneyIn;
    public double moneyOut;

    public CashReturn(double moneyIn,double moneyOut){
        this.moneyIn = moneyIn;
        this.moneyOut = moneyOut;
    }

    @Override
    public double acceptCashSuper(double money) {

        double result = money;
        if (money >= moneyIn) {
            result = Math.max(money, money / moneyIn * moneyOut); // 这一段代码太吊了，解决了满几返几的问题
        }
        return result;
    }
}
