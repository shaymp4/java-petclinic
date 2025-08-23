/**
 * Represents a Cat, which is a type of Pet.
 * Adds a breed attribute and overrides the speak() method.
 */
class Cat extends Pet {
    private String breed; //Additional attributes

    /**
     * Constructs a new Cat object with all pet properties and breed.
     *
     * @param name   the cat's name
     * @param age    the cat's age in years (must be positive)
     * @param color  the cat's color
     * @param weight the cat's weight in kilograms (must be positive)
     * @param breed  the cat's breed
     */
    public Cat(String name, int age, String color, double weight, String breed) {
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
     * @return a String in the format "Meow I am (name)"
     */
    @Override
    public String speak() {return "Meow I am " + name;}


    /**
     * Prints the cat's details, including breed.
     */
    @Override
    public void printPet() {
        super.printPet();
        System.out.println("Breed: " + breed);
    }
}
