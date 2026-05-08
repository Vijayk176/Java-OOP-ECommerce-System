//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Product Laptop=new Product(21,"HP Probook",65000,15);
    Customer c1=new Customer(12,"Vijay Kumar","vijayk@gmail.com");
    Order order1=new Order(13,c1,Laptop,2);
    c1.placeOrder(order1);
    c1.displayCustomerInfo();
    c1.displayOrderHistory();
    }
}