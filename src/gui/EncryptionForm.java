package gui;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.AttributeSetMethodGenerator;
import sun.nio.cs.ext.EUC_CN;

import javax.swing.*;
import java.awt.*;

public class EncryptionForm extends JPanel{
    /// Attributes ///
    private JButton decryptButton , encryptButton, browseInputInputButton , browseOutputPathButton;
    private JLabel keyLabel , inputPathLabel , outputPathLabel;
    private JTextField keyTextField , inputPathTextField , outputPathTextField;
    private GridBagConstraints myGridBagConstraints;

    /// Constructor ///
    public EncryptionForm() {
        /// Initialize attributes ///
        decryptButton = new JButton("decrypt");
        encryptButton = new JButton("encrypt");
        browseInputInputButton = new JButton("Browse");
        browseOutputPathButton = new JButton("Browse");
        keyLabel = new JLabel("Enter key: ");
        inputPathLabel = new JLabel("path of text file: ");
        outputPathLabel = new JLabel("path of encrypted file: ");
        keyTextField = new JTextField(15);
        inputPathTextField = new JTextField(15);
        outputPathTextField = new JTextField(15);
        myGridBagConstraints = new GridBagConstraints();

        /// set properties ///
        setVisible(true);
        setLayout(new GridBagLayout());
        setComponentPosition();
        setComponentBehaviour();

    }

    /// Methods ///

    private void setComponentPosition() {


        myGridBagConstraints.weighty = 0.1;
        myGridBagConstraints.anchor = GridBagConstraints.LINE_END;
        /// First Row ///
        setGrid(0, 0);
        add(keyLabel, myGridBagConstraints);

        myGridBagConstraints.anchor = GridBagConstraints.LINE_START;
        setGrid(0, 1);
        add(keyTextField, myGridBagConstraints);


        /// Second Row ///
        myGridBagConstraints.anchor = GridBagConstraints.LINE_END;
        setGrid(1, 0);
        add(inputPathLabel, myGridBagConstraints);

        myGridBagConstraints.anchor = GridBagConstraints.LINE_START;
        setGrid(1, 1);
        add(inputPathTextField, myGridBagConstraints);

        setGrid(1, 2);
        add(browseInputInputButton, myGridBagConstraints);

        /// Third Row ///
        myGridBagConstraints.anchor = GridBagConstraints.LINE_END;
        setGrid(2, 0);
        add(outputPathLabel, myGridBagConstraints);

        myGridBagConstraints.anchor = GridBagConstraints.LINE_START;
        setGrid(2, 1);
        add(outputPathTextField, myGridBagConstraints);


        setGrid(2, 2);
        add(browseOutputPathButton, myGridBagConstraints);

        myGridBagConstraints.weighty = 3;
        /// Fourth line ///
        myGridBagConstraints.anchor = GridBagConstraints.LINE_START;
        setGrid(3, 0);
        add(encryptButton, myGridBagConstraints);

        setGrid(3, 2);
        myGridBagConstraints.anchor = GridBagConstraints.LINE_END;
        add(decryptButton, myGridBagConstraints);

    }
    private void setComponentBehaviour(){
        
    }

    private void setGrid(int row, int column) {
        myGridBagConstraints.gridx = column;
        myGridBagConstraints.gridy = row;
    }




}
