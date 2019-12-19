package herewegolearninagain;

import javax.swing.JFrame;

/**
 *
 * @author nickv
 */
public class GraphicsLearning {
    
    public static void main(String[] args) {
        JFrame window = new JFrame();
        
        int windLength = 225;
        int windWidth = 245;
        window.setSize(windLength, windWidth);
        window.setTitle("YEET");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        drawingComp yeet = new drawingComp();
                window.add(yeet);
        
    }
}

