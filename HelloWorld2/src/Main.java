import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int score = new Scanner(System.in).nextInt();

        while (score > 100) {
            System.out.print("Please enter your score");
            int score = scanner.nextLine();
            for (score > 100) ; {
                System.out.println("Try again! Please enter your score:");
                int score = scanner.nextLine();
                System.out.print("Please enter your score");
            }
        }
                if (score >= 70) {
                    System.out.println("Congrats! You’ve passed the test!");
                } else {
                    System.out.println("Sorry, you’ve failed the test.");
                }

            }
        }
    }

//        Задание 3.

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