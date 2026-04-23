public class ClothingItem {
    private String type;
    private String color;

    public ClothingItem(String type, String color, Wardrobe wardrobe){
        this.type = type;
        this.color = color;
        wardrobe.addItem(this);
    }

    public String getType(){
        return this.type;
    }

    public String getColor(){
        return this.color;
    }


    @Override
    public String toString(){
        return "Item type: " + this.type + " Color: " + this.color;
    }
}
