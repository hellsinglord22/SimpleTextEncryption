package gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{
    /// Attribute(s) ///
    private Container mainWindowContainer;
    private EncryptionForm mainWindowEncryptionForm;


    /// Constructor(s) ///
    public MainWindow(String text) {
        super(text);

        /// initialize attributes ///
        mainWindowContainer = getContentPane();
        mainWindowEncryptionForm = new EncryptionForm();

        /// setting properties ////
        setResizable(false);
        setMinimumSize(new Dimension(500, 500));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    /// Methods(s) ////
    private void setAttributesBehaviour () {

    }
    private void setAttributesPositions() {

    }
}
