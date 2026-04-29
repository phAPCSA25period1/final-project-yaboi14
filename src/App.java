import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        // Create wardrobe
        Wardrobe wardrobe = new Wardrobe();

        // Add items
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Add new clothing item to wardrobe!");
            System.out.println("Item Type (Hat,Shirt,Pants, or Shoes):");
            String type = scan.next();

            while (true) {
                if(!(type.equalsIgnoreCase("hat") || type.equalsIgnoreCase("shirt") || type.equalsIgnoreCase("pants") || type.equalsIgnoreCase("shoes"))){
                System.out.println("Please give valid answer, choose between Hat, Shirt, Pants, or Shoes " );
                type = scan.next();
                }
                else{
                    break;
                }
            }

            System.out.println("Clothing Color: ");
            String color = scan.next();

            new ClothingItem(type,color,wardrobe);
            System.out.println("");
            System.out.println("Add more clothing?");
            String answer = scan.next();
            if(answer.equalsIgnoreCase("no")){
                break;
            }
            if(!answer.equalsIgnoreCase("yes")|| !answer.equalsIgnoreCase("no")){
                System.out.println("Give valid answer (yes or no)");
            }
        }

        OutfitManager manager = new OutfitManager();

    while (true) {

        System.out.println("\nWould you like to generate an outfit? (yes/no)");
        String answer = scan.next();

        if(answer.equalsIgnoreCase("no")){
            break;
        }

        if(answer.equalsIgnoreCase("yes")){

            Outfit fit1 = OutfitGenerator.generateOutfit(wardrobe);

            if(fit1 != null){
                System.out.println("\nGenerated Outfit:");
                System.out.println(fit1);

            // SAVE?
                while (true) {
                    System.out.println("Would you like to save the outfit? (yes/no)");
                    String answer2 = scan.next();

                    if(answer2.equalsIgnoreCase("yes")){
                        manager.saveOutfit(fit1);
                        System.out.println("Outfit saved!");
                        break;
                    }
                    else if(answer2.equalsIgnoreCase("no")){
                        break;
                    }
                    else{
                        System.out.println("Invalid input.");
                    }
                }
            }
        }
        else{
            System.out.println("Please enter yes or no.");
            }
        }
    }
}
