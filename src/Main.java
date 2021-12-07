public class Main {
    public static void main(String[] args) {
        ServiceCalc service = new ServiceCalc();
        float monthPay;
        float a = 1000000;
        float p = 9.9f;
        float t = 12;
        monthPay = service.calculate(a, p, t);
        System.out.println(monthPay);
    }
}
