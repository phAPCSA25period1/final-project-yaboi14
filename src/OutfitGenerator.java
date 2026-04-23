import java.util.ArrayList;
import java.util.Random;

public class OutfitGenerator {

    public static Outfit generateOutfit(Wardrobe wardrobe){
        Random rand = new Random();

        ArrayList<ClothingItem> hats = wardrobe.getItemsByType("hat");
        ArrayList<ClothingItem> shirts = wardrobe.getItemsByType("shirt");
        ArrayList<ClothingItem> pants = wardrobe.getItemsByType("pants");
        ArrayList<ClothingItem> shoes = wardrobe.getItemsByType("shoes");


        if(hats.isEmpty() || shirts.isEmpty() || pants.isEmpty() || shoes.isEmpty()){
            System.out.println("Not enough items to generate outfit!");
            return null;
        }

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
