public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedFish1 = ShapeCache.getShape("4");
        System.out.println("Shape : " + clonedFish1.getType());

        Shape clonedFish2 = ShapeCache.getShape("4");
        System.out.println("Shape : " + clonedFish2.getType());

        // Compare two cloned Fish
        if (clonedFish1.equals(clonedFish2)) {
            System.out.println("Two cloned Fish are equal! Here is the fish image:");
            printFishImage();
        } else {
            System.out.println("Two cloned Fish are not equal!");
        }
    }

    private static void printFishImage() {
        String[] fishArt = new String[]{
            "    ><(((('>",
            
            "    ><<((((:>>    ",
           
        };
        for (String line : fishArt) {
            System.out.println(line);
        }
    }
}
