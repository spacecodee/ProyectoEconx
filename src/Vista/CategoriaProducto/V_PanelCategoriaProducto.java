package Vista.CategoriaProducto;

import Controlador.CategoriaProductos.C_CategoriaProducto;
import Controlador.Dialogos.C_Dialogos;
import java.awt.Color;

public class V_PanelCategoriaProducto extends javax.swing.JPanel {

    String verificar = "Agregar";
    C_CategoriaProducto cCategoriaProdcuto = new C_CategoriaProducto();
    C_Dialogos cDialogos = new C_Dialogos();
    public static int id;

    public V_PanelCategoriaProducto() {
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
        tblCategoria = new rojerusan.RSTableMetro();
        txtID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtCategoria = new javax.swing.JTextField();
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

        tblCategoria.setBackground(new java.awt.Color(253, 253, 254));
        tblCategoria.setForeground(new java.awt.Color(253, 253, 254));
        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CÓDIGO", "CATEGORIA"
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
        tblCategoria.setBackgoundHead(new java.awt.Color(73, 131, 254));
        tblCategoria.setBackgoundHover(new java.awt.Color(73, 131, 254));
        tblCategoria.setColorBorderHead(new java.awt.Color(253, 253, 254));
        tblCategoria.setColorBorderRows(new java.awt.Color(253, 253, 254));
        tblCategoria.setColorPrimaryText(new java.awt.Color(73, 131, 254));
        tblCategoria.setColorSecundaryText(new java.awt.Color(73, 131, 254));
        tblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblCategoria.setFontHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblCategoria.setFontRowHover(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblCategoria.setFontRowSelect(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblCategoria.setGridColor(new java.awt.Color(73, 131, 254));
        tblCategoria.setHighHead(40);
        tblCategoria.setRowHeight(30);
        tblCategoria.setSelectionBackground(new java.awt.Color(73, 131, 254));
        tblCategoria.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblCategoria.getTableHeader().setResizingAllowed(false);
        tblCategoria.getTableHeader().setReorderingAllowed(false);
        tblCategoria.setWidthBorderHead(0);
        tblCategoria.setWidthBorderRows(0);
        tblCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriaMouseClicked(evt);
            }
        });
        jspTabla.setViewportView(tblCategoria);

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CategoriaProducto/IDProd.png"))); // NOI18N
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
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CategoriaProducto/Categoria.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(590, 330, 70, 50);

        jSeparator3.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator3.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(680, 380, 370, 10);

        txtCategoria.setBackground(new java.awt.Color(253, 253, 254));
        txtCategoria.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(73, 131, 254));
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCategoria.setBorder(null);
        txtCategoria.setCaretColor(new java.awt.Color(73, 131, 254));
        txtCategoria.setSelectionColor(new java.awt.Color(73, 131, 254));
        jPanel1.add(txtCategoria);
        txtCategoria.setBounds(680, 330, 370, 50);

        btnSave.setBackground(new java.awt.Color(253, 253, 254));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CategoriaProducto/Guardar.png"))); // NOI18N
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
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/CategoriaProducto/Eliminar.png"))); // NOI18N
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
            if (!cCategoriaProdcuto.textVacio(txtID, txtCategoria, lblMensaje)) {
                if (verificar.equals("Actualizar")) {
                    cCategoriaProdcuto.actualizar(txtID, txtCategoria, id);
                } else if (verificar.equals("Agregar")) {
                    cCategoriaProdcuto.agregar(txtID, txtCategoria);
                }
            }
            verificar = "Agregar";
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (evt.getSource() == btnEliminar) {
            if (!cDialogos.validarSeleccion(tblCategoria, "Selecciona lo que deseas eliminar")) {
                cCategoriaProdcuto.dialogoEliminarRoll(id, tblCategoria, "¿Estas seguro que deseas eliminar el registro?");
                cCategoriaProdcuto.limpiarCajas(txtID, txtCategoria);
            }
            verificar = "Agregar";
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if (evt.getSource() == txtBuscar) {
            cCategoriaProdcuto.verif(evt, txtBuscar);
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        if (evt.getSource() == txtID) {
            cCategoriaProdcuto.verif(evt, txtID, lblMensaje);
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (evt.getSource() == txtBuscar) {
            cCategoriaProdcuto.buscarTablaRoles(tblCategoria, txtBuscar);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tblCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriaMouseClicked
        if (evt.getSource() == tblCategoria) {
            cCategoriaProdcuto.pasarUsuario(tblCategoria);
            verificar = "Actualizar";
        }
    }//GEN-LAST:event_tblCategoriaMouseClicked


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
    public static rojerusan.RSTableMetro tblCategoria;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JTextField txtCategoria;
    public static javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        txtBuscar.requestFocus();
        cCategoriaProdcuto.mostrarTablaCategoria(tblCategoria);
        jspTabla.getViewport().setBackground(new Color(253, 253, 254));
        lblMensaje.setText(null);
        cCategoriaProdcuto.agregarImg(btnEliminar, btnSave);
        cCategoriaProdcuto.fantasmaText(txtID, txtCategoria, txtBuscar);
    }
}
