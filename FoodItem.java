class FoodItem 
{
    String name;
    double price;

    // Constructor overloading
    FoodItem(String name, float price) 
    {
        this.name = name;
        this.price = price;
    }

    FoodItem(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    // UI METHOD (MENU BOX)
    void showMenuHeader()
    {
        System.out.println();
        System.out.println("+--------------------------------------+");
        System.out.println("|                MENU                 |");
        System.out.println("+--------------------------------------+");
    }
}
