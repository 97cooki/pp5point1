// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Australian", 45);
        Dog dog3 = new Dog("Maui", 2, "Pomeranian", 60);

        System.out.println("Fang's breed is: " + dog1.getBreed() + "\nFang is " + dog1.getAge() +
                            " years old\n");
        System.out.println("Piper's weight in pounds: " + dog2.getWeight() + "\nPiper's weight in kilograms " +
                            dog2.kgWeight() + "\n");
        System.out.println(dog3.toString());
        System.out.println("There is " + Dog.getDogCount() + " dogs.");
    }
}