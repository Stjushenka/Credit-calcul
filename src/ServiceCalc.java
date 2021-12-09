public class ServiceCalc {

    public float calculate(float credit, float percent, float time) {
        float monthPay;
        monthPay = (float) (credit * percent / 1200 / (1 - Math.pow(1 + percent / 1200, -time)));
        return monthPay;
    }
}
