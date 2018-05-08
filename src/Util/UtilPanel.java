/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Component;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.lang.reflect.Field;
import javafx.scene.control.SplitPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JViewport;

/**
 *
 * @author csqueiroz
 */
public class UtilPanel {

    public static void limpaCampos(JPanel panel) {
        for (Component c : panel.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
            if (c instanceof JComboBox) {
                ((JComboBox) c).setSelectedItem(null);
            }
            if (c instanceof JCheckBox) {
                ((JCheckBox) c).setSelected(false);
            }
            if (c instanceof JSpinner) {
                ((JSpinner) c).setValue(0);
            }
        }
    }

    public static void adicionarMouseListener(JPanel panel, MouseListener ml) {
        for (Component c : panel.getComponents()) {
            if (c instanceof JSplitPane) {
                for (Component c2 : ((JSplitPane) c).getComponents()) {
                    if (c2 instanceof JPanel) {
                        c2.addMouseListener(ml);
                        adicionarMouseListener(((JPanel) c2), ml);
                    } else {
                        c2.addMouseListener(ml);
                    }

                }
            } else if (c instanceof JScrollPane) {
                for (Component c2 : ((JScrollPane) c).getComponents()) {
                    if (c2 instanceof JPanel) {
                        c2.addMouseListener(ml);
                        adicionarMouseListener(((JPanel) c2), ml);
                    } else if (c2 instanceof JViewport) {
                        for (Component c3 : ((JViewport) c2).getComponents()) {
                            if (c3 instanceof JPanel) {
                                c3.addMouseListener(ml);
                                adicionarMouseListener(((JPanel) c3), ml);
                            } else {
                                c3.addMouseListener(ml);
                            }

                        }
                    } else {
                        c2.addMouseListener(ml);
                    }

                }
            } else {
                c.addMouseListener(ml);

            }

        }
    }
    
    public static void adicionarKeyListener(JPanel panel, KeyListener kl) {
        for (Component c : panel.getComponents()) {
            if (c instanceof JSplitPane) {
                for (Component c2 : ((JSplitPane) c).getComponents()) {
                    if (c2 instanceof JPanel) {
                        c2.addKeyListener(kl);
                        adicionarKeyListener(((JPanel) c2), kl);
                    } else {
                        c2.addKeyListener(kl);
                    }

                }
            } else if (c instanceof JScrollPane) {
                for (Component c2 : ((JScrollPane) c).getComponents()) {
                    if (c2 instanceof JPanel) {
                        c2.addKeyListener(kl);
                        adicionarKeyListener(((JPanel) c2), kl);
                    } else if (c2 instanceof JViewport) {
                        for (Component c3 : ((JViewport) c2).getComponents()) {
                            if (c3 instanceof JPanel) {
                                c3.addKeyListener(kl);
                                adicionarKeyListener(((JPanel) c3), kl);
                            } else {
                                c3.addKeyListener(kl);
                            }

                        }
                    } else {
                        c2.addKeyListener(kl);
                    }

                }
            } else {
                c.addKeyListener(kl);

            }

        }
    }
}
