package Controlador.CategoriaProductos;

import Dialogos.D_Confirmar;
import Modelo.CategoriaProducto.M_CategoriaProducto;
import Recursos.R_AgregarImagenes;
import Recursos.R_PlaceHolder;
import Recursos.R_Texto;
import Recursos.R_VerificacionesDeEntradaTexto;
import SQL.CategoriaProducto.S_CategoriaProducto;
import Vista.CategoriaProducto.D_EliminarCategoria;
import Vista.CategoriaProducto.V_PanelCategoriaProducto;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class C_CategoriaProducto {

    //Objetos
    R_AgregarImagenes rAgregarImg = new R_AgregarImagenes();
    R_VerificacionesDeEntradaTexto rVerificarionesText = new R_VerificacionesDeEntradaTexto();
    R_Texto rText = new R_Texto();
    M_CategoriaProducto mCategoriaProducto = new M_CategoriaProducto();
    S_CategoriaProducto sCategoriaProducto = new S_CategoriaProducto();

    //Variables de objetos
    R_PlaceHolder rTextFantasma;
    DefaultTableModel modelo;
    D_Confirmar dConfirmar;
    V_PanelCategoriaProducto vPanelCateProd;
    D_EliminarCategoria dEliminarCategoria;

    int fila;

    public void dialogoEliminarRoll(int id, JTable tbl, String msg) {
        dEliminarCategoria = new D_EliminarCategoria(new JFrame(), true);
        fila = tbl.getSelectedRow();
        id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        dEliminarCategoria.id = id;
        D_EliminarCategoria.lblMsg.setText(msg.toUpperCase());
        dEliminarCategoria.setVisible(true);
    }

    public void agregarImg(JButton btnEliminar, JButton btnGuardar) {
        rAgregarImg.agregarImagen("/Img/CategoriaProducto/Eliminar.png", btnEliminar);
        rAgregarImg.pasarMauseBoton("/Img/CategoriaProducto/EliminarP.png", btnEliminar);

        rAgregarImg.agregarImagen("/Img/CategoriaProducto/Guardar.png", btnGuardar);
        rAgregarImg.pasarMauseBoton("/Img/CategoriaProducto/GuardarP.png", btnGuardar);
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
    public void agregar(JTextField txtCodigo, JTextField txtCategoria) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mCategoriaProducto.setCodigo(txtCodigo.getText());
        mCategoriaProducto.setNombre(txtCategoria.getText());

        if (sCategoriaProducto.agregarCategoria(mCategoriaProducto)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Exitoso".toUpperCase());
            limpiarCajas(txtCodigo, txtCategoria);
            mostrarTablaCategoria(V_PanelCategoriaProducto.tblCategoria);
            dConfirmar.setVisible(true);
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(txtCodigo, txtCategoria);
            dConfirmar.setVisible(true);
        }
    }

    //Metodo para actualziar usuarios
    public boolean actualizar(JTextField txtCodigo, JTextField txtCategoria, int id) {

        dConfirmar = new D_Confirmar(new JFrame(), true);

        mCategoriaProducto.setCodigo(txtCodigo.getText());
        mCategoriaProducto.setNombre(txtCategoria.getText());
        mCategoriaProducto.setId(id);

        if (sCategoriaProducto.actualizarCategoria(mCategoriaProducto)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Registro Actualizado con exito".toUpperCase());
            limpiarCajas(txtCodigo, txtCategoria);
            mostrarTablaCategoria(V_PanelCategoriaProducto.tblCategoria);
            dConfirmar.setVisible(true);
            return true;
        } else {
            rAgregarImg.agregarImagen("/Img/Dialogos/Error.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Al parecer ocurrio un error".toUpperCase());
            limpiarCajas(txtCodigo, txtCategoria);
            dConfirmar.setVisible(true);
            return false;
        }
    }

    public boolean eliminar(int id) {
        dConfirmar = new D_Confirmar(new JFrame(), true);

        if (sCategoriaProducto.eliminarCategoria(id)) {
            rAgregarImg.agregarImagen("/Img/Dialogos/Hecho.png", D_Confirmar.lblImg);
            D_Confirmar.lblMensaje.setText("Se elimino el registro".toUpperCase());
            mostrarTablaCategoria(V_PanelCategoriaProducto.tblCategoria);
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

        V_PanelCategoriaProducto.id = Integer.parseInt(tbl.getValueAt(fila, 0).toString());
        V_PanelCategoriaProducto.txtID.setText(tbl.getValueAt(fila, 1).toString());
        V_PanelCategoriaProducto.txtCategoria.setText(tbl.getValueAt(fila, 2).toString());
    }

    public void mostrarTablaCategoria(JTable tbl) {
        modelo = sCategoriaProducto.mostrarTablaCategoria();
        tbl.setModel(modelo);
        ocultarFila(tbl);
    }
    
    public void buscarTablaRoles(JTable tbl, JTextField txt) {
        if (txt.getText().trim().isEmpty()) {
            mostrarTablaCategoria(tbl);
        } else {
            modelo = sCategoriaProducto.buscarTablaCategoria(txt.getText());
            tbl.setModel(modelo);
            ocultarFila(tbl);
        }
    }

    private void ocultarFila(JTable tbl) {
        tbl.getColumnModel().getColumn(0).setMaxWidth(0);
        tbl.getColumnModel().getColumn(0).setMinWidth(0);
        tbl.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    public void limpiarCajas(JTextField txtID, JTextField txtCategoria) {
        txtID.setText(null);
        txtCategoria.setText(null);
    }

}
