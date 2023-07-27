package 策略模式改造;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cs){
        this.cashSuper = cs;
    }

    /**
     * @param money 收取的钱
     * @return 找回的钱
     */
    public double getMoney(double money){
        double moneyBack = cashSuper.acceptCashSuper(money);
        return moneyBack;
    }
}
