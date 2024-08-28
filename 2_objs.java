class Mobile{
    String brand;
    int price;
    static String name;
    
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 20_000;
        Mobile.name = "phone";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 80_000;
        Mobile.name = "phone";
        
        obj1.show();
        obj2.show();
    }
}


//output by creating 2 objects created..
//op: Samsung : 20000 : phone
//    Apple : 80000 : phone
