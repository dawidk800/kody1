import java.util.Scanner;

public class SwitchPoryRoku {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj porę roku");
        String poraRoku = scan.nextLine();


        switch (poraRoku) {
            case "wiosna":
                System.out.println("zaczyna się 21 marca");
                break;
            case "lato":
                System.out.println("zaczyna się 22 czerwca");
                break;
            case "jesień":
                System.out.println("zaczyna się 23 września");
                break;
            case "zima":
                System.out.println("zaczyna się 22 grudnia");
                break;

            default:
                System.out.println("Nie znam takiej pory roku");
                break;
        }
    }
}