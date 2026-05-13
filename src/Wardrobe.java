import java.util.ArrayList;

/**
 * Represents a collection of ClothingItem objects.
 * Provides methods to add items, view all items,
 * and filter items by type.
 * I used AI to write these JavaDoc
 */
public class Wardrobe {
    ArrayList<ClothingItem> wardrobe = new ArrayList<>();

    /**
     * Adds a ClothingItem to the wardrobe.
     *
     * @param clothingItem the item to be added
     */
    public void addItem(ClothingItem clothingItem){
        wardrobe.add(clothingItem);
    }

    /**
     * Prints all clothing items currently in the wardrobe.
     * Displays each item with a number.
     */
    public void seeWardrobe(){

        if(wardrobe.isEmpty()){
            System.out.println("Wardrobe is empty!");
            return;
        }

        for(int i = 0; i < wardrobe.size(); i++){
            System.out.println((i + 1) + ". " + wardrobe.get(i));
        }
    }

    /**
     * Prints all clothing items that match the specified type.
     * The comparison is case-insensitive.
     *
     * @param type the type of clothing items to display
     */
    public void printItemsByType(String type) {
        for (ClothingItem item : wardrobe) {
            if (item.getType().equalsIgnoreCase(type)) {
                System.out.println(item);
            }
        }
    }

    /**
     * Returns a list of clothing items that match the specified type.
     * The comparison is case-insensitive.
     *
     * @param type the type of clothing items to search for
     * @return an ArrayList containing all matching items;
     *         returns an empty list if no matches are found
     */
    public ArrayList<ClothingItem> getItemsByType(String type){
        ArrayList<ClothingItem> matches = new ArrayList<>();

        for(ClothingItem item : wardrobe){
            if(item.getType().equalsIgnoreCase(type)){
                matches.add(item);
            }
        }

        return matches;
    }
}
