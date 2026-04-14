class Restaurant {

    String name;

    FoodItem[] menu = new FoodItem[4];
    int count = 0;

    // Constructor
    Restaurant(String name) {
        this.name = name;

        // UI PRINT INSIDE CONSTRUCTOR (NO VOID METHOD USED)
        System.out.println();
        System.out.println("+------------------------------------------------------------+");
        System.out.println("|             SELECT YOUR FAVOURITE RESTAURANT              |");
        System.out.println("+------------------------------------------------------------+");
    }

    String getName() {
        return name;
    }
}
