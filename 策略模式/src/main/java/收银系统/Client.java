package 收银系统;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        //商品单价
        double totalPrices = 0;
        //商品数量
        double num = 0;
        //折扣
        double discount = 0;

        int state = 0;

        List<Double> list_total = new ArrayList<>();
        List<Double> list_totalPrices = new ArrayList<>();
        List<Double> list_num = new ArrayList<>();
        List<Double> list_discount = new ArrayList<>();
        while (true) {
            //键盘输入数据
            System.out.println("请输入商品单价：");
            Scanner scanner1 = new Scanner(System.in);
            totalPrices = scanner1.nextDouble();

            System.out.println("请输入商品数量：");
            Scanner scanner2 = new Scanner(System.in);
            num = scanner2.nextDouble();

            System.out.println("请选择折扣：10折  8折  5折");
            Scanner scanner3 = new Scanner(System.in);
            discount = scanner3.nextDouble();

            //分别存入集合（单价，数量，折扣）
            list_totalPrices.add(totalPrices);
            list_num.add(num);
            list_discount.add(discount);

            //调用
            CashRegister cashRegister = new CashRegister();
            cashRegister.cash(list_totalPrices, list_num, list_discount,list_total,state);

            System.out.println("是否结束？: 1(yes) 0(no)");
            Scanner scanner4 = new Scanner(System.in);
            int isEnd = scanner4.nextInt();
            if(isEnd == 1){
                state = isEnd;
                cashRegister.cash(list_totalPrices, list_num, list_discount,list_total,state);
                break;
            }
        }



    }
}
