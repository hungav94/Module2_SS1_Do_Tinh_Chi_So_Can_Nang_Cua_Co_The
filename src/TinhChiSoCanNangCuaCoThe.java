import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        double weight, height, bmi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight: ");
        weight = scanner.nextDouble();
        System.out.println("Enter height: ");
        height = scanner.nextDouble();

        bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);

        if (bmi >= 30.0) {
            System.out.println("Obese");
        } else if (bmi >= 25.0) {
            System.out.println("Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }
    }
}
