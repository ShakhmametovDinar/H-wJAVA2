package Task;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;

public class Task1 {
    public static int[] randomNum() {
        Random rnd = new Random();
        int[] list1 = new int[10];
        for (int i = 0; i < 10; i++) {
            list1[i] = rnd.nextInt(10);
        }
        System.out.println(Arrays.toString(list1));
        return list1;
    }

    public static void bubbleSorting(int[] list1) throws IOException {
        int step;
        Logger logger = Logger.getLogger(Task1.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        for (int i = 1; i < 10; i++) {
            if (list1[i] < list1[i-1]) {
                step = list1[i];
                list1[i] = list1[i-1];
                list1[i-1] = step;
                i = 0;
                logger.log(Level.WARNING, Arrays.toString(list1));
            }
        }
        System.out.println(Arrays.toString(list1));
    }
}