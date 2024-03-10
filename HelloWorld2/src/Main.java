import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//       Это 1-ое задание. Мне нужна подсказка. Вот до чего дошла (ниже). Не понимаю, почему выхожу из цикла и не иду на проверку диапозона 0-100.
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your score:");
//
//        int score = new Scanner(System.in).nextInt();
//        while (score <= 0 && score >= 100);
//        {
//            System.out.print("Incorrect value! Try again!");
//            System.out.println("Please enter your name:");
//            String name = scanner.nextLine();
//
//        }
//        System.out.println("Please enter your score:");
//        if (score >= 70 && score <= 100)
//        {
//            System.out.println("Congrats! You’ve passed the test!");
//        }
//        if (score >= 0 && score <= 70) {
//            System.out.println("Sorry, you’ve failed the test.");
//        }
//
//    }
//       2- задание. тут можно не смотреть

//        String str = new String();
//        Scanner scanner = new Scanner(System.in);
//        while (str.length() == 0) {
//            System.out.print("Please enter something:");
//            str = scanner.nextLine();
//        }

//        Задание 3.

        System.out.println("Choose your channel: \n1 - NTV \n2 - Russia\n3 - RenTV\n4- Culture\n5 - Fox3");
        int channels = new Scanner(System.in).nextInt();
        switch (channels) {
            case 1:
                System.out.println("NTV");
                break;
            case 2:
                System.out.println("Russia");
                break;
            case 3:
                System.out.println("RenTv");
                break;
            case 4:
                System.out.println("Culture");
                break;
            case 5:
                System.out.println("Fox3");
                break;
            default:
                System.out.println("Sorry! Doesn't exist connection!");
        }
    }
}