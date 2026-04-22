import java.util.ArrayList;

public class Wardrobe {
    ArrayList<ClothingItem> wardrobe = new ArrayList<>();

    public void addItem(ClothingItem clothingItem){
        wardrobe.add(clothingItem);
    }

    public void seeWardrobe(){
        for (ClothingItem item : wardrobe) {
            System.out.println(item);
        }
    }

    public void printItemsByType(String type) {
        for (ClothingItem item : wardrobe) {
            if (item.getType().equalsIgnoreCase(type)) {
                System.out.println(item);
                }
        }
    }

    public ArrayList<ClothingItem> getItemsByType(String type){
        ArrayList<ClothingItem> matches = new ArrayList<>();

        for(ClothingItem item : wardrobe){
            if(item.getType().equalsIgnoreCase(type)){
                matches.add(item);
            }
        }

        return matches;
    }


}

