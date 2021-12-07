public class Main {
    public static void main(String[] args) {
        ServiceCalc service = new ServiceCalc();
        float monthPay;
        float a = 1000000f;
        float p = 9.9f;
        float t = 12f;
        monthPay = service.calculate(a, p, t);
        System.out.println(monthPay);
    }
}
