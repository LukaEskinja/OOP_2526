package fst_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class AppMenuBar extends JMenuBar implements ActionListener{

    private JMenu fileMenu;

    private JMenu editMenu;

    private JMenuItem loadFile;

    private JMenuItem exitApp;

    private JMenuItem saveFile;

    private AppMenuBarListener menuBarListener;

    public AppMenuBar() {

        initComps();
        layoutComps();
        activateMenuBar();
    }

    private void InitComps() {
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");

        loadFile = new JMenuItem("Load...");
        saveFile = new JMenuItem("saving...");
        exitApp = new JMenuItem("exiting");

        loadFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_DOWN_MASK));
        saveFile.setAccelerator(KeyStroke.getKeyStroke("control S"));
        exitApp.setAccelerator(KeyStroke.getKeyStroke("control E"));

        fileMenu.setMnemonic('F');

    }

    private void activateMenuBar() {
        exitApp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        loadFile.setActionCommand("LOAD");
        saveFile.setActionCommand("SAVE");
        loadFile.addActionListener(this);
        saveFile.addActionListener(this);

        exitApp.setActionCommand("EXIT");
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("LOAD")) {
            if(menuBarListener != null){
                menuBarListener.menuBarEventOccured("LOAD");
            }
        }
        if (ae.getActionCommand().equals("SAVE")) {
            menuBarListener.menuBarEventOccured(ae.getActionCommand());

        }

    }

    public void setMenuBarListener(AppMenuBarListener menuBarListener) {

        @Override
        public void menuBarEventOccurred(String)
    }
}
