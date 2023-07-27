package 统一接口处理;

public class Context{
    public Animal animal;

    public void setAnimal(Animal animal){
        this.animal = animal;
    }

    public void AnimalShow(){
        animal.show();
    }

    public void AnimalEat(){
        animal.eat();
    }

}
