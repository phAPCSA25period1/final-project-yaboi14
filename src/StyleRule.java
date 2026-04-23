public class StyleRule {

    public static boolean isValid(Outfit outfit){
        return noSameColor(outfit) && noClashingColors(outfit);
    }

    private static boolean noSameColor(Outfit outfit){
        String hatColor = outfit.getHat().getColor();
        String shirtColor = outfit.getShirt().getColor();
        String pantsColor = outfit.getPants().getColor();
        String shoesColor = outfit.getShoes().getColor();

        return !(hatColor.equals(shirtColor) ||
                 shirtColor.equals(pantsColor) ||
                 pantsColor.equals(shoesColor));
    }

    private static boolean noClashingColors(Outfit outfit){

    String[] colors = {
        outfit.getHat().getColor().toLowerCase(),
        outfit.getShirt().getColor().toLowerCase(),
        outfit.getPants().getColor().toLowerCase(),
        outfit.getShoes().getColor().toLowerCase()
    };

    for(int i = 0; i < colors.length; i++){
        for(int j = i + 1; j < colors.length; j++){

            String c1 = colors[i];
            String c2 = colors[j];

            if ((c1.equals("hot pink") && c2.equals("red")) ||
                (c1.equals("red") && c2.equals("hot pink")) ||

                (c1.equals("orange") && c2.equals("green")) ||
                (c1.equals("green") && c2.equals("orange")) ||

                (c1.equals("blue") && c2.equals("yellow")) ||
                (c1.equals("yellow") && c2.equals("blue")) ||

                (c1.equals("black") && c2.equals("brown")) ||
                (c1.equals("brown") && c2.equals("black"))) {

                return false;
            }
        }
    }

    return true;
}

}
