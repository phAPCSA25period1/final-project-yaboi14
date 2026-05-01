import java.util.ArrayList;
import java.util.Random;

/**
 * Generates Outfit objects from items stored in a Wardrobe.
 * Selects random clothing items by type and ensures the outfit
 * follows defined style rules.
 * I used AI for these JavaDoc
 */
public class OutfitGenerator {

    /**
     * Generates a valid Outfit using random items from the given Wardrobe.
     * Items are selected by type (hat, shirt, pants, shoes).
     * The method will keep generating combinations until a valid outfit
     * (based on StyleRule) is found.
     *
     * If any required clothing type is missing, the method will return null.
     *
     * @param wardrobe the Wardrobe containing available clothing items
     * @return a valid Outfit object, or null if generation is not possible
     */
    public static Outfit generateOutfit(Wardrobe wardrobe){
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

        // Keep generating until a valid outfit is found
        while(true){
            ClothingItem hat = hats.get((int) (Math.random() * hats.size()));
            ClothingItem shirt = shirts.get((int) (Math.random() * shirts.size()));
            ClothingItem pant = pants.get((int) (Math.random() * pants.size()));
            ClothingItem shoe = shoes.get((int) (Math.random() * shoes.size()));

            Outfit outfit = new Outfit(hat, shirt, pant, shoe);

            if(StyleRule.isValid(outfit)){
                return outfit;
            }
        }
    }
}
