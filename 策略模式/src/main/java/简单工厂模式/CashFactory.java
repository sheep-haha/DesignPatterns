package 简单工厂模式;

public class CashFactory {
    public static CashSuper CreatCashAccept(String Type) {
        CashSuper cashSuper = null;
        switch (Type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "8":
                cashSuper = new CashRebate(0.8);
                break;
            case "5":
                cashSuper = new CashRebate(0.5);
                break;
            case "满300返20":
                cashSuper = new CashReturn(300,20);
                break;
            case "满600返50":
                cashSuper = new CashReturn(600,50);
                break;
        }

        return cashSuper;
    }
}
