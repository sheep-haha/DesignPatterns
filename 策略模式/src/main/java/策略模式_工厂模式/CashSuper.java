package 策略模式_工厂模式;

/**
 * 抽象现金类
 */
abstract class CashSuper {
   /**
    * @param money 收取的金额
    * @return 返现金额
    */
   public abstract double acceptCashSuper(double money);
}
