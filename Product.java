public class Product {
    String productCode;
    String productName;
    Double productPrice;
    //constructor
    Product(String name1,String name2,Double name3 ){
        productCode = name1;
        productName = name2;
        productPrice = name3;
    }
    void displayProductDetails(){
        System.out.println(productCode+productName+productPrice);
    }
    public static void main(String args[])
    {
        Product myObj = new Product("123","ProductS", 191);
        myObj.displayProductDetails();
    }
}
