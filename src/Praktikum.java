import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {//***Main
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println("День программиста будет 12 сентября " + year + "г.");
        } else {
            System.out.println("День программиста будет 13 сентября " + year + "г.");
        }
    }//***End of Main

    public static boolean isLeapYear(int year) {// ***Проверка на високосность
        if (year % 4 == 0){
            if (year % 100 != 0 || year % 400 == 0){
                return true;
            }
        }
        return false;
    } //End of ***Проверка на високосность
}//End of class Praktikum