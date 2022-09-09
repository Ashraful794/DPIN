public class IComponent {
    private String processor;
    private String motherBoard;
    private String graphicsCard;
    private String ram;

    public IComponent(){};
    public IComponent(String processor, String motherBoard, String graphicsCard, String ram) {
        this.processor = processor;
        this.motherBoard = motherBoard;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void showConfigaration(){};


}
