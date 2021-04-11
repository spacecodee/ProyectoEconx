package Vista.PerfilUsuario;

import Controlador.Perfil.C_Perfil;
import Modelo.Usuario.M_UsuarioLogin;

public class V_PanelCambiarPass extends javax.swing.JPanel {

    M_UsuarioLogin mUsuarioLogin;
    C_Perfil cPerfil = new C_Perfil();
    public int id;

    public V_PanelCambiarPass() {
        ini();
    }

    public V_PanelCambiarPass(M_UsuarioLogin mUsuarioLogin) {
        ini();
        this.mUsuarioLogin = mUsuarioLogin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pwsPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pwsConfirmar = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        lblImgPerfil = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 246, 250));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setLayout(null);

        pwsPass.setBackground(new java.awt.Color(245, 246, 250));
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
        add(pwsPass);
        pwsPass.setBounds(230, 230, 370, 50);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Pass.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(160, 230, 50, 50);

        jSeparator2.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator2.setForeground(new java.awt.Color(73, 131, 254));
        add(jSeparator2);
        jSeparator2.setBounds(230, 280, 370, 10);

        pwsConfirmar.setBackground(new java.awt.Color(245, 246, 250));
        pwsConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pwsConfirmar.setForeground(new java.awt.Color(73, 131, 254));
        pwsConfirmar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwsConfirmar.setBorder(null);
        pwsConfirmar.setCaretColor(new java.awt.Color(73, 131, 254));
        pwsConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwsConfirmarKeyTyped(evt);
            }
        });
        add(pwsConfirmar);
        pwsConfirmar.setBounds(230, 320, 370, 50);

        jSeparator3.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator3.setForeground(new java.awt.Color(73, 131, 254));
        add(jSeparator3);
        jSeparator3.setBounds(230, 370, 370, 10);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Pass.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(160, 320, 50, 50);

        btnSave.setBackground(new java.awt.Color(253, 253, 254));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/btnG.png"))); // NOI18N
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
        add(btnSave);
        btnSave.setBounds(160, 490, 450, 70);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        add(lblMensaje);
        lblMensaje.setBounds(30, 410, 730, 50);

        lblImgPerfil.setBackground(new java.awt.Color(245, 246, 250));
        lblImgPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/userPerfil.png"))); // NOI18N
        add(lblImgPerfil);
        lblImgPerfil.setBounds(310, 30, 128, 128);
    }// </editor-fold>//GEN-END:initComponents

    private void pwsPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwsPassKeyTyped

    }//GEN-LAST:event_pwsPassKeyTyped

    private void pwsConfirmarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwsConfirmarKeyTyped

    }//GEN-LAST:event_pwsConfirmarKeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        btnGuardar(evt);
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblImgPerfil;
    public javax.swing.JLabel lblMensaje;
    private javax.swing.JPasswordField pwsConfirmar;
    private javax.swing.JPasswordField pwsPass;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        cPerfil.imgPerfil(btnSave);
        cPerfil.fantasmaText(pwsPass, pwsConfirmar);
        lblMensaje.setText(null);
    }

    private void btnGuardar(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == btnSave) {
            if (cPerfil.textVacio(evt, pwsPass, pwsConfirmar, lblMensaje)) {
                if (cPerfil.ModificarPassword(mUsuarioLogin.getId(), pwsPass, lblMensaje)) {
                    
                }
            }
        }
    }
}
