package Assignment4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        System.out.println("Enter no.of hours : ");
        int hours = Integer.parseInt(sc.nextLine());
        System.out.println("Enter cost per Hour : ");
        double costPerHour = Double.parseDouble(sc.nextLine());

        AirFare airfare = null;

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        airfare.display();
    }
}