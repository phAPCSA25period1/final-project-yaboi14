public class Outfit {

    private ClothingItem hat;
    private ClothingItem shirt;
    private ClothingItem pants;
    private ClothingItem shoes;

    public Outfit(ClothingItem hat, ClothingItem shirt, ClothingItem pants, ClothingItem shoes){
        this.hat = hat;
        this.shirt = shirt;
        this.pants = pants;
        this.shoes = shoes;
    }

    public ClothingItem getHat(){
        return hat;
    }

    public ClothingItem getShirt(){
        return shirt;
    }

    public ClothingItem getPants(){
        return pants;
    }

    public ClothingItem getShoes(){
        return shoes;
    }

        @Override
    public String toString(){
    return "Hat: " + hat + "\n" +
           "Shirt: " + shirt + "\n" +
           "Pants: " + pants + "\n" +
           "Shoes: " + shoes;
    }

}
