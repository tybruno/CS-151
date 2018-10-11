import javax.swing.*;
import java.awt.*;

public class Control extends JFrame {

/*
this is the main controller that controls
and combines different components of the game.
*/ 

private Board GameBoard; //Board and Button
private Tools TButtons; // Exit and Reset

Control() {

    setLayout(new BorderLayout());

    GameBoard = new Board();
    TButtons = new Tools();

    TButtons.SetObject(GameBoard);

    add(GameBoard, BorderLayout.CENTER);
    add(TButtons, BorderLayout.SOUTH);

    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}