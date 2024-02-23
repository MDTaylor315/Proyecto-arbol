/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entidades.*;
/**
 *
 * @author md
 */
public class FrmEjercicio02 extends javax.swing.JFrame {

    /**
     * Creates new form FrmEjercicio02
     */
    public FrmEjercicio02() {
        initComponents();
        this.setLocationRelativeTo(null);
        String titulos[] = {"Código", "Nombre", "Carrera", "Ciclo", "Créditos"};
        modelo1.setColumnIdentifiers(titulos);
        enable(false);
    }


    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTextField1 = new javax.swing.JTextField();
        grupoMostrar = new javax.swing.ButtonGroup();
        grupoCursos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JToggleButton();
        btnReiniciar = new javax.swing.JButton();
        BtnConsultar = new javax.swing.JToggleButton();
        BtnActualizar = new javax.swing.JToggleButton();
        BtnCreditos = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtCarrera = new javax.swing.JTextField();
        txtCreditos = new javax.swing.JTextField();
        opEnOrden = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        opPreOrden = new javax.swing.JRadioButton();
        opPostOrden = new javax.swing.JRadioButton();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCiclo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        opCarrera = new javax.swing.JRadioButton();
        opCiclo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jScrollPane2.setViewportView(jEditorPane1);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        BtnConsultar.setText("Consultar");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });

        BtnActualizar.setText("Actualizar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        BtnCreditos.setText("Créditos");
        BtnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreditosActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtCarrera.setBackground(new java.awt.Color(51, 102, 255));
        txtCarrera.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCarrera.setForeground(new java.awt.Color(255, 255, 255));
        txtCarrera.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrera", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        txtCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarreraActionPerformed(evt);
            }
        });

        txtCreditos.setBackground(new java.awt.Color(51, 102, 255));
        txtCreditos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCreditos.setForeground(new java.awt.Color(255, 255, 255));
        txtCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Créditos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        txtCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditosActionPerformed(evt);
            }
        });

        opEnOrden.setBackground(new java.awt.Color(51, 102, 255));
        grupoMostrar.add(opEnOrden);
        opEnOrden.setForeground(new java.awt.Color(255, 255, 255));
        opEnOrden.setText("EnOrden");
        opEnOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEnOrdenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mostrar por:");

        opPreOrden.setBackground(new java.awt.Color(51, 102, 255));
        grupoMostrar.add(opPreOrden);
        opPreOrden.setForeground(new java.awt.Color(255, 255, 255));
        opPreOrden.setText("PreOrden");
        opPreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPreOrdenActionPerformed(evt);
            }
        });

        opPostOrden.setBackground(new java.awt.Color(51, 102, 255));
        grupoMostrar.add(opPostOrden);
        opPostOrden.setForeground(new java.awt.Color(255, 255, 255));
        opPostOrden.setText("PostOrden");
        opPostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPostOrdenActionPerformed(evt);
            }
        });

        txtCodigo.setBackground(new java.awt.Color(51, 102, 255));
        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(51, 102, 255));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtCiclo.setBackground(new java.awt.Color(51, 102, 255));
        txtCiclo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtCiclo.setForeground(new java.awt.Color(255, 255, 255));
        txtCiclo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ciclo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        txtCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCicloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(BtnConsultar)
                                    .addGap(76, 76, 76)
                                    .addComponent(BtnActualizar)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnRegistrar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(opEnOrden)
                                .addGap(18, 18, 18)
                                .addComponent(opPreOrden)
                                .addGap(18, 18, 18)
                                .addComponent(opPostOrden)))
                        .addGap(37, 37, 37))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnConsultar)
                            .addComponent(BtnActualizar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opEnOrden)
                                    .addComponent(opPreOrden)
                                    .addComponent(opPostOrden))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCreditos)
                    .addComponent(btnReiniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(BtnEliminar))
                .addContainerGap())
        );

        jList1.setModel(modelo2);
        jScrollPane3.setViewportView(jList1);

        opCarrera.setBackground(new java.awt.Color(255, 255, 255));
        grupoCursos.add(opCarrera);
        opCarrera.setText("Carrera");
        opCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCarreraActionPerformed(evt);
            }
        });

        opCiclo.setBackground(new java.awt.Color(255, 255, 255));
        grupoCursos.add(opCiclo);
        opCiclo.setText("Ciclo");
        opCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCicloActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mostrar cursos por:");

        jTable1.setModel(modelo1);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opCiclo)
                                    .addComponent(opCarrera))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opCiclo)
                        .addGap(18, 18, 18)
                        .addComponent(opCarrera)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditosActionPerformed

    private void txtCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCicloActionPerformed

    private void txtCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarreraActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        String codigo = txtCodigo.getText();
        if (codigo.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Porfavor ingrese el codigo del curso en la caja de texto(Codigo)");
        } else {
            Curso x = new Curso(codigo);
            pBusqueda = arbol.buscar(x);
            if (pBusqueda != null) {
                x = pBusqueda.getInfo();
                txtCodigo.setText(x.getCodigo());
                txtNombre.setText(x.getNombre());
                txtCiclo.setText(String.valueOf(x.getCiclo()));
                txtCarrera.setText(x.getCarrera());
                txtCreditos.setText(String.valueOf(x.getCreditos()));
                enable(true);
            } else {
                JOptionPane.showMessageDialog(null, "El curso no existe");
            }
        }


    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        txtCodigo.requestFocus();
        String nombre = txtNombre.getText();
        String codigo = txtCodigo.getText();
        String carrera = txtCarrera.getText();
        int creditos = Integer.parseInt(txtCreditos.getText());
        int ciclo = Integer.parseInt(txtCiclo.getText());

        Curso curso = new Curso(codigo, nombre, ciclo, creditos, carrera);
        arbol.inserta(curso);
        arbol.enOrden(modelo1);
        limpiar();

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        String nombre = txtNombre.getText();
        String codigo = txtCodigo.getText();
        String carrera = txtCarrera.getText();
        int creditos = Integer.parseInt(txtCreditos.getText());
        int ciclo = Integer.parseInt(txtCiclo.getText());
        Curso curso = new Curso(codigo, nombre, ciclo, creditos, carrera);
        pBusqueda.setInfo(curso);
        arbol.enOrden(modelo1);
        enable(false);
        limpiar();
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        arbol.elimina(pBusqueda.getInfo());
        arbol.enOrden(modelo1);
        enable(false);
        limpiar();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        enable(false);
        limpiar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BtnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreditosActionPerformed
      String carrera=JOptionPane.showInputDialog(null, "Ingrese la carrera");
      int r=arbol.sumaCreditos(carrera);
      if(r!=0){
            JOptionPane.showMessageDialog(null, "La carrera " + carrera + " cuenta con " + r + " creditos");
      }
     
    }//GEN-LAST:event_BtnCreditosActionPerformed

    private void opEnOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEnOrdenActionPerformed
        // TODO add your handling code here:
        arbol.enOrden(modelo1);
    }//GEN-LAST:event_opEnOrdenActionPerformed

    private void opPreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPreOrdenActionPerformed
        // TODO add your handling code here:
        arbol.preOrden(modelo1);
    }//GEN-LAST:event_opPreOrdenActionPerformed

    private void opPostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPostOrdenActionPerformed
        // TODO add your handling code here:
        arbol.postOrden(modelo1);
    }//GEN-LAST:event_opPostOrdenActionPerformed

    private void opCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCicloActionPerformed
        // TODO add your handling code here:
        int ciclo=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ciclo"));
           arbol.enOrdenListaCiclo(modelo2,ciclo);
    }//GEN-LAST:event_opCicloActionPerformed

    private void opCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCarreraActionPerformed
        // TODO add your handling code here:
        String carrera=JOptionPane.showInputDialog(null, "Ingrese la carrera");
        arbol.enOrdenListaCarrera(modelo2,carrera);

    }//GEN-LAST:event_opCarreraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEjercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEjercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEjercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEjercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEjercicio02().setVisible(true);
            }
        });
    }
    
    public void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCiclo.setText("");
        txtCarrera.setText("");
        txtCreditos.setText("");
    }
    
    public void enable(boolean estado){
        BtnEliminar.setEnabled(estado);
        btnRegistrar.setEnabled(!estado);
        BtnConsultar.setEnabled(!estado);
        BtnActualizar.setEnabled(estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnActualizar;
    private javax.swing.JToggleButton BtnConsultar;
    private javax.swing.JButton BtnCreditos;
    private javax.swing.JToggleButton BtnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup grupoCursos;
    private javax.swing.ButtonGroup grupoMostrar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton opCarrera;
    private javax.swing.JRadioButton opCiclo;
    private javax.swing.JRadioButton opEnOrden;
    private javax.swing.JRadioButton opPostOrden;
    private javax.swing.JRadioButton opPreOrden;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtCiclo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    ArbolC arbol = new ArbolC();
    DefaultTableModel modelo1 = new DefaultTableModel();
    DefaultListModel modelo2 = new DefaultListModel();
    NodoArbolC pBusqueda;
}
