package Vista.PerfilUsuario;

import Modelo.Usuario.M_UsuarioLogin;

public class V_PanelPerfilPrincipal extends javax.swing.JPanel {

    M_UsuarioLogin mUsuarioLogin;

    public V_PanelPerfilPrincipal() {
        initComponents();
    }

    public V_PanelPerfilPrincipal(M_UsuarioLogin mUsuarioLogin) {
        initComponents();
        this.mUsuarioLogin = mUsuarioLogin;
        String sms = "Hola " + mUsuarioLogin.getNombre() + " " + mUsuarioLogin.getApellidos();
        lblMensaje.setText(sms.toUpperCase());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensaje = new javax.swing.JLabel();
        lblImgPerfil = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 246, 250));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setLayout(null);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        add(lblMensaje);
        lblMensaje.setBounds(10, 290, 770, 50);

        lblImgPerfil.setBackground(new java.awt.Color(245, 246, 250));
        lblImgPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/userPerfil.png"))); // NOI18N
        add(lblImgPerfil);
        lblImgPerfil.setBounds(320, 100, 128, 128);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImgPerfil;
    public static javax.swing.JLabel lblMensaje;
    // End of variables declaration//GEN-END:variables
}
