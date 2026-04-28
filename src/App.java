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


        // Create manager
        OutfitManager manager = new OutfitManager();

        // Generate and save multiple outfits
        for(int i = 0; i < 5; i++){
            Outfit outfit = OutfitGenerator.generateOutfit(wardrobe);

            if(outfit != null){
                manager.saveOutfit(outfit);
            }
        }

        // Display saved outfits
        manager.displayOutfits();
    }
}
