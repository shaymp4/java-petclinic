import java.util.Scanner;

public class PetClinic {
    private static Scanner input = new Scanner(System.in); // Create an instance of scanner

    public static void main(String[] arg){
        /**
         * Menu display
         */
        boolean menu = true;
        while(menu){
            System.out.println("1. Add pet");
            System.out.println("2. Show all pets");
            System.out.println("3. Edit pet");
            System.out.println("4. Delete pet");
            System.out.println("5. Report");
            System.out.println("6. Exit");
            break;
        }
    }

    private static void addPet(){
        try {
            //Pet Type
            System.out.println("Enter pet type (Cat / Dog): ");
            String petType = input.nextLine();
            if(!petType.equalsIgnoreCase("Cat") &&
            !petType.equalsIgnoreCase("Dog")){
                System.out.println("Invalid pet type. Please enter a valid pet type.");
                addPet();
                return;
            }
            //Pet Name
            System.out.println("Enter name: ");
            String petName = input.nextLine();
            if(petName.isEmpty()){
                System.out.println("Name can't be empty. Please enter a valid name.");
                addPet();
                return;
            }

        } catch (Exception e) {
            System.out.println("Error adding pet.");
        }

    }
}
