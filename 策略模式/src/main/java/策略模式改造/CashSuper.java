package 策略模式改造;

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
