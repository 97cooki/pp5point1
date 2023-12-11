public class Dog {
    //Instantiate Variables
    private String name;
    private String breed;
    private double weight;
    private int age;
    private static int dogCount = 0;

    //Create constructors
    //default constructor
    public Dog() {
        name = "";
        breed = "";
        age = 0;
        weight = 0;
        dogCount++;
    } //end default constructor

    //full constructor
    public Dog(String name, int age, String breed, double weight) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        dogCount++;
    } //end full constructor

    //Getters & Setters
    public String getBreed() { return breed; }
    public double getWeight() { return weight; }
    public int getAge() { return age; }

    public static int getDogCount() { return dogCount; }
    public void setWeight(double weight) { this.weight = weight; }

    //Brain Methods
    public String toString() {
    String result = "Dog's name: " + this.name;
    result += "\nDog's age: " + this.age +
                "\nDog's breed: " + this.breed +
                    "\nDog's weight: " + this.weight;
    return result;
    }

    public double kgWeight() {
        double newWeight = this.weight *  0.45359237;
        return newWeight;
    }
}
