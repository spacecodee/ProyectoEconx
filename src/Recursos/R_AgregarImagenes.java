package Recursos;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class R_AgregarImagenes {

    public void agregarImagen(String URL, JLabel lbl) {
        try {
            ImageIcon img = new ImageIcon(getClass().getResource(URL));
            ImageIcon icon = new ImageIcon(img.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
            lbl.setIcon(icon);
        } catch (Exception e) {
            System.err.println("No existe la imagen");
        }
    }

    public void agregarImagen(String URL, JButton btn) {
        try {
            ImageIcon img = new ImageIcon(getClass().getResource(URL));
            ImageIcon icon = new ImageIcon(img.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
            btn.setIcon(icon);
        } catch (Exception e) {
            System.err.println("No existe la imagen");
        }
    }

    public void pasarMauseBoton(String URL, JButton btn) {
        try {
            btn.setRolloverIcon(new ImageIcon(getClass().getResource(URL)));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
