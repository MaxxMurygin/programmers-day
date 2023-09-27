import java.util.Scanner;

public class Praktikum {
    //Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Високосный");// здесь нужно вывести результат
        } else {
            System.out.println("Обычный короткий год");
        }
    }//End of Main

    // здесь нужно определить, является ли переданный год високосным
    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0){
            if ((year % 100 != 0) || (year % 400 == 0)){
                isLeap = true;
            }
        }
        return isLeap;
    } //End of isLeapYear(int year)
}//End of class Praktikum