package 简单工厂模式;


/**
 * 打折
 */
public class CashRebate extends CashSuper{

    //折扣
    private double Rebate = 1;

    public CashRebate(double Rabate){
        this.Rebate = Rabate;
    }

    @Override
    public double acceptCashSuper(double money) {

        return money * Rebate ;
    }
}
