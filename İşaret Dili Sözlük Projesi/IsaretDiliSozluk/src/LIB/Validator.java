package LIB;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Validator {

    public boolean validationJtxt(Component... n) {
        for (Component component : n) {
            if (component instanceof JTextField) {
                JTextField txt = (JTextField) component;
                if (txt.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(component, "lütfen '" + txt.getToolTipText().toUpperCase() + "' bölümünü doldurunuz!");
                    txt.setText("");
                    txt.setBackground(Color.pink);
                    txt.requestFocus();
                    return false;   
                } else {
                    txt.setBackground(Color.white);
                    txt.setText(txt.getText().trim());
                }
            }
        }

        return true;

    }

    public boolean validationJpassword(Component... n) {
        for (Component component : n) {
            if (component instanceof JPasswordField) {
                JPasswordField jp = (JPasswordField) component;
                if (jp.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(component, "lütfen '" + jp.getToolTipText().toUpperCase() + "' bölümünü doldurunuz!");
                    jp.setText("");
                    jp.setBackground(Color.pink);
                    jp.requestFocus();
                    return false;
                } else {
                    jp.setBackground(Color.white);
                    jp.setText(jp.getText().trim());
                }
            }
        }

        return true;

    }

    public boolean sayiMi(String deger) {
        char[] karakterler = deger.toCharArray();
        for (char item : karakterler) {
            if (!Character.isDigit(item)) {
                if (item != '.') {
                    return false;
                }

            }
        }

        return true;

    }

    public boolean temizle(Component... n) {
        for (Component component : n) {
            if (component instanceof JTextField) {
                JTextField txt = (JTextField) component;
                txt.setText("");
            } else if (component instanceof JTextArea) {
                JTextArea txt = (JTextArea) component;
                txt.setText("");
            }
        }

        return true;

    }

    public boolean parolaTemizle(Component... n) {
        for (Component component : n) {
            if (component instanceof JPasswordField) {
                JPasswordField txt = (JPasswordField) component;
                txt.setText("");
            }
        }

        return true;

    }

    public boolean mailMi(JTextField n) {
        if (!n.getText().matches("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$")) {
            return false;
        }
        return true;

    }
}
