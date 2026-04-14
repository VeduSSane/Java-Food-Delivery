class Cart 
{
    FoodItem[] items = new FoodItem[10];
    int count = 0;

    // Add item to cart
    void addItem(FoodItem f)
    {
        items[count] = f;
        count++;

        System.out.println("ITEM ADDED TO YOUR CART");
    }

    // Show cart
    void showCart()
    {
        System.out.println("\n+----------- CART -----------+");

        for (int i = 0; i < count; i++)
        {
            System.out.println(items[i].name + " - ₹" + items[i].price);
        }

        System.out.println("+----------------------------+");
    }

    // Total bill
    double getTotal()
    {
        double total = 0;

        for (int i = 0; i < count; i++)
        {
            total = total + items[i].price;
        }

        return total;
    }
}
