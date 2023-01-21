package part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovingAverage {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("input.txt"));
        int length = Integer.parseInt(reader.nextLine());
        String[] arr = reader.nextLine().split(" ");
        int window = Integer.parseInt(reader.nextLine());
        List<Double> result = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i <= length - window; i++) {
            if (i == 0) {
                for (int j = 0; j < window; j++) {
                    sum += Integer.parseInt(arr[j]);
                }
            } else {
                sum -= Integer.parseInt(arr[i - 1]);
                sum += Integer.parseInt(arr[i + window - 1]);
            }

            result.add((double) sum / window);
        }

        StringBuilder stringBuilder = new StringBuilder();
        result.forEach(avg -> stringBuilder.append(avg).append(' '));
        System.out.println(stringBuilder);
    }
}
