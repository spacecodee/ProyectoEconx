package Controlador.Productos;

import Controlador.TraeProducto.C_TraeProducto;
import Dialogos.D_Confirmar;
import Modelo.CategoriaProducto.M_ComboCategoriaP;
import Modelo.Producto.M_Producto;
import Recursos.R_AgregarImagenes;
import Recursos.R_PlaceHolder;
import Recursos.R_Texto;
import Recursos.R_VerificacionesDeEntradaTexto;
import SQL.Producto.S_Producto;
import Vista.Producto.D_EliminarProducto;
import Vista.Producto.V_AgregarProducto;
import Vista.Producto.V_EditarProd;
import Vista.Producto.V_PanelProductos;
import Vista.TraeProducto.V_PanelIntermedia;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class C_Producto {

    //Objetos
    C_TraeProducto cTraePro = new C_TraeProducto();
    R_AgregarImagenes rAgregarImg = new R_AgregarImagenes();
    R_VerificacionesDeEntradaTexto rVerificarionesText = new R_VerificacionesDeEntradaTexto();
    R_Texto rText = new R_Texto();
    S_Producto sProducto = new S_Producto();
    M_Producto mProducto = new M_Producto();
    M_ComboCategoriaP cComboCategoriaP;
    Vector v = new Vector();

    //Variables de objetos
    DefaultTableModel modelo;
    R_PlaceHolder rTextFantasma;
    D_Confirmar dConfirmar;
    V_AgregarProducto vAgregarProducto;
    V_EditarProd vEditarProd;
    DefaultComboBoxModel modeloCombo;
    D_EliminarProducto dEliminarP;

    //
    int fila;
    String x, g;

    //Abrir dialogo de agregar
    public void dialogoAgregarProducto() {
        vAgregarProducto = new V_AgregarProducto(new JFrame(), true);
        vAgregarProducto.setVisible(true);
    }

    public void dialogoEliminarProducto(int id, JTable tbl, String msg) {
        dEliminarP = new D_EliminarProducto(new JFrame(), true);
        fila = tbl.getSelectedRow();
        id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        dEliminarP.id = id;
        D_EliminarProducto.lblMsg.setText(msg.toUpperCase());
        dEliminarP.setVisible(true);
    }

    //Metodo para cargar los roles de los usuarios en un combobox
    public void mostrarUsuarios(JComboBox cbx) {
        //cbx.addItem("Selecciona".toUpperCase());
        modeloCombo = new DefaultComboBoxModel(sProducto.MostrarCategoriaPro());
        cbx.setModel(modeloCombo);
        cComboCategoriaP = (M_ComboCategoriaP) cbx.getSelectedItem();
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
        rAgregarImg.agregarImagen("/Img/Producto/Cancelar.png", btnCancelar);
        rAgregarImg.pasarMauseBoton("/Img/Producto/CancelarP.png", btnCancelar);

        rAgregarImg.agregarImagen("/Img/Producto/Guardar.png", btnGuardar);
        rAgregarImg.pasarMauseBoton("/Img/Producto/GuardarP.png", btnGuardar);
    }

    //Metodo para agregar usuarios
    public void agregar(JTextField txtCodigo, JTextField txtNombre, JTextField txtPrecio, JTextField txtStock, JComboBox cbx) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        cComboCategoriaP = (M_ComboCategoriaP) cbx.getSelectedItem();

        mProducto.setCodigo(txtCodigo.getText());
        mProducto.setNombre(txtNombre.getText());
        mProducto.setPrecio(Double.parseDouble(txtPrecio.getText()));
        mProducto.setStock(Integer.parseInt(txtStock.getText()));
        mProducto.setCategoria(cComboCategoriaP.getId());

        if (sProducto.agregarProductos(mProducto)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Exitoso".toUpperCase());
            limpiarCajas(txtCodigo, txtNombre, txtPrecio, txtStock, cbx);
            mostrarTablaProductos(V_PanelProductos.tblProductos);
            cTraePro.mostrarProducto(V_PanelIntermedia.cbxProducto);
            dConfirmar.setVisible(true);
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(txtCodigo, txtNombre, txtPrecio, txtStock, cbx);
            dConfirmar.setVisible(true);
        }
    }

    public boolean actualizar(int id, JTextField txtCodigo, JTextField txtNombre, JTextField txtPrecio,
            JTextField txtStock, JComboBox cbx) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        cComboCategoriaP = (M_ComboCategoriaP) cbx.getSelectedItem();

        mProducto.setCodigo(txtCodigo.getText());
        mProducto.setNombre(txtNombre.getText());
        mProducto.setPrecio(Double.parseDouble(txtPrecio.getText()));
        mProducto.setStock(Integer.parseInt(txtStock.getText()));
        mProducto.setCategoria(cComboCategoriaP.getId());
        mProducto.setId(id);

        if (sProducto.actualizarProducto(mProducto)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Actualizado con exito".toUpperCase());
            limpiarCajas(txtCodigo, txtNombre, txtPrecio, txtStock, cbx);
            mostrarTablaProductos(V_PanelProductos.tblProductos);
            cTraePro.mostrarProducto(V_PanelIntermedia.cbxProducto);
            dConfirmar.setVisible(true);
            return true;
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(txtCodigo, txtNombre, txtPrecio, txtStock, cbx);
            dConfirmar.setVisible(true);
            return false;
        }
    }

    public void pasarUsuario(JTable tbl) {
        vEditarProd = new V_EditarProd(new JFrame(), true);

        fila = tbl.getSelectedRow();

        vEditarProd.id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        V_EditarProd.txtCodigo.setText(tbl.getValueAt(fila, 1).toString());
        V_EditarProd.txtNom.setText(tbl.getValueAt(fila, 2).toString());
        V_EditarProd.txtPrecio.setText(tbl.getValueAt(fila, 3).toString());
        V_EditarProd.txtStock.setText(tbl.getValueAt(fila, 4).toString());

        // Pasamos el roll que tiene al combo
        x = tbl.getValueAt(tbl.getSelectedRow(), 5).toString();
        forParaRecorrerElCombo(V_EditarProd.cbxCategoria, x);
        vEditarProd.setVisible(true);
    }

    public boolean eliminar(int id) {
        dConfirmar = new D_Confirmar(new JFrame(), true);

        if (sProducto.eliminarProducto(id)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Se elimino el registro".toUpperCase());
            mostrarTablaProductos(V_PanelProductos.tblProductos);
            dConfirmar.setVisible(true);
            return true;
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            dConfirmar.setVisible(true);
            return false;
        }
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

    //Metodos para poner texto fantasma
    public void fantasmaText(JTextField txt, String smj) {
        rTextFantasma = new R_PlaceHolder(smj.toUpperCase(), txt);
        txt.grabFocus();
    }

    public void fantasmaText(JTextField txtCodigo, JTextField txtNombre, JTextField txtPrecio, JTextField txtStock) {
        rTextFantasma = new R_PlaceHolder("Código".toUpperCase(), txtCodigo);
        rTextFantasma = new R_PlaceHolder("Nombre".toUpperCase(), txtNombre);
        rTextFantasma = new R_PlaceHolder("Precio".toUpperCase(), txtPrecio);
        rTextFantasma = new R_PlaceHolder("Stock".toUpperCase(), txtStock);
        txtCodigo.grabFocus();
    }

    //Metodo para cargar la tabla de los usuarios
    public void mostrarTablaProductos(JTable tbl) {
        modelo = sProducto.mostrarTablaProductos();
        tbl.setModel(modelo);
        ocultarFila(tbl);
    }

    //Metodo para bsucar en la tabla de los usuarios
    public void buscarTablaProductos(JTable tbl, JTextField txt) {
        if (txt.getText().trim().isEmpty()) {
            mostrarTablaProductos(tbl);
        } else {
            modelo = sProducto.buscarProductos(txt.getText());
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

    //Metodo para verificar si las entradas estan vacias para poder registrar usuarios
    public boolean textVacio(JTextField txtCodigo, JTextField txtNombre, JTextField txtPrecio,
            JTextField txtStock, JLabel lblMensaje) {
        try {
            boolean veri = txtCodigo.getText().trim().isEmpty() || txtNombre.getText().trim().isEmpty()
                    || txtPrecio.getText().trim().isEmpty() || txtStock.getText().trim().isEmpty();

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

    private void ocultarFila(JTable tbl) {
        tbl.getColumnModel().getColumn(0).setMaxWidth(0);
        tbl.getColumnModel().getColumn(0).setMinWidth(0);
        tbl.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    private void limpiarCajas(JTextField txtCodigo, JTextField txtNombre, JTextField txtPrecio,
            JTextField txtStock, JComboBox cbxC) {
        txtCodigo.setText(null);
        txtNombre.setText(null);
        txtPrecio.setText(null);
        txtStock.setText(null);
        cbxC.setSelectedIndex(0);
    }
}
