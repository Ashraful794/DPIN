public class Main {
    public static void main(String[] args) {

        IComponent component=new Asus("IntelCorei3","MSIA320M","GT710-2GD3-V 2GB","Vulcan Z 8GB DDR4 3200MHz ");
        IComponent component1=new HP("IntelCorei4","A320M","2GB","4GB DDR4 3200MHz ");


        Laptop laptop=new Laptop(component);
        Laptop laptop1=new Laptop(component1);

        laptop1.showConfiguration();

        laptop.showConfiguration();



    }
}
