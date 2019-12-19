package herewegolearninagain;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author nickv
 */
public class GraphicsLearning extends Application {

    public static final int WINDOW_WIDTH = 225;
    public static final int WINDOW_HEIGHT = 245;

    public static final int SQUARE_SIZE = 25;
    public static final int PADDING = 2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene s = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, Color.GRAY);

        CheckerBoard board = new CheckerBoard();
        root.getChildren().addAll(board.getBoard());

        stage.setScene(s);
        stage.show();
    }
}

