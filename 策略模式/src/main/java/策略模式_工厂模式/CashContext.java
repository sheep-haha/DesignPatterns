package 策略模式_工厂模式;


public class CashContext {
    CashSuper cashSuper = null;

    public CashContext(String Type){
        switch (Type){
            case "正常收费":
                CashNormal cashNormal = new CashNormal();
                cashSuper = cashNormal;
                break;
            case "8折":
                CashRebate cashRebate1 = new CashRebate(0.8);
                cashSuper = cashRebate1;
                break;
            case "5折":
                CashRebate cashRebate2 = new CashRebate(0.5);
                cashSuper = cashRebate2;
                break;

            case "满300返20":
                CashReturn cashReturn1 = new CashReturn(300, 20);
                cashSuper = cashReturn1;
                break;
            case "满600返50":
                CashReturn cashReturn2 = new CashReturn(600, 50);
                cashSuper = cashReturn2;
                break;
        }
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
