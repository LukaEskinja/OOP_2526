package fst_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ToolBarListener {

    private JTextArea textArea;

    private JButton jButton;

    private JScrollPane textAreaScroll;

    private ToolBar toolBar;

    private AppMenuBar menubar;

    public MainFrame(){
        super("Simple Gui app!");
        initFrame();
        initComps();
        layoutComps();
        activateFrame();
    }

    private void initFrame(){
        setSize(650, 500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void initComps(){

        textArea = new JTextArea();
        jButton = new JButton("Submit");
        textAreaScroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        toolBar = new ToolBar();
        menubar = new AppMenuBar();
        setJMenuBar(menubar);
    }

    private void layoutComps(){
        setLayout(new BorderLayout());
        add(textAreaScroll, BorderLayout.CENTER);
        add(jButton, BorderLayout.SOUTH);
        add(toolBar,BorderLayout.NORTH);
    }

    private void activateFrame(){

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String line = ae.toString() + ae.paramString() + Integer.toHexString(ae.hashCode()) + "\n";
                setText2TxtArea(line);
            }
        });

    }

    @Override
    public void toolBarEventOccured(String eventCommand) {
    }

    private void setText2TxtArea(String txt){
        textArea.append(txt);
    }

    private void resetText2TxtArea(String txt){
        textArea.append(txt);
    }


}
