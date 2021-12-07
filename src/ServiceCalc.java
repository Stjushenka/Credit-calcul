public class ServiceCalc {
    public float a;
    public float p;
    public float t;

    public float calculate(float a, float p, float t) {
        this.a = a;
        this.p = p;
        this.t = t;
        float monthPay;
        monthPay = (float) (a * p / 1200 / (1 - Math.pow(1 + p / 1200, -t)));
        return monthPay;
    }
}
