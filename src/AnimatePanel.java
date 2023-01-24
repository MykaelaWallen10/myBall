//ballPanel

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// Creating my own Panel class that inherits from JPanel
public class AnimatePanel extends JPanel
{

    ball[] balls = new ball[100];
ball balll;

    public AnimatePanel()
    {
         balll = new ball((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));

        setPreferredSize(new Dimension(400,400));
        setBackground(Color.BLUE);
        for(int i = 0; i< balls.length; i++){
            balls[i] = new ball((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
        }

this.setFocusable(true);
this.addKeyListener(new KeyListener() {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        int blah = e.getKeyCode();

        if (blah == 68){
            balll.moveRight();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
});
    }

    // overriding the paintComponent method inherited
    // this method automatically gets called by JVM
    // Graphics class is in java.awt package

    @Override
    protected void paintComponent(Graphics g)
    {
        // calling the paintComponent method I overroad
        super.paintComponent(g);
        balll.draw(g);
//        for(int i = 0; i< balls.length; i++){
//            balls[i].draw(g);
//            balls[i].move(this);
//
//        }


        g.setColor(Color.RED);
        //g.fillOval(x,40,20,20);

        // If the ball hits the right edge change what we add each time
        //if(x >= 400)
        //xAdd = -1;

        //else if (x <= 0)
        //xAdd = 1;

        // update the location of the ball
        //x = x + xAdd;

        // pause the program
        try
        {
            Thread.sleep(10);

        }
        catch(Exception blah)
        {
            System.out.println(blah.toString());
        }

        repaint(); // calls paintComponent again



    }



}
