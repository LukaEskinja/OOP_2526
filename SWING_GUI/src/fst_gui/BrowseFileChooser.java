package fst_gui;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class BrowseFileChooser extends JFileChooser {

    public BrowseFileChooser(){
        super("./DATA/");
        initFileChooser();
    }

    private void initFileChooser() {
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("Text files", ".txt");
        FileNameExtensionFilter csvFilter = new FileNameExtensionFilter("CSV files", ".csv");
        addChoosableFileFilter(txtFilter);
        addChoosableFileFilter(csvFilter);
        setFileFilter(txtFilter);
    }
}
