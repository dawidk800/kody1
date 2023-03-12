import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner skan = new Scanner(System.in);


        System.out.println("Jak się nazywasz?");
        String nazwa = skan.nextLine();
        System.out.println("Masz na imię " + nazwa);

        System.out.println("ile masz lat?");
        int wiek = skan.nextInt();

        System.out.println("Masz " + wiek + " lat");
        if (wiek > 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("jesteś niepełnoletni");
        }

        System.out.println("jaki jest twój wzrost?");
        double wzrost = skan.nextDouble();

        if (wzrost <= 160) {
            System.out.println("jesteś bardzo niksi");
        } else if (wzrost >= 160 && wzrost <= 170) {
            System.out.println("jesteś niski");
        } else if (wzrost >= 170 && wzrost <= 180) {
            System.out.println("jesteś wysoki");
        } else {
            System.out.println("jesteś bardzo wysoki");
        }


    }
}
