import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 2; i++){
            System.out.println(i + "人目");
            System.out.print("身長(m):");
            double height = Double.parseDouble(sc.nextLine());
            System.out.print("体重(kg):");
            double weight = Double.parseDouble(sc.nextLine());
            double bmi = weight / (height * height);
            int bm = (int)(bmi * 100);
            bmi = (double) bm / 100;
            System.out.println("BMI:" + bmi); 
            if (bmi < 18.50) {
                System.out.println("低体重です。");
                } else if (bmi < 25.00) {
                    System.out.println("適正体重です。");
                } else if (bmi < 30.00) {
                    System.out.println("太り気味です。");
                } else {
                    System.out.println("肥満です。");
            }
        }
    }
}
