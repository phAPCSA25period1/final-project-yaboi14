import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Create wardrobe
        Wardrobe wardrobe = new Wardrobe();

        // Presaved clothes
        ClothingItem redShirt = new ClothingItem("shirt","red",wardrobe);
        ClothingItem blueShirt = new ClothingItem("shirt","blue",wardrobe);
        ClothingItem brownShirt = new ClothingItem("shirt","brown",wardrobe);
        ClothingItem blackShirt = new ClothingItem("shirt","black",wardrobe);

        ClothingItem redHat = new ClothingItem("hat","red",wardrobe);
        ClothingItem blueHat = new ClothingItem("hat","blue",wardrobe);
        ClothingItem yellowHat = new ClothingItem("hat","yellow",wardrobe);

        ClothingItem bluePants = new ClothingItem("pants","blue",wardrobe);
        ClothingItem blackPants = new ClothingItem("pants","black",wardrobe);
        ClothingItem greyPants = new ClothingItem("pants","grey",wardrobe);

        ClothingItem blackShoes = new ClothingItem("shoes","black",wardrobe);
        ClothingItem blueShoes = new ClothingItem("shoes","blue",wardrobe);
        ClothingItem brownShoes = new ClothingItem("shoes","brown",wardrobe);

        Scanner scan = new Scanner(System.in);

        OutfitManager manager = new OutfitManager();

        // Main program loop
        while (true) {

            System.out.println("\n===== Outfit Generator Menu =====");
            System.out.println("1. Add Clothing Item");
            System.out.println("2. Generate Outfit");
            System.out.println("3. View Saved Outfits");
            System.out.println("4. View Wardrobe");
            System.out.println("5. Exit");

            String choice = scan.next();

            // Add clothing item
            if (choice.equals("1")) {

                System.out.println("\nEnter clothing type (Hat, Shirt, Pants, Shoes):");
                String type = scan.next();

                while (!(type.equalsIgnoreCase("hat") ||
                         type.equalsIgnoreCase("shirt") ||
                         type.equalsIgnoreCase("pants") ||
                         type.equalsIgnoreCase("shoes"))) {

                    System.out.println("Invalid type. Please enter Hat, Shirt, Pants, or Shoes:");
                    type = scan.next();
                }

                System.out.println("Enter clothing color:");
                String color = scan.next();

                new ClothingItem(type, color, wardrobe);

                System.out.println("Clothing item added!");
            }

            // Generate outfit
            else if (choice.equals("2")) {

                Outfit fit1 = OutfitGenerator.generateOutfit(wardrobe);

                if (fit1 != null) {

                    System.out.println("\nGenerated Outfit:");
                    System.out.println(fit1);

                    while (true) {

                        System.out.println("\nWould you like to save the outfit? (yes/no)");
                        String saveAnswer = scan.next();

                        if (saveAnswer.equalsIgnoreCase("yes")) {
                            manager.saveOutfit(fit1);
                            System.out.println("Outfit saved!");
                            break;
                        }

                        else if (saveAnswer.equalsIgnoreCase("no")) {
                            break;
                        }

                        else {
                            System.out.println("Invalid input.");
                        }
                    }
                }
            }

            // View saved outfits
            else if (choice.equals("3")) {
                manager.displayOutfits();
            }

            // View wardrobe
            else if (choice.equals("4")) {
                wardrobe.seeWardrobe();
            }

            // Exit
            else if (choice.equals("5")) {
                System.out.println("Goodbye!");
                break;
            }

            // Invalid menu option
            else {
                System.out.println("Invalid option.");
            }
        }

        scan.close();
    }
}
