package org.example.task2;
/*
Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
Пример ввода:
1 2 1 2 -1 1 3 1 3 -1 0
Логика расчета:
2 -1 переход -> 2 в сумму
3 -1 переход -> 3 в сумму
Пример вывода: 5
 */

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        while (a != 0) {

            int b = scanner.nextInt();
            if (b < 0 && a > 0) {
                sum += a;

            }
            a = b;

        }
        System.out.println(sum);
    }
}
