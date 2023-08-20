public class BmiService {
    /*
     * Расчет индекса массы тела
     * height рост в метрах.
     * weight вес в килограммах
     */
    public int calculate(double height, int weight) {
        int index = (int) (weight / Math.pow(height, 2));
        return index;
    }
}
