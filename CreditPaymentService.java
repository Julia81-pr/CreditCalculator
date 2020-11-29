public class CreditPaymentService {

        public double calculate( double summa, double month, double rate){
               double p = rate/ month/100; // p - коэффициент процентной ставки
               double a = (p * Math.pow((1 + p),month) / (Math.pow((1 + p),month) - 1)); // аннуитетный коэффициент;
                double pay = summa*a;


                return pay;


        }



}
