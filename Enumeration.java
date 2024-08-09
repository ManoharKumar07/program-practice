enum Laptop{
    Macbook(2000),Xps(2200),Hp(1800),Surface;
    int price;
    private Laptop(int val)
{
this.price =val;
System.out.println("Custom:"+this.name());
}
private Laptop()
{
this.price =500;
System.out.println("default:"+this.name());
}
public int getPrice(){
    return price;
}
}
class Enumeration{
    public static void main(String[] args) {
        System.out.println("Hii started main");
        Laptop lap =Laptop.Macbook;

        System.out.println("geyclass==="+lap.getClass()+"getName=="+lap.getClass().getSuperclass());
        System.out.println(lap+":"+lap.getPrice());
    }
}