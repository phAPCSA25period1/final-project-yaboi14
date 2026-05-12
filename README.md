# Outfit Generator

## What This Software Does
Outfit Generator is a Java program that allows users to create and manage a digital wardrobe. The program can randomly generate outfits using clothing items stored in the wardrobe while following built-in style rules to avoid clashing colors and repeated color combinations.

Users can:
- Add clothing items to the wardrobe
- View all stored clothing items
- Generate randomized outfits
- Save generated outfits
- View previously saved outfits

The program uses object-oriented programming concepts and multiple interacting classes to organize clothing, outfits, wardrobe storage, outfit generation, and style validation.

---

## Who It’s For
This software is designed for users who want help creating outfit combinations from clothing they own. It solves the problem of choosing outfits by automatically generating clothing combinations while following simple style rules.

---

## How to Run the Program

1. Open the project in a Java IDE such as:
   - VS Code


2. Compile all Java files.

3. Run the `App.java` file.

4. Use the menu to:
   - Add clothing items
   - Generate outfits
   - Save outfits
   - View the wardrobe
   - View saved outfits

---

## Technical Overview

### Main Classes

#### `App`
The main driver class that runs the menu system and handles user interaction.

#### `ClothingItem`
Represents a single clothing item with:
- clothing type
- clothing color

#### `Wardrobe`
Stores all clothing items using an `ArrayList<ClothingItem>` and provides methods to search and display items.

#### `Outfit`
Represents a complete outfit containing:
- hat
- shirt
- pants
- shoes

#### `OutfitGenerator`
Generates random outfits from the wardrobe and checks if they follow style rules.

#### `StyleRule`
Validates outfits by checking:
- repeated colors
- clashing color combinations

#### `OutfitManager`
Stores saved outfits using a purposeful 2D array:
```java
ClothingItem[][] savedOutfits
