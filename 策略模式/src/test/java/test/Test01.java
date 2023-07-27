package test;


import org.junit.Test;
import 策略模式_工厂模式.CashRebate;

public class Test01 {
    @Test
    public void test(){
        CashRebate cashRebate = new CashRebate(0.9);
        double total = cashRebate.acceptCashSuper(100);
        System.out.println(total);
    }

}
