public class OutfitManager {

    private ClothingItem[][] savedOutfits = new ClothingItem[4][10];
    private int outfitCount = 0;

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

    public void displayOutfits(){
        for(int col = 0; col < outfitCount; col++){
            System.out.println("Outfit " + (col + 1) + ":");

            System.out.println("Hat: " + savedOutfits[0][col]);
            System.out.println("Shirt: " + savedOutfits[1][col]);
            System.out.println("Pants: " + savedOutfits[2][col]);
            System.out.println("Shoes: " + savedOutfits[3][col]);

            System.out.println("-----");
        }
    }
}

