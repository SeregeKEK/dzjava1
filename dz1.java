package dzjava;
import java.util.Scanner;
public class dz1 {
    public static void main(String[] args) {
        // Zadacha1();
        // Zadacha2();
        Zadacha3();
    }

    static void Zadacha3(){
        // Реализовать простой калькулятор
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите два числа через пробел: ");
        double num1 = iScanner.nextDouble();
        double num2 = iScanner.nextDouble();
        double result;
        char operator;
        System.out.print("\nВыберите операцию (+, -,* , /): ");
        operator = iScanner.next().charAt(0);
        switch(operator) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
            default:  System.out.printf("Введен неверный оператор");
            return;
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(num1 + " " + operator + " " + num2 + " = " + result);
    }

    static void Zadacha1(){
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
        // n! (произведение чисел от 1 до n)
    Scanner iScanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int number = iScanner.nextInt();
    System.out.println("n-ое треугольного числа " + number+" :");
    for(int i = 0; i <= number; i++){
        double res = 0.5 * i * (i + 1);
        System.out.print((int)res + "\n");
    }
    System.out.println("Факториал числа " + number + ":");
    int fact = 1;
    for(int i = 1; i <= number; i++){
        fact *= i;
    }
    System.out.print(fact);
    }

    static void Zadacha2(){
        // Вывести все простые числа от 1 до 1000

        for(int i = 1; i <= 1000; i++){
            int count = 0;
            for(int j = 2; j <= i && count < 2; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count < 2){
                System.out.println(i);
            }
        }
    }
}