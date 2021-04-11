package Controlador.TraeProducto;

import Dialogos.D_Confirmar;
import Modelo.Producto.M_ComboProducto;
import Modelo.Proveedor.M_ComboProveedor;
import Modelo.TraeProducto.M_TraeProducto;
import Recursos.R_AgregarImagenes;
import Recursos.R_PlaceHolder;
import Recursos.R_Texto;
import Recursos.R_VerificacionesDeEntradaTexto;
import SQL.TraeProducto.S_TraeProducto;
import Vista.TraeProducto.D_EliminarTraeProducto;
import Vista.TraeProducto.V_PanelIntermedia;
import Vista.TraeProducto.V_PanelTraeProducto;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
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

public class C_TraeProducto {

    R_AgregarImagenes rAgregarImg = new R_AgregarImagenes();
    R_VerificacionesDeEntradaTexto rVerificarionesText = new R_VerificacionesDeEntradaTexto();
    R_Texto rText = new R_Texto();
    S_TraeProducto sTraeProdcuto = new S_TraeProducto();
    M_TraeProducto mTraeProducto = new M_TraeProducto();

    //Variables de objetos
    R_PlaceHolder rTextFantasma;
    DefaultTableModel modelo;
    DefaultComboBoxModel modeloCombo;
    M_ComboProveedor mComboProvee;
    M_ComboProducto mComboProducto;
    D_EliminarTraeProducto dEliminarTraeP;
    D_Confirmar dConfirmar;
    V_PanelTraeProducto vPanelTraeP;
    V_PanelIntermedia vPanelIntermedia;

    //Variables normales
    Date date = null;
    java.sql.Date sqlFecha = null;
    long d = 0;
    String x, g, y;
    Vector v = new Vector();
    Vector v2 = new Vector();
    int fila;
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yy-MM-dd");

    //Metodo para cargar los roles de los usuarios en un combobox
    public void mostrarProveedor(JComboBox cbx) {
        cbx.removeAllItems();
        modeloCombo = new DefaultComboBoxModel(sTraeProdcuto.MostrarComboProvee());
        cbx.setModel(modeloCombo);
        mComboProvee = (M_ComboProveedor) cbx.getSelectedItem();
    }

    public void mostrarProducto(JComboBox cbx) {
        cbx.removeAllItems();
        modeloCombo = new DefaultComboBoxModel(sTraeProdcuto.MostrarComboProducto());
        cbx.setModel(modeloCombo);
        mComboProducto = (M_ComboProducto) cbx.getSelectedItem();
    }

    public void dialogoEliminarTraeP(int id, JTable tbl, String msg) {
        dEliminarTraeP = new D_EliminarTraeProducto(new JFrame(), true);
        fila = tbl.getSelectedRow();
        id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        dEliminarTraeP.id = id;
        D_EliminarTraeProducto.lblMsg.setText(msg.toUpperCase());
        dEliminarTraeP.setVisible(true);
    }

    public void agregarImg(JButton btnEliminar, JButton btnGuardar) {
        rAgregarImg.agregarImagen("/Img/TraeProducto/Eliminar.png", btnEliminar);
        rAgregarImg.pasarMauseBoton("/Img/TraeProducto/EliminarP.png", btnEliminar);

        rAgregarImg.agregarImagen("/Img/TraeProducto/Guardar.png", btnGuardar);
        rAgregarImg.pasarMauseBoton("/Img/TraeProducto/GuardarP.png", btnGuardar);
    }

    public void fantasmaText(JTextField txtBuscar, JTextField txtCodigo) {
        rTextFantasma = new R_PlaceHolder("Buscar".toUpperCase(), txtBuscar);
        txtBuscar.grabFocus();
        rTextFantasma = new R_PlaceHolder("Código".toUpperCase(), txtCodigo);
    }

    public void fantasmaText(JTextField txtBuscar, JTextField txtCodigo, JTextField txtPrecio, JTextField txtStock) {
        rTextFantasma = new R_PlaceHolder("Buscar".toUpperCase(), txtBuscar);
        txtBuscar.grabFocus();
        rTextFantasma = new R_PlaceHolder("Código".toUpperCase(), txtCodigo);
        rTextFantasma = new R_PlaceHolder("Precio".toUpperCase(), txtPrecio);
        rTextFantasma = new R_PlaceHolder("Stock".toUpperCase(), txtStock);
    }

    //Metodo para verificar si las entradas estan vacias para poder registrar usuarios
    public boolean textVacio(JTextField txtCodigo, JComboBox cbxProv, JComboBox cbxProd, JLabel lblMensaje) {
        try {
            boolean veri = txtCodigo.getText().trim().isEmpty() || cbxProv.getSelectedIndex() == 0 || cbxProd.getSelectedIndex() == 0;

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

    public boolean textVacio(JTextField txtCodigo, JComboBox cbxProv, JComboBox cbxProd, JLabel lblMensaje,
            JTextField txtPrecio, JTextField txtStock) {
        try {
            boolean veri = txtCodigo.getText().trim().isEmpty() || cbxProv.getSelectedIndex() == 0 || cbxProd.getSelectedIndex() == 0;

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

    public boolean verificar(KeyEvent evt, JTextField txt, JLabel lbl) {
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
    public void mostrarTablaIntermedia(JTable tbl) {
        modelo = sTraeProdcuto.mostrarTablaIntermedia();
        tbl.setModel(modelo);
        ocultarFila(tbl);
    }

    //Metodo para bsucar en la tabla de los usuarios
    public void buscarTablaIntermedia(JTable tbl, JTextField txt) {
        if (txt.getText().trim().isEmpty()) {
            mostrarTablaIntermedia(tbl);
        } else {
            modelo = sTraeProdcuto.buscarTablaIntermedia(txt.getText());
            tbl.setModel(modelo);
            ocultarFila(tbl);
        }
    }

    //Metodo para agregar usuarios
    public void agregar(JTextField txtCodigo, JComboBox cbx, JComboBox cbx2, RSDateChooser dt) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mComboProvee = (M_ComboProveedor) cbx.getSelectedItem();
        mComboProducto = (M_ComboProducto) cbx2.getSelectedItem();
        date = dt.getDatoFecha();
        d = date.getTime();
        sqlFecha = new java.sql.Date(d);

        mTraeProducto.setCodigo(txtCodigo.getText());
        mTraeProducto.setIdProveedor(mComboProvee.getId());
        mTraeProducto.setIdProducto(mComboProducto.getId());
        mTraeProducto.setFecha(sqlFecha.toString());

        if (sTraeProdcuto.agregarTraePro(mTraeProducto)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Exitoso".toUpperCase());
            limpiarCajas(txtCodigo, cbx, cbx2);
            mostrarTablaIntermedia(V_PanelTraeProducto.tblTrae);
            dConfirmar.setVisible(true);
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(txtCodigo, cbx, cbx2);
            dConfirmar.setVisible(true);
        }
    }

    public void agregar(JTextField txtCodigo, JComboBox cbx, JComboBox cbx2, JTextField txtPrecio, JTextField txtStock) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mComboProvee = (M_ComboProveedor) cbx.getSelectedItem();
        mComboProducto = (M_ComboProducto) cbx2.getSelectedItem();
        /*date = dt.getDatoFecha();
        d = date.getTime();
        sqlFecha = new java.sql.Date(d);*/

        mTraeProducto.setCodigo(txtCodigo.getText());
        mTraeProducto.setIdProveedor(mComboProvee.getId());
        mTraeProducto.setIdProducto(mComboProducto.getId());
        mTraeProducto.setPrecio(Double.parseDouble(txtPrecio.getText().trim()));
        mTraeProducto.setStock(Integer.parseInt(txtStock.getText().trim()));

        if (sTraeProdcuto.agregarTraePro(mTraeProducto)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Exitoso".toUpperCase());
            limpiarCajas(txtCodigo, cbx, cbx2, txtPrecio, txtStock);
            mostrarTablaIntermedia(V_PanelIntermedia.tblTrae);
            dConfirmar.setVisible(true);
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(txtCodigo, cbx, cbx2);
            dConfirmar.setVisible(true);
        }
    }

    public boolean actualizar(JTextField txtCodigo, JComboBox cbx, JComboBox cbx2, RSDateChooser dt, int id) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mComboProvee = (M_ComboProveedor) cbx.getSelectedItem();
        mComboProducto = (M_ComboProducto) cbx.getSelectedItem();

        //date = dt.getDatoFecha();
        //d = date.getTime();
        //sqlFecha = new java.sql.Date(d);
        mTraeProducto.setCodigo(txtCodigo.getText());
        mTraeProducto.setIdProveedor(mComboProvee.getId());
        mTraeProducto.setIdProducto(mComboProducto.getId());
        mTraeProducto.setId(id);

        if (sTraeProdcuto.actualizarIntermedia(mTraeProducto)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Actualizado con exito".toUpperCase());
            limpiarCajas(txtCodigo, cbx, cbx2);
            mostrarTablaIntermedia(V_PanelIntermedia.tblTrae);
            dConfirmar.setVisible(true);
            return true;
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(txtCodigo, cbx, cbx2);
            dConfirmar.setVisible(true);
            return false;
        }
    }

    public boolean actualizar(JTextField txtCodigo, JComboBox cbx, JComboBox cbx2, int id, JTextField txtPrecio, JTextField txtStock) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mComboProvee = (M_ComboProveedor) cbx.getSelectedItem();
        mComboProducto = (M_ComboProducto) cbx2.getSelectedItem();

        mTraeProducto.setCodigo(txtCodigo.getText());
        mTraeProducto.setIdProveedor(mComboProvee.getId());
        mTraeProducto.setIdProducto(mComboProducto.getId());
        mTraeProducto.setPrecio(Double.parseDouble(txtPrecio.getText().trim()));
        try {
            mTraeProducto.setStock(Integer.parseInt(txtStock.getText().trim()));
            mTraeProducto.setId(id);

            if (sTraeProdcuto.actualizarIntermedia(mTraeProducto)) {
                rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
                D_Confirmar.lblMensaje.setText("Registro Actualizado con exito".toUpperCase());
                limpiarCajas(txtCodigo, cbx, cbx2, txtPrecio, txtStock);
                mostrarTablaIntermedia(V_PanelIntermedia.tblTrae);
                dConfirmar.setVisible(true);
                return true;
            } else {
                rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
                D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
                limpiarCajas(txtCodigo, cbx, cbx2, txtPrecio, txtStock);
                dConfirmar.setVisible(true);
                return false;
            }
        } catch (NumberFormatException e) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Solo debes ingresar números enteros en el stock".toUpperCase());
            limpiarCajas(txtCodigo, cbx, cbx2, txtPrecio, txtStock);
            dConfirmar.setVisible(true);
            return false;
        }

    }

    public boolean eliminar(int id) {
        dConfirmar = new D_Confirmar(new JFrame(), true);

        if (sTraeProdcuto.eliminarIntermedia(id)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Se elimino el registro".toUpperCase());
            mostrarTablaIntermedia(V_PanelIntermedia.tblTrae);
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
    public void pasarIntermedia(JTable tbl) {

        fila = tbl.getSelectedRow();

        V_PanelIntermedia.id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        V_PanelIntermedia.txtCodigo.setText(tbl.getValueAt(fila, 1).toString());
        // Pasamos el roll que tiene al combo
        x = tbl.getValueAt(tbl.getSelectedRow(), 2).toString();
        forParaRecorrerElCombo(V_PanelIntermedia.cbxProveedor, x);

        // Pasamos el roll que tiene al combo
        y = tbl.getValueAt(tbl.getSelectedRow(), 3).toString();
        forParaRecorrerElComboDos(V_PanelIntermedia.cbxProducto, y);

        //date = formatoFecha.parse(tbl.getValueAt(fila, 4).toString());
        //V_PanelTraeProducto.dtFecha.setDatoFecha(date);
        V_PanelIntermedia.txtPrecio.setText(tbl.getValueAt(fila, 4).toString());
        V_PanelIntermedia.txtStock.setText(tbl.getValueAt(fila, 5).toString());

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

    public void forParaRecorrerElComboDos(JComboBox cbx, String xd) {
        for (int i = 0; i < cbx.getItemCount(); i++) {
            v2.add(cbx.getItemAt(i));
        }
        for (int i = 0; i < cbx.getItemCount(); i++) {
            g = v2.get(i).toString();
            if (xd.equalsIgnoreCase(g)) {
                cbx.setSelectedIndex(i);
            }
        }
    }

    //Metodo para ocultar una fila de una tabla
    private void ocultarFila(JTable tbl) {
        tbl.getColumnModel().getColumn(0).setMaxWidth(0);
        tbl.getColumnModel().getColumn(0).setMinWidth(0);
        tbl.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    public void limpiarCajas(JTextField txt, JComboBox cbx1, JComboBox cbx2) {
        txt.setText(null);
        mostrarProveedor(cbx1);
        mostrarProducto(cbx2);
    }

    public void limpiarCajas(JTextField txt, JComboBox cbx1, JComboBox cbx2, JTextField txtPrecio, JTextField txtStock) {
        txt.setText(null);
        cbx1.removeAllItems();
        cbx2.removeAllItems();
        mostrarProveedor(cbx1);
        mostrarProducto(cbx2);
        txtPrecio.setText(null);
        txtStock.setText(null);
    }
}
