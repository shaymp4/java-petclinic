import java.util.Scanner;
import java.util.ArrayList;

public class PetClinic {
    private static Scanner input = new Scanner(System.in); // Create an instance of scanner
    private static ArrayList<Pet> pets = new ArrayList<>();

    public static void main(String[] arg) {
        /**
         * Menu display
         */
        boolean menu = true;
        while (menu) {
            System.out.println("1. Add pet");
            System.out.println("2. Show all pets");
            System.out.println("3. Edit pet");
            System.out.println("4. Delete pet");
            System.out.println("5. Report");
            System.out.println("6. Exit");
            break;
        }
    }

    private static void addPet() {
        try {
            //Pet Type
            String petType = " ";
            while (true) {
                System.out.println("Enter pet type (Cat / Dog): ");
                petType = input.nextLine();
                if (petType.equalsIgnoreCase("Cat") ||
                        petType.equalsIgnoreCase("Dog")) {
                    break;
                }
                System.out.println("Invalid pet type. Please enter a valid pet type.");
            }
            //Pet Name
            String petName = " ";
            while (true) {
                System.out.println("Enter pet name: ");
                petName = input.nextLine();
                if (petName.isEmpty()) {
                    System.out.println("Name can't be empty. Please enter a valid name.");
                } else {
                    break;
                }
            }
            //Pet Age
            int petAge = 0;
            while (true) {
                System.out.println("Enter pet age: ");
                petAge = input.nextInt();
                input.nextLine(); //Clears buffer
                if (petAge > 0) {
                    break;
                } else {
                    input.nextLine(); //Clear invalid input
                }
                System.out.println("Invalid age. Age must be positive.");
            }
            //Pet Color
            String petColor = " ";
            while (true) {
                System.out.println("Enter pet color: ");
                petColor = input.nextLine();
                if (petColor.isEmpty()) {
                    System.out.println("Color can't be empty. Please enter a valid color.");
                } else {
                    break;
                }
            }

            //Pet Weight
            double petWeight = 0;
            while (true) {
                System.out.println("Enter pet weight: ");
                petWeight = input.nextDouble();
                if (petWeight > 0) {
                    break;
                } else {
                    input.nextLine();
                }
                System.out.println("Invalid weight. Weight must be positive.");
            }
            //Pet Breed
            String petBreed = " ";
            if (petType.equalsIgnoreCase("cat") || petType.equalsIgnoreCase("dog")) {
                while (true) {
                    System.out.println("Enter pet breed: ");
                    petBreed = input.nextLine();
                    if (petBreed.isEmpty()) {
                        System.out.println("Breed can't be empty. Please enter a valid breed.");
                    } else {
                        break;
                    }
                }
            }
            Pet pet = null; //Declare pet obj
            //Create pet
            if (petType.equalsIgnoreCase("dog")) {
                pet = new Dog(petName, petAge, petColor, petWeight, petBreed);
            } else if (petType.equalsIgnoreCase("cat")) {
                pet = new Cat(petName, petAge, petColor, petWeight, petBreed);
            } else {
                System.out.println("Invalid pet type. Please enter a valid pet type.");
            }
            if (pet != null) {
                pets.add(pet);
                System.out.println("Pet added successfully.");
            } else {
                System.out.println("Error adding pet.");
            }

        } catch (Exception e) {
            System.out.println("Error adding pet.");
        }

    }

    private static void showPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets found");
            return;
        }
//List all the pets
        System.out.println("----------=*All Pets*=----------");
        for (Pet pet : pets) {
            if (pet instanceof Dog) { System.out.println("Type: Dog");
            } else if (pet instanceof Cat) { //If cat type = cat
                System.out.println("Type: Cat");
            }
//Get all pet details
            System.out.println("Name: " + pet.getName());
            System.out.println("Age: " + pet.getAge() + " years old");
            System.out.println("Color: " + pet.getColor());
            System.out.println("Weight: " + pet.getWeight() + " KG");
            if (pet instanceof Dog) { //if dog get breed
                System.out.println("Breed: " + ((Dog) pet).getBreed());
            } else if (pet instanceof Cat) { //if cat get breed
                System.out.println("Breed: " + ((Cat) pet).getBreed());
            }
            System.out.println("--------------------------------");//If dog type = dog

            }
        }
    }