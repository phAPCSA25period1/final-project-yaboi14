/**
 * Represents a single clothing item with a type and color.
 * Each ClothingItem is automatically added to a Wardrobe when created.
 * I used AI to write my JavaDocs
 */
public class ClothingItem {
    private String type;
    private String color;

    /**
     * Constructs a ClothingItem with the specified type and color,
     * and adds it to the given Wardrobe.
     *
     * @param type the type of clothing item (e.g., "Shirt", "Pants", "Hat")
     * @param color the color of the clothing item (e.g., "Red", "Blue")
     * @param wardrobe the Wardrobe to which this item will be added
     */
    public ClothingItem(String type, String color, Wardrobe wardrobe){
        this.type = type;
        this.color = color;
        wardrobe.addItem(this);
    }

    /**
     * Returns the type of this clothing item.
     *
     * @return the clothing type
     */
    public String getType(){
        return this.type;
    }

    /**
     * Returns the color of this clothing item.
     *
     * @return the clothing color
     */
    public String getColor(){
        return this.color;
    }

    /**
     * Returns a string representation of the clothing item.
     *
     * @return a formatted string describing the item
     */
    @Override
    public String toString(){
        return color + " " + type;
    }
}
