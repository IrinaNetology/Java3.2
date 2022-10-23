public class Main {
    public static void main(String[] args) {
        double weight = 67;

        double height = 1.65;

        BmiService service = new BmiService();
        System.out.println(service.calculate(weight, height));
    }
}