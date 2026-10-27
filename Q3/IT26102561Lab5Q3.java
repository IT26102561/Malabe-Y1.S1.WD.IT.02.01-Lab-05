import java.util.Scanner;
public class IT26102561Lab5Q3 {
    public static void main(String [] args){
        final double ROOM_CHARGE = 48000.0;
        final double DISCOUNT_3TO4 = 0.10;
        final double DISCOUNT_5ORMORE = 0.20;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();
        System.out.print("Enter the End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }
        if (startDate >= endDate){
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int daysReserved = endDate - startDate;
        double totalAmount = daysReserved * ROOM_CHARGE;

        if (daysReserved >= 5){
            totalAmount = totalAmount - (totalAmount * DISCOUNT_5ORMORE);
        }
        else if (daysReserved >= 3){
            totalAmount = totalAmount - (totalAmount * DISCOUNT_3TO4);
        }

        System.out.println();
        System.out.println("Room Charge Per Day: " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}
