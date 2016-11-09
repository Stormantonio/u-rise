package webinarLesson3;

/**
 * Created by Anton on 25.10.2016.
 */
public class Dog extends Pet{
    private double weight;

    public void Dog(double weight) {
        this.weight = weight;
    }

    public Dog() {
        this.weight = 1000 + Math.random() * 3000;
    }

    public double getWeight() {

        return weight;
    }

    public Dog(double weight) {

        this.weight = weight;
    }

    public void voice() {
        System.out.println("uff uff!");
    }
}
