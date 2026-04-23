public class App {
    public static void main(String[] args) throws Exception {
        Wardrobe wardrobe = new Wardrobe();
        ClothingItem shirt1 = new ClothingItem("Shirt","Red",wardrobe);
        ClothingItem shirt2 = new ClothingItem("Shirt","Green",wardrobe);
        ClothingItem shirt3 = new ClothingItem("Shirt","Blue",wardrobe);
        ClothingItem pants1 = new ClothingItem("Pants","Blue",wardrobe);
        ClothingItem pants2 = new ClothingItem("Pants","Black",wardrobe);
        ClothingItem pants3 = new ClothingItem("Pants","Grey",wardrobe);
        ClothingItem hat1 = new ClothingItem("Hat","Purple",wardrobe);
         ClothingItem hat2 = new ClothingItem("Hat","Brown",wardrobe);
        ClothingItem shoes1 = new ClothingItem("Shoes","Black",wardrobe);
        ClothingItem shoes2 = new ClothingItem("Shoes","Red",wardrobe);
        ClothingItem shoes3 = new ClothingItem("Shoes","Brown",wardrobe);
        System.out.println(shirt1.getColor());

        //wardrobe.seeWardrobe();
        //wardrobe.printItemsByType("shirt");
        //System.out.println(wardrobe.getItemsByType("shirt"));

        Outfit utfit = OutfitGenerator.generateOutfit(wardrobe);
        System.out.print(utfit);
    }
}
