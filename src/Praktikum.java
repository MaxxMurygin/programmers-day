import java.util.Scanner;
public class Praktikum {
    public static void main(String[] args) {//***Main
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println("Високосный");// здесь нужно вывести результат
        } else {
            System.out.println("Обычный короткий год");
        }
    }//***End of Main
    public static boolean isLeapYear(int year) {// ***Проверка на високосность
        boolean isLeap = false;
        if (year % 4 == 0){
            if ((year % 100 != 0) || (year % 400 == 0)){
                isLeap = true;
            }
        }
        return isLeap;
    } //End of ***Проверка на високосность
}//End of class Praktikum