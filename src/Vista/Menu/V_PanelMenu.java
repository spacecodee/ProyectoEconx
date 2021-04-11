package Vista.Menu;
//C:\Program Files\Microsoft Office\root\Office16\\EXCEL.EXE

import Controlador.Menu.C_Menu;

public class V_PanelMenu extends javax.swing.JPanel {

    C_Menu cMenu = new C_Menu();

    public V_PanelMenu() {
        ini();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblEmpleados = new javax.swing.JLabel();
        lblProveedores = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblBienvenida = new javax.swing.JLabel();
        btnExcel = new javax.swing.JButton();
        btnCalcu = new javax.swing.JButton();
        btnGoogle = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        pnlMenu.setBackground(new java.awt.Color(253, 253, 254));
        pnlMenu.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(253, 253, 254));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 50));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(253, 253, 254));
        jPanel3.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.setLayout(null);
        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(253, 253, 254));
        jPanel4.setPreferredSize(new java.awt.Dimension(1150, 50));

        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Minimi.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCerrar.setMaximumSize(new java.awt.Dimension(50, 50));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(1071, Short.MAX_VALUE)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);

        pnlMenu.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(253, 253, 254));
        jPanel1.setLayout(null);

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoeconx.png"))); // NOI18N
        jPanel1.add(lblIcon);
        lblIcon.setBounds(1110, 0, 64, 64);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(73, 131, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ECONX");
        jLabel2.setPreferredSize(new java.awt.Dimension(64, 64));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(930, 0, 180, 64);

        jPanel5.setBackground(new java.awt.Color(245, 246, 250));
        jPanel5.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(73, 131, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOTAL EMPLEADOS");
        jLabel1.setMaximumSize(new java.awt.Dimension(260, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(260, 100));
        jPanel5.add(jLabel1);
        jLabel1.setBounds(50, 20, 200, 100);

        lblEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblEmpleados.setForeground(new java.awt.Color(104, 105, 109));
        lblEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpleados.setText("15");
        lblEmpleados.setMaximumSize(new java.awt.Dimension(80, 100));
        lblEmpleados.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel5.add(lblEmpleados);
        lblEmpleados.setBounds(250, 20, 50, 100);

        lblProveedores.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblProveedores.setForeground(new java.awt.Color(104, 105, 109));
        lblProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProveedores.setText("15");
        lblProveedores.setMaximumSize(new java.awt.Dimension(80, 100));
        lblProveedores.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel5.add(lblProveedores);
        lblProveedores.setBounds(590, 20, 50, 100);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(73, 131, 254));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOTAL PROVEEDORES");
        jLabel5.setMaximumSize(new java.awt.Dimension(260, 100));
        jLabel5.setPreferredSize(new java.awt.Dimension(260, 100));
        jPanel5.add(jLabel5);
        jLabel5.setBounds(350, 20, 240, 100);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(73, 131, 254));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TOTAL PRODUCTOS");
        jLabel6.setMaximumSize(new java.awt.Dimension(260, 100));
        jLabel6.setPreferredSize(new java.awt.Dimension(260, 100));
        jPanel5.add(jLabel6);
        jLabel6.setBounds(700, 20, 240, 100);

        lblProductos.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(104, 105, 109));
        lblProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductos.setText("15");
        lblProductos.setMaximumSize(new java.awt.Dimension(80, 100));
        lblProductos.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel5.add(lblProductos);
        lblProductos.setBounds(940, 20, 50, 100);

        jSeparator1.setBackground(new java.awt.Color(93, 177, 249));
        jSeparator1.setForeground(new java.awt.Color(93, 177, 249));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(670, 10, 10, 120);

        jSeparator2.setBackground(new java.awt.Color(93, 177, 249));
        jSeparator2.setForeground(new java.awt.Color(93, 177, 249));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(320, 10, 10, 120);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(60, 120, 1060, 140);

        lblBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(93, 177, 249));
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("Bienvenida");
        jPanel1.add(lblBienvenida);
        lblBienvenida.setBounds(60, 280, 1060, 60);

        btnExcel.setBackground(new java.awt.Color(75, 132, 254));
        btnExcel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/excel.png"))); // NOI18N
        btnExcel.setBorder(null);
        btnExcel.setBorderPainted(false);
        btnExcel.setContentAreaFilled(false);
        btnExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcel.setFocusPainted(false);
        btnExcel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcel);
        btnExcel.setBounds(870, 400, 128, 128);

        btnCalcu.setBackground(new java.awt.Color(75, 132, 254));
        btnCalcu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCalcu.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/calculadora.png"))); // NOI18N
        btnCalcu.setBorder(null);
        btnCalcu.setBorderPainted(false);
        btnCalcu.setContentAreaFilled(false);
        btnCalcu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcu.setFocusPainted(false);
        btnCalcu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcuActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcu);
        btnCalcu.setBounds(160, 400, 128, 128);

        btnGoogle.setBackground(new java.awt.Color(75, 132, 254));
        btnGoogle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnGoogle.setForeground(new java.awt.Color(255, 255, 255));
        btnGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu/google.png"))); // NOI18N
        btnGoogle.setBorder(null);
        btnGoogle.setBorderPainted(false);
        btnGoogle.setContentAreaFilled(false);
        btnGoogle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoogle.setFocusPainted(false);
        btnGoogle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoogleActionPerformed(evt);
            }
        });
        jPanel1.add(btnGoogle);
        btnGoogle.setBounds(520, 400, 128, 128);

        pnlMenu.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(pnlMenu, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        if (evt.getSource() == lblCerrar) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnCalcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcuActionPerformed
        if (evt.getSource() == btnCalcu) {
            cMenu.abrirProgramaCompu("calc");
        }
    }//GEN-LAST:event_btnCalcuActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        if (evt.getSource() == btnExcel) {
            cMenu.abrirProgramaCompu("C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE");
        }
    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoogleActionPerformed
        if (evt.getSource() == btnGoogle) {
            cMenu.OpenInternnet("www.google.com");
        }
    }//GEN-LAST:event_btnGoogleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcu;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnGoogle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblCerrar;
    public static javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblIcon;
    public static javax.swing.JLabel lblProductos;
    public static javax.swing.JLabel lblProveedores;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
    private void ini() {
        initComponents();
        cMenu.imgMenu(btnCalcu, btnGoogle, btnExcel);
        lblEmpleados.setText(String.valueOf(cMenu.totalEmpleados()));
        lblProveedores.setText(String.valueOf(cMenu.totaProveedores()));
        lblProductos.setText(String.valueOf(cMenu.totaProductos()));
    }
}
