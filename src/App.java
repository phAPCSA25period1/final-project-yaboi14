import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        // Create wardrobe
        Wardrobe wardrobe = new Wardrobe();

        // Presaved clothes so they can make an outfit wihout adding more clothes
        ClothingItem redShirt = new ClothingItem("shirt","red",wardrobe);
        ClothingItem blueShirt = new ClothingItem("shirt","blue",wardrobe);
        ClothingItem brownShirt = new ClothingItem("shirt","brown",wardrobe);
        ClothingItem black = new ClothingItem("shirt","black",wardrobe);
        ClothingItem redHat = new ClothingItem("hat","red",wardrobe);
        ClothingItem blueHat = new ClothingItem("hat","blue",wardrobe);
        ClothingItem yellowHat = new ClothingItem("hat","yellow",wardrobe);
        ClothingItem bluePants = new ClothingItem("pants","blue",wardrobe);
        ClothingItem blackPants = new ClothingItem("pants","black",wardrobe);
        ClothingItem greyPants = new ClothingItem("pants","grey",wardrobe);
        ClothingItem blackShoes = new ClothingItem("Shoes","black",wardrobe);
        ClothingItem blueShoes = new ClothingItem("Shoes","blue",wardrobe);
        ClothingItem brownShoes = new ClothingItem("Shoes","brown",wardrobe);

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
