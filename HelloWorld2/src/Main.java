import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Please enter your score:");
//        int score = new Scanner(System.in).nextInt();
//
//        if ((score > 100 ) || (score < 0)) {
//
//            do {
//                System.out.println("Uncorrect input(");
//                System.out.println("Please enter your score:");
//
//                score = new Scanner(System.in).nextInt();
//            }
//            while ((score > 100) ||(score < 0));
//            /* for (score > 100) ; {
//                System.out.println(" Please enter your score:");
//                int score = scanner.nextLine();
//                System.out.print("Please enter your score");
//            } */
//        }  if  (score >= 70) {
//                System.out.println("Congrats! You’ve passed the test!");
//            } else System.out.println("Sorry, you’ve failed the test.");
//
//        }
//    }
//        score = scanner.nextLine();
// задание 2.

        String str = new String("Exit");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter something:");
            str = scanner.nextLine();
        }
        while (false);




    }
}
//        Задание 3.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter a number: ");
//        int x = scanner.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= x; i++) {
//            sum += i;
//        }
//        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);


//        Задание 4.

//        System.out.println("Choose your channel: \n1 - NTV \n2 - Russia\n3 - RenTV\n4- Culture\n5 - Fox3");
//        int channels = new Scanner(System.in).nextInt();
//        switch (channels) {
//            case 1:
//                System.out.println("NTV");
//                break;
//            case 2:
//                System.out.println("Russia");
//                break;
//            case 3:
//                System.out.println("RenTv");
//                break;
//            case 4:
//                System.out.println("Culture");
//                break;
//            case 5:
//                System.out.println("Fox3");
//                break;
//            default:
//                System.out.println("Sorry! Doesn't exist connection!");
//        }
//    }
//}