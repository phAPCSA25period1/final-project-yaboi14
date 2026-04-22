public class App {
    public static void main(String[] args) throws Exception {
        Wardrobe wardrobe = new Wardrobe();
        ClothingItem shirt1 = new ClothingItem("Shirt","Red","path",wardrobe);
        ClothingItem shirt2 = new ClothingItem("Shirt","Green","path",wardrobe);
        ClothingItem shirt3 = new ClothingItem("Shirt","Blue","path",wardrobe);
        ClothingItem pants1 = new ClothingItem("Pants","Blue","path",wardrobe);
        ClothingItem pants2 = new ClothingItem("Pants","Black","path",wardrobe);
        ClothingItem pants3 = new ClothingItem("Pants","Grey","path",wardrobe);
        ClothingItem hat1 = new ClothingItem("Hat","Purple","path",wardrobe);
         ClothingItem hat2 = new ClothingItem("Hat","Brown","path",wardrobe);
        ClothingItem shoes1 = new ClothingItem("Shoes","Black","path",wardrobe);
        ClothingItem shoes2 = new ClothingItem("Shoes","Red","path",wardrobe);
        ClothingItem shoes3 = new ClothingItem("Shoes","Brown","path",wardrobe);
        System.out.println(shirt1.getColor());

        //wardrobe.seeWardrobe();
        //wardrobe.printItemsByType("shirt");
        //System.out.println(wardrobe.getItemsByType("shirt"));

        Outfit utfit = OutfitGenerator.generateOutfit(wardrobe);
        System.out.print(utfit);
    }
}
