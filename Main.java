import java.util.Scanner;
public class Main {

            public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            double PERCENTS = 2.2;
            // System.out.println("сумма кредита ");
            double credit = 5000;//input.nextInt();
            // System.out.println("первый взнос ");
            double firstPayment = 1000;// input.nextInt();
            // System.out.println("Срок ");
            double paymentTerm = 12;//input.nextInt();
            double leftToPay = credit - firstPayment;
            double Z = PERCENTS / 100 / paymentTerm;
            double linearPercent = leftToPay * Z;
            System.out.format("Линейный процент %.2f\n", linearProcent);
            double payPerMonth = linearProcent + (leftToPay / paymentTerm);

            for (double i = leftToPay; i > 0; i -= payPerMonth) {

                payPerMonth= linearProcent + (leftToPay / paymentTerm);//340.67


                System.out.format("Проц %-6.2fМес %-8.2fОст %-8.2f\n", linearProcent, payPerMonth, i);
                linearProcent -= linearProcent - (leftToPay - payPerMonth) * Z;

            }
        }
    }

