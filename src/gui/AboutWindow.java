package gui;


import javax.swing.*;
import java.awt.*;

public class AboutWindow extends JFrame {

    /// Constructor ///
    public AboutWindow(String text) {
        super(text);

        setVisible(true);
        setMinimumSize(new Dimension(400, 400));
    }

}
