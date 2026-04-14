class Restaurant {

    String name;

    FoodItem[] menu = new FoodItem[4];
    int count = 0;

    // Constructor
    Restaurant(String name) {
        this.name = name;
    }

    // Getter
    String getName() {
        return name;
    }

    // UI Banner Method (BOX STYLE)
    void showRestaurantHeader() {

        System.out.println();
        System.out.println("+------------------------------------------------------------+");
        System.out.println("|             SELECT YOUR FAVOURITE RESTAURANT              |");
        System.out.println("+------------------------------------------------------------+");
    }
}
