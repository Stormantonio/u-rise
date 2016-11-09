package webinarLesson3;

/**
 * Created by Anton on 25.10.2016.
 */
public abstract class Pet {
    private double weight;
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {

        return weight;
    }

    public Pet() {
        this.weight = 500 + Math.random() * 1000;
    }
    abstract void voice();
}
