package io.day14;

import javax.swing.JFrame;
import java.awt.FileDialog;

public class FileSelectTest {
    public static void main(String[] args) {
        
        // GUI : Graphic User Interface 
        // java.awt 와 java.swing에서 제공합니다.

        JFrame jf = new JFrame();
        jf.setSize(200,200);
        jf.setVisible(false);

        FileDialog fd = new FileDialog(jf,"",FileDialog.LOAD);
        

    }
    
}
