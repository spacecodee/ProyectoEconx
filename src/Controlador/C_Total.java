package Controlador;

import java.awt.Frame;
import javax.swing.JFrame;
import rojeru_san.complementos.RSMoveWindow;
import rojeru_san.complementos.RSUtilities;

public class C_Total {

    public void ini(JFrame frm) {
        frm.setLocationRelativeTo(null);
        new RSMoveWindow().setMoveWindow(frm);
        RSUtilities.setIconWindow(frm, "/Img/logoeconx.png");
        frm.setTitle("ECONX PRO VER. 1.0");
        RSUtilities.setOpaqueWindow(frm, true);
    }

    public void minimizar(JFrame frm) {
        frm.setState(Frame.ICONIFIED);
    }

}
