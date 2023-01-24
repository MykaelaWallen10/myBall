import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.net.http.WebSocket;


public class ball{

    private int x,y, size,xSpeed, ySpeed;
    private String Color;
    private int xAdd = 1;


    public ball(int inx, int iny, int insize, int inxSpeed, int inySpeed){
        x = inx;
        y = iny;
        xSpeed = inxSpeed;
        ySpeed = inySpeed;
        size = insize;

    }

    public void draw(Graphics g){

        g.fillOval(x,y,size,size);

    }

    public void move(JPanel bPanel){
        x += xSpeed;
        y += ySpeed;
        if(x>= bPanel.getWidth()-size|| x<=0){
            xSpeed *= -1;

        }
        if(y>= bPanel.getHeight()-size||y<0){
            ySpeed*= -1;
        }


    }

    public void moveRight(){
        x++;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    public int getSize(){
        return size;
    }
}
