package herewegolearninagain;

import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Creates Checkers board
 *
 * @author nickv
 */
public class CheckerBoard {

    private Rectangle[] rects;

    public CheckerBoard() {
        this.rects = new Rectangle[64];
        this.createBoard();
    }

    public void createBoard() {
        int count = 0;
        for (int i = GraphicsLearning.PADDING;
             i < GraphicsLearning.WINDOW_WIDTH - (GraphicsLearning.SQUARE_SIZE - GraphicsLearning.PADDING);
             i = i + GraphicsLearning.SQUARE_SIZE) {
            for (int j = GraphicsLearning.PADDING;
                 j < GraphicsLearning.WINDOW_WIDTH - (GraphicsLearning.SQUARE_SIZE - GraphicsLearning.PADDING);
                 j = j + GraphicsLearning.SQUARE_SIZE) {
                Rectangle rect = new Rectangle(i, j, GraphicsLearning.SQUARE_SIZE, GraphicsLearning.SQUARE_SIZE);
                rect.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
                    // Mouse event

                });
                if((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) {
                    rect.setFill(Color.WHITE);
                }
                rects[count] = rect;
                count++;
            }
        }
    }

    public Rectangle fetchRectangle(double x, double y) {
        for (int i = 0; i < rects.length; i++) {
            if(rects[i].contains(x, y)) {
                return rects[i];
            }
        }
        return null;
    }

    public Rectangle[] getBoard() {
        return rects;
    }

}
