public class Main {
    public static void main(String[] args) {

        IComponent component=new Asus("IntelCorei3","MSIA320M","GT710-2GD3-V 2GB","Vulcan Z 8GB DDR4 3200MHz ");
        IComponent component1=new HP("IntelCorei4","A320M","2GB","4GB DDR4 3200MHz ");
        IComponent component2=new Dell("AMD Athlon 3000G Processor","Gigabyte H310M S2P 8th Gen ","Gigabyte GeForce GT 1030 ","TEAM ELITE SO-DIMM DDR4 8GB 2400MHz Laptop RAM ");

        Laptop laptop=new Laptop(component);
        Laptop laptop1=new Laptop(component1);
        Laptop laptop2=new Laptop(component2);


        laptop2.showConfiguration();
        laptop1.showConfiguration();

        laptop.showConfiguration();



    }
}
