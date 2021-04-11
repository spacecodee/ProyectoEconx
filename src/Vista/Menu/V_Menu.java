package Vista.Menu;

import Controlador.C_Total;
import Controlador.Menu.C_Menu;
import Modelo.Usuario.M_UsuarioLogin;
import Vista.Boleta.V_PanelBoleta;
import Vista.Boleta.V_PanelBoletaNueva;
import Vista.CategoriaProducto.V_PanelCategoriaProducto;
import Vista.Producto.V_PanelProductos;
import Vista.Proveedor.V_PanelProveedor;
import Vista.TipoUsuario.V_PanelTipoUsuario;
import Vista.TraeProducto.V_PanelIntermedia;
import Vista.TraeProducto.V_PanelTraeProducto;
import Vista.Usuario.V_PanelUsuario;
import javax.swing.UIManager;

public class V_Menu extends javax.swing.JFrame {

    // Objetos
    C_Total cTotal = new C_Total();
    C_Menu cMenu = new C_Menu();
    V_PanelUsuario vPanelUsuario = new V_PanelUsuario();
    V_PanelTipoUsuario vPanelTipoUsuario = new V_PanelTipoUsuario();
    V_PanelProductos vPanelProductos = new V_PanelProductos();
    V_PanelCategoriaProducto vPanelCategoriaProducto = new V_PanelCategoriaProducto();
    V_PanelProveedor vPanelProvee = new V_PanelProveedor();
    V_PanelMenu vPanelMenu = new V_PanelMenu();
    V_PanelTraeProducto vPanelTraeProducto = new V_PanelTraeProducto();
    V_PanelIntermedia vIntermedia = new V_PanelIntermedia();
    V_PanelBoleta vPanelBoleta = new V_PanelBoleta();
    V_PanelBoletaNueva vPBoletaNueva = new V_PanelBoletaNueva();

    // Varible para obtener argumentos
    M_UsuarioLogin mUsuLogin;
    String msg;

    public V_Menu() {
        ini();
    }

    public V_Menu(M_UsuarioLogin mUsuLogin) {
        ini();
        this.mUsuLogin = mUsuLogin;
        msg = "Hola " + mUsuLogin.getNombre() + " " + mUsuLogin.getApellidos() + " ¿Que quieres hacer hoy?";
        vPanelMenu.lblBienvenida.setText(msg.toUpperCase());
        if (!mUsuLogin.getRoll().equals("Administrador")) {
            btnUsuario.setEnabled(false);
            btnRoles.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        pnlArriba = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        pnlCentrar = new javax.swing.JPanel();
        pnlBarra = new javax.swing.JPanel();
        pnlA = new javax.swing.JPanel();
        btnUsuario = new javax.swing.JButton();
        btnRoles = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        pnlC = new javax.swing.JPanel();
        btnProductos = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        pnlLas = new javax.swing.JPanel();
        btnProductoProvee = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnBoletas = new javax.swing.JButton();
        pnlMen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1500, 900));
        setMinimumSize(new java.awt.Dimension(1500, 900));
        setUndecorated(true);
        setResizable(false);

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setLayout(new java.awt.BorderLayout());

        pnlArriba.setBackground(new java.awt.Color(255, 255, 255));
        pnlArriba.setMaximumSize(new java.awt.Dimension(1500, 50));
        pnlArriba.setMinimumSize(new java.awt.Dimension(1500, 50));
        pnlArriba.setPreferredSize(new java.awt.Dimension(1500, 50));
        pnlArriba.setLayout(null);

        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mini.png"))); // NOI18N
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setMaximumSize(new java.awt.Dimension(50, 50));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        pnlArriba.add(lblMinimizar);
        lblMinimizar.setBounds(20, 10, 30, 30);

        btnMenu.setBackground(new java.awt.Color(73, 131, 254));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/Menu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setFocusPainted(false);
        btnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlArriba.add(btnMenu);
        btnMenu.setBounds(100, 0, 160, 50);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/user.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlArriba.add(jLabel1);
        jLabel1.setBounds(1430, 0, 45, 45);

        btnInfo.setBackground(new java.awt.Color(73, 131, 254));
        btnInfo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Mas/info.png"))); // NOI18N
        btnInfo.setBorder(null);
        btnInfo.setBorderPainted(false);
        btnInfo.setContentAreaFilled(false);
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.setFocusPainted(false);
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        pnlArriba.add(btnInfo);
        btnInfo.setBounds(1340, 10, 30, 30);

        btnConfig.setBackground(new java.awt.Color(73, 131, 254));
        btnConfig.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnConfig.setForeground(new java.awt.Color(255, 255, 255));
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Mas/conf.png"))); // NOI18N
        btnConfig.setBorder(null);
        btnConfig.setBorderPainted(false);
        btnConfig.setContentAreaFilled(false);
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfig.setFocusPainted(false);
        btnConfig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });
        pnlArriba.add(btnConfig);
        btnConfig.setBounds(1390, 10, 30, 30);

        pnlMenu.add(pnlArriba, java.awt.BorderLayout.PAGE_START);

        pnlCentrar.setBackground(new java.awt.Color(253, 253, 254));
        pnlCentrar.setPreferredSize(new java.awt.Dimension(1500, 50));
        pnlCentrar.setLayout(new java.awt.BorderLayout());

        pnlBarra.setBackground(new java.awt.Color(253, 253, 254));
        pnlBarra.setMaximumSize(new java.awt.Dimension(300, 850));
        pnlBarra.setMinimumSize(new java.awt.Dimension(300, 850));
        pnlBarra.setPreferredSize(new java.awt.Dimension(300, 850));
        pnlBarra.setLayout(new java.awt.BorderLayout());

        pnlA.setBackground(new java.awt.Color(253, 253, 254));
        pnlA.setMaximumSize(new java.awt.Dimension(200, 250));
        pnlA.setMinimumSize(new java.awt.Dimension(200, 250));
        pnlA.setPreferredSize(new java.awt.Dimension(200, 250));
        pnlA.setLayout(null);

        btnUsuario.setBackground(new java.awt.Color(253, 253, 254));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/Usuarios.png"))); // NOI18N
        btnUsuario.setBorder(null);
        btnUsuario.setBorderPainted(false);
        btnUsuario.setContentAreaFilled(false);
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.setFocusPainted(false);
        btnUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        pnlA.add(btnUsuario);
        btnUsuario.setBounds(0, 50, 300, 60);

        btnRoles.setBackground(new java.awt.Color(253, 253, 254));
        btnRoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/Roles.png"))); // NOI18N
        btnRoles.setBorder(null);
        btnRoles.setBorderPainted(false);
        btnRoles.setContentAreaFilled(false);
        btnRoles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRoles.setFocusPainted(false);
        btnRoles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolesActionPerformed(evt);
            }
        });
        pnlA.add(btnRoles);
        btnRoles.setBounds(0, 110, 300, 60);

        jSeparator1.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator1.setForeground(new java.awt.Color(73, 131, 254));
        pnlA.add(jSeparator1);
        jSeparator1.setBounds(40, 240, 220, 10);

        jSeparator3.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator3.setForeground(new java.awt.Color(73, 131, 254));
        pnlA.add(jSeparator3);
        jSeparator3.setBounds(40, 10, 220, 10);

        pnlBarra.add(pnlA, java.awt.BorderLayout.PAGE_START);

        pnlC.setBackground(new java.awt.Color(253, 253, 254));
        pnlC.setMaximumSize(new java.awt.Dimension(300, 300));
        pnlC.setMinimumSize(new java.awt.Dimension(300, 300));
        pnlC.setPreferredSize(new java.awt.Dimension(300, 300));
        pnlC.setLayout(null);

        btnProductos.setBackground(new java.awt.Color(253, 253, 254));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/Productos.png"))); // NOI18N
        btnProductos.setBorder(null);
        btnProductos.setBorderPainted(false);
        btnProductos.setContentAreaFilled(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setFocusPainted(false);
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        pnlC.add(btnProductos);
        btnProductos.setBounds(0, 0, 300, 60);

        btnCategorias.setBackground(new java.awt.Color(253, 253, 254));
        btnCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/Categorias.png"))); // NOI18N
        btnCategorias.setBorder(null);
        btnCategorias.setBorderPainted(false);
        btnCategorias.setContentAreaFilled(false);
        btnCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategorias.setFocusPainted(false);
        btnCategorias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });
        pnlC.add(btnCategorias);
        btnCategorias.setBounds(0, 60, 300, 60);

        btnProveedores.setBackground(new java.awt.Color(253, 253, 254));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/Proveedores.png"))); // NOI18N
        btnProveedores.setBorder(null);
        btnProveedores.setBorderPainted(false);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.setFocusPainted(false);
        btnProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        pnlC.add(btnProveedores);
        btnProveedores.setBounds(0, 120, 300, 60);

        jSeparator2.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator2.setForeground(new java.awt.Color(73, 131, 254));
        pnlC.add(jSeparator2);
        jSeparator2.setBounds(40, 240, 220, 10);

        pnlBarra.add(pnlC, java.awt.BorderLayout.CENTER);

        pnlLas.setBackground(new java.awt.Color(253, 253, 254));
        pnlLas.setMaximumSize(new java.awt.Dimension(300, 300));
        pnlLas.setMinimumSize(new java.awt.Dimension(300, 300));
        pnlLas.setPreferredSize(new java.awt.Dimension(300, 300));
        pnlLas.setLayout(null);

        btnProductoProvee.setBackground(new java.awt.Color(253, 253, 254));
        btnProductoProvee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/ProducProveedor.png"))); // NOI18N
        btnProductoProvee.setBorder(null);
        btnProductoProvee.setBorderPainted(false);
        btnProductoProvee.setContentAreaFilled(false);
        btnProductoProvee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductoProvee.setFocusPainted(false);
        btnProductoProvee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductoProvee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoProveeActionPerformed(evt);
            }
        });
        pnlLas.add(btnProductoProvee);
        btnProductoProvee.setBounds(0, 0, 300, 60);

        btnCerrarSesion.setBackground(new java.awt.Color(253, 253, 254));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/CerrarSesion.png"))); // NOI18N
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        pnlLas.add(btnCerrarSesion);
        btnCerrarSesion.setBounds(0, 180, 300, 60);

        btnBoletas.setBackground(new java.awt.Color(253, 253, 254));
        btnBoletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/Boletas.png"))); // NOI18N
        btnBoletas.setBorder(null);
        btnBoletas.setBorderPainted(false);
        btnBoletas.setContentAreaFilled(false);
        btnBoletas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBoletas.setFocusPainted(false);
        btnBoletas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBoletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletasActionPerformed(evt);
            }
        });
        pnlLas.add(btnBoletas);
        btnBoletas.setBounds(0, 60, 300, 60);

        pnlBarra.add(pnlLas, java.awt.BorderLayout.PAGE_END);

        pnlCentrar.add(pnlBarra, java.awt.BorderLayout.WEST);

        pnlMen.setBackground(new java.awt.Color(253, 253, 254));
        pnlMen.setMaximumSize(new java.awt.Dimension(1200, 850));
        pnlMen.setMinimumSize(new java.awt.Dimension(1200, 850));
        pnlMen.setPreferredSize(new java.awt.Dimension(1200, 850));
        pnlMen.setLayout(new java.awt.BorderLayout());
        pnlCentrar.add(pnlMen, java.awt.BorderLayout.CENTER);

        pnlMenu.add(pnlCentrar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlMenu, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        if (evt.getSource() == lblMinimizar) {
            cTotal.minimizar(this);
        }
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        if (evt.getSource() == btnUsuario) {
            cMenu.panelUsuario(evt, vPanelUsuario, pnlMen);
        }
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        if (evt.getSource() == btnCerrarSesion) {
            cMenu.btnCSesion(this, btnCerrarSesion);
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolesActionPerformed
        if (evt.getSource() == btnRoles) {
            cMenu.panelRoles(evt, vPanelTipoUsuario, pnlMen);
        }
    }//GEN-LAST:event_btnRolesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        if (evt.getSource() == btnProductos) {
            cMenu.panelProductos(evt, vPanelProductos, pnlMen);
        }
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        if (evt.getSource() == btnCategorias) {
            cMenu.panelCategoriaProductos(evt, vPanelCategoriaProducto, pnlMen);
        }
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        if (evt.getSource() == btnProveedores) {
            cMenu.panelProveedor(evt, vPanelProvee, pnlMen);
        }
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if (evt.getSource() == btnMenu) {
            cMenu.panelMenu(evt, vPanelMenu, pnlMen);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnProductoProveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoProveeActionPerformed
        if (evt.getSource() == btnProductoProvee) {
            cMenu.panelTraeP(evt, vIntermedia, pnlMen);
        }
    }//GEN-LAST:event_btnProductoProveeActionPerformed

    private void btnBoletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletasActionPerformed
        if (evt.getSource() == btnBoletas) {
            cMenu.panelBoleta(evt, vPBoletaNueva, pnlMen);
        }
    }//GEN-LAST:event_btnBoletasActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        if (evt.getSource() == btnInfo) {
            cMenu.mas();
        }
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        if (evt.getSource() == btnConfig) {
            cMenu.perfil(mUsuLogin);
        }

    }//GEN-LAST:event_btnConfigActionPerformed
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoletas;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnProductoProvee;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRoles;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JPanel pnlA;
    private javax.swing.JPanel pnlArriba;
    private javax.swing.JPanel pnlBarra;
    private javax.swing.JPanel pnlC;
    private javax.swing.JPanel pnlCentrar;
    private javax.swing.JPanel pnlLas;
    private javax.swing.JPanel pnlMen;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
    private void ini() {
        initComponents();
        cTotal.ini(this);
        cMenu.panelMenu(vPanelMenu, pnlMen);
        cMenu.agregarImg(btnUsuario, btnRoles, btnProductos, btnCategorias, btnProveedores,
                btnCerrarSesion, btnMenu, btnProductoProvee, btnBoletas, btnInfo, btnConfig);
    }
}
