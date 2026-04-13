public class ClothingItem {
    private String itemName;
    private String color;
    private String imagePath;

    public ClothingItem(String itemName, String color, String imagePath){
        this.itemName = itemName;
        this.color = color;
        this.imagePath = imagePath;
    }

    public String getItemName(){
        return this.itemName;
    }

    public String getColor(){
        return this.color;
    }

    public String getImagePath(){
        return this.imagePath;
    }

    @Override
    public String toString(){
        return "Item: " + this.itemName + " Color: " + this.color + " Image Path: " + this.imagePath;
    }
}
