package 策略模式_工厂模式;

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

            //核心
            CashContext cashContext = new CashContext(Type);

            //计算每次交易的总原价
            total = totalPrices * num;
            //传入原价，得到处理后的价格
            total = cashContext.getMoney(total);

            //将每次交易处理后的价格存入集合
            list_total.add(total);
            //每单价格归零
            total = 0;


            System.out.println("是否结束？: 1(yes) 0(no)");
            Scanner scanner4 = new Scanner(System.in);
            int isEnd = scanner4.nextInt();
            if (isEnd == 1){
                break;
            }
        }

        //统计所有商品价格
        int size = list_total.size();
        for (int i = 0; i < size; i++) {
            total += list_total.get(i);
        }
        System.out.println("总价格是：" + total);
        }

    }
