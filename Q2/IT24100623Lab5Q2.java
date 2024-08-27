import java.util.Scanner;
public class IT24100623Lab5Q2 {
    public static void main(String[] args) {
        Scanner company = new Scanner(System.in);
        
        System.out.print("Enter the number of new members you introduced: ");
        int newMembers = company.nextInt();
        if (newMembers < 0) {
            System.out.println("Invalid input! The number of new members should be 0 or more.");
        } else {
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }
            System.out.println("You are entitled to: " + prize);
        }
    }
}