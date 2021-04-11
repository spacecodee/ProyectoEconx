package Vista.PerfilUsuario;

import Controlador.Perfil.C_Perfil;
import Modelo.Usuario.M_UsuarioLogin;

public class V_PanelInformacionBasica extends javax.swing.JPanel {

    M_UsuarioLogin mUsuarioLogin;
    C_Perfil cPerfil = new C_Perfil();

    public V_PanelInformacionBasica() {
        initComponents();
    }

    public V_PanelInformacionBasica(M_UsuarioLogin mUsuarioLogin) {
        ini();
        this.mUsuarioLogin = mUsuarioLogin;
        txtNom.setText(mUsuarioLogin.getNombre());
        txtApe.setText(mUsuarioLogin.getApellidos());
        txtTelefono.setText(mUsuarioLogin.getTelefono());
        txtCorreo.setText(mUsuarioLogin.getCorreoElectronico());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImgPerfil = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtApe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblMensaje = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 246, 250));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setLayout(null);

        lblImgPerfil.setBackground(new java.awt.Color(245, 246, 250));
        lblImgPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/userPerfil.png"))); // NOI18N
        add(lblImgPerfil);
        lblImgPerfil.setBounds(310, 30, 128, 128);

        txtNom.setBackground(new java.awt.Color(245, 246, 250));
        txtNom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNom.setForeground(new java.awt.Color(73, 131, 254));
        txtNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNom.setBorder(null);
        txtNom.setCaretColor(new java.awt.Color(73, 131, 254));
        add(txtNom);
        txtNom.setBounds(210, 180, 370, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/Usuario.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(140, 180, 50, 50);

        jSeparator3.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator3.setForeground(new java.awt.Color(73, 131, 254));
        add(jSeparator3);
        jSeparator3.setBounds(210, 230, 370, 10);

        txtApe.setBackground(new java.awt.Color(245, 246, 250));
        txtApe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtApe.setForeground(new java.awt.Color(73, 131, 254));
        txtApe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApe.setBorder(null);
        txtApe.setCaretColor(new java.awt.Color(73, 131, 254));
        add(txtApe);
        txtApe.setBounds(210, 260, 370, 50);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/Usuario.png"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(140, 260, 50, 50);

        jSeparator4.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator4.setForeground(new java.awt.Color(73, 131, 254));
        add(jSeparator4);
        jSeparator4.setBounds(210, 310, 370, 10);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/Telefono.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(140, 340, 50, 50);

        txtTelefono.setBackground(new java.awt.Color(245, 246, 250));
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
        add(txtTelefono);
        txtTelefono.setBounds(210, 340, 370, 50);

        jSeparator5.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator5.setForeground(new java.awt.Color(73, 131, 254));
        add(jSeparator5);
        jSeparator5.setBounds(210, 390, 370, 10);

        txtCorreo.setBackground(new java.awt.Color(245, 246, 250));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(73, 131, 254));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(73, 131, 254));
        add(txtCorreo);
        txtCorreo.setBounds(210, 420, 370, 50);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/Mail.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(140, 420, 50, 50);

        jSeparator6.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator6.setForeground(new java.awt.Color(73, 131, 254));
        add(jSeparator6);
        jSeparator6.setBounds(210, 470, 370, 10);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        add(lblMensaje);
        lblMensaje.setBounds(20, 490, 770, 50);

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
        btnSave.setBounds(160, 570, 450, 70);

        btnEdit.setBackground(new java.awt.Color(253, 253, 254));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/btnE.png"))); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setFocusPainted(false);
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit);
        btnEdit.setBounds(580, 30, 200, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (evt.getSource() == txtTelefono) {
            cPerfil.verifTelefono(evt, txtApe, lblMensaje);
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (evt.getSource() == btnSave) {
            if (!cPerfil.textVacio(txtNom, txtApe, txtApe, txtCorreo, lblMensaje)) {
                if (cPerfil.actualizarInfoBasica(txtNom.getText(), txtApe.getText(), txtTelefono.getText(),
                        txtCorreo.getText(), mUsuarioLogin.getId(), lblMensaje)) {
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        txtNom.setEnabled(true);
        txtApe.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtCorreo.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnEdit;
    public static javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblImgPerfil;
    public static javax.swing.JLabel lblMensaje;
    public static javax.swing.JTextField txtApe;
    public static javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtNom;
    public static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        cPerfil.imgPerfil(btnSave, btnEdit);
        cPerfil.fantasmaTextPerfil(txtNom, txtApe, txtTelefono, txtCorreo);
        lblMensaje.setText(null);
        txtNom.setEnabled(false);
        txtApe.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCorreo.setEnabled(false);
    }
}
