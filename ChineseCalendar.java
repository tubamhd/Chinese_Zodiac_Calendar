import java.util.Scanner;

public class ChineseCalendar {
    public static void main(String[] args) {
        double birthyear;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth year:  ");
        birthyear = input.nextDouble();
        double result = birthyear % 12;

        if (result == 0 ){
            System.out.println("Your Chinese Zodiac 'MONKEY'");
        }else if (result == 1){
            System.out.println("Your Chinese Zodiac 'ROOSTER'");
        }else if (result == 2){
            System.out.println("Your Chinese Zodiac 'DOG'");
        }else if (result == 3){
            System.out.println("Your Chinese Zodiac 'PİG'");
        }else if (result == 4){
            System.out.println("Your Chinese Zodiac 'RAT'");
        }else if (result == 5){
            System.out.println("Your Chinese Zodiac 'OX'");
        }else if (result == 6){
            System.out.println("Your Chinese Zodiac 'TIGER'");
        }else if (result == 7){
            System.out.println("Your Chinese Zodiac 'RABBIT'");
        }else if (result == 8){
            System.out.println("Your Chinese Zodiac 'DRAGON'");
        }else if (result == 9){
            System.out.println("Your Chinese Zodiac 'SNAKE'");
        }else if (result == 10){
            System.out.println("Your Chinese Zodiac 'HORSE'");
        }else if (result == 11){
            System.out.println("Your Chinese Zodiac 'GOAT'");
        }










    }
}
