package 收银系统;

import java.util.List;

/**
 * 计算总价
 */
public class CashRegister {

   public void cash( List<Double> list_totalPrices,List<Double> list_num,List<Double> list_discount,List<Double> list_total,int state) {
       //总价
       double total = 0;

       int sum = list_totalPrices.size()-1;

       //循环条数
       for (; sum >= 0 ; sum--) {
           if (list_discount.get(sum) < 10) {
               //打折
               total = list_totalPrices.get(sum) * list_num.get(sum) * list_discount.get(sum) * 0.1;
               list_total.add(total);
           }else {
               //不打折
               total = list_totalPrices.get(sum) * list_num.get(sum);
               list_total.add(total);
           }

       }

       if(state == 1){
           System.out.println("购买详情："+ "\n");
           int i = list_totalPrices.size()-1;
           for (; i >= 0; i--) {
               if (list_discount.get(i) < 10) {
                   System.out.println("商品单价："+ list_totalPrices.get(i) + " 商品数量：" + list_num.get(i) +
                           " 折扣：" + list_discount.get(i) + "折" + " 商品总价格：" + list_total.get(i) + '\n');
               }else
                   System.out.println("商品单价："+ list_totalPrices.get(i) + " 商品数量：" + list_num.get(i) + " 折扣：正常价格" + " 商品总价格：" + list_total.get(i) + '\n');
           }
       }

   }



}
