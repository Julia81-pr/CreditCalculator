import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CreditPaymentService credit = new CreditPaymentService();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сумму кредита: ");
        double summa= input.nextDouble();

        System.out.println("Введите количество месяцев: ");
        double month= input.nextDouble();

        System.out.println("Введите размер процентной ставки: ");
        double rate = input.nextDouble();

        double pay = credit.calculate(summa, month, rate);


        for (int i = 0; i<11; i++){
            System.out.println("Сумма платежа  " + pay);
        }


    }



}
