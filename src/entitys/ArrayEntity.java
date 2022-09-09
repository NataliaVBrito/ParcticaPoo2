package entitys;

public class ArrayEntity {

    private double[] arrayA;
    private double[] arrayB;

    public ArrayEntity() {
    }

    public ArrayEntity(double[] arrayA, double[] arrayB) {
        this.arrayA = arrayA;
        this.arrayB = arrayB;
    }

    public double[] getArrayA() {
        return arrayA;
    }

    public void setArrayA(double[] arrayA) {
        this.arrayA = arrayA;
    }

    public double[] getArrayB() {
        return arrayB;
    }

    public void setArrayB(double[] arrayB) {
        this.arrayB = arrayB;
    }

}
