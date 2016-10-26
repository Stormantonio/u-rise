package bones;

/**
 * Created by Anton on 26.10.2016.
 */
public class Bones {
    public static void main(String[] args) {
        int[] sums = new int[13];
        for (int i = 0; i < 1000000; i++) {
            int throwBone1 = (int) (1 + Math.random() * 6);
            int throwBone2 = (int) (1 + Math.random() * 6);
            sums[throwBone1 + throwBone2]++;
        }

        int max = 0;
        int indMax = 0;
        System.out.println("Кол-во выпаданий сумм бросков двух костей:");
        for (int i = 2; i < sums.length; i++) {
            if (max < sums[i]) {
                max = sums[i];
                indMax = i;
            }
            System.out.println(i + " : " + sums[i]);
        }
        System.out.println("Наиболее вероятная сумма при бросании двух костей = " + indMax);
    }
}
