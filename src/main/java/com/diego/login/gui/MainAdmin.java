package com.diego.login.gui;

import com.diego.login.controller.Controller;
import com.diego.login.controller.User;
import java.awt.Color;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainAdmin extends javax.swing.JFrame {

    Controller control;
    User usr;

    public MainAdmin(Controller control, User usr) {
        initComponents();
        this.control = control;
        this.usr = usr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        btnExit1 = new javax.swing.JButton();
        btnNewUser = new javax.swing.JButton();
        btnEditUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnRefreshTable1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersTable.setBackground(new java.awt.Color(255, 255, 255));
        usersTable.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 650, 350));

        btnExit1.setBackground(new java.awt.Color(102, 102, 102));
        btnExit1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnExit1.setForeground(new java.awt.Color(255, 255, 255));
        btnExit1.setText("Salir");
        btnExit1.setBorder(null);
        btnExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExit1MouseExited(evt);
            }
        });
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 170, 40));

        btnNewUser.setBackground(new java.awt.Color(102, 102, 102));
        btnNewUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnNewUser.setForeground(new java.awt.Color(255, 255, 255));
        btnNewUser.setText("Crear nuevo usuario");
        btnNewUser.setBorder(null);
        btnNewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewUserMouseExited(evt);
            }
        });
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 170, 40));

        btnEditUser.setBackground(new java.awt.Color(102, 102, 102));
        btnEditUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEditUser.setForeground(new java.awt.Color(255, 255, 255));
        btnEditUser.setText("Editar usuario");
        btnEditUser.setBorder(null);
        btnEditUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditUserMouseExited(evt);
            }
        });
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 170, 40));

        btnDeleteUser.setBackground(new java.awt.Color(102, 102, 102));
        btnDeleteUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnDeleteUser.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteUser.setText("Eliminar usuario");
        btnDeleteUser.setBorder(null);
        btnDeleteUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteUserMouseExited(evt);
            }
        });
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 170, 40));

        btnRefreshTable1.setBackground(new java.awt.Color(102, 102, 102));
        btnRefreshTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnRefreshTable1.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreshTable1.setText("Recargar tabla");
        btnRefreshTable1.setBorder(null);
        btnRefreshTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRefreshTable1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRefreshTable1MouseExited(evt);
            }
        });
        btnRefreshTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTable1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefreshTable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 170, 40));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRADOR DE USUARIOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtUserName.setEditable(false);
        txtUserName.setBackground(new java.awt.Color(153, 153, 153));
        txtUserName.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtUserName.setText("jTextField1");
        txtUserName.setBorder(null);
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 20, 160, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        RegisterUsers regUsers = new RegisterUsers(control);
        regUsers.setVisible(true);
        regUsers.setLocationRelativeTo(null);
        //this.dispose();
    }//GEN-LAST:event_btnNewUserActionPerformed

    private void btnNewUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewUserMouseEntered
        btnNewUser.setBackground(new Color(204,204,204));
        btnNewUser.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_btnNewUserMouseEntered

    private void btnNewUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewUserMouseExited
        btnNewUser.setBackground(new Color(102,102,102));
        btnNewUser.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnNewUserMouseExited

    private void btnEditUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditUserMouseEntered
        btnEditUser.setBackground(new Color(204,204,204));
        btnEditUser.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_btnEditUserMouseEntered

    private void btnEditUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditUserMouseExited
        btnEditUser.setBackground(new Color(102,102,102));
        btnEditUser.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnEditUserMouseExited

    private void btnDeleteUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUserMouseEntered
        btnDeleteUser.setBackground(new Color(204,204,204));
        btnDeleteUser.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_btnDeleteUserMouseEntered

    private void btnDeleteUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteUserMouseExited
        btnDeleteUser.setBackground(new Color(102,102,102));
        btnDeleteUser.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnDeleteUserMouseExited

    private void btnRefreshTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshTable1MouseEntered
        btnRefreshTable1.setBackground(new Color(204,204,204));
        btnRefreshTable1.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_btnRefreshTable1MouseEntered

    private void btnRefreshTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshTable1MouseExited
        btnRefreshTable1.setBackground(new Color(102,102,102));
        btnRefreshTable1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnRefreshTable1MouseExited

    private void btnExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseEntered
        btnExit1.setBackground(new Color(204,204,204));
        btnExit1.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_btnExit1MouseEntered

    private void btnExit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseExited
        btnExit1.setBackground(new Color(102,102,102));
        btnExit1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnExit1MouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtUserName.setText("Hola, " + usr.getUserName());
        tableLoad();
    }

    private void tableLoad() {
        //definir el modelo de tabla que queremos
        DefaultTableModel tableModel = new DefaultTableModel() {
            //hacer no editable filas y columnas
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //establecemos nombres de columnas
        String title[] = {"Id", "Usuario", "Rol"};
        tableModel.setColumnIdentifiers(title);

        List<User> userList = control.loadUsers();

        //preguntamos si la lista está vacia
        if (userList != null) {
            //recorrer la lista
            for (User us : userList) {
                Object[] object = {us.getId(), us.getUserName(), us.getRole().getRoleName()};
                tableModel.addRow(object);
            }
        }

        usersTable.setModel(tableModel);
    }//GEN-LAST:event_formWindowOpened

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnRefreshTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTable1ActionPerformed
        tableLoad();
    }//GEN-LAST:event_btnRefreshTable1ActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        //validar que la tabla tenga elementos
        if (usersTable.getRowCount() > 0) {
            //controlar que se haya seleccionado un elemento
            if (usersTable.getSelectedRow() != -1) {
                //obtengo la id del elemento a eleminar
                int idUser = Integer.parseInt(String.valueOf(usersTable.getValueAt(usersTable.getSelectedRow(), 0)));

                //lamo al metodo borrar
                control.userDelete(idUser);

                //avisar al usuario que se eliminó correctamente
                showMessage("El usuario fue borrado correctamente", "info", "Eliminación exitosa");

                //recargar la tabla
                tableLoad();
            } else {
                showMessage("No seleccionó ningún registro", "error", "Error al eliminar");
            }
        } else {
            showMessage("La tabla está vacía", "error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        //validar que la tabla tenga elementos
        if (usersTable.getRowCount() > 0) {
            //controlar que se haya seleccionado un elemento
            if (usersTable.getSelectedRow() != -1) {
                //obtengo la id del elemento a eleminar
                int idUser = Integer.parseInt(String.valueOf(usersTable.getValueAt(usersTable.getSelectedRow(), 0)));

                //lamo a la ventana de edición
                EditUsers screenEdit = new EditUsers(control, idUser);
                screenEdit.setVisible(true);
                screenEdit.setLocationRelativeTo(null);
                
            } else {
                showMessage("No seleccionó ningún registro", "error", "Error al editar");
            }
        } else {
            showMessage("La tabla está vacía", "error", "Error al editar");
        }
    }//GEN-LAST:event_btnEditUserActionPerformed

    public void showMessage(String message, String type, String title) {
        JOptionPane optionPane = new JOptionPane(message);
        if (type.equals("info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (type.equals("error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnNewUser;
    private javax.swing.JButton btnRefreshTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
