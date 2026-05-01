/**
 * Represents a complete outfit consisting of a hat, shirt, pants, and shoes.
 * Each component is a ClothingItem.
 * I used AI for these JavaDoc
 */
public class Outfit {

    private ClothingItem hat;
    private ClothingItem shirt;
    private ClothingItem pants;
    private ClothingItem shoes;

    /**
     * Constructs an Outfit with the specified clothing items.
     *
     * @param hat the hat component of the outfit
     * @param shirt the shirt component of the outfit
     * @param pants the pants component of the outfit
     * @param shoes the shoes component of the outfit
     */
    public Outfit(ClothingItem hat, ClothingItem shirt, ClothingItem pants, ClothingItem shoes){
        this.hat = hat;
        this.shirt = shirt;
        this.pants = pants;
        this.shoes = shoes;
    }

    /**
     * Returns the hat in the outfit.
     *
     * @return the hat ClothingItem
     */
    public ClothingItem getHat(){
        return hat;
    }

    /**
     * Returns the shirt in the outfit.
     *
     * @return the shirt ClothingItem
     */
    public ClothingItem getShirt(){
        return shirt;
    }

    /**
     * Returns the pants in the outfit.
     *
     * @return the pants ClothingItem
     */
    public ClothingItem getPants(){
        return pants;
    }

    /**
     * Returns the shoes in the outfit.
     *
     * @return the shoes ClothingItem
     */
    public ClothingItem getShoes(){
        return shoes;
    }

    /**
     * Returns a string representation of the outfit.
     *
     * @return a formatted string listing all clothing items in the outfit
     */
    @Override
    public String toString(){
        return "Hat: " + hat + "\n" +
               "Shirt: " + shirt + "\n" +
               "Pants: " + pants + "\n" +
               "Shoes: " + shoes;
    }
}
