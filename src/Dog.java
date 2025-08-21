/**
 * Represents a Dog, which is a type of Pet.
 * Adds a breed attribute and overrides the speak() method.
 */
class Dog extends Pet {
    private String breed; //Additional attributes

    /**
     * Constructs a new Dog object with all pet properties and breed.
     *
     * @param name   the dog's name
     * @param age    the dog's age in years (must be positive)
     * @param color  the dog's color
     * @param weight the dog's weight in kilograms (must be positive)
     * @param breed  the dog's breed
     */
    public Dog(String name, int age, String color, double weight, String breed) {
        super(name, age, color, weight);
        this.breed = breed;
    }

    //Getter
    public String getBreed() {return breed;}

    //Setter
    public void setBreed(String breed) {this.breed = breed;}

    /**
     * Overrides the abstract speak() method.
     *
     * @return a String in the format "Woof I am (name)"
     */
    @Override
    public String speak() {return "Woof I am " + name;}


    /**
     * Prints the dog's details, including breed.
     */
    @Override
    public void printPet() {
        super.printPet();
        System.out.println("Breed: " + breed);
    }
}
