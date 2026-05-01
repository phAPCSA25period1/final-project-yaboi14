/**
 * Provides validation rules for determining whether an Outfit is acceptable.
 * Combines multiple style checks such as color matching and clashing rules.
 * I used AI for these JavaDoc
 */
public class StyleRule {

    /**
     * Determines whether an Outfit is valid based on all style rules.
     *
     * @param outfit the Outfit to validate
     * @return true if the outfit passes all style rules; false otherwise
     */
    public static boolean isValid(Outfit outfit){
        return noSameColor(outfit) && noClashingColors(outfit);
    }

    /**
     * Ensures that no adjacent clothing items share the same color.
     *
     * @param outfit the Outfit to check
     * @return true if no adjacent items have the same color; false otherwise
     */
    private static boolean noSameColor(Outfit outfit){
        String hatColor = outfit.getHat().getColor();
        String shirtColor = outfit.getShirt().getColor();
        String pantsColor = outfit.getPants().getColor();
        String shoesColor = outfit.getShoes().getColor();

        return !(hatColor.equals(shirtColor) ||
                 shirtColor.equals(pantsColor) ||
                 pantsColor.equals(shoesColor));
    }

    /**
     * Ensures that no two clothing items have clashing color combinations.
     * Specific disallowed color pairs are hardcoded.
     *
     * @param outfit the Outfit to check
     * @return true if no colors clash; false if a disallowed combination is found
     */
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
