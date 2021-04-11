package Controlador.Perfil;

import Modelo.Usuario.M_UsuarioLogin;
import Recursos.R_AgregarImagenes;
import Recursos.R_PlaceHolder;
import Recursos.R_Texto;
import Recursos.R_VerificacionesDeEntradaTexto;
import SQL.Perfil.S_Perfil;
import Vista.PerfilUsuario.V_CambiarPass;
import Vista.PerfilUsuario.V_PanelCambiarPass;
import Vista.PerfilUsuario.V_PanelInfoAvanzada;
import Vista.PerfilUsuario.V_PanelInformacionBasica;
import Vista.PerfilUsuario.V_PanelPerfilPrincipal;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import rojeru_san.rsdate.RSDateChooser;

public class C_Perfil {

    R_AgregarImagenes rAgregarImagenes = new R_AgregarImagenes();
    R_VerificacionesDeEntradaTexto rVerificarionesText = new R_VerificacionesDeEntradaTexto();
    S_Perfil sPerfil = new S_Perfil();
    R_Texto rTexto = new R_Texto();

    M_UsuarioLogin mUsuarioLogin;
    R_PlaceHolder rPlaceHolder;
    V_CambiarPass vCambiarPass;

    String sms;
    Date date = null;
    java.sql.Date sqlFecha = null;
    long d = 0;
    String secretKey = "Hi_ThisIsAKey_Encritp";

    public boolean botonCambiarPass(java.awt.event.ActionEvent evt, JButton btnCambiarPass, M_UsuarioLogin mUsuarioLogin) {
        if (evt.getSource() == btnCambiarPass) {
            vCambiarPass = new V_CambiarPass(new JFrame(), true, mUsuarioLogin);
            vCambiarPass.setVisible(true);
            return true;
        } else {
            return false;
        }
    }

    public void imgP(JButton btnSave, JButton btnCancel) {
        rAgregarImagenes.agregarImagen("/Img/Usuario/Guardar.png", btnSave);
        rAgregarImagenes.agregarImagen("/Img/Usuario/Cancelar.png", btnCancel);

        rAgregarImagenes.pasarMauseBoton("/Img/Usuario/GuardarP.png", btnSave);
        rAgregarImagenes.pasarMauseBoton("/Img/Usuario/CancelarP.png", btnCancel);
    }

    public void imgPerfil(JButton btnSave, JButton btnE) {
        rAgregarImagenes.agregarImagen("/Img/Perfil/btnG.png", btnSave);
        rAgregarImagenes.pasarMauseBoton("/Img/Perfil/btnGP.png", btnSave);

        rAgregarImagenes.agregarImagen("/Img/Perfil/btnE.png", btnE);
        rAgregarImagenes.pasarMauseBoton("/Img/Perfil/btnEP.png", btnE);
    }

    public void imgP(JButton btnSave, JButton btnCancel, JButton btnInfB, JButton btnCambiarContra, JButton btnInfoAvanzada) {
        rAgregarImagenes.agregarImagen("/Img/Usuario/Guardar.png", btnSave);
        rAgregarImagenes.agregarImagen("/Img/Usuario/Cancelar.png", btnCancel);
        rAgregarImagenes.agregarImagen("/Img/Perfil/btnInfBas.png", btnInfB);
        rAgregarImagenes.agregarImagen("/Img/Perfil/btnInfA.png", btnInfoAvanzada);
        rAgregarImagenes.agregarImagen("/Img/Perfil/btnCambiarC.png", btnCambiarContra);

        rAgregarImagenes.pasarMauseBoton("/Img/Usuario/GuardarP.png", btnSave);
        rAgregarImagenes.pasarMauseBoton("/Img/Usuario/CancelarP.png", btnCancel);
        rAgregarImagenes.pasarMauseBoton("/Img/Perfil/btnInfBasP.png", btnInfB);
        rAgregarImagenes.pasarMauseBoton("/Img/Perfil/btnInfAP.png", btnInfoAvanzada);
        rAgregarImagenes.pasarMauseBoton("/Img/Perfil/btnCambiarCP.png", btnCambiarContra);
    }

    public void fantasmaTextPerfil(JTextField Nombre, JTextField Apellidos, JTextField Telefono, JTextField Mail) {
        rPlaceHolder = new R_PlaceHolder("Nombre".toUpperCase(), Nombre);
        rPlaceHolder = new R_PlaceHolder("Apellidos".toUpperCase(), Apellidos);
        rPlaceHolder = new R_PlaceHolder("Teléfono".toUpperCase(), Telefono);
        rPlaceHolder = new R_PlaceHolder("Correo Electrónico".toUpperCase(), Mail);
    }

    public void fantasmaText(JPasswordField pwsPass, JPasswordField pwsCon) {
        rPlaceHolder = new R_PlaceHolder("Contraseña".toUpperCase(), pwsPass);
        rPlaceHolder = new R_PlaceHolder("Otra vez".toUpperCase(), pwsCon);
    }

    public void fantasmaText(JPasswordField pwsPass) {
        rPlaceHolder = new R_PlaceHolder("Contraseña".toUpperCase(), pwsPass);
    }

    public boolean textVacio(java.awt.event.ActionEvent evt, JPasswordField pwsPass,
            JPasswordField pwsPassCon, JLabel lblMensaje) {
        try {
            boolean veri = pwsPassCon.getText().trim().isEmpty() || pwsPass.getText().trim().isEmpty();

            if (veri == true) {
                lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS".toUpperCase());
                return true;
            } else {
                if (pwsPass.getText().trim().equals(pwsPassCon.getText().trim())) {
                    lblMensaje.setText("".toUpperCase());
                    return true;
                } else {
                    lblMensaje.setText("Escribe bien las contraseñas".toUpperCase());
                    return false;
                }
            }

        } catch (Exception e) {
            System.err.println("Erro bro :(");
        }
        return true;
    }

    public void imgPerfil(JButton btnSave) {
        rAgregarImagenes.agregarImagen("/Img/Perfil/btnG.png", btnSave);
        rAgregarImagenes.pasarMauseBoton("/Img/Perfil/btnGP.png", btnSave);
    }

    public void imgPer(JButton btnVerificarPass) {
        rAgregarImagenes.agregarImagen("/Img/Perfil/btnVerificarPas.png", btnVerificarPass);
        rAgregarImagenes.pasarMauseBoton("/Img/Perfil/btnVerificarPasP.png", btnVerificarPass);
    }

    public boolean actualizarInfoBasica(String txtN, String txtA, String txtNum, String txtCorreo, int id, JLabel lbl) {
        if (sPerfil.ActualizarInfoBasica(txtN, txtA, txtNum, txtCorreo, id)) {
            lbl.setText("Datos actualizados".toUpperCase());
            return true;
        } else {
            lbl.setText("Al parecer ocurrio un error".toUpperCase());
            return false;
        }
    }

    public boolean actualizarInfoAvanzada(RSDateChooser dt, int id, JLabel lbl) {
        date = dt.getDatoFecha();
        d = date.getTime();
        sqlFecha = new java.sql.Date(d);

        if (sPerfil.ActualizarInfoAvanzada(sqlFecha.toString(), id)) {
            lbl.setText("Datos actualizados".toUpperCase());
            return true;
        } else {
            lbl.setText("Al parecer ocurrio un error".toUpperCase());
            return false;
        }
    }

    public boolean ModificarPassword(int id, JPasswordField pws, JLabel lbl) {
        String Pass = new String(pws.getPassword());
        String nuevoPass = rTexto.ecnode(secretKey, Pass);

        if (sPerfil.modificarPass(nuevoPass, id)) {
            lbl.setText("Contraseña Modificada".toUpperCase());
            return true;
        } else {
            lbl.setText("Opps, al parecer a ocurrido un error".toUpperCase());
            return false;
        }
    }

    public boolean CambiarPass(int id, JPasswordField pws, JLabel lbl) {
        String Pass = new String(pws.getPassword());
        String nuevoPass = rTexto.ecnode(secretKey, Pass);

        if (sPerfil.confPassw(nuevoPass, id)) {
            lbl.setText("Las contraseñas coinciden");
            return true;
        } else {
            lbl.setText("Contraseñas Incorrectas".toUpperCase());
            return false;
        }
    }

    public boolean verifTelefono(KeyEvent evt, JTextField txt, JLabel lbl) {
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            rVerificarionesText.getToolkit().beep();
            evt.consume();
            lbl.setText("Solo se permiten números".toUpperCase());
            return true;
        } else if (txt.getText().trim().length() >= 9) {
            rVerificarionesText.getToolkit().beep();
            evt.consume();
            lbl.setText("Solo se permiten 9 carácteres".toUpperCase());
            return true;
        } else {
            lbl.setText("");
            return false;
        }
    }

    public boolean textVacio(JTextField txtNom, JTextField txtApe, JTextField txtTele,
            JTextField txtCorreo, JLabel lblMensaje) {

        try {

            boolean veri = txtNom.getText().trim().isEmpty() || txtApe.getText().trim().isEmpty()
                    || txtTele.getText().trim().isEmpty() || txtCorreo.getText().trim().isEmpty();

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

    public boolean textVacio(java.awt.event.ActionEvent evt, JPasswordField pwsPass, JLabel lblMensaje) {
        try {
            boolean veri = pwsPass.getText().trim().isEmpty();

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

    public void panelPerfil(java.awt.event.ActionEvent evt, V_PanelPerfilPrincipal vPanelPrincipal, JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vPanelPrincipal.setVisible(true);
        pnlEntorno.add(vPanelPrincipal);
        pnlEntorno.validate();
    }

    public void PanelInfoBasica(JPanel pnlEntorno, M_UsuarioLogin mUsuarioLogin) {
        V_PanelInformacionBasica vPanelinfoBasica = new V_PanelInformacionBasica(mUsuarioLogin);
        pnl(pnlEntorno);
        vPanelinfoBasica.setVisible(true);
        pnlEntorno.add(vPanelinfoBasica);
        pnlEntorno.validate();
    }

    public void PanelInfoAvanzada(JPanel pnlEntorno, M_UsuarioLogin mUsuarioLogin) {
        V_PanelInfoAvanzada vPanelinfoAvanzada = new V_PanelInfoAvanzada(mUsuarioLogin);
        pnl(pnlEntorno);
        vPanelinfoAvanzada.setVisible(true);
        pnlEntorno.add(vPanelinfoAvanzada);
        pnlEntorno.validate();
    }

    public void botonMenuPerfilP(JPanel pnlEntorno, M_UsuarioLogin mUsuarioLogin) {
        V_PanelPerfilPrincipal vPanelPrincipal = new V_PanelPerfilPrincipal(mUsuarioLogin);
        pnl(pnlEntorno);
        vPanelPrincipal.setVisible(true);
        pnlEntorno.add(vPanelPrincipal);
        pnlEntorno.validate();
    }

    public void botonCambiarPass(JPanel pnlEntorno, M_UsuarioLogin mUsuarioLogin) {
        V_PanelCambiarPass vPanelCambiarPass = new V_PanelCambiarPass(mUsuarioLogin);
        pnl(pnlEntorno);
        vPanelCambiarPass.setVisible(true);
        pnlEntorno.add(vPanelCambiarPass);
        pnlEntorno.validate();
    }

    private void pnl(JPanel pnlEntorno) {
        pnlEntorno.removeAll();
        pnlEntorno.repaint();
    }

}
