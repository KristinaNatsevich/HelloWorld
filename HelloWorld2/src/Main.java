import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// это задание № 3
        Scanner scanner = new Scanner(System.in);

        System.out.println("Как тебя зовут?");
        String userName = scanner.nextLine();

        System.out.println("Привет, " + userName);

// это задание №2
        int x = 214789;
        byte y = 1;
        short z = -32768;
        long a = 2L;
        float j = 2.5f;
        double f = 2.45896;
        boolean k = true;
        char g = 't';

           System.out.println(x + "\n" + y + "\n" +  z + "\n" + a + "\n" + j + "\n" + f + "\n" + k + "\n" + g + "\n");

// это задание №1

String myAdressAndName = "Kristina Natsevich, manual qa";
        System.out.println(myAdressAndName);

    }
}