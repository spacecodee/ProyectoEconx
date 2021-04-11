package Vista.TraeProducto;

import Controlador.Dialogos.C_Dialogos;
import Controlador.TraeProducto.C_TraeProducto;
import java.awt.Color;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class V_PanelTraeProducto extends javax.swing.JPanel {

    String verificar = "Agregar";
    C_TraeProducto cTreaProducto = new C_TraeProducto();
    C_Dialogos cDialogos = new C_Dialogos();
    public static int id;

    public V_PanelTraeProducto() {
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
        tblTrae = new rojerusan.RSTableMetro();
        jSeparator1 = new javax.swing.JSeparator();
        lblIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxProveedor = new rojerusan.RSComboBox();
        cbxProducto = new rojerusan.RSComboBox();
        dtFecha = new rojeru_san.rsdate.RSDateChooser();
        jSeparator4 = new javax.swing.JSeparator();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

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

        tblTrae.setBackground(new java.awt.Color(253, 253, 254));
        tblTrae.setForeground(new java.awt.Color(253, 253, 254));
        tblTrae.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PROVEEDOR", "PRODUCTO", "FECHA COMPRA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTrae.setBackgoundHead(new java.awt.Color(73, 131, 254));
        tblTrae.setBackgoundHover(new java.awt.Color(73, 131, 254));
        tblTrae.setColorBorderHead(new java.awt.Color(253, 253, 254));
        tblTrae.setColorBorderRows(new java.awt.Color(253, 253, 254));
        tblTrae.setColorPrimaryText(new java.awt.Color(73, 131, 254));
        tblTrae.setColorSecundaryText(new java.awt.Color(73, 131, 254));
        tblTrae.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblTrae.setFontHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblTrae.setFontRowHover(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblTrae.setFontRowSelect(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblTrae.setGridColor(new java.awt.Color(73, 131, 254));
        tblTrae.setHighHead(40);
        tblTrae.setRowHeight(30);
        tblTrae.setSelectionBackground(new java.awt.Color(73, 131, 254));
        tblTrae.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblTrae.getTableHeader().setResizingAllowed(false);
        tblTrae.getTableHeader().setReorderingAllowed(false);
        tblTrae.setWidthBorderHead(0);
        tblTrae.setWidthBorderRows(0);
        tblTrae.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTraeMouseClicked(evt);
            }
        });
        jspTabla.setViewportView(tblTrae);

        jPanel1.add(jspTabla);
        jspTabla.setBounds(20, 190, 520, 402);

        jSeparator1.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator1.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(690, 430, 370, 10);

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Producto/Categoria.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(600, 380, 70, 50);

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
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Fecha.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 470, 70, 50);

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
        btnSave.setBounds(620, 620, 450, 70);

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
        btnEliminar.setBounds(620, 700, 450, 70);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        jPanel1.add(lblMensaje);
        lblMensaje.setBounds(590, 550, 510, 50);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Usuario.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(600, 290, 70, 50);

        cbxProveedor.setBackground(new java.awt.Color(255, 255, 255));
        cbxProveedor.setForeground(new java.awt.Color(73, 131, 254));
        cbxProveedor.setColorArrow(new java.awt.Color(73, 131, 254));
        cbxProveedor.setColorBorde(new java.awt.Color(255, 255, 255));
        cbxProveedor.setColorBoton(new java.awt.Color(253, 253, 254));
        cbxProveedor.setColorDisabledIndex(new java.awt.Color(73, 131, 254));
        cbxProveedor.setColorDisabledIndexText(new java.awt.Color(253, 253, 254));
        cbxProveedor.setColorFondo(new java.awt.Color(255, 255, 255));
        cbxProveedor.setColorListaItems(new java.awt.Color(253, 253, 254));
        cbxProveedor.setColorListaItemsTXT(new java.awt.Color(73, 131, 254));
        cbxProveedor.setColorSeleccion(new java.awt.Color(36, 101, 239));
        cbxProveedor.setColorSeleccionTXT(new java.awt.Color(253, 253, 254));
        cbxProveedor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbxProveedor.setPreferredSize(new java.awt.Dimension(370, 50));
        jPanel1.add(cbxProveedor);
        cbxProveedor.setBounds(690, 290, 370, 50);

        cbxProducto.setBackground(new java.awt.Color(255, 255, 255));
        cbxProducto.setForeground(new java.awt.Color(73, 131, 254));
        cbxProducto.setColorArrow(new java.awt.Color(73, 131, 254));
        cbxProducto.setColorBorde(new java.awt.Color(255, 255, 255));
        cbxProducto.setColorBoton(new java.awt.Color(253, 253, 254));
        cbxProducto.setColorDisabledIndex(new java.awt.Color(73, 131, 254));
        cbxProducto.setColorDisabledIndexText(new java.awt.Color(253, 253, 254));
        cbxProducto.setColorFondo(new java.awt.Color(255, 255, 255));
        cbxProducto.setColorListaItems(new java.awt.Color(253, 253, 254));
        cbxProducto.setColorListaItemsTXT(new java.awt.Color(73, 131, 254));
        cbxProducto.setColorSeleccion(new java.awt.Color(36, 101, 239));
        cbxProducto.setColorSeleccionTXT(new java.awt.Color(253, 253, 254));
        cbxProducto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cbxProducto.setPreferredSize(new java.awt.Dimension(370, 50));
        jPanel1.add(cbxProducto);
        cbxProducto.setBounds(690, 380, 370, 50);

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
        dtFecha.setBounds(690, 470, 370, 50);

        jSeparator4.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator4.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(690, 340, 370, 10);

        txtCodigo.setBackground(new java.awt.Color(253, 253, 254));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(73, 131, 254));
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setBorder(null);
        txtCodigo.setCaretColor(new java.awt.Color(73, 131, 254));
        txtCodigo.setSelectionColor(new java.awt.Color(73, 131, 254));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo);
        txtCodigo.setBounds(690, 190, 370, 50);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TipoUsuario/ID.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(600, 190, 70, 50);

        jSeparator5.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator5.setForeground(new java.awt.Color(73, 131, 254));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(690, 240, 370, 10);

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
            if (!cTreaProducto.textVacio(txtCodigo, cbxProveedor, cbxProducto, lblMensaje)) {
                if (verificar.equals("Actualizar")) {
                    cTreaProducto.actualizar(txtCodigo, cbxProveedor, cbxProducto, dtFecha, id);
                } else if (verificar.equals("Agregar")) {
                    cTreaProducto.agregar(txtCodigo, cbxProveedor, cbxProducto, dtFecha);;
                }
            }
            verificar = "Agregar";
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (evt.getSource() == btnEliminar) {
            if (!cDialogos.validarSeleccion(tblTrae, "Selecciona lo que deseas eliminar")) {
                cTreaProducto.dialogoEliminarTraeP(id, tblTrae, "¿Estas seguro que deseas eliminar el registro?");
                cTreaProducto.limpiarCajas(txtBuscar, cbxProveedor, cbxProducto);
            }
            verificar = "Agregar";
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if (evt.getSource() == txtBuscar) {
            cTreaProducto.verif(evt, txtBuscar);
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (evt.getSource() == txtBuscar) {
            cTreaProducto.buscarTablaIntermedia(tblTrae, txtBuscar);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tblTraeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTraeMouseClicked
        if (evt.getSource() == tblTrae) {
            cTreaProducto.pasarIntermedia(tblTrae);
            verificar = "Actualizar";
        }
    }//GEN-LAST:event_tblTraeMouseClicked

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        if (evt.getSource() == txtCodigo) {
            cTreaProducto.verif(evt, txtCodigo, lblMensaje);
        }
    }//GEN-LAST:event_txtCodigoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSave;
    public static rojerusan.RSComboBox cbxProducto;
    public static rojerusan.RSComboBox cbxProveedor;
    public static rojeru_san.rsdate.RSDateChooser dtFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JScrollPane jspTabla;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblIcon;
    public javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel pnlMenu;
    public static rojerusan.RSTableMetro tblTrae;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        ((JLabel) cbxProveedor.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        ((JLabel) cbxProducto.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        txtBuscar.requestFocus();
        cbxProveedor.validate();
        cbxProducto.validate();
        cTreaProducto.mostrarProveedor(cbxProveedor);
        cTreaProducto.mostrarProducto(cbxProducto);
        cTreaProducto.mostrarTablaIntermedia(tblTrae);
        jspTabla.getViewport().setBackground(new Color(253, 253, 254));
        lblMensaje.setText(null);
        cTreaProducto.agregarImg(btnEliminar, btnSave);
        cTreaProducto.fantasmaText(txtBuscar, txtCodigo);
        dtFecha.setDatoFecha(new Date());
    }
}
