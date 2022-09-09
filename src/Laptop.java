public class Laptop  {

    private IComponent component;

    public Laptop(IComponent component)
    {
        this.component=component;
    }

    public void showConfiguration()
    {
        component.showConfigaration();
    }




}
