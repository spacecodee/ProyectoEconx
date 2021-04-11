package Vista.Boleta;

import Controlador.Boleta.C_Boleta;
import java.util.Date;
import javax.swing.UIManager;
import rojeru_san.complementos.RSMoveWindow;

public class V_ReportarBoleta extends javax.swing.JDialog {

    C_Boleta cBoleta = new C_Boleta();

    public V_ReportarBoleta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ini();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl1 = new javax.swing.JPanel();
        dtFecha = new rojeru_san.rsdate.RSDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblMensaje = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 400));
        jPanel1.setLayout(new java.awt.BorderLayout());

        pnl1.setBackground(new java.awt.Color(255, 255, 255));
        pnl1.setPreferredSize(new java.awt.Dimension(700, 300));
        pnl1.setLayout(null);

        dtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        dtFecha.setForeground(new java.awt.Color(73, 131, 254));
        dtFecha.setColorBackground(new java.awt.Color(73, 131, 254));
        dtFecha.setColorButtonHover(new java.awt.Color(36, 101, 239));
        dtFecha.setColorDiaActual(new java.awt.Color(73, 131, 254));
        dtFecha.setColorForeground(new java.awt.Color(73, 131, 254));
        dtFecha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dtFecha.setFuente(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dtFecha.setPlaceholder("SELECCIONE SU FECHA");
        pnl1.add(dtFecha);
        dtFecha.setBounds(190, 170, 370, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Fecha.png"))); // NOI18N
        pnl1.add(jLabel3);
        jLabel3.setBounds(100, 170, 70, 50);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Producto/Category.png"))); // NOI18N
        pnl1.add(jLabel5);
        jLabel5.setBounds(100, 100, 70, 50);

        txtDNI.setBackground(new java.awt.Color(253, 253, 254));
        txtDNI.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(73, 131, 254));
        txtDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDNI.setBorder(null);
        txtDNI.setCaretColor(new java.awt.Color(73, 131, 254));
        txtDNI.setSelectionColor(new java.awt.Color(73, 131, 254));
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });
        pnl1.add(txtDNI);
        txtDNI.setBounds(190, 30, 370, 50);

        jSeparator5.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator5.setForeground(new java.awt.Color(73, 131, 254));
        pnl1.add(jSeparator5);
        jSeparator5.setBounds(190, 80, 370, 10);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        pnl1.add(lblMensaje);
        lblMensaje.setBounds(80, 240, 510, 50);

        txtNombre.setBackground(new java.awt.Color(253, 253, 254));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(73, 131, 254));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(73, 131, 254));
        txtNombre.setSelectionColor(new java.awt.Color(73, 131, 254));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnl1.add(txtNombre);
        txtNombre.setBounds(190, 100, 370, 50);

        jSeparator6.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator6.setForeground(new java.awt.Color(73, 131, 254));
        pnl1.add(jSeparator6);
        jSeparator6.setBounds(190, 150, 370, 10);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TipoUsuario/ID.png"))); // NOI18N
        pnl1.add(jLabel6);
        jLabel6.setBounds(100, 30, 70, 50);

        jPanel1.add(pnl1, java.awt.BorderLayout.PAGE_START);

        pnl2.setBackground(new java.awt.Color(245, 246, 250));
        pnl2.setMaximumSize(new java.awt.Dimension(700, 100));
        pnl2.setMinimumSize(new java.awt.Dimension(700, 100));
        pnl2.setLayout(null);

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
        pnl2.add(btnCancel);
        btnCancel.setBounds(350, 30, 150, 40);

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
        pnl2.add(btnSave);
        btnSave.setBounds(520, 30, 150, 40);

        jPanel1.add(pnl2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (evt.getSource() == btnSave) {
            if (!cBoleta.textVacio(txtDNI, txtNombre, lblMensaje)) {
                cBoleta.facturar(txtDNI, txtNombre, dtFecha);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        if (evt.getSource() == txtDNI) {
            cBoleta.verifOcho(evt, txtDNI, lblMensaje);
        }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

    }//GEN-LAST:event_txtNombreKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_ReportarBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_ReportarBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_ReportarBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_ReportarBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                V_ReportarBoleta dialog = new V_ReportarBoleta(new javax.swing.JFrame(), true);
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
    public static rojeru_san.rsdate.RSDateChooser dtFecha;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    public static javax.swing.JTextField txtDNI;
    public static javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        lblMensaje.setText(null);
        new RSMoveWindow().setMoveWindow(this);
        this.setLocationRelativeTo(null);
        cBoleta.agregarImg(btnCancel, btnSave);
        cBoleta.fantasmaText(txtDNI, txtNombre);
        dtFecha.setDatoFecha(new Date());
    }
}
