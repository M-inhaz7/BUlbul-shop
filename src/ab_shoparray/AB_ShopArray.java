
package ab_shoparray;
import java.util.ArrayList;

class Product{
    int id,stock;
    String name;
    Product(int id, String name,int stock){
        this.id = id;
        this.name=name;
        this.stock = stock;
    }
}
class Manager{
    int id;
    String name;
    ArrayList<Product> p = new ArrayList<Product>();
    ArrayList<Product> Up=new ArrayList<Product>();
    Manager(int id, String name){
        this.id = id;
        this.name = name;
    }
    void addProduct(Product p1){
        p.add(p1);
    }
    void check(ArrayList<Product> P){
        for(Product p1:P){
            if(p1.stock < 100){
                p1.stock+=100;
                Update(p1);
            }
        }
    }
    void Update(Product p){
        Up.add(p);
        System.out.println(name+" "+" has updated "+p.name+" "+p.stock);
    }
}

public class AB_ShopArray {

    public static void main(String[] args) {
        // TODO code application logic here
        Product p = new Product(1,"p",160);
        Product p1 = new Product(1,"p1",60);
        Product p2 = new Product(1,"p2",50);
        Manager m = new Manager(1,"M");
        m.addProduct(p);
        m.addProduct(p2);
        m.addProduct(p2);
        ArrayList<Product> pro = new ArrayList<Product>();
        pro.add(p);
        pro.add(p1);
        pro.add(p2);
        m.check(pro);
    }
    
}
