import java.util.ArrayList;
import java.util.Random;

/**
 * Generates Outfit objects from items stored in a Wardrobe.
 * Selects random clothing items by type and ensures the outfit
 * follows defined style rules.
 * I used AI for these JavaDoc
 */
public class OutfitGenerator {
    // Tracks how many outfits have been generated
    private static int generatedCount = 0;

        /**
     * Generates a valid Outfit using random items from the given Wardrobe.
     * Items are selected by type (hat, shirt, pants, shoes).
     * The method will keep generating combinations until a valid outfit
     * (based on StyleRule) is found.
     *
     * If any required clothing type is missing, the method will return null.
     *
     * @param wardrobe the Wardrobe containing available clothing items
     * @param favoriteColor the user's favorite color
     * @return a valid Outfit object, or null if generation is not possible
     */
    public static Outfit generateOutfit(Wardrobe wardrobe, String favoriteColor){

        Random rand = new Random();

        ArrayList<ClothingItem> hats = wardrobe.getItemsByType("hat");
        ArrayList<ClothingItem> shirts = wardrobe.getItemsByType("shirt");
        ArrayList<ClothingItem> pants = wardrobe.getItemsByType("pants");
        ArrayList<ClothingItem> shoes = wardrobe.getItemsByType("shoes");

        // Check if all required categories have at least one item
        if(hats.isEmpty() || shirts.isEmpty() || pants.isEmpty() || shoes.isEmpty()){
            System.out.println("Not enough items to generate outfit!");
            return null;
        }

        // Prevent infinite loop
        for(int attempts = 0; attempts < 100; attempts++){

            ClothingItem hat = hats.get(rand.nextInt(hats.size()));
            ClothingItem shirt = shirts.get(rand.nextInt(shirts.size()));
            ClothingItem pant = pants.get(rand.nextInt(pants.size()));
            ClothingItem shoe = shoes.get(rand.nextInt(shoes.size()));

            Outfit outfit = new Outfit(hat, shirt, pant, shoe);

            if(StyleRule.isValid(outfit)){

                generatedCount++;

                // Favorite color bonus
                if(hasFavoriteColor(outfit, favoriteColor)){
                    System.out.println("Favorite color bonus!");
                }

                return outfit;
            }
        }

        System.out.println("Could not generate valid outfit.");
        return null;
    }

    /**
 * Checks if the outfit contains the user's favorite color.
 *
 * @param outfit the outfit to check
 * @param favoriteColor the user's favorite color
 * @return true if the outfit contains the favorite color
 */
private static boolean hasFavoriteColor(Outfit outfit, String favoriteColor){

    return outfit.getHat().getColor().equalsIgnoreCase(favoriteColor) ||
           outfit.getShirt().getColor().equalsIgnoreCase(favoriteColor) ||
           outfit.getPants().getColor().equalsIgnoreCase(favoriteColor) ||
           outfit.getShoes().getColor().equalsIgnoreCase(favoriteColor);
    }

    /**
     * Returns the number of outfits generated.
     *
     * @return total generated outfits
     */
    public static int getGeneratedCount(){
        return generatedCount;
    }
}
