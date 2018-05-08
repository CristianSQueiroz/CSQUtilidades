/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Cristian
 */
public class UtilFile {

    public static String createFile() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            JFileChooser jfileChooser = new JFileChooser();
            jfileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int escolha = jfileChooser.showSaveDialog(null);
            if (escolha == JFileChooser.APPROVE_OPTION) {
                return jfileChooser.getSelectedFile().getPath();
            } else {
                return "";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }

    }
}
