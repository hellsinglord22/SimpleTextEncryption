package gui;


import controller.ProgramLogic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame{
    /// Attribute(s) ///
    private Container mainWindowContainer;
    private EncryptionForm mainWindowEncryptionForm;
    private JFileChooser mainWindowFileChooser;
    private ProgramLogic mainWindowProgramLogic;



    /// Constructor(s) ///
    public MainWindow(String text) {
        super(text);

        // Add looks and feels //
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("couldn't load the looks and feels");
        }

        /// initialize attributes ///
        mainWindowContainer = getContentPane();
        mainWindowEncryptionForm = new EncryptionForm();
        mainWindowFileChooser = new JFileChooser();
        mainWindowProgramLogic = new ProgramLogic();

        /// setting properties ////
        setResizable(false);
        setMinimumSize(new Dimension(400, 400));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(createMenuBar());
        setComponentPosition();
        setComponentBehaviour();

    }

    /// Methods(s) ////
    private void setComponentBehaviour() {
        mainWindowEncryptionForm.setBehaviour(mainWindowProgramLogic);
    }
    private void setComponentPosition() {
        mainWindowContainer.add(mainWindowEncryptionForm, BorderLayout.CENTER);
    }
    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        // Menus ///
        JMenu fileMenu = new JMenu("File");
        JMenu viewMenu = new JMenu("View");

        /// add menus to MenuBar ///
        menuBar.add(fileMenu);
        menuBar.add(viewMenu);

        // Menu's items ///
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem openItem = new JMenuItem("Open file...");
        final JMenuItem exitItem = new JMenuItem("Exit");

        /// Add items to the menus //
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        viewMenu.add(aboutItem);

        /// Give items a behaviour ///
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mainWindowFileChooser.showOpenDialog(MainWindow.this) == JFileChooser.APPROVE_OPTION) {
                    String path = mainWindowFileChooser.getSelectedFile().toString();
                }

            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int exitOption = JOptionPane.showConfirmDialog(MainWindow.this, "Are you sure " +
                        "you want to exit ?", "Exit", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

                if (exitOption == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });


        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AboutWindow("About");
            }
        });

        return menuBar;
    }
}
