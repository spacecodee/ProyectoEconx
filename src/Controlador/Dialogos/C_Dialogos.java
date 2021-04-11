package Controlador.Dialogos;

import Dialogos.D_Confirmar;
import Recursos.R_AgregarImagenes;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class C_Dialogos {

    //Objetos
    R_AgregarImagenes rAgregarImg = new R_AgregarImagenes();

    //Variables
    D_Confirmar dConfirmar;

    //Metodo para verificar si ha seleccionado un campo en una tabla para luego eliminar o editar
    public boolean validarSeleccion(JTable tbl, String msg) {
        int fila = tbl.getSelectedRow();
        String t = tbl.getValueAt(fila, 2).toString();

        if (t.equals("Administrador")) {
            dConfirmar = new D_Confirmar(new JFrame(), true);
            D_Confirmar.lblMensaje.setText("No puedes eliminar el rol de administrador".toUpperCase());
            dConfirmar.setVisible(true);
            return true;
        } else {
            if (tbl.getSelectedRow() == -1) {
                dConfirmar = new D_Confirmar(new JFrame(), true);
                D_Confirmar.lblMensaje.setText(msg.toUpperCase());
                dConfirmar.setVisible(true);
                return true;
            } else {
                return false;
            }
        }
    }

    //Metodo para agregar imagenes a los botones
    public void agregarImg(JButton btnListo) {
        rAgregarImg.agregarImagen("/Img/Dialogos/Listo.png", btnListo);
        rAgregarImg.pasarMauseBoton("/Img/Dialogos/ListoP.png", btnListo);
    }

    public void agregarImg(JButton btnSi, JButton btnNo) {
        rAgregarImg.agregarImagen("/Img/Dialogos/Si.png", btnSi);
        rAgregarImg.pasarMauseBoton("/Img/Dialogos/SiP.png", btnSi);

        rAgregarImg.agregarImagen("/Img/Dialogos/No.png", btnNo);
        rAgregarImg.pasarMauseBoton("/Img/Dialogos/NoP.png", btnNo);
    }
}
