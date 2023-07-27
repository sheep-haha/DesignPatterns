package 统一接口处理;

public class Test02 {
    public static void main(String[] args) {
        Context context = new Context();

        context.setAnimal(new Cat());
        context.AnimalShow();
        context.AnimalEat();

        context.setAnimal(new Dog());
        context.AnimalShow();
        context.AnimalEat();


    }
}
