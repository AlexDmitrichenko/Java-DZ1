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
//         for (int j = 1; j <= 1000; j++) {
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

// Задача 3. Реализовать простой калькулятор (+ - / *) Ввод числа -> Ввод знака -> Ввод числа ->

// public class Tasks {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.printf("Введите первое число: ");
//         double num1 = scan.nextDouble();
//         System.out.printf("Введите оператор -, +, *, /: ");
//         char op = scan.next().charAt(0);
//         System.out.printf("Введите второе число: ");
//         double num2 = scan.nextDouble();
//         double ans;
//         switch (op) {
//             case '+':
//                 ans = num1 + num2;
//                 break;
//             case '-':
//                 ans = num1 - num2;
//                 break;
//             case '*':
//                 ans = num1 * num2;
//                 break;
//             case '/':
//                 ans = num1 / num2;
//                 break;
//             default:
//                 System.out.printf("Введен неверный оператор");
//                 return;
//         }
//         System.out.printf("Результат: %s %s %s = %s", num1, op, num2, ans);
//         scan.close();

//     }

// }
    

