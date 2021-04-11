package Controlador.TipoUsuarios;

import Dialogos.D_Confirmar;
import Modelo.TipoUsuario.M_TipoUsuario;
import Recursos.R_AgregarImagenes;
import Recursos.R_PlaceHolder;
import Recursos.R_Texto;
import Recursos.R_VerificacionesDeEntradaTexto;
import SQL.TipoUsuario.S_TipoUsuario;
import Vista.TipoUsuario.D_EliminarRoll;
import Vista.TipoUsuario.V_PanelTipoUsuario;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class C_TipoUsuario {

    //Objetos
    R_AgregarImagenes rAgregarImg = new R_AgregarImagenes();
    R_VerificacionesDeEntradaTexto rVerificarionesText = new R_VerificacionesDeEntradaTexto();
    R_Texto rText = new R_Texto();
    S_TipoUsuario sTipoUsuario = new S_TipoUsuario();
    M_TipoUsuario mTipoUsuario = new M_TipoUsuario();

    //Variables de objetos
    R_PlaceHolder rTextFantasma;
    DefaultTableModel modelo;
    D_Confirmar dConfirmar;
    V_PanelTipoUsuario vPanelTipoUsuario;
    D_EliminarRoll dEliminarRoll;

    int fila;

    public void dialogoEliminarRoll(int id, JTable tbl, String msg) {
        dEliminarRoll = new D_EliminarRoll(new JFrame(), true);
        fila = tbl.getSelectedRow();
        id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        dEliminarRoll.id = id;
        D_EliminarRoll.lblMsg.setText(msg.toUpperCase());
        dEliminarRoll.setVisible(true);
    }

    public void agregarImg(JButton btnEliminar, JButton btnGuardar) {
        rAgregarImg.agregarImagen("/Img/TipoUsuario/Eliminar.png", btnEliminar);
        rAgregarImg.pasarMauseBoton("/Img/TipoUsuario/EliminarP.png", btnEliminar);

        rAgregarImg.agregarImagen("/Img/TipoUsuario/Guardar.png", btnGuardar);
        rAgregarImg.pasarMauseBoton("/Img/TipoUsuario/GuardarP.png", btnGuardar);
    }

    public void fantasmaText(JTextField txtCodigo, JTextField txtRoll, JTextField txtBuscar) {
        rTextFantasma = new R_PlaceHolder("Código".toUpperCase(), txtCodigo);
        rTextFantasma = new R_PlaceHolder("Roll".toUpperCase(), txtRoll);
        rTextFantasma = new R_PlaceHolder("Buscar".toUpperCase(), txtBuscar);
        txtBuscar.grabFocus();
    }

    //Metodo para verificar que no escriba letras en solo 8 carácteres al buscar por dni
    public boolean verif(KeyEvent evt, JTextField txt) {
        dConfirmar = new D_Confirmar(new JFrame(), true);
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            rVerificarionesText.getToolkit().beep();
            evt.consume();
            D_Confirmar.lblMensaje.setText("Solo se permiten números".toUpperCase());
            dConfirmar.setVisible(true);
            return true;
        } else if (txt.getText().trim().length() >= 4) {
            rVerificarionesText.getToolkit().beep();
            evt.consume();
            D_Confirmar.lblMensaje.setText("Solo se permiten 4 carácteres".toUpperCase());
            dConfirmar.setVisible(true);
            return true;
        } else {
            return false;
        }
    }

    public boolean verif(KeyEvent evt, JTextField txt, JLabel lbl) {
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            rVerificarionesText.getToolkit().beep();
            evt.consume();
            lbl.setText("Solo se permiten números".toUpperCase());
            return true;
        } else if (txt.getText().trim().length() >= 4) {
            rVerificarionesText.getToolkit().beep();
            evt.consume();
            lbl.setText("Solo se permiten 4 carácteres".toUpperCase());
            return true;
        } else {
            lbl.setText("");
            return false;
        }
    }

    //Metodo para verificar si las entradas estan vacias para poder registrar usuarios
    public boolean textVacio(JTextField txtID, JTextField txtRoll, JLabel lblMensaje) {
        try {
            boolean veri = txtID.getText().trim().isEmpty() || txtRoll.getText().trim().isEmpty();

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

    //Metodo para agregar usuarios
    public void agregar(JTextField txtCodigo, JTextField txtRoll) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mTipoUsuario.setCodigo(txtCodigo.getText());
        mTipoUsuario.setRoll(txtRoll.getText());

        if (sTipoUsuario.agregarRoles(mTipoUsuario)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Exitoso".toUpperCase());
            limpiarCajas(txtCodigo, txtRoll);
            mostrarTablaRoles(V_PanelTipoUsuario.tblRoles);
            dConfirmar.setVisible(true);
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(txtCodigo, txtRoll);
            dConfirmar.setVisible(true);
        }
    }

    //Metodo para actualziar usuarios
    public boolean actualizar(JTextField txtCodigo, JTextField txtRoll, int id) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        if (!txtRoll.getText().equals("Administrador")) {
            mTipoUsuario.setCodigo(txtCodigo.getText());
            mTipoUsuario.setRoll(txtRoll.getText());
            mTipoUsuario.setId(id);

            if (sTipoUsuario.actualizarUsuarios(mTipoUsuario)) {
                rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
                D_Confirmar.lblMensaje.setText("Registro Actualizado con exito".toUpperCase());
                limpiarCajas(txtCodigo, txtRoll);
                mostrarTablaRoles(V_PanelTipoUsuario.tblRoles);
                dConfirmar.setVisible(true);
                return true;
            } else {
                rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
                D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
                limpiarCajas(txtCodigo, txtRoll);
                dConfirmar.setVisible(true);
                return false;
            }

        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("No puedes cambiar el roll de admistrador".toUpperCase());
            limpiarCajas(txtCodigo, txtRoll);
            dConfirmar.setVisible(true);
            return false;
        }

    }

    public boolean eliminar(int id) {
        dConfirmar = new D_Confirmar(new JFrame(), true);

        if (sTipoUsuario.eliminarRoll(id)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Se elimino el registro".toUpperCase());
            mostrarTablaRoles(V_PanelTipoUsuario.tblRoles);
            dConfirmar.setVisible(true);
            return true;
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            dConfirmar.setVisible(true);
            return false;
        }
    }

    public void pasarUsuario(JTable tbl) {
        fila = tbl.getSelectedRow();

        V_PanelTipoUsuario.id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        V_PanelTipoUsuario.txtID.setText(tbl.getValueAt(fila, 1).toString());
        V_PanelTipoUsuario.txtRoll.setText(tbl.getValueAt(fila, 2).toString());
    }

    public void mostrarTablaRoles(JTable tbl) {
        modelo = sTipoUsuario.mostrarTablaRoles();
        tbl.setModel(modelo);
        ocultarFila(tbl);
    }

    public void buscarTablaRoles(JTable tbl, JTextField txt) {
        if (txt.getText().trim().isEmpty()) {
            mostrarTablaRoles(tbl);
        } else {
            modelo = sTipoUsuario.buscarTablaRoles(txt.getText());
            tbl.setModel(modelo);
            ocultarFila(tbl);
        }
    }

    private void ocultarFila(JTable tbl) {
        tbl.getColumnModel().getColumn(0).setMaxWidth(0);
        tbl.getColumnModel().getColumn(0).setMinWidth(0);
        tbl.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    public void limpiarCajas(JTextField txtID, JTextField txtRoll) {
        txtID.setText(null);
        txtRoll.setText(null);
    }

}
