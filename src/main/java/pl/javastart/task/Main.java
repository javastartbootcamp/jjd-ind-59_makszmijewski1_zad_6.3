package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean condition = true;
        int rowNumbers = 0;
        int columnNumbers = 0;
        int[][] numbers;
        while (condition) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj liczbe wierszy:");
            rowNumbers = scanner.nextInt();
            System.out.println("podaj liczbe kolumn:");
            columnNumbers = scanner.nextInt();
            if (rowNumbers < 100 || columnNumbers < 100) {
                condition = false;
            }
        }
        numbers = new int[rowNumbers][columnNumbers];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = i * j;
            }
        }

        for (int[] number : numbers) {
            for (int i : number) {
                if (i < 10) {
                    System.out.printf("     %d  |", i);
                } else {
                    System.out.printf("    %d  |", i);
                }
            }
            System.out.println();
            for (int i = 0; i < columnNumbers; i++) {
                System.out.print("---------");
            }
            System.out.println();
        }
    }
}
