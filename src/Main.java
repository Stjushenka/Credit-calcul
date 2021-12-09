public class Main {
    public static void main(String[] args) {
        ServiceCalc service = new ServiceCalc();
        float monthPay;
        float credit = 1000000f;
        float percent = 9.9f;
        float time = 12f;
        monthPay = service.calculate(credit, percent, time);
        System.out.println(monthPay);
    }
}
