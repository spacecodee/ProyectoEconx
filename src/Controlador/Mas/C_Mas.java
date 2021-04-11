package Controlador.Mas;

import Recursos.R_AgregarImagenes;
import Vista.Mas.V_Mas;
import javax.swing.JButton;

public class C_Mas {

    R_AgregarImagenes rAgregarImg = new R_AgregarImagenes();

    V_Mas vMas;

    public void agregarImg(JButton btnGuardar) {
        rAgregarImg.agregarImagen("/Img/Mas/Listo.png", btnGuardar);
        rAgregarImg.pasarMauseBoton("/Img/Mas/ListoP.png", btnGuardar);
    }

    public void mas() {
        
    }

}
