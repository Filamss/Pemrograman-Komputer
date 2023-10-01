package practice.oop;
import java.util.Scanner;

public class DuckSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis Duck yang ingin Anda lihat:");
        System.out.println("1. Mallard Duck");
        System.out.println("2. Rubber Duck");
        System.out.println("3. Decoy Duck");
        System.out.println("4. Model Duck");

        int choice = scanner.nextInt();

        Duck duck = null;

        if (choice == 1) {
            duck = new MallarDuck();
        } else if (choice == 2) {
            FlyBehavior cantFly = () -> System.out.println("I can't fly");
            QuackBehavior squeak = () -> System.out.println("Squeak");
            duck = new RubberDuck(cantFly, squeak);
        } else if (choice == 3) {
            duck = new DecoyDuck();
        } else if (choice == 4) {
            duck = new ModelDuck();
        } else {
            System.out.println("Pilihan tidak valid.");
            System.exit(0);
        }

        System.out.println("Anda telah memilih " + duck.getClass().getSimpleName());

        duck.performQuack();

        if (duck instanceof ModelDuck) {
            ModelDuck modelDuck = (ModelDuck) duck;
            System.out.println("Anda ingin mengubah perilaku terbang Model Duck?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");

            int changeBehavior = scanner.nextInt();

            if (changeBehavior == 1) {
                modelDuck.setFlyBehavior(new FlyRocketPowered());
                System.out.println("Perilaku terbang Model Duck telah diubah!");
                modelDuck.performFly();
            }
        } else {
            duck.performFly();
        }

        scanner.close();
    }
}
