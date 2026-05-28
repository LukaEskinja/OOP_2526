package fst_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel {

    private JButton resetBtn;

    private JButton saveBtn;

    private JButton loadBtn;

    private ToolBar toolBarListener;

    public ToolBar(){

        initComps();
        layoutComps();
        activate();
    }

    public void setToolBarListener(ToolBar toolBarListener) {
        toolBarListener = toolBarListener;
    }

    private void initComps(){

        resetBtn = new JButton(("Reset"));
        loadBtn = new JButton("load");
        saveBtn = new JButton("Save");
        resetBtn.setActionCommand("RESET");
        loadBtn.setActionCommand("Load");
        saveBtn.setActionCommand("SAVE");
    }

    private void layoutComps(){

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(resetBtn);
        add(saveBtn);
        add(loadBtn);


    }

    private void activate() {
        resetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(toolBarListener != null){
                    toolBarListener.toolBarEventOccured(resetBtn.getActionCommand());

                }

            }
        });


    }
}
