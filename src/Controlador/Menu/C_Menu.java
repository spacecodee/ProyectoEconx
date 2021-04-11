package Controlador.Menu;

import Dialogos.D_CerrarSesion;
import Modelo.Usuario.M_UsuarioLogin;
import Recursos.R_AgregarImagenes;
import SQL.Menu.S_Menu;
import Vista.Boleta.V_PanelBoleta;
import Vista.Boleta.V_PanelBoletaNueva;
import Vista.CategoriaProducto.V_PanelCategoriaProducto;
import Vista.Mas.V_Mas;
import Vista.Menu.V_Menu;
import Vista.Menu.V_PanelMenu;
import Vista.PerfilUsuario.V_Perfil;
import Vista.Producto.V_PanelProductos;
import Vista.Proveedor.V_PanelProveedor;
import Vista.TipoUsuario.V_PanelTipoUsuario;
import Vista.TraeProducto.V_PanelIntermedia;
import Vista.TraeProducto.V_PanelTraeProducto;
import Vista.Usuario.V_PanelUsuario;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class C_Menu {

    //Objetos
    R_AgregarImagenes rAgregarImg = new R_AgregarImagenes();
    S_Menu sMenu = new S_Menu();

    //Variables
    V_Menu vMenu;
    V_Mas vMas;
    V_Perfil vPerfil;
    D_CerrarSesion dCerrarSesion;

    public void mas() {
        vMas = new V_Mas(new JFrame(), true);
        vMas.setVisible(true);
    }

    public void perfil(M_UsuarioLogin mUsuarioLogin) {
        vPerfil = new V_Perfil(new JFrame(), true, mUsuarioLogin);
        vPerfil.setVisible(true);
    }

    //Metodo para agregar imagenes a los botones
    public void agregarImg(JButton btnUsuarios, JButton roll, JButton btnProductos,
            JButton btnCategorias, JButton btnProveedores, JButton btnCerrarSesion,
            JButton btnMenu, JButton btnProductoProve, JButton btnBoletas,
            JButton btnInfo, JButton btnCon) {
        rAgregarImg.agregarImagen("/Img/Menu/Usuarios.png", btnUsuarios);
        rAgregarImg.pasarMauseBoton("/Img/Menu/UsuariosP.png", btnUsuarios);

        rAgregarImg.agregarImagen("/Img/Menu/Roles.png", roll);
        rAgregarImg.pasarMauseBoton("/Img/Menu/RolesP.png", roll);

        rAgregarImg.agregarImagen("/Img/Menu/Productos.png", btnProductos);
        rAgregarImg.pasarMauseBoton("/Img/Menu/ProductosP.png", btnProductos);

        rAgregarImg.agregarImagen("/Img/Menu/Categorias.png", btnCategorias);
        rAgregarImg.pasarMauseBoton("/Img/Menu/CategoriasP.png", btnCategorias);

        rAgregarImg.agregarImagen("/Img/Menu/Proveedores.png", btnProveedores);
        rAgregarImg.pasarMauseBoton("/Img/Menu/ProveedoresP.png", btnProveedores);

        rAgregarImg.agregarImagen("/Img/Menu/CerrarSesion.png", btnCerrarSesion);
        rAgregarImg.pasarMauseBoton("/Img/Menu/CerrarSesionP.png", btnCerrarSesion);

        rAgregarImg.agregarImagen("/Img/Menu/Menu.png", btnMenu);
        rAgregarImg.pasarMauseBoton("/Img/Menu/MenuP.png", btnMenu);

        rAgregarImg.agregarImagen("/Img/Menu/ProducProveedor.png", btnProductoProve);
        rAgregarImg.pasarMauseBoton("/Img/Menu/ProducProveedorP.png", btnProductoProve);

        rAgregarImg.agregarImagen("/Img/Menu/Boletas.png", btnBoletas);
        rAgregarImg.pasarMauseBoton("/Img/Menu/BoletasP.png", btnBoletas);

        rAgregarImg.agregarImagen("/Img/Mas/info.png", btnInfo);
        rAgregarImg.pasarMauseBoton("/Img/Mas/infoP.png", btnInfo);

        rAgregarImg.agregarImagen("/Img/Mas/conf.png", btnCon);
        rAgregarImg.pasarMauseBoton("/Img/Mas/confP.png", btnCon);
    }

    public void imgMenu(JButton btnCal, JButton btnGoogle, JButton btnExcel) {
        rAgregarImg.agregarImagen("/img/Menu/calculadora.png", btnCal);
        rAgregarImg.agregarImagen("/img/Menu/google.png", btnGoogle);
        rAgregarImg.agregarImagen("/img/Menu/excel.png", btnExcel);

        rAgregarImg.pasarMauseBoton("/img/Menu/calculadoraP.png", btnCal);
        rAgregarImg.pasarMauseBoton("/img/Menu/googleP.png", btnGoogle);
        rAgregarImg.pasarMauseBoton("/img/Menu/excelP.png", btnExcel);
    }

    public void btnCSesion(V_Menu vMen, JButton btnCSesion) {
        dCerrarSesion = new D_CerrarSesion(vMen, true);
        dCerrarSesion.setVisible(true);
    }

    //Metodo para poder agregar paneles a otro panel desde otro form
    public void panelUsuario(java.awt.event.ActionEvent evt, V_PanelUsuario vPanelUsuario, JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vPanelUsuario.setVisible(true);
        pnlEntorno.add(vPanelUsuario);
        pnlEntorno.validate();
    }

    public void panelRoles(java.awt.event.ActionEvent evt, V_PanelTipoUsuario vTipoUsuario, JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vTipoUsuario.setVisible(true);
        pnlEntorno.add(vTipoUsuario);
        pnlEntorno.validate();
    }

    public void panelProductos(java.awt.event.ActionEvent evt, V_PanelProductos vPanelProducto, JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vPanelProducto.setVisible(true);
        pnlEntorno.add(vPanelProducto);
        pnlEntorno.validate();
    }

    public void panelCategoriaProductos(java.awt.event.ActionEvent evt, V_PanelCategoriaProducto vPanelCategoriaProducto,
            JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vPanelCategoriaProducto.setVisible(true);
        pnlEntorno.add(vPanelCategoriaProducto);
        pnlEntorno.validate();
    }

    public void panelProveedor(java.awt.event.ActionEvent evt, V_PanelProveedor vPanelProveedor,
            JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vPanelProveedor.setVisible(true);
        pnlEntorno.add(vPanelProveedor);
        pnlEntorno.validate();
    }

    public void panelTraeP(java.awt.event.ActionEvent evt, V_PanelTraeProducto vPanelTrae,
            JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vPanelTrae.setVisible(true);
        pnlEntorno.add(vPanelTrae);
        pnlEntorno.validate();
    }
    
    public void panelTraeP(java.awt.event.ActionEvent evt, V_PanelIntermedia vPanelTrae,
            JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vPanelTrae.setVisible(true);
        pnlEntorno.add(vPanelTrae);
        pnlEntorno.validate();
    }

    public void panelBoleta(java.awt.event.ActionEvent evt, V_PanelBoleta vPanelBoleta,
            JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vPanelBoleta.setVisible(true);
        pnlEntorno.add(vPanelBoleta);
        pnlEntorno.validate();
    }
    
    public void panelBoleta(java.awt.event.ActionEvent evt, V_PanelBoletaNueva vPanelBoleta,
            JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vPanelBoleta.setVisible(true);
        pnlEntorno.add(vPanelBoleta);
        pnlEntorno.validate();
    }

    public void panelMenu(java.awt.event.ActionEvent evt, V_PanelMenu vPanelMenu,
            JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vPanelMenu.setVisible(true);
        pnlEntorno.add(vPanelMenu);
        pnlEntorno.validate();
    }

    public void panelMenu(V_PanelMenu vPanelMenu, JPanel pnlEntorno) {
        pnl(pnlEntorno);
        vPanelMenu.setVisible(true);
        pnlEntorno.add(vPanelMenu);
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

    public int totalEmpleados() {
        return sMenu.totalEmpleados();
    }

    public int totaProveedores() {
        return sMenu.totalProveedores();
    }

    public int totaProductos() {
        return sMenu.totalProductos();
    }
    //Aquí terminan
}
