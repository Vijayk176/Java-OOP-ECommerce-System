public class Order {
    int orderId;
    Customer customer;
    Product product;
    int quantity;
    double totalAmount;

    Order(int orderId, Customer customer, Product product, int quantity){
        this.orderId=orderId;
        this.customer=customer;
        this.product=product;
        this.quantity=quantity;
        this.totalAmount=calculateTotal();
    }
    double calculateTotal(){
        return quantity*product.price;
    }
    void displayOrderDetails(){
        System.out.println("OrderId: "+orderId);
        System.out.println("Customer Name: "+customer.name);
        System.out.println("Product: "+product.name);
        System.out.println("Quantity: "+ quantity);
        System.out.println("Total Amount: " + (product.price * quantity));
    }

}
