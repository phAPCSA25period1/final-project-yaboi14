public class ClothingItem {
    private String type;
    private String color;
    private String imagePath;

    public ClothingItem(String type, String color, String imagePath){
        this.type = type;
        this.color = color;
        this.imagePath = imagePath;
    }

    public String getType(){
        return this.type;
    }

    public String getColor(){
        return this.color;
    }

    public String getImagePath(){
        return this.imagePath;
    }

    @Override
    public String toString(){
        return "Item type: " + this.type + " Color: " + this.color + " Image Path: " + this.imagePath;
    }
}
