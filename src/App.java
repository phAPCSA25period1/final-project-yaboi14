public class App {
    public static void main(String[] args) throws Exception {
        Wardrobe wardrobe = new Wardrobe();
        ClothingItem shirt1 = new ClothingItem("Shirt","Red","path");
        ClothingItem shirt2 = new ClothingItem("Shirt","Green","path");
        ClothingItem shirt3 = new ClothingItem("Shirt","Blue","path");
        ClothingItem pants = new ClothingItem("Pants","Blue","path");
        ClothingItem hat = new ClothingItem("Hat","Purple","path");
        ClothingItem shoes = new ClothingItem("Shoes","Black","path");
        System.out.println(shirt1.getColor());
        wardrobe.addItem(shirt1);
        wardrobe.addItem(shirt2);
        wardrobe.addItem(shirt3);
        wardrobe.addItem(pants);
        wardrobe.addItem(hat);
        wardrobe.addItem(shoes);

        wardrobe.seeWardrobe();
        wardrobe.printItemsByType("shirt");
        wardrobe.getItemType("shirt");

    }
}
