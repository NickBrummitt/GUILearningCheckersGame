package herewegolearninagain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * Creates Checkers board
 * @author nickv
 */
public class drawingComp extends JComponent{
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        Color red = new Color(255, 0, 0);
        Color blue = new Color(0, 0, 255);
        
        for(int i = 2; i < 225 - 23; i = i + 25){
            for(int j = 2; j < 225 - 23; j = j + 25){
                Rectangle rect = new Rectangle(i, j, 25, 25);
                g2.draw(rect);
                if (i%2 == 1 && j%2 == 0){
                    g2.fill(rect);
                }
                if (i%2 == 0 && j%2 == 1){
                    g2.fill(rect);
                }
            }
        }
    }  
}
