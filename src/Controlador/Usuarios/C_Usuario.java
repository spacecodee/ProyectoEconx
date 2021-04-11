package Controlador.Usuarios;

import Dialogos.D_Confirmar;
import Dialogos.D_EliminarConfirmar;
import Modelo.TipoUsuario.M_ComboRoll;
import Modelo.Usuario.M_Usuario;
import Recursos.R_AgregarImagenes;
import Recursos.R_PlaceHolder;
import Recursos.R_Texto;
import Recursos.R_VerificacionesDeEntradaTexto;
import SQL.Usuario.S_Usuario;
import Vista.Usuario.V_AgregarUsuario;
import Vista.Usuario.V_EditarUsuario;
import Vista.Usuario.V_PanelUsuario;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import rojeru_san.rsdate.RSDateChooser;

public class C_Usuario {

    //Objetos
    R_AgregarImagenes rAgregarImg = new R_AgregarImagenes();
    R_VerificacionesDeEntradaTexto rVerificarionesText = new R_VerificacionesDeEntradaTexto();
    R_Texto rText = new R_Texto();
    S_Usuario sUsuario = new S_Usuario();
    M_Usuario mUsuarios = new M_Usuario();

    //Variables de objetos
    R_PlaceHolder rTextFantasma;
    V_EditarUsuario vEditarUsuario;
    V_AgregarUsuario vAgregarUsuario;
    M_ComboRoll mComboRoll;
    DefaultTableModel modelo;
    D_Confirmar dConfirmar;
    D_EliminarConfirmar dEliminarConfirmar;
    DefaultComboBoxModel modeloCombo;

    //Variables normales
    Date date = null;
    java.sql.Date sqlFecha = null;
    long d = 0;
    String Pass = null, secretKey = "Hi_ThisIsAKey_Encritp", nuevoPass = null, x, g;
    Vector v = new Vector();
    int fila;

    //Abrir dialogo de editar
    public void dialogoEditarUsuario() {
        vEditarUsuario = new V_EditarUsuario(new JFrame(), true);
        vEditarUsuario.setVisible(true);
    }

    //Abrir dialogo de agregar
    public void dialogoAgregarUsuario() {
        vAgregarUsuario = new V_AgregarUsuario(new JFrame(), true);
        vAgregarUsuario.setVisible(true);
    }

    public void dialogoEliminarUsuario(int id, JTable tbl, String msg) {
        dEliminarConfirmar = new D_EliminarConfirmar(new JFrame(), true);
        fila = tbl.getSelectedRow();
        id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        dEliminarConfirmar.id = id;
        D_EliminarConfirmar.lblMsg.setText(msg.toUpperCase());
        dEliminarConfirmar.setVisible(true);
    }

    //Metodo para agregar imagenes a los botones
    public void agregarImg(JButton btnAgregar, JButton btnEditar, JButton btnEliminar) {
        rAgregarImg.agregarImagen("/Img/Usuario/Agregar.png", btnAgregar);
        rAgregarImg.pasarMauseBoton("/Img/Usuario/AgregarP.png", btnAgregar);

        rAgregarImg.agregarImagen("/Img/Usuario/btnEdit.png", btnEditar);
        rAgregarImg.pasarMauseBoton("/Img/Usuario/btnEditP.png", btnEditar);

        rAgregarImg.agregarImagen("/Img/Usuario/btnElim.png", btnEliminar);
        rAgregarImg.pasarMauseBoton("/Img/Usuario/btnElimP.png", btnEliminar);
    }

    public void agregarImg(JButton btnCancelar, JButton btnGuardar) {
        rAgregarImg.agregarImagen("/Img/Usuario/Cancelar.png", btnCancelar);
        rAgregarImg.pasarMauseBoton("/Img/Usuario/CancelarP.png", btnCancelar);

        rAgregarImg.agregarImagen("/Img/Usuario/Guardar.png", btnGuardar);
        rAgregarImg.pasarMauseBoton("/Img/Usuario/GuardarP.png", btnGuardar);
    }

    //Metodos para poner texto fantasma
    public void fantasmaText(JTextField txt, String smj) {
        rTextFantasma = new R_PlaceHolder(smj.toUpperCase(), txt);
        txt.grabFocus();
    }

    public void fantasmaText(JTextField txtDNI, JTextField txtNombre, JTextField txtApellidos, JTextField txtTelefono) {
        rTextFantasma = new R_PlaceHolder("DNI".toUpperCase(), txtDNI);
        txtDNI.grabFocus();

        rTextFantasma = new R_PlaceHolder("Nombre".toUpperCase(), txtNombre);
        rTextFantasma = new R_PlaceHolder("Apellidos".toUpperCase(), txtApellidos);
        rTextFantasma = new R_PlaceHolder("Teléfono".toUpperCase(), txtTelefono);
    }

    public void fantasmaText(JTextField txtDNI, JPasswordField pwsPass, JTextField txtNombre,
            JTextField txtApellidos, JTextField txtTelefono, JTextField txtMail) {
        rTextFantasma = new R_PlaceHolder("DNI".toUpperCase(), txtDNI);
        txtDNI.grabFocus();

        rTextFantasma = new R_PlaceHolder("Contraseña".toUpperCase(), pwsPass);
        rTextFantasma = new R_PlaceHolder("Nombre".toUpperCase(), txtNombre);
        rTextFantasma = new R_PlaceHolder("Apellidos".toUpperCase(), txtApellidos);
        rTextFantasma = new R_PlaceHolder("Teléfono".toUpperCase(), txtTelefono);
        rTextFantasma = new R_PlaceHolder("Correo Electrónico".toUpperCase(), txtMail);
    }

    //Metodo para poder agregar paneles a otro panel desde otro form
    public void panelUsuario(java.awt.event.ActionEvent evt, V_PanelUsuario vPanelUsuario, JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vPanelUsuario.setVisible(true);
        pnlEntorno.add(vPanelUsuario);
        pnlEntorno.validate();
    }

    //Metodo para poder refrescar cuando se agrega un panel y no se habra otro encima de otro
    private void pnl(JPanel pnlEntorno) {
        pnlEntorno.removeAll();
        pnlEntorno.repaint();
    }

    //Metodos para abrir programas de la pc o una url de internet
    public void abrirProgramaCompu(String programa) {
        try {
            Runtime Rt = Runtime.getRuntime();
            Process Pro = Rt.exec(programa);
            Pro.waitFor();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error bro :(. " + e.toString());
        }
    }

    public void OpenInternnet(String URL) {
        try {
            Desktop.getDesktop().browse(URI.create(URL));
        } catch (IOException e) {
            System.err.println("Error bro :( " + e.toString());
        }
    }
    //Aquí terminan

    //Metodo para cargar la tabla de los usuarios
    public void mostrarTablaUsuario(JTable tbl) {
        modelo = sUsuario.mostrarTablaUsuarios();
        tbl.setModel(modelo);
        ocultarFila(tbl);
    }

    //Metodo para bsucar en la tabla de los usuarios
    public void buscarTablaUsuario(JTable tbl, JTextField txt) {
        if (txt.getText().trim().isEmpty()) {
            mostrarTablaUsuario(tbl);
        } else {
            modelo = sUsuario.buscarUsuarios(txt.getText());
            tbl.setModel(modelo);
            ocultarFila(tbl);
        }
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
        } else if (txt.getText().trim().length() >= 8) {
            rVerificarionesText.getToolkit().beep();
            evt.consume();
            D_Confirmar.lblMensaje.setText("Solo se permiten 8 carácteres".toUpperCase());
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
        } else if (txt.getText().trim().length() >= 8) {
            rVerificarionesText.getToolkit().beep();
            evt.consume();
            lbl.setText("Solo se permiten 8 carácteres".toUpperCase());
            return true;
        } else {
            lbl.setText("");
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
    
    //Metodo para cargar los roles de los usuarios en un combobox
    public void mostrarUsuarios(JComboBox cbx) {
        //cbx.addItem("Selecciona".toUpperCase());
        modeloCombo = new DefaultComboBoxModel(sUsuario.MostrarTipoUsuarios());
        cbx.setModel(modeloCombo);
        mComboRoll = (M_ComboRoll) cbx.getSelectedItem();
    }

    //Metodo para agregar usuarios
    public void agregar(JComboBox cbx, RSDateChooser dt,
            JPasswordField pws, JTextField txtCorreo, JTextField txtDNI, JTextField txtNombre, JTextField txtApellidos,
            JTextField txtTelef) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mComboRoll = (M_ComboRoll) cbx.getSelectedItem();
        date = dt.getDatoFecha();
        d = date.getTime();
        sqlFecha = new java.sql.Date(d);

        Pass = new String(pws.getPassword());

        nuevoPass = rText.ecnode(secretKey, Pass);

        mUsuarios.setDni(txtDNI.getText());
        mUsuarios.setPassword(nuevoPass);
        mUsuarios.setNombre(txtNombre.getText());
        mUsuarios.setApellidos(txtApellidos.getText());
        mUsuarios.setFechaNacimiento(sqlFecha.toString());
        mUsuarios.setCorreoElectronico(txtCorreo.getText());
        mUsuarios.setTelefono(txtTelef.getText());
        mUsuarios.setRoll(mComboRoll.getId());

        if (sUsuario.agregarUsuarios(mUsuarios)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Exitoso".toUpperCase());
            limpiarCajas(pws, txtDNI, txtNombre, txtApellidos, txtTelef, txtCorreo, cbx, dt);
            mostrarTablaUsuario(V_PanelUsuario.tblUsuarios);
            dConfirmar.setVisible(true);
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(pws, txtDNI, txtNombre, txtApellidos, txtTelef, txtCorreo, cbx, dt);
            dConfirmar.setVisible(true);
        }
    }

    //Metodo para actualziar usuarios
    public boolean actualizar(JComboBox cbx, JTextField txtDNI, JTextField txtNombre, JTextField txtApellidos,
            JTextField txtTelef, int id) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mComboRoll = (M_ComboRoll) cbx.getSelectedItem();

        mUsuarios.setDni(txtDNI.getText());
        mUsuarios.setNombre(txtNombre.getText());
        mUsuarios.setApellidos(txtApellidos.getText());
        mUsuarios.setTelefono(txtTelef.getText());
        mUsuarios.setRoll(mComboRoll.getId());
        mUsuarios.setId(id);

        if (sUsuario.actualizarUsuarios(mUsuarios)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Actualizado con exito".toUpperCase());
            limpiarCajas(txtDNI, txtNombre, txtApellidos, txtTelef, cbx);
            mostrarTablaUsuario(V_PanelUsuario.tblUsuarios);
            dConfirmar.setVisible(true);
            return true;
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(txtDNI, txtNombre, txtApellidos, txtTelef, cbx);
            dConfirmar.setVisible(true);
            return false;
        }
    }

    public boolean eliminar(int id) {
        dConfirmar = new D_Confirmar(new JFrame(), true);

        if (sUsuario.eliminarUsuarios(id)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Se elimino el registro".toUpperCase());
            mostrarTablaUsuario(V_PanelUsuario.tblUsuarios);
            dConfirmar.setVisible(true);
            return true;
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            dConfirmar.setVisible(true);
            return false;
        }
    }

    //Metodo para pasar información de los usuarios al editar
    public void pasarUsuario(JTable tbl) {
        vEditarUsuario = new V_EditarUsuario(new JFrame(), true);

        fila = tbl.getSelectedRow();

        vEditarUsuario.id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        V_EditarUsuario.txtDNI.setText(tbl.getValueAt(fila, 1).toString());
        V_EditarUsuario.txtNom.setText(tbl.getValueAt(fila, 2).toString());
        V_EditarUsuario.txtApe.setText(tbl.getValueAt(fila, 3).toString());
        V_EditarUsuario.txtTelefono.setText(tbl.getValueAt(fila, 4).toString());

        // Pasamos el roll que tiene al combo
        x = tbl.getValueAt(tbl.getSelectedRow(), 5).toString();
        forParaRecorrerElCombo(V_EditarUsuario.cbxRoll, x);
        vEditarUsuario.setVisible(true);
    }

    //Metodo para poder recorrer el combo y selecciona lo que este tenga
    public void forParaRecorrerElCombo(JComboBox cbx, String xd) {
        for (int i = 0; i < cbx.getItemCount(); i++) {
            v.add(cbx.getItemAt(i));
        }
        for (int i = 0; i < cbx.getItemCount(); i++) {
            g = v.get(i).toString();
            if (xd.equalsIgnoreCase(g)) {
                cbx.setSelectedIndex(i);
            }
        }
    }

    //Metodo para verificar si las entradas estan vacias para poder registrar usuarios
    public boolean textVacio(JTextField txtDNI, JPasswordField pwsPass, JTextField txtNom,
            JTextField txtApe, JTextField txtTele, JTextField txtCorreo, JComboBox cbx, JLabel lblMensaje) {

        try {

            boolean veri = txtDNI.getText().trim().isEmpty() || pwsPass.getText().trim().isEmpty() || txtNom.getText().trim().isEmpty()
                    || txtApe.getText().trim().isEmpty() || txtTele.getText().trim().isEmpty() || txtCorreo.getText().trim().isEmpty()
                    || cbx.getSelectedIndex() == 0;

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

    //Metodo para verificar si el correo electronico esta bien escrito
    public boolean correo(JTextField txt, JLabel lbl) {
        if (!rText.ValidarEmail(txt.getText().trim())) {
            lbl.setText("Escribe bien el correo electrónico".toUpperCase());
            return true;
        } else {
            lbl.setText("".toUpperCase());
            return false;
        }
    }

    //Metodo para ocultar una fila de una tabla
    private void ocultarFila(JTable tbl) {
        tbl.getColumnModel().getColumn(0).setMaxWidth(0);
        tbl.getColumnModel().getColumn(0).setMinWidth(0);
        tbl.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    //metodo para limpiar cajas despues de editar, eliminar o agregar
    private void limpiarCajas(JPasswordField pws, JTextField txtDNI, JTextField txtNombre, JTextField txtApellidos,
            JTextField txtTelef, JTextField txtCorreo, JComboBox cbx, RSDateChooser dt) {
        txtDNI.setText(null);
        pws.setText(null);
        txtNombre.setText(null);
        txtApellidos.setText(null);
        dt.setDatoFecha(new Date());
        txtCorreo.setText(null);
        txtTelef.setText(null);
        mostrarUsuarios(cbx);
    }

    private void limpiarCajas(JTextField txtDNI, JTextField txtNombre, JTextField txtApellidos,
            JTextField txtTelef, JComboBox cbx) {
        txtDNI.setText(null);
        txtNombre.setText(null);
        txtApellidos.setText(null);
        txtTelef.setText(null);
        mostrarUsuarios(cbx);
    }
}
