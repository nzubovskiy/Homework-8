package ru.skypro;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1(2022);
        task2(0, 2019);
        task3(95);
        task4("aabccddefgghiijjkk");
        task5(new int[]{3, 2, 1, 6, 5});


    }

    public static void task1(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " - високосный год");
        } else if (year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void task2(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean lightVersion = clientDeviceYear < currentYear;
        if (clientOS == 0 && lightVersion) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && lightVersion) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int task3(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            deliveryTime = deliveryTime;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = deliveryTime + 1;
        } else if (deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
        }
        return deliveryTime;
    }

    // Данный код проверяет дублирование только в соседней ячейке массива и нужно как-то вынести условие else за пределы цикла, чтобы не дублировался вывод, если нет дублирования символов, но как это сделать я не придумал:(
    public static void task4(String example) {
        char[] c = example.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i+1] == c[i]) {
                System.out.println("В строке есть дублирующийся символ " + c[i]);
                break;
            } else {
                System.out.println("В строке нет дублирующихся символов");
            }
            }
        }

        public static void task5(int[] numbers) {
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i]);
            }
        }


}




