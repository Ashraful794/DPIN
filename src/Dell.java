public class Dell extends IComponent {

    public Dell(){};

    public Dell(String processor, String motherBoard, String graphicsCard, String ram)
    {
        super(processor,motherBoard,graphicsCard,ram);
    }


    public void showConfigaration()
    {
        System.out.println("Processor: "+this.getProcessor()+"MotherBoard: "+this.getMotherBoard()
                +"Graphics Card: "+this.getGraphicsCard()+"Ram "+this.getRam());
    }
}
