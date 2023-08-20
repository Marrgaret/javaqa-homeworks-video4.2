public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeter = 1.58; /* рост в сантиметрах */
        int weightKilo = 62; /* вес в килограммах */
        int index = service.calculate(heightMeter, weightKilo);
        System.out.println("Индекс массы тела: " + index + " кг/кв.м");
    }
}
