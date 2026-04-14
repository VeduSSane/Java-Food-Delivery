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

    // UI METHOD (MENU HEADER)
    void showMenuHeader()
    {
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("                                           MENU");
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}
