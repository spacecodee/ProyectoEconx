package Controlador.Boleta;

import Dialogos.D_Confirmar;
import Modelo.Boleta.M_Boleta;
import Modelo.Boleta.M_ComboComprador;
import Modelo.Boleta.M_ComboTrae;
import Recursos.R_AgregarImagenes;
import Recursos.R_PlaceHolder;
import Recursos.R_Texto;
import Recursos.R_VerificacionesDeEntradaTexto;
import SQL.Boleta.S_Boleta;
import Vista.Boleta.D_EliminaBoleta;
import Vista.Boleta.V_AgregarBolRe;
import Vista.Boleta.V_AgregarBoleta;
import Vista.Boleta.V_EditarBol;
import Vista.Boleta.V_EditarBolRe;
import Vista.Boleta.V_PanelBoleta;
import Vista.Boleta.V_ReportarBoleta;
import Vista.Boleta.V_TablaProProd;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import rojeru_san.rsdate.RSDateChooser;

public class C_Boleta {

    R_AgregarImagenes rAgregarImg = new R_AgregarImagenes();
    R_VerificacionesDeEntradaTexto rVerificarionesText = new R_VerificacionesDeEntradaTexto();
    R_Texto rText = new R_Texto();
    S_Boleta sBoleta = new S_Boleta();
    M_Boleta mBoleta = new M_Boleta();
    Vector v = new Vector();
    Vector v2 = new Vector();

    DefaultTableModel modelo;
    DefaultComboBoxModel modeloCombo;
    R_PlaceHolder rTextFantasma;
    D_Confirmar dConfirmar;
    D_EliminaBoleta dEliminarBoleta;
    V_AgregarBoleta vAgregarBoleta;
    V_AgregarBolRe vAgregarBol;
    V_EditarBol vEditarBoleta;
    V_EditarBolRe vEdit;
    V_ReportarBoleta vReportarBoleta;
    V_TablaProProd vTablaInterProP;
    M_ComboTrae mComboTrae;
    M_ComboComprador mComboComprado;
    Date date = null;
    java.sql.Date sqlFecha = null;
    long d = 0;

    int fila;
    String x, y, g, verificar;

    public void dialogoBoleta() {
        vReportarBoleta = new V_ReportarBoleta(new JFrame(), true);
        vReportarBoleta.setVisible(true);
    }

    public void dialogo(String verificar) {
        vTablaInterProP = new V_TablaProProd(new JFrame(), true, verificar);
        vTablaInterProP.setVisible(true);
    }

    public void traer(JTable tbl, String verificar) {
        fila = tbl.getSelectedRow();
        System.out.println("es: " + verificar);
        if (verificar.equals("Agregar")) {
            V_AgregarBolRe.idT = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
            V_AgregarBolRe.txtProveedor.setText(tbl.getValueAt(fila, 2).toString());
            V_AgregarBolRe.txtProducto.setText(tbl.getValueAt(fila, 3).toString());
        } else if (verificar.equals("Actualizar")) {
            V_EditarBolRe.idT = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
            V_EditarBolRe.txtProveedor.setText(tbl.getValueAt(fila, 2).toString());
            V_EditarBolRe.txtProducto.setText(tbl.getValueAt(fila, 3).toString());
        }

    }

    public void facturar() {
        dConfirmar = new D_Confirmar(new JFrame(), true);

        if (sBoleta.facturarTodo()) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Boleta realizada".toUpperCase());
            dConfirmar.setVisible(true);
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            dConfirmar.setVisible(true);
        }
    }

    public void facturar(JTextField txtDNI, JTextField txtNombre, RSDateChooser dt) {
        dConfirmar = new D_Confirmar(new JFrame(), true);

        date = dt.getDatoFecha();
        d = date.getTime();
        sqlFecha = new java.sql.Date(d);
        if (sBoleta.facturar(txtDNI.getText().trim(), txtNombre.getText().trim(), sqlFecha.toString())) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Boleta realizada".toUpperCase());
            dConfirmar.setVisible(true);
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            dConfirmar.setVisible(true);
        }
    }

    //Metodo para cargar los roles de los usuarios en un combobox
    public void mostrarTrae(JComboBox cbx) {
        modeloCombo = new DefaultComboBoxModel(sBoleta.MostrarComboTrae());
        cbx.setModel(modeloCombo);
        mComboTrae = (M_ComboTrae) cbx.getSelectedItem();
    }

    public void mostrarComprador(JComboBox cbx) {
        modeloCombo = new DefaultComboBoxModel(sBoleta.MostrarComboComprador());
        cbx.setModel(modeloCombo);
        mComboComprado = (M_ComboComprador) cbx.getSelectedItem();
    }

    //Metodos para poner texto fantasma
    public void fantasmaText(JTextField txt, String smj) {
        rTextFantasma = new R_PlaceHolder(smj.toUpperCase(), txt);
        txt.grabFocus();
    }

    public void fantasmaText(JTextField txtCodigo, JTextField txtEmpresa,
            JTextField txtProveedor, JTextField txtProducto) {
        rTextFantasma = new R_PlaceHolder("Código".toUpperCase(), txtCodigo);
        rTextFantasma = new R_PlaceHolder("Empresa".toUpperCase(), txtEmpresa);
        rTextFantasma = new R_PlaceHolder("Proveedor".toUpperCase(), txtProveedor);
        rTextFantasma = new R_PlaceHolder("Producto".toUpperCase(), txtProducto);
        txtCodigo.grabFocus();
    }

    public void fantasmaText(JTextField txtCodigo, JTextField txtNombre) {
        rTextFantasma = new R_PlaceHolder("Código".toUpperCase(), txtCodigo);
        rTextFantasma = new R_PlaceHolder("Nombre Boleta".toUpperCase(), txtNombre);
        txtCodigo.grabFocus();
    }

    //Abrir dialogo de agregar
    public void dialogoAgregarProducto() {
        vAgregarBoleta = new V_AgregarBoleta(new JFrame(), true);
        vAgregarBoleta.setVisible(true);
    }

    public void dialogoEliminarBoleta(int id, JTable tbl, String msg) {
        dEliminarBoleta = new D_EliminaBoleta(new JFrame(), true);
        fila = tbl.getSelectedRow();
        id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        dEliminarBoleta.id = id;
        D_EliminaBoleta.lblMsg.setText(msg.toUpperCase());
        dEliminarBoleta.setVisible(true);
    }

    //Metodo para agregar imagenes a los botones
    public void agregarImg(JButton btnAgregar, JButton btnEditar, JButton btnEliminar,
            JButton btnFT, JButton btnFac) {
        rAgregarImg.agregarImagen("/Img/Usuario/Agregar.png", btnAgregar);
        rAgregarImg.pasarMauseBoton("/Img/Usuario/AgregarP.png", btnAgregar);

        rAgregarImg.agregarImagen("/Img/Usuario/btnEdit.png", btnEditar);
        rAgregarImg.pasarMauseBoton("/Img/Usuario/btnEditP.png", btnEditar);

        rAgregarImg.agregarImagen("/Img/Usuario/btnElim.png", btnEliminar);
        rAgregarImg.pasarMauseBoton("/Img/Usuario/btnElimP.png", btnEliminar);

        rAgregarImg.agregarImagen("/Img/Boleta/FT.png", btnFT);
        rAgregarImg.pasarMauseBoton("/Img/Boleta/FTP.png", btnFT);

        rAgregarImg.agregarImagen("/Img/Boleta/Fac.png", btnFac);
        rAgregarImg.pasarMauseBoton("/Img/Boleta/FacP.png", btnFac);
    }

    public void agregarImg(JButton btnCancelar, JButton btnGuardar) {
        rAgregarImg.agregarImagen("/Img/Producto/Cancelar.png", btnCancelar);
        rAgregarImg.pasarMauseBoton("/Img/Producto/CancelarP.png", btnCancelar);

        rAgregarImg.agregarImagen("/Img/Producto/Guardar.png", btnGuardar);
        rAgregarImg.pasarMauseBoton("/Img/Producto/GuardarP.png", btnGuardar);
    }

    public void agregarImg(JButton btnCancelar, JButton btnGuardar, JButton btnBus) {
        rAgregarImg.agregarImagen("/Img/Producto/Cancelar.png", btnCancelar);
        rAgregarImg.pasarMauseBoton("/Img/Producto/CancelarP.png", btnCancelar);

        rAgregarImg.agregarImagen("/Img/Producto/Guardar.png", btnGuardar);
        rAgregarImg.pasarMauseBoton("/Img/Producto/GuardarP.png", btnGuardar);

        rAgregarImg.agregarImagen("/Img/Boleta/btnI.png", btnBus);
        rAgregarImg.pasarMauseBoton("/Img/Boleta/btnIP.png", btnBus);
    }

    //Metodo para verificar si las entradas estan vacias para poder registrar usuarios
    public boolean textVacio(JComboBox cbxtrae, JComboBox cbxComprador, JTextField txtCodigo,
            JTextField txtPrecio, JTextField txtCantidad, JTextField txtEmpresa, JLabel lblMensaje) {
        try {
            boolean veri = cbxtrae.getSelectedIndex() == 0 || cbxComprador.getSelectedIndex() == 0
                    || txtCodigo.getText().trim().isEmpty() || txtPrecio.getText().trim().isEmpty()
                    || txtCantidad.getText().trim().isEmpty() || txtEmpresa.getText().trim().isEmpty();

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

    public boolean textVacio(JTextField txtCod, JTextField txtNom, JLabel lblMsj) {
        if (txtCod.getText().trim().isEmpty() || txtNom.getText().trim().isEmpty()) {
            lblMsj.setText("Todos los campos son necesarios".toUpperCase());
            return true;
        } else {
            lblMsj.setText("".toUpperCase());
            return false;
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
        } else if (txt.getText().trim().length() >= 10) {
            rVerificarionesText.getToolkit().beep();
            evt.consume();
            D_Confirmar.lblMensaje.setText("Solo se permiten 10 carácteres".toUpperCase());
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
        } else if (txt.getText().trim().length() >= 10) {
            rVerificarionesText.getToolkit().beep();
            evt.consume();
            lbl.setText("Solo se permiten 10 carácteres".toUpperCase());
            return true;
        } else {
            lbl.setText("");
            return false;
        }
    }

    public boolean verifOcho(KeyEvent evt, JTextField txt, JLabel lbl) {
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

    public boolean verifSoloNumeros(KeyEvent evt, JTextField txt, JLabel lbl) {
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            rVerificarionesText.getToolkit().beep();
            evt.consume();
            lbl.setText("Solo se permiten números".toUpperCase());
            return true;
        } else {
            lbl.setText("");
            return false;
        }
    }

    //Metodo para cargar la tabla de los usuarios
    public void mostrarTablaBoleta(JTable tbl) {
        modelo = sBoleta.mostrarTablaBoleta();
        tbl.setModel(modelo);
        ocultarFila(tbl);
    }

    public void mostrarTablita(JTable tbl) {
        modelo = sBoleta.tablita();
        tbl.setModel(modelo);
        ocultarFila(tbl);
    }

    //Metodo para bsucar en la tabla de los usuarios
    public void buscarBoleta(JTable tbl, JTextField txt) {
        if (txt.getText().trim().isEmpty()) {
            mostrarTablaBoleta(tbl);
        } else {
            modelo = sBoleta.buscarBoleta(txt.getText());
            tbl.setModel(modelo);
            ocultarFila(tbl);
        }
    }

    public void mostrarTablita(JTable tbl, JTextField txt) {
        if (txt.getText().trim().isEmpty()) {
            mostrarTablita(tbl);
        } else {
            modelo = sBoleta.tablita(txt.getText());
            tbl.setModel(modelo);
            ocultarFila(tbl);
        }
    }

    public void agregar(JComboBox cbxTrae, JComboBox cbxComprador, JTextField txtCodigo,
            JTextField txtPrecio, JTextField txtCantidad, JTextField txtEmpresa) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mComboTrae = (M_ComboTrae) cbxTrae.getSelectedItem();
        mComboComprado = (M_ComboComprador) cbxComprador.getSelectedItem();

        mBoleta.setIdTrae(mComboTrae.getId());
        mBoleta.setUsuarioComprador(mComboComprado.getId());
        mBoleta.setCodigo(txtCodigo.getText());
        mBoleta.setPrecio(Double.parseDouble(txtPrecio.getText()));
        mBoleta.setCantidad(Integer.parseInt(txtCantidad.getText()));
        mBoleta.setEmpresa(txtEmpresa.getText());

        if (sBoleta.agregarBoleta(mBoleta)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Exitoso".toUpperCase());
            //limpiarCajas(cbxTrae, cbxComprador, txtCodigo, txtPrecio, txtCantidad, txtEmpresa);
            mostrarTablaBoleta(V_PanelBoleta.tblBoleta);
            dConfirmar.setVisible(true);
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            //limpiarCajas(cbxTrae, cbxComprador, txtCodigo, txtPrecio, txtCantidad, txtEmpresa);
            dConfirmar.setVisible(true);
        }
    }

    public void agregar(int idTrae, JComboBox cbxComprador, JTextField txtCodigo,
            JTextField txtEmpresa, RSDateChooser dt) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mComboComprado = (M_ComboComprador) cbxComprador.getSelectedItem();

        date = dt.getDatoFecha();
        d = date.getTime();
        sqlFecha = new java.sql.Date(d);

        mBoleta.setIdTrae(idTrae);
        mBoleta.setUsuarioComprador(mComboComprado.getId());
        mBoleta.setCodigo(txtCodigo.getText());
        mBoleta.setEmpresa(txtEmpresa.getText());
        mBoleta.setFecha(sqlFecha.toString());

        if (sBoleta.agregarBoleta(mBoleta)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Exitoso".toUpperCase());
            limpiarCajas(cbxComprador, txtCodigo, txtEmpresa, dt);
            mostrarTablaBoleta(V_PanelBoleta.tblBoleta);
            dConfirmar.setVisible(true);
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(cbxComprador, txtCodigo, txtEmpresa, dt);
            dConfirmar.setVisible(true);
        }
    }

    public boolean actualizar(int idTrae, JComboBox cbxComprador, JTextField txtCodigo,
            JTextField txtEmpresa, RSDateChooser dt, int id) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mComboComprado = (M_ComboComprador) cbxComprador.getSelectedItem();

        date = dt.getDatoFecha();
        d = date.getTime();
        sqlFecha = new java.sql.Date(d);

        mBoleta.setIdTrae(idTrae);
        mBoleta.setUsuarioComprador(mComboComprado.getId());
        mBoleta.setCodigo(txtCodigo.getText());
        mBoleta.setEmpresa(txtEmpresa.getText());
        mBoleta.setFecha(sqlFecha.toString());
        mBoleta.setId(id);

        if (sBoleta.actualizarBoleta(mBoleta)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Actualizado con exito".toUpperCase());
            limpiarCajas(cbxComprador, txtCodigo, txtEmpresa, dt);
            mostrarTablaBoleta(V_PanelBoleta.tblBoleta);
            dConfirmar.setVisible(true);
            return true;
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(cbxComprador, txtCodigo, txtEmpresa, dt);
            dConfirmar.setVisible(true);
            return false;
        }
    }

    public boolean eliminar(int id) {
        dConfirmar = new D_Confirmar(new JFrame(), true);

        if (sBoleta.eliminarBoleta(id)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Se elimino el registro".toUpperCase());
            mostrarTablaBoleta(V_PanelBoleta.tblBoleta);
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
    public void pasarBoleta(JTable tbl) {
        vEditarBoleta = new V_EditarBol(new JFrame(), true);
        fila = tbl.getSelectedRow();

        vEditarBoleta.id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());

        x = tbl.getValueAt(tbl.getSelectedRow(), 1).toString();
        forParaRecorrerElCombo(V_EditarBol.cbxTrae, x);

        // Pasamos el roll que tiene al combo
        y = tbl.getValueAt(tbl.getSelectedRow(), 4).toString();
        forParaRecorrerElComboDos(V_EditarBol.cbxComprador, y);

        V_EditarBol.txtCodigo.setText(tbl.getValueAt(fila, 6).toString());
        V_EditarBol.txtPrecio.setText(tbl.getValueAt(fila, 7).toString());
        V_EditarBol.txtStock.setText(tbl.getValueAt(fila, 8).toString());
        V_EditarBol.txtEmpres.setText(tbl.getValueAt(fila, 9).toString());
        vEditarBoleta.setVisible(true);
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

    public void forParaRecorrerElComboDos(JComboBox cbx, String yd) {
        for (int i = 0; i < cbx.getItemCount(); i++) {
            v2.add(cbx.getItemAt(i));
        }
        for (int i = 0; i < cbx.getItemCount(); i++) {
            g = v2.get(i).toString();
            if (yd.equalsIgnoreCase(g)) {
                cbx.setSelectedIndex(i);
            }
        }
    }

    //Metodo para ocultar una fila de una tabla
    private void ocultarFila(JTable tbl) {
        tbl.getColumnModel().getColumn(0).setMaxWidth(0);
        tbl.getColumnModel().getColumn(0).setMinWidth(0);
        tbl.getColumnModel().getColumn(0).setPreferredWidth(0);

        /*tbl.getColumnModel().getColumn(1).setMaxWidth(0);
        tbl.getColumnModel().getColumn(1).setMinWidth(0);
        tbl.getColumnModel().getColumn(1).setPreferredWidth(0);

        tbl.getColumnModel().getColumn(4).setMaxWidth(0);
        tbl.getColumnModel().getColumn(4).setMinWidth(0);
        tbl.getColumnModel().getColumn(4).setPreferredWidth(0);*/
    }

    public void limpiarCajas(JComboBox cbxComprador, JTextField txtCodigo, JTextField txtEmpresa, RSDateChooser dt) {
        mostrarComprador(cbxComprador);
        txtCodigo.setText(null);
        txtEmpresa.setText(null);
        dt.setDatoFecha(new Date());
    }

}
