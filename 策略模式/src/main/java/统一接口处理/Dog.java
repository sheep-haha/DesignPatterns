package 统一接口处理;

public class Dog implements Animal{

    @Override
    public void show() {
        System.out.println("旺");
    }

    @Override
    public void eat() {
        System.out.println("吃肉");

    }
}

