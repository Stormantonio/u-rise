package webinarLesson3;

/**
 * Created by Anton on 25.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        Pet[] pets = new Pet[10];
        for (int i = 0; i < 10; i++) {
            if (i%2 == 0)
                pets[i] = new Cat();
            else
                pets[i] = new Dog();
        }
        for (int i = 0; i < 10; i++) {
            pets[i].voice();
        }
    }
}
