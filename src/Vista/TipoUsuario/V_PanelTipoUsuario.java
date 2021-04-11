package Vista.TipoUsuario;

import Controlador.Dialogos.C_Dialogos;
import Controlador.TipoUsuarios.C_TipoUsuario;
import java.awt.Color;

public class V_PanelTipoUsuario extends javax.swing.JPanel {

    String verificar = "Agregar";
    C_TipoUsuario cTipoUsuario = new C_TipoUsuario();
    C_Dialogos cDialogos = new C_Dialogos();
    public static int id;

    public V_PanelTipoUsuario() {
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
        jspTabla = new javax.swing.JScrollPane();
        tblRoles = new rojerusan.RSTableMetro();
        txtID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtRoll = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 850));
        setLayout(new java.awt.BorderLayout());

        pnlMenu.setBackground(new java.awt.Color(253, 253, 254));
        pnlMenu.setPreferredSize(new java.awt.Dimension(1200, 850));
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
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(null);

        jspTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(73, 131, 254), 0));

        tblRoles.setBackground(new java.awt.Color(253, 253, 254));
        tblRoles.setForeground(new java.awt.Color(253, 253, 254));
        tblRoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CÓDIGO", "ROLL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRoles.setBackgoundHead(new java.awt.Color(73, 131, 254));
        tblRoles.setBackgoundHover(new java.awt.Color(73, 131, 254));
        tblRoles.setColorBorderHead(new java.awt.Color(253, 253, 254));
        tblRoles.setColorBorderRows(new java.awt.Color(253, 253, 254));
        tblRoles.setColorPrimaryText(new java.awt.Color(73, 131, 254));
        tblRoles.setColorSecundaryText(new java.awt.Color(73, 131, 254));
        tblRoles.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblRoles.setFontHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblRoles.setFontRowHover(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblRoles.setFontRowSelect(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblRoles.setGridColor(new java.awt.Color(73, 131, 254));
        tblRoles.setHighHead(40);
        tblRoles.setRowHeight(30);
        tblRoles.setSelectionBackground(new java.awt.Color(73, 131, 254));
        tblRoles.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblRoles.getTableHeader().setResizingAllowed(false);
        tblRoles.getTableHeader().setReorderingAllowed(false);
        tblRoles.setWidthBorderHead(0);
        tblRoles.setWidthBorderRows(0);
        tblRoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRolesMouseClicked(evt);
            }
        });
        jspTabla.setViewportView(tblRoles);

        jPanel1.add(jspTabla);
        jspTabla.setBounds(20, 190, 520, 402);

        txtID.setBackground(new java.awt.Color(253, 253, 254));
        txtID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtID.setForeground(new java.awt.Color(73, 131, 254));
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(null);
        txtID.setCaretColor(new java.awt.Color(73, 131, 254));
        txtID.setSelectionColor(new java.awt.Color(73, 131, 254));
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        jPanel1.add(txtID);
        txtID.setBounds(680, 240, 370, 50);

        jSeparator1.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator1.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(680, 290, 370, 10);

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TipoUsuario/ID.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(590, 240, 70, 50);

        txtBuscar.setBackground(new java.awt.Color(253, 253, 254));
        txtBuscar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(73, 131, 254));
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscar.setBorder(null);
        txtBuscar.setCaretColor(new java.awt.Color(73, 131, 254));
        txtBuscar.setSelectionColor(new java.awt.Color(73, 131, 254));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(txtBuscar);
        txtBuscar.setBounds(20, 130, 370, 50);

        jSeparator2.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator2.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(20, 180, 370, 10);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TipoUsuario/Roll.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(590, 330, 70, 50);

        jSeparator3.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator3.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(680, 380, 370, 10);

        txtRoll.setBackground(new java.awt.Color(253, 253, 254));
        txtRoll.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtRoll.setForeground(new java.awt.Color(73, 131, 254));
        txtRoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRoll.setBorder(null);
        txtRoll.setCaretColor(new java.awt.Color(73, 131, 254));
        txtRoll.setSelectionColor(new java.awt.Color(73, 131, 254));
        jPanel1.add(txtRoll);
        txtRoll.setBounds(680, 330, 370, 50);

        btnSave.setBackground(new java.awt.Color(253, 253, 254));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TipoUsuario/Guardar.png"))); // NOI18N
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
        jPanel1.add(btnSave);
        btnSave.setBounds(610, 480, 450, 70);

        btnEliminar.setBackground(new java.awt.Color(253, 253, 254));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TipoUsuario/Eliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(610, 560, 450, 70);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        jPanel1.add(lblMensaje);
        lblMensaje.setBounds(580, 410, 510, 50);

        pnlMenu.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(pnlMenu, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        if (evt.getSource() == lblCerrar) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (evt.getSource() == btnSave) {
            if (!cTipoUsuario.textVacio(txtID, txtRoll, lblMensaje)) {
                if (verificar.equals("Actualizar")) {
                    cTipoUsuario.actualizar(txtID, txtRoll, id);
                } else if (verificar.equals("Agregar")) {
                    cTipoUsuario.agregar(txtID, txtRoll);
                }
            }
            verificar = "Agregar";
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (evt.getSource() == btnEliminar) {
            if (!cDialogos.validarSeleccion(tblRoles, "Selecciona lo que deseas eliminar")) {
                cTipoUsuario.dialogoEliminarRoll(id, tblRoles, "¿Estas seguro que deseas eliminar el registro?");
                cTipoUsuario.limpiarCajas(txtID, txtRoll);
            }
            txtID.setText(null);
            txtRoll.setText(null);
            verificar = "Agregar";
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if (evt.getSource() == txtBuscar) {
            cTipoUsuario.verif(evt, txtBuscar);
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        if (evt.getSource() == txtID) {
            cTipoUsuario.verif(evt, txtID, lblMensaje);
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (evt.getSource() == txtBuscar) {
            cTipoUsuario.buscarTablaRoles(tblRoles, txtBuscar);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tblRolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRolesMouseClicked
        if (evt.getSource() == tblRoles) {
            cTipoUsuario.pasarUsuario(tblRoles);
            verificar = "Actualizar";
        }
    }//GEN-LAST:event_tblRolesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JScrollPane jspTabla;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblIcon;
    public javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel pnlMenu;
    public static rojerusan.RSTableMetro tblRoles;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtRoll;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        txtBuscar.requestFocus();
        cTipoUsuario.mostrarTablaRoles(tblRoles);
        jspTabla.getViewport().setBackground(new Color(253, 253, 254));
        lblMensaje.setText(null);
        cTipoUsuario.agregarImg(btnEliminar, btnSave);
        cTipoUsuario.fantasmaText(txtID, txtRoll, txtBuscar);
    }
}
