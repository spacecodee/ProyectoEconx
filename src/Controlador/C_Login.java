package Controlador;

import Modelo.Usuario.M_UsuarioLogin;
import Recursos.R_AgregarImagenes;
import Recursos.R_PlaceHolder;
import Recursos.R_Texto;
import Recursos.R_VerificacionesDeEntradaTexto;
import SQL.Login.S_Login;
import Vista.Menu.V_Menu;
import Vista.V_Login;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class C_Login {

    //Instancio Objeto
    R_AgregarImagenes rAgregarImg = new R_AgregarImagenes();
    R_Texto rText = new R_Texto();
    R_PlaceHolder rPlaceH;
    R_VerificacionesDeEntradaTexto rVerifiText = new R_VerificacionesDeEntradaTexto();
    M_UsuarioLogin mUsuario = new M_UsuarioLogin();
    S_Login sLogin = new S_Login();

    //Creo variables
    String msg, secretKey = "Hi_ThisIsAKey_Encritp";

    public void agregarImg(JButton btnLogin) {
        rAgregarImg.agregarImagen("/Img/Login/btnLogin.png", btnLogin);
        rAgregarImg.pasarMauseBoton("/Img/Login/btnLoginP.png", btnLogin);
    }

    public void textFantasma(JTextField txt, JPasswordField pws) {
        txt.setFocusable(true);
        rPlaceH = new R_PlaceHolder("Usuario".toUpperCase(), txt);
        rPlaceH = new R_PlaceHolder("Contraseña".toUpperCase(), pws);
    }

    //Metodo paraa verificar las entradas de texto y no haya conflictos con la base de datos
    public boolean verif(KeyEvent evt, JTextField txt, JLabel lblMsg) {
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            rVerifiText.getToolkit().beep();
            evt.consume();

            lblMsg.setText("Solo se permiten números".toUpperCase());
            return true;
        } else if (txt.getText().trim().length() >= 8) {
            rVerifiText.getToolkit().beep();
            evt.consume();
            lblMsg.setText("Solo se permiten 8 carácteres".toUpperCase());
            return true;
        } else {
            lblMsg.setText("".toUpperCase());
            return false;
        }
    }

    //Metodo para verificar si las entradas de texto estan vacias o no
    public boolean textVacio(java.awt.event.ActionEvent evt, JTextField txtDNI, JPasswordField pwsPass, JLabel lblMensaje) {
        try {
            boolean veri = txtDNI.getText().trim().isEmpty() || pwsPass.getText().trim().isEmpty();

            if (veri == true) {
                lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS".toUpperCase());
                return true;
            } else {
                lblMensaje.setText("".toUpperCase());
                return false;
            }
        } catch (Exception e) {
            System.err.println("Erro bro :(");
        }

        return true;
    }

    //metodo para poder hacer login
    public boolean login(V_Login frm, java.awt.event.ActionEvent evt,
            JTextField txtUsuario, JPasswordField pwsPassword, JLabel lblSms) {

        String Pass = new String(pwsPassword.getPassword());
        String nuevoPass = rText.ecnode(secretKey, Pass);

        mUsuario.setDni(txtUsuario.getText());
        mUsuario.setPassword(nuevoPass);

        if (sLogin.login(mUsuario)) {

            msg = "Hola " + mUsuario.getNombre() + " Bienvendio.";

            //jdC.lblMensaje.setText(msg.toUpperCase());
            //agr.agregarImagen("/Img/Dialogos/Hecho.png", jdC.lblImg);
            //jdC.setVisible(true);
            frm.setVisible(false);
            frm.dispose();

            V_Menu vMenu = new V_Menu(mUsuario);
            vMenu.setVisible(true);
            return true;
        } else {
            lblSms.setText("Al parecer el usuario o contraseña son incorrectos");
            return false;
        }

    }

    public void verif(JPasswordField pwsPass, JLabel lblMsg) {
        if (pwsPass.getText().length() >= 0) {
            lblMsg.setText("");
        }
    }

}
