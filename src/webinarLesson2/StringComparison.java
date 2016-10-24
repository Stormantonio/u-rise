package webinarLesson2;

/**
 * Created by Anton on 24.10.2016.
 */
public class StringComparison {
    public static void main(String[] args) {
        /*
        Если мы хотим сравнивать строчки, мы всегда должны их сравнивать оператором equals(), который у нас сравнивает ИМЕННО обьекты
         */
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        s1 += ""; // операция сложения строк через "+" - конкатенация - она создает всегда новый объект
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        StringBuilder sb = new StringBuilder(); // более новый метод, однопоточный ( в отличии от StringBuffer)
        for (int i = 0; i < 100; i++) {
            // s1 += "222"; // жрет очень много памяти.
            sb.append("222"); // гораздо быстрее. Так правильно складывать строчку. Эта функция не создает новых обьектов.
                              // Она просто динамически дополняет обьект.
        }

        // как переполнить кучу
        /*for (int i = 0; i < 100000; i++) {
            s1 += "2222";
        }*/
        System.out.println(s1);
    }
}