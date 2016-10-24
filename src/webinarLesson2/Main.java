package webinarLesson2;

/**
 * Created by Anton on 24.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        String text = "The Roman 456 Empire had a huge task in front of them while it was first 4 starting out and while it was becoming a dominant dynasty in the early civilizations. The main problem that the book «Discovering the Global Past» points out is how the Roman Empire found itself growing a little too quickly.";
        String[] words = text.split("\\d+");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
