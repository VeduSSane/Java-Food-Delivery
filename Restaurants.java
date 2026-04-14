class Restaurant {

    String name;

    FoodItem[] menu = new FoodItem[4];
    int count = 0;

    // Constructor
    Restaurant(String name) {
        this.name = name;
    }

    // Getter method
    String getName() {
        return name;
    }
}
