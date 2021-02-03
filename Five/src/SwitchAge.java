import java.util.Scanner;

public class SwitchAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite");
        String age = scanner.nextLine();
        switch (age) {
            case "nol":
                System.out.println("kek");
                break;
            default:
                System.out.println("ne kek");
        }
    }
}
