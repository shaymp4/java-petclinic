/**
 * Base class to represent a pet in the clinic.
 * Stores basic info like name, age, color, and weight.
 */
abstract class Pet {
    protected String name;
    protected int age;
    protected String color;
    protected double weight;

    /**
     * Constructs a new Pet object with the given properties.
     *
     * @param name   the pet's name
     * @param age    the pet's age in years (must be positive)
     * @param color  the pet's color
     * @param weight the pet's weight in kilograms (must be positive)
     */
    public Pet(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    //Getters
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getColor() {return color;}
    public double getWeight() {return weight;}

    //Setters
    public void setName(String name) {this.name = name;}

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {System.out.println("Invalid age. Age must be positive.");}
    }

    public void setColor(String color) {this.color = color;}

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight. Weight must be positive.");
        }
    }

    /**
     * Abstract method for the pet to make a sound.
     * Must be implemented by subclasses.
     * @return the sound the pet makes
     */
    public abstract String speak();

    //Print pet method
    public void printPet() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nColor: " + color + "\nWeight: " + weight);
    }

}