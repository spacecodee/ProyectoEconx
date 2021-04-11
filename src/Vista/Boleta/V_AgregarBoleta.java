package Vista.Boleta;

import Controlador.Boleta.C_Boleta;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import rojeru_san.complementos.RSMoveWindow;

public class V_AgregarBoleta extends javax.swing.JDialog {

    C_Boleta cBoleta = new C_Boleta();
    public int id;

    public V_AgregarBoleta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ini();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtEmpres = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtCodigo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        cbxComprador = new rojerusan.RSComboBox();
        lblMensaje = new javax.swing.JLabel();
        cbxTrae = new rojerusan.RSComboBox();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
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

        txtEmpres.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpres.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtEmpres.setForeground(new java.awt.Color(73, 131, 254));
        txtEmpres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmpres.setBorder(null);
        txtEmpres.setCaretColor(new java.awt.Color(73, 131, 254));
        txtEmpres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmpresKeyTyped(evt);
            }
        });
        jPanel1.add(txtEmpres);
        txtEmpres.setBounds(640, 290, 370, 50);

        jSeparator1.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator1.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(640, 340, 370, 10);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TipoUsuario/Roll.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(580, 290, 50, 50);

        jSeparator2.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator2.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(640, 250, 370, 10);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Producto/Proce.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(570, 200, 50, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Producto/IDProd.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 200, 50, 50);

        jSeparator3.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator3.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(140, 250, 370, 10);

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
        txtCodigo.setBounds(140, 200, 370, 50);

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(73, 131, 254));
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setBorder(null);
        txtPrecio.setCaretColor(new java.awt.Color(73, 131, 254));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio);
        txtPrecio.setBounds(640, 200, 370, 50);

        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtStock.setForeground(new java.awt.Color(73, 131, 254));
        txtStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStock.setBorder(null);
        txtStock.setCaretColor(new java.awt.Color(73, 131, 254));
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        jPanel1.add(txtStock);
        txtStock.setBounds(140, 290, 370, 50);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Producto/Stock.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 290, 50, 50);

        jSeparator5.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator5.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(140, 340, 370, 10);

        jSeparator8.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator8.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(140, 160, 370, 10);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Producto/Category.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 110, 50, 50);

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
        cbxComprador.setBounds(640, 110, 370, 50);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        jPanel1.add(lblMensaje);
        lblMensaje.setBounds(80, 440, 930, 50);

        cbxTrae.setBackground(new java.awt.Color(255, 255, 255));
        cbxTrae.setForeground(new java.awt.Color(73, 131, 254));
        cbxTrae.setColorArrow(new java.awt.Color(73, 131, 254));
        cbxTrae.setColorBorde(new java.awt.Color(255, 255, 255));
        cbxTrae.setColorBoton(new java.awt.Color(253, 253, 254));
        cbxTrae.setColorDisabledIndex(new java.awt.Color(73, 131, 254));
        cbxTrae.setColorDisabledIndexText(new java.awt.Color(253, 253, 254));
        cbxTrae.setColorFondo(new java.awt.Color(255, 255, 255));
        cbxTrae.setColorListaItems(new java.awt.Color(253, 253, 254));
        cbxTrae.setColorListaItemsTXT(new java.awt.Color(73, 131, 254));
        cbxTrae.setColorSeleccion(new java.awt.Color(36, 101, 239));
        cbxTrae.setColorSeleccionTXT(new java.awt.Color(253, 253, 254));
        cbxTrae.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbxTrae.setPreferredSize(new java.awt.Dimension(370, 50));
        jPanel1.add(cbxTrae);
        cbxTrae.setBounds(140, 110, 370, 50);

        jSeparator9.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator9.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(640, 160, 370, 10);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/ID.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(570, 110, 50, 50);

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
            if (!cBoleta.textVacio(cbxTrae, cbxComprador, txtCodigo, txtPrecio, txtStock, txtEmpres, lblMensaje)) {
                cBoleta.agregar(cbxTrae, cbxComprador, txtCodigo, txtPrecio, txtStock, txtEmpres);
                cBoleta.mostrarTablaBoleta(V_PanelBoleta.tblBoleta);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtEmpresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpresKeyTyped
        if (evt.getSource() == txtEmpres) {
        }
    }//GEN-LAST:event_txtEmpresKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        if (evt.getSource() == txtStock) {
            cBoleta.verifSoloNumeros(evt, txtStock, lblMensaje);
        }
    }//GEN-LAST:event_txtStockKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        if (evt.getSource() == txtPrecio) {
            cBoleta.verifSoloNumeros(evt, txtPrecio, lblMensaje);
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        if (evt.getSource() == txtCodigo) {
            cBoleta.verif(evt, txtCodigo);
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_AgregarBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_AgregarBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_AgregarBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_AgregarBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                V_AgregarBoleta dialog = new V_AgregarBoleta(new javax.swing.JFrame(), true);
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
    public static rojerusan.RSComboBox cbxComprador;
    public static rojerusan.RSComboBox cbxTrae;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel pnlContenedor;
    public static javax.swing.JTextField txtCodigo;
    public static javax.swing.JTextField txtEmpres;
    public static javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        setLocationRelativeTo(null);
        new RSMoveWindow().setMoveWindow(this);
        cBoleta.mostrarTrae(cbxTrae);
        ((JLabel) cbxTrae.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        cBoleta.mostrarComprador(cbxComprador);
        ((JLabel) cbxComprador.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        cBoleta.agregarImg(btnCancel, btnSave);
        cBoleta.fantasmaText(txtCodigo, txtPrecio, txtStock, txtEmpres);
        lblMensaje.setText(null);
    }
}
