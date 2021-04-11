package Vista.PerfilUsuario;

import Controlador.Perfil.C_Perfil;
import Modelo.Usuario.M_UsuarioLogin;
import SQL.Perfil.S_Perfil;
import javax.swing.UIManager;

public class V_CambiarPass extends javax.swing.JDialog {

    M_UsuarioLogin mUsuarioLogin;
    C_Perfil cPerfil = new C_Perfil();
    S_Perfil sPerfil = new S_Perfil();
    public int id = 0;

    V_PanelCambiarPass VpanelCambiarPass = new V_PanelCambiarPass();

    public V_CambiarPass(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ini();
    }

    public V_CambiarPass(java.awt.Frame parent, boolean modal, M_UsuarioLogin mUsuarioLogin) {
        super(parent, modal);
        ini();
        this.mUsuarioLogin = mUsuarioLogin;
        //System.out.println(objLo.getApellidos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pwsPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblMensaje = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 246, 250), 4, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel1.setLayout(null);

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
        pwsPass.setBounds(190, 100, 370, 50);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Pass.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 100, 50, 50);

        jSeparator2.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator2.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(190, 150, 370, 10);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        jPanel1.add(lblMensaje);
        lblMensaje.setBounds(110, 180, 520, 50);

        btnVerificar.setBackground(new java.awt.Color(253, 253, 254));
        btnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/btnVerificarPas.png"))); // NOI18N
        btnVerificar.setBorder(null);
        btnVerificar.setBorderPainted(false);
        btnVerificar.setContentAreaFilled(false);
        btnVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerificar.setFocusPainted(false);
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerificar);
        btnVerificar.setBounds(140, 260, 450, 70);

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/close.png"))); // NOI18N
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jPanel1.add(lblClose);
        lblClose.setBounds(650, 10, 30, 30);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pwsPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwsPassKeyTyped

    }//GEN-LAST:event_pwsPassKeyTyped

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (evt.getSource() == btnVerificar) {

            if (cPerfil.textVacio(evt, pwsPass, lblMensaje)) {
            } else if (cPerfil.CambiarPass(mUsuarioLogin.getId(), pwsPass, lblMensaje)) {
                cPerfil.botonCambiarPass(V_Perfil.pnlEntorno, mUsuarioLogin); // Envio objeto
                //
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        if (evt.getSource() == lblClose) {
            this.dispose();
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_CambiarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_CambiarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_CambiarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_CambiarPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                V_CambiarPass dialog = new V_CambiarPass(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblClose;
    public javax.swing.JLabel lblMensaje;
    private javax.swing.JPasswordField pwsPass;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        this.setLocationRelativeTo(null);
        cPerfil.imgPer(btnVerificar);
        cPerfil.fantasmaText(pwsPass);
        lblMensaje.setText(null);
    }
}
