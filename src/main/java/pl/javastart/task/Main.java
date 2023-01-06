package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        int[][] array = main.createArray();
        main.showArray(array);

    }

    private int[][] createArray() {
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
        return numbers;
    }

    private void showArray(int[][] array) {
        char c = '|';
        for (int[] number : array) {
            for (int i : number) {
                if (i < 10) {
                    System.out.printf("%6d%3c", i, c);
                } else {
                    System.out.printf("%6d%3c", i, c);
                }
            }
            System.out.println();
            for (int i = 0; i < array[0].length; i++) {
                System.out.print("---------");
            }
            System.out.println();
        }
    }
}
