public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 55.0;
        double height = 1.5;
        double BMI = service.calculate(weight, height);
        System.out.println("Индекс массы тела: " + BMI);
    }
}
