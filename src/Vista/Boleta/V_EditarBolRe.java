package Vista.Boleta;

import Controlador.Boleta.C_Boleta;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import rojeru_san.complementos.RSMoveWindow;

public class V_EditarBolRe extends javax.swing.JDialog {

    C_Boleta cBoleta = new C_Boleta();
    public int id;
    public static int idT;
    public String verificar;

    public V_EditarBolRe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ini();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtCodigo = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbxComprador = new rojerusan.RSComboBox();
        lblMensaje = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        btnInter = new javax.swing.JButton();
        txtProducto = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtProveedor = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        dtFecha = new rojeru_san.rsdate.RSDateChooser();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 580));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 580));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 580));

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 246, 250), 4, true));
        pnlContenedor.setMinimumSize(new java.awt.Dimension(1100, 580));
        pnlContenedor.setPreferredSize(new java.awt.Dimension(1100, 580));
        pnlContenedor.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 520));
        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TipoUsuario/Roll.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(570, 200, 50, 50);

        jSeparator2.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator2.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(630, 250, 370, 10);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Fecha.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(570, 290, 50, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Producto/IDProd.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 290, 50, 50);

        jSeparator3.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator3.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(130, 340, 370, 10);

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(73, 131, 254));
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setBorder(null);
        txtCodigo.setCaretColor(new java.awt.Color(73, 131, 254));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo);
        txtCodigo.setBounds(130, 290, 370, 50);

        txtEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtEmpresa.setForeground(new java.awt.Color(73, 131, 254));
        txtEmpresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmpresa.setBorder(null);
        txtEmpresa.setCaretColor(new java.awt.Color(73, 131, 254));
        txtEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmpresaKeyTyped(evt);
            }
        });
        jPanel1.add(txtEmpresa);
        txtEmpresa.setBounds(630, 200, 370, 50);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Usuario.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 110, 50, 50);

        cbxComprador.setBackground(new java.awt.Color(255, 255, 255));
        cbxComprador.setForeground(new java.awt.Color(73, 131, 254));
        cbxComprador.setColorArrow(new java.awt.Color(73, 131, 254));
        cbxComprador.setColorBorde(new java.awt.Color(255, 255, 255));
        cbxComprador.setColorBoton(new java.awt.Color(253, 253, 254));
        cbxComprador.setColorDisabledIndex(new java.awt.Color(73, 131, 254));
        cbxComprador.setColorDisabledIndexText(new java.awt.Color(253, 253, 254));
        cbxComprador.setColorFondo(new java.awt.Color(255, 255, 255));
        cbxComprador.setColorListaItems(new java.awt.Color(253, 253, 254));
        cbxComprador.setColorListaItemsTXT(new java.awt.Color(73, 131, 254));
        cbxComprador.setColorSeleccion(new java.awt.Color(36, 101, 239));
        cbxComprador.setColorSeleccionTXT(new java.awt.Color(253, 253, 254));
        cbxComprador.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbxComprador.setPreferredSize(new java.awt.Dimension(370, 50));
        jPanel1.add(cbxComprador);
        cbxComprador.setBounds(630, 110, 370, 50);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        jPanel1.add(lblMensaje);
        lblMensaje.setBounds(70, 400, 930, 50);

        jSeparator9.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator9.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(630, 160, 370, 10);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/ID.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(560, 110, 50, 50);

        btnInter.setBackground(new java.awt.Color(253, 253, 254));
        btnInter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Boleta/btnI.png"))); // NOI18N
        btnInter.setBorder(null);
        btnInter.setBorderPainted(false);
        btnInter.setContentAreaFilled(false);
        btnInter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInter.setFocusPainted(false);
        btnInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterActionPerformed(evt);
            }
        });
        jPanel1.add(btnInter);
        btnInter.setBounds(130, 40, 280, 50);

        txtProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtProducto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(73, 131, 254));
        txtProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProducto.setBorder(null);
        txtProducto.setCaretColor(new java.awt.Color(73, 131, 254));
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });
        jPanel1.add(txtProducto);
        txtProducto.setBounds(130, 200, 370, 50);

        jSeparator4.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator4.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(130, 250, 370, 10);

        txtProveedor.setBackground(new java.awt.Color(255, 255, 255));
        txtProveedor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtProveedor.setForeground(new java.awt.Color(73, 131, 254));
        txtProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProveedor.setBorder(null);
        txtProveedor.setCaretColor(new java.awt.Color(73, 131, 254));
        txtProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtProveedor);
        txtProveedor.setBounds(130, 110, 370, 50);

        jSeparator6.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator6.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(130, 160, 370, 10);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Producto/Category.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 200, 50, 50);

        dtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        dtFecha.setForeground(new java.awt.Color(73, 131, 254));
        dtFecha.setColorBackground(new java.awt.Color(73, 131, 254));
        dtFecha.setColorButtonHover(new java.awt.Color(36, 101, 239));
        dtFecha.setColorDiaActual(new java.awt.Color(73, 131, 254));
        dtFecha.setColorForeground(new java.awt.Color(73, 131, 254));
        dtFecha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dtFecha.setFuente(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dtFecha.setPlaceholder("SELECCIONE SU FECHA");
        jPanel1.add(dtFecha);
        dtFecha.setBounds(630, 290, 370, 50);

        pnlContenedor.add(jPanel1, java.awt.BorderLayout.CENTER);

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
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpresaKeyTyped
        if (evt.getSource() == txtEmpresa) {
            cBoleta.verifSoloNumeros(evt, txtEmpresa, lblMensaje);
        }
    }//GEN-LAST:event_txtEmpresaKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        if (evt.getSource() == txtCodigo) {
            cBoleta.verif(evt, txtCodigo);
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void btnInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterActionPerformed
        if (evt.getSource() == btnInter) {
            cBoleta.dialogo("Actualizar");
        }
    }//GEN-LAST:event_btnInterActionPerformed

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoKeyTyped

    private void txtProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorKeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_EditarBolRe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_EditarBolRe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_EditarBolRe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_EditarBolRe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                V_EditarBolRe dialog = new V_EditarBolRe(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnInter;
    private javax.swing.JButton btnSave;
    public static rojerusan.RSComboBox cbxComprador;
    public static rojeru_san.rsdate.RSDateChooser dtFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel pnlContenedor;
    public static javax.swing.JTextField txtCodigo;
    public static javax.swing.JTextField txtEmpresa;
    public static javax.swing.JTextField txtProducto;
    public static javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        setLocationRelativeTo(null);
        new RSMoveWindow().setMoveWindow(this);

        cBoleta.mostrarComprador(cbxComprador);
        ((JLabel) cbxComprador.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        cBoleta.agregarImg(btnCancel, btnSave, btnInter);
        cBoleta.fantasmaText(txtCodigo, txtEmpresa, txtProveedor, txtProducto);
        lblMensaje.setText(null);
        
        txtProveedor.setEnabled(false);
        txtProducto.setEnabled(false);
        
        dtFecha.setDatoFecha(new Date());
    }
}
