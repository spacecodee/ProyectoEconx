package Vista.Proveedor;

import Controlador.Menu.C_Menu;
import Controlador.Proveedores.C_Proveedor;
import Controlador.TraeProducto.C_TraeProducto;
import Vista.Menu.V_PanelMenu;
import Vista.TraeProducto.V_PanelIntermedia;
import Vista.TraeProducto.V_PanelTraeProducto;
import javax.swing.UIManager;
import rojeru_san.complementos.RSMoveWindow;

public class V_EditarProveedor extends javax.swing.JDialog {

    C_Proveedor cProveedor = new C_Proveedor();
    C_TraeProducto cTraeProducto = new C_TraeProducto();
    C_Menu cMenu = new C_Menu();
    public int id;

    public V_EditarProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ini();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtDNI = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 246, 250), 4, true));
        pnlContenedor.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 520));
        jPanel1.setLayout(null);

        txtDNI.setBackground(new java.awt.Color(255, 255, 255));
        txtDNI.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(73, 131, 254));
        txtDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDNI.setBorder(null);
        txtDNI.setCaretColor(new java.awt.Color(73, 131, 254));
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDNIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });
        jPanel1.add(txtDNI);
        txtDNI.setBounds(140, 110, 370, 50);

        jSeparator1.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator1.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(140, 160, 370, 10);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/ID.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 110, 50, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Usuario.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 200, 50, 50);

        jSeparator3.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator3.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(140, 250, 370, 10);

        txtNom.setBackground(new java.awt.Color(255, 255, 255));
        txtNom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNom.setForeground(new java.awt.Color(73, 131, 254));
        txtNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNom.setBorder(null);
        txtNom.setCaretColor(new java.awt.Color(73, 131, 254));
        jPanel1.add(txtNom);
        txtNom.setBounds(140, 200, 370, 50);

        txtApe.setBackground(new java.awt.Color(255, 255, 255));
        txtApe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtApe.setForeground(new java.awt.Color(73, 131, 254));
        txtApe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApe.setBorder(null);
        txtApe.setCaretColor(new java.awt.Color(73, 131, 254));
        jPanel1.add(txtApe);
        txtApe.setBounds(640, 200, 370, 50);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Usuario.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(570, 200, 50, 50);

        jSeparator4.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator4.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(640, 250, 370, 10);

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(73, 131, 254));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setBorder(null);
        txtTelefono.setCaretColor(new java.awt.Color(73, 131, 254));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono);
        txtTelefono.setBounds(140, 310, 370, 50);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Telefono.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 310, 50, 50);

        jSeparator5.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator5.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(140, 360, 370, 10);

        jSeparator8.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator8.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(640, 360, 370, 10);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Roll.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(570, 310, 50, 50);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        jPanel1.add(lblMensaje);
        lblMensaje.setBounds(80, 440, 930, 50);

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(73, 131, 254));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(73, 131, 254));
        jPanel1.add(txtCorreo);
        txtCorreo.setBounds(640, 310, 370, 50);

        pnlContenedor.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(245, 246, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(1100, 80));
        jPanel3.setLayout(null);

        btnSave.setBackground(new java.awt.Color(253, 253, 254));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Guardar.png"))); // NOI18N
        btnSave.setBorder(null);
        btnSave.setBorderPainted(false);
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setFocusPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave);
        btnSave.setBounds(930, 20, 150, 40);

        btnCancel.setBackground(new java.awt.Color(253, 253, 254));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Cancelar.png"))); // NOI18N
        btnCancel.setBorder(null);
        btnCancel.setBorderPainted(false);
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setFocusPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancel);
        btnCancel.setBounds(770, 20, 150, 40);

        pnlContenedor.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(pnlContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (evt.getSource() == btnSave) {
            if (!cProveedor.textVacio(txtDNI, txtNom, txtApe, txtCorreo, txtTelefono, lblMensaje)) {
                if (!cProveedor.correo(txtCorreo, lblMensaje)) {
                    if (cProveedor.actualizar(txtDNI, txtNom, txtApe, txtCorreo, txtTelefono, id)) {
                        V_PanelMenu.lblProveedores.setText(String.valueOf(cMenu.totaProveedores()));
                        cTraeProducto.mostrarProveedor(V_PanelIntermedia.cbxProveedor);
                        this.dispose();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        if (evt.getSource() == txtDNI) {
            cProveedor.verif(evt, txtDNI, lblMensaje);
        }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (evt.getSource() == txtTelefono) {
            cProveedor.verifTelefono(evt, txtTelefono, lblMensaje);
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyReleased

    }//GEN-LAST:event_txtDNIKeyReleased

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_EditarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_EditarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_EditarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_EditarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                V_EditarProveedor dialog = new V_EditarProveedor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel pnlContenedor;
    public static javax.swing.JTextField txtApe;
    public static javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtDNI;
    public static javax.swing.JTextField txtNom;
    public static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        setLocationRelativeTo(null);
        new RSMoveWindow().setMoveWindow(this);
        cProveedor.agregarImg(btnCancel, btnSave);
        cProveedor.fantasmaText(txtDNI, txtNom, txtApe, txtCorreo, txtTelefono);
        lblMensaje.setText(null);
    }
}
