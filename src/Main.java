import javax.swing.*;
        import java.awt.*;
public class Main{
    public static void main(String[] args){
        JFrame myFrame = new JFrame();
        myFrame.setSize(400,300);
        AnimatePanel bPanel = new AnimatePanel();
String blah = "testing push";

        //myFrame.add(bPanel);
        myFrame.add(bPanel);
        myFrame.setVisible(true);
    }
}