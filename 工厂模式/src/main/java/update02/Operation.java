package update02;

/**
 * 计算器的公共类：定义参数A，B，和运算结果
 */
public abstract class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double get_NumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    abstract double getResult();

}
