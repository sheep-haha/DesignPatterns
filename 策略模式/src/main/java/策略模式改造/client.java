package 策略模式改造;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        double total; //总价
        double totalPrices;  //商品单价
        double num;  //商品数量

        List<Double> list_total = new ArrayList<>();
        List<Double> list_totalPrices = new ArrayList<>();
        List<Double> list_num = new ArrayList<>();


        while (true){
            //键盘输入数据
            System.out.println("请输入商品单价：");
            Scanner scanner1 = new Scanner(System.in);
            totalPrices = scanner1.nextDouble();
            list_totalPrices.add(totalPrices);

            System.out.println("请输入商品数量：");
            Scanner scanner2 = new Scanner(System.in);
            num = scanner2.nextDouble();
            list_num.add(num);

            System.out.println("请选择：正常收费  8折  5折 满300返20  满600返50");
            Scanner scanner3 = new Scanner(System.in);
            String Type = scanner3.nextLine();

            //计算每次交易总原价
            total = totalPrices * num;

            CashContext cashContext;

            switch (Type){
                case "正常收费":
                    cashContext = new CashContext(new CashNormal());
                    total = cashContext.getMoney(total);
                    list_total.add(total);
                    total = 0;
                    break;
                case "8折":
                    cashContext = new CashContext(new CashRebate(0.8));
                    total = cashContext.getMoney(total);
                    list_total.add(total);
                    total = 0;
                    break;
                case "5折":
                    cashContext = new CashContext(new CashRebate(0.5));
                    total = cashContext.getMoney(total);
                    list_total.add(total);
                    total = 0;
                    break;
                case "满300返20":
                    cashContext = new CashContext(new CashReturn(300,20));
                    total = cashContext.getMoney(total);
                    list_total.add(total);
                    total = 0;
                case "满600返50":
                    cashContext = new CashContext(new CashReturn(600,50));
                    total = cashContext.getMoney(total);
                    list_total.add(total);
                    total = 0;
            }

            System.out.println("是否结束？: 1(yes) 0(no)");
            Scanner scanner4 = new Scanner(System.in);
            int isEnd = scanner4.nextInt();
            if (isEnd == 1){
                break;
            }
        }

        int size = list_total.size();
        for (int i = 0; i < size; i++) {
            total += list_total.get(i);
        }
        System.out.println("总价格是：" + total);
        }

    }
