public class Product {
    int productId;
    String name;
    double price;
    int stock;
    static Product[] productList = new Product[100];
    static int productCount = 0;

    Product(int productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        }
    }

    void displayProductInfo() {
        System.out.println("ProductId: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }

    // Method to add products to the list
    void addProduct(Product product) {
        if (productCount < productList.length) {
            productList[productCount] = product;
            productCount++;
        }
        else{
            System.out.println("No More Enough space to add product..");
        }
    }
}