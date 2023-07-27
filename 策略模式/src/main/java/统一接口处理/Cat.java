package 统一接口处理;

public class Cat implements Animal{

    @Override
    public void show() {
        System.out.println("喵");
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");

    }
}
