// import java.util.Scanner;
// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! 
// (произведение чисел от 1 до n) Ввод: 5 Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

// public class Tasks {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Введите число: ");
//         int number = in.nextInt();
//         int sum = 0;
//         int fact = 1;
//         for (int i = 1; i <= number; i++) {
//             sum += i;
//             fact *= i;
//         }
//         System.out.printf("Треугольного число = %s, факториал числа = %s", sum, fact);
//         in.close();
//     }
// }

// Задача 2. Вывести все простые числа от 1 до 1000
// public class Tasks {
//     public static void main(String[] args) {
//         for (int j = 2; j <= 1000; j++) {
//             boolean simple = false;

//             for (int i = 2; i * i <= j; i++) {
//                 simple = (j % i == 0);
//                 if (simple) {
//                     break;
//                 }
//             }
//             if (!simple) {
//                 System.out.print(j + " ");
//             }
//         }
//     }
// }