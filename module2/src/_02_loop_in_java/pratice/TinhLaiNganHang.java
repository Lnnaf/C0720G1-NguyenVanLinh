package _02_loop_in_java.pratice;

        import java.util.Scanner;

public class TinhLaiNganHang {
    public static void main(String[] args) {
        int month;
        double money, total = 0, rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money: ");
        money = input.nextDouble();
        System.out.println("Enter interest rate of Loan: ");
        rate = input.nextDouble();
        System.out.println("Enter number of Month: ");
        month = input.nextInt();
        for (int i = 0; i<month; i++){
            total += money*(rate/100)/12*month;
        }
        System.out.println("Total of interest: " +total);
    }
}
