/**
 * Manages the storage and display of multiple Outfit objects.
 * Uses a 2D array to store clothing items for up to 10 outfits.
 * Each column represents a single outfit, and each row represents
 * a clothing category (hat, shirt, pants, shoes).
 * I used AI for these JavaDoc
 */
public class OutfitManager {

    private ClothingItem[][] savedOutfits = new ClothingItem[4][10];
    private int outfitCount = 0;

    /**
     * Saves an Outfit into the 2D array storage.
     * Each clothing item is stored in a specific row:
     * 0 = hat, 1 = shirt, 2 = pants, 3 = shoes.
     *
     * If storage is full, the outfit will not be saved.
     *
     * @param outfit the Outfit to be saved
     */
    public void saveOutfit(Outfit outfit){
        if(outfitCount >= savedOutfits[0].length){
            System.out.println("Storage full!");
            return;
        }

        savedOutfits[0][outfitCount] = outfit.getHat();
        savedOutfits[1][outfitCount] = outfit.getShirt();
        savedOutfits[2][outfitCount] = outfit.getPants();
        savedOutfits[3][outfitCount] = outfit.getShoes();

        outfitCount++;
    }

    /**
     * Displays all saved outfits.
     * Each outfit is printed with its clothing items listed in order.
     */
    public void displayOutfits(){
        for(int col = 0; col < outfitCount; col++){
            System.out.println("Outfit " + (col + 1) + ":");

            System.out.println(savedOutfits[0][col]);
            System.out.println(savedOutfits[1][col]);
            System.out.println(savedOutfits[2][col]);
            System.out.println(savedOutfits[3][col]);

            System.out.println("-----");
        }
    }
}
