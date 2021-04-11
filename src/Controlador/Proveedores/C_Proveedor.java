package Controlador.Proveedores;

import Dialogos.D_Confirmar;
import Modelo.Proveedor.M_Proveedor;
import Recursos.R_AgregarImagenes;
import Recursos.R_PlaceHolder;
import Recursos.R_Texto;
import Recursos.R_VerificacionesDeEntradaTexto;
import SQL.Proveedor.S_Proveedor;
import Vista.Proveedor.D_EliminarProveedor;
import Vista.Proveedor.V_AgregarProveedor;
import Vista.Proveedor.V_EditarProveedor;
import Vista.Proveedor.V_PanelProveedor;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class C_Proveedor {

    //Objetos
    R_AgregarImagenes rAgregarImg = new R_AgregarImagenes();
    R_VerificacionesDeEntradaTexto rVerificarionesText = new R_VerificacionesDeEntradaTexto();
    R_Texto rText = new R_Texto();
    S_Proveedor sProveedor = new S_Proveedor();
    M_Proveedor mProveedor = new M_Proveedor();

    R_PlaceHolder rTextFantasma;
    DefaultTableModel modelo;
    D_Confirmar dConfirmar;
    V_EditarProveedor vEditarProveedor;
    V_AgregarProveedor vAgregarProveedor;
    D_EliminarProveedor dEliminarProveedor;

    int fila;

    //Abrir dialogo de editar
    public void dialogoEditarProveedor() {
        vEditarProveedor = new V_EditarProveedor(new JFrame(), true);
        vEditarProveedor.setVisible(true);
    }

    //Abrir dialogo de agregar
    public void dialogoAgregarProveedor() {
        vAgregarProveedor = new V_AgregarProveedor(new JFrame(), true);
        vAgregarProveedor.setVisible(true);
    }

    public void dialogoEliminarProveedor(int id, JTable tbl, String msg) {
        dEliminarProveedor = new D_EliminarProveedor(new JFrame(), true);
        fila = tbl.getSelectedRow();
        id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        dEliminarProveedor.id = id;
        D_EliminarProveedor.lblMsg.setText(msg.toUpperCase());
        dEliminarProveedor.setVisible(true);
    }

    //Metodo para agregar imagenes a los botones
    public void agregarImg(JButton btnAgregar, JButton btnEditar, JButton btnEliminar) {
        rAgregarImg.agregarImagen("/Img/Proveedores/Agregar.png", btnAgregar);
        rAgregarImg.pasarMauseBoton("/Img/Proveedores/AgregarP.png", btnAgregar);

        rAgregarImg.agregarImagen("/Img/Proveedores/Edit.png", btnEditar);
        rAgregarImg.pasarMauseBoton("/Img/Proveedores/EditP.png", btnEditar);

        rAgregarImg.agregarImagen("/Img/Proveedores/Elim.png", btnEliminar);
        rAgregarImg.pasarMauseBoton("/Img/Proveedores/ElimP.png", btnEliminar);
    }

    public void agregarImg(JButton btnCancelar, JButton btnGuardar) {
        rAgregarImg.agregarImagen("/Img/Proveedores/Cancelar.png", btnCancelar);
        rAgregarImg.pasarMauseBoton("/Img/Proveedores/CancelarP.png", btnCancelar);

        rAgregarImg.agregarImagen("/Img/Proveedores/Guardar.png", btnGuardar);
        rAgregarImg.pasarMauseBoton("/Img/Proveedores/GuardarP.png", btnGuardar);
    }

    //Metodos para poner texto fantasma
    public void fantasmaText(JTextField txt, String smj) {
        rTextFantasma = new R_PlaceHolder(smj.toUpperCase(), txt);
        txt.grabFocus();
    }

    public void fantasmaText(JTextField txtDNI, JTextField txtNombre, JTextField txtApellidos,
            JTextField txtCorreo, JTextField txtTelefono) {
        rTextFantasma = new R_PlaceHolder("DNI".toUpperCase(), txtDNI);
        txtDNI.grabFocus();

        rTextFantasma = new R_PlaceHolder("Nombre".toUpperCase(), txtNombre);
        rTextFantasma = new R_PlaceHolder("Apellidos".toUpperCase(), txtApellidos);
        rTextFantasma = new R_PlaceHolder("Correo Electrónico".toUpperCase(), txtCorreo);
        rTextFantasma = new R_PlaceHolder("Teléfono".toUpperCase(), txtTelefono);
    }

    //Metodo para cargar la tabla de los usuarios
    public void mostrarTablaProveedor(JTable tbl) {
        modelo = sProveedor.mostrarTablaProveedor();
        tbl.setModel(modelo);
        ocultarFila(tbl);
    }

    //Metodo para bsucar en la tabla de los usuarios
    public void buscarTablaProveedor(JTable tbl, JTextField txt) {
        if (txt.getText().trim().isEmpty()) {
            mostrarTablaProveedor(tbl);
        } else {
            modelo = sProveedor.buscarProveedor(txt.getText());
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

    //Metodo para agregar usuarios
    public boolean agregar(JTextField txtDNI, JTextField txtNombre, JTextField txtApellidos,
            JTextField txtCorreo, JTextField txtTelefono) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mProveedor.setDni(txtDNI.getText());
        mProveedor.setNombre(txtNombre.getText());
        mProveedor.setApellidos(txtApellidos.getText());
        mProveedor.setCorreoElectronico(txtCorreo.getText());
        mProveedor.setTelefono(txtTelefono.getText());

        if (sProveedor.agregarProveedor(mProveedor)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Exitoso".toUpperCase());
            limpiarCajas(txtDNI, txtNombre, txtApellidos, txtCorreo, txtTelefono);
            mostrarTablaProveedor(V_PanelProveedor.tblUsuarios);
            dConfirmar.setVisible(true);
            return true;
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(txtDNI, txtNombre, txtApellidos, txtCorreo, txtTelefono);
            dConfirmar.setVisible(true);
            return false;
        }
    }

    //Metodo para actualziar usuarios
    public boolean actualizar(JTextField txtDNI, JTextField txtNombre, JTextField txtApellidos,
            JTextField txtCorreo, JTextField txtTelefono, int id) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mProveedor.setDni(txtDNI.getText());
        mProveedor.setNombre(txtNombre.getText());
        mProveedor.setApellidos(txtApellidos.getText());
        mProveedor.setCorreoElectronico(txtCorreo.getText());
        mProveedor.setTelefono(txtTelefono.getText());
        mProveedor.setId(id);

        if (sProveedor.actualizarProveedor(mProveedor)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Actualizado con exito".toUpperCase());
            limpiarCajas(txtDNI, txtNombre, txtApellidos, txtCorreo, txtTelefono);
            mostrarTablaProveedor(V_PanelProveedor.tblUsuarios);
            dConfirmar.setVisible(true);
            return true;
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(txtDNI, txtNombre, txtApellidos, txtCorreo, txtTelefono);
            dConfirmar.setVisible(true);
            return false;
        }
    }

    public boolean eliminar(int id) {
        dConfirmar = new D_Confirmar(new JFrame(), true);

        if (sProveedor.eliminarProveedor(id)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Se elimino el registro".toUpperCase());
            mostrarTablaProveedor(V_PanelProveedor.tblUsuarios);
            dConfirmar.setVisible(true);
            return true;
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            dConfirmar.setVisible(true);
            return false;
        }
    }

    //Metodo para verificar si las entradas estan vacias para poder registrar usuarios
    public boolean textVacio(JTextField txtDNI, JTextField txtNombre, JTextField txtApellidos,
            JTextField txtCorreo, JTextField txtTelefono, JLabel lblMensaje) {

        try {

            boolean veri = txtDNI.getText().trim().isEmpty() || txtNombre.getText().trim().isEmpty()
                    || txtApellidos.getText().trim().isEmpty() || txtCorreo.getText().trim().isEmpty() || txtTelefono.getText().trim().isEmpty();

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

    //Metodo para pasar información de los usuarios al editar
    public void pasarUsuario(JTable tbl) {
        vEditarProveedor = new V_EditarProveedor(new JFrame(), true);

        fila = tbl.getSelectedRow();

        vEditarProveedor.id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        V_EditarProveedor.txtDNI.setText(tbl.getValueAt(fila, 1).toString());
        V_EditarProveedor.txtNom.setText(tbl.getValueAt(fila, 2).toString());
        V_EditarProveedor.txtApe.setText(tbl.getValueAt(fila, 3).toString());
        V_EditarProveedor.txtCorreo.setText(tbl.getValueAt(fila, 4).toString());
        V_EditarProveedor.txtTelefono.setText(tbl.getValueAt(fila, 5).toString());
        
        vEditarProveedor.setVisible(true);
    }

    //Metodo para ocultar una fila de una tabla
    private void ocultarFila(JTable tbl) {
        tbl.getColumnModel().getColumn(0).setMaxWidth(0);
        tbl.getColumnModel().getColumn(0).setMinWidth(0);
        tbl.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    //metodo para limpiar cajas despues de editar, eliminar o agregar
    private void limpiarCajas(JTextField txtDNI, JTextField txtNombre, JTextField txtApellidos,
            JTextField txtCorreo, JTextField txtTelefono) {
        txtDNI.setText(null);
        txtNombre.setText(null);
        txtApellidos.setText(null);
        txtCorreo.setText(null);
        txtTelefono.setText(null);
    }
}
