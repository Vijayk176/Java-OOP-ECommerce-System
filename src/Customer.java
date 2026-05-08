public class Customer {
    int customerId;
    String name;
    String email;

    Order[] orderHistory = new Order[5];
    int orderCount = 0;

    static  Customer[] customersList=new Customer[15];
    static int customerCount=0;

    Customer(int customerId, String name, String email){
        this.customerId=customerId;
        this.name=name;
        this.email=email;
    }
    void displayCustomerInfo(){
        System.out.println("CustomerID: "+customerId);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
    }
    void placeOrder(Order order) {
        if (orderCount < orderHistory.length) {
            orderHistory[orderCount] = order;
            orderCount++;
//            System.out.println(name + " placed an order for " + order.product.name);
        }
    }
     void displayOrderHistory() {
            for (int i = 0; i < orderCount; i++) {
                orderHistory[i].displayOrderDetails();
            }
        }
    }



