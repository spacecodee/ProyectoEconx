package Vista.Usuario;

import Controlador.Menu.C_Menu;
import Controlador.Usuarios.C_Usuario;
import Vista.Menu.V_PanelMenu;
import java.awt.Color;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import rojeru_san.complementos.RSMoveWindow;

public class V_AgregarUsuario extends javax.swing.JDialog {

    C_Usuario cUsuario = new C_Usuario();
    C_Menu cMenu = new C_Menu();

    public V_AgregarUsuario(java.awt.Frame parent, boolean modal) {
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
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        pwsPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        cbxRoll = new rojerusan.RSComboBox();
        dtFecha = new rojeru_san.rsdate.RSDateChooser();
        lblMensaje = new javax.swing.JLabel();
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });
        jPanel1.add(txtDNI);
        txtDNI.setBounds(140, 50, 370, 50);

        jSeparator1.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator1.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(140, 100, 370, 10);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/ID.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 50, 50, 50);

        jSeparator2.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator2.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(640, 100, 370, 10);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Pass.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(570, 50, 50, 50);

        pwsPass.setBackground(new java.awt.Color(255, 255, 255));
        pwsPass.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pwsPass.setForeground(new java.awt.Color(73, 131, 254));
        pwsPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwsPass.setBorder(null);
        pwsPass.setCaretColor(new java.awt.Color(73, 131, 254));
        pwsPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwsPassKeyTyped(evt);
            }
        });
        jPanel1.add(pwsPass);
        pwsPass.setBounds(640, 50, 370, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Usuario.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 140, 50, 50);

        jSeparator3.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator3.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(140, 190, 370, 10);

        txtNom.setBackground(new java.awt.Color(255, 255, 255));
        txtNom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNom.setForeground(new java.awt.Color(73, 131, 254));
        txtNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNom.setBorder(null);
        txtNom.setCaretColor(new java.awt.Color(73, 131, 254));
        jPanel1.add(txtNom);
        txtNom.setBounds(140, 140, 370, 50);

        txtApe.setBackground(new java.awt.Color(255, 255, 255));
        txtApe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtApe.setForeground(new java.awt.Color(73, 131, 254));
        txtApe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApe.setBorder(null);
        txtApe.setCaretColor(new java.awt.Color(73, 131, 254));
        jPanel1.add(txtApe);
        txtApe.setBounds(640, 140, 370, 50);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Usuario.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(570, 140, 50, 50);

        jSeparator4.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator4.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(640, 190, 370, 10);

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(73, 131, 254));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(73, 131, 254));
        jPanel1.add(txtCorreo);
        txtCorreo.setBounds(640, 240, 370, 50);

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
        txtTelefono.setBounds(140, 240, 370, 50);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Telefono.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 240, 50, 50);

        jSeparator5.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator5.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(140, 290, 370, 10);

        jSeparator6.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator6.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(640, 290, 370, 10);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Mail.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(570, 240, 50, 50);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Fecha.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 350, 50, 50);

        jSeparator8.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator8.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(640, 400, 370, 10);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Roll.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(570, 350, 50, 50);

        cbxRoll.setBackground(new java.awt.Color(255, 255, 255));
        cbxRoll.setForeground(new java.awt.Color(73, 131, 254));
        cbxRoll.setColorArrow(new java.awt.Color(73, 131, 254));
        cbxRoll.setColorBorde(new java.awt.Color(255, 255, 255));
        cbxRoll.setColorBoton(new java.awt.Color(253, 253, 254));
        cbxRoll.setColorDisabledIndex(new java.awt.Color(73, 131, 254));
        cbxRoll.setColorDisabledIndexText(new java.awt.Color(253, 253, 254));
        cbxRoll.setColorFondo(new java.awt.Color(255, 255, 255));
        cbxRoll.setColorListaItems(new java.awt.Color(253, 253, 254));
        cbxRoll.setColorListaItemsTXT(new java.awt.Color(73, 131, 254));
        cbxRoll.setColorSeleccion(new java.awt.Color(36, 101, 239));
        cbxRoll.setColorSeleccionTXT(new java.awt.Color(253, 253, 254));
        cbxRoll.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbxRoll.setPreferredSize(new java.awt.Dimension(370, 50));
        jPanel1.add(cbxRoll);
        cbxRoll.setBounds(640, 350, 370, 50);

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
        dtFecha.setBounds(140, 350, 370, 50);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        jPanel1.add(lblMensaje);
        lblMensaje.setBounds(80, 440, 930, 50);

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
            if (!cUsuario.textVacio(txtDNI, pwsPass, txtNom, txtApe, txtTelefono, txtCorreo, cbxRoll, lblMensaje)) {
                if (!cUsuario.correo(txtCorreo, lblMensaje)) {
                    cUsuario.agregar(cbxRoll, dtFecha, pwsPass, txtCorreo, txtDNI, txtNom, txtApe, txtTelefono);
                    V_PanelMenu.lblEmpleados.setText(String.valueOf(cMenu.totalEmpleados()));
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        if (evt.getSource() == txtDNI) {
            cUsuario.verif(evt, txtDNI, lblMensaje);
        }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (evt.getSource() == txtTelefono) {
            cUsuario.verifTelefono(evt, txtTelefono, lblMensaje);
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void pwsPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwsPassKeyTyped

    }//GEN-LAST:event_pwsPassKeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                V_AgregarUsuario dialog = new V_AgregarUsuario(new javax.swing.JFrame(), true);
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
    private rojerusan.RSComboBox cbxRoll;
    private rojeru_san.rsdate.RSDateChooser dtFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPasswordField pwsPass;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        setLocationRelativeTo(null);
        new RSMoveWindow().setMoveWindow(this);
        cUsuario.mostrarUsuarios(cbxRoll);
        cUsuario.agregarImg(btnCancel, btnSave);
        cUsuario.fantasmaText(txtDNI, pwsPass, txtNom, txtApe, txtTelefono, txtCorreo);
        ((JLabel) cbxRoll.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        dtFecha.setBorder(new LineBorder(new Color(255, 255, 255), 0));
        lblMensaje.setText(null);
        dtFecha.setDatoFecha(new Date());
    }
}
