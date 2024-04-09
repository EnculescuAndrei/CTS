import java.util.ArrayList;
import java.util.List;

interface GUIComponent{
    void draw();
}
class Button implements GUIComponent
{
    @Override
    public void draw() {
        System.out.println("Drawing button");
    }
}
class Panel implements GUIComponent
{
    private List<GUIComponent> components = new ArrayList<>();
    @Override
    public void draw() {
        System.out.println("Drawing panel");
        for (GUIComponent component : components){
            component.draw();
        }
    }
    public void addComponent(GUIComponent component){
        components.add(component);
    }
}


public class Composite {
    public static void main(String[] args)
    {
        Button btn1=new Button();
        Button btn2=new Button();
        Panel panel = new Panel();
        panel.addComponent(btn1);
        panel.addComponent(btn2);
        panel.draw();
    }
}