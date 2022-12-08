public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 83.5;
        double height = 1.8;
        double bmiIndex = service.calculate(weight, height);
        System.out.println("Индекс массы тела - " + bmiIndex);
    }
}