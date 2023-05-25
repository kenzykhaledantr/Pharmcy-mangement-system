/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginform;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author KENZY
 */
public class AddDrug extends javax.swing.JFrame {

    /**
     * Creates new form AddDrug
     */
    public AddDrug() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DrugName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        DrugID = new javax.swing.JTextField();
        DrugPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DrugCategory = new javax.swing.JTextField();
        AvailableQuantity = new javax.swing.JTextField();
        BackMainMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,60));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("Add Drug");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Drug Name");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Drug Category");

        DrugName.setBackground(new java.awt.Color(175, 211, 226));

        jButton1.setBackground(new java.awt.Color(255, 234, 210));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DrugID.setBackground(new java.awt.Color(175, 211, 226));
        DrugID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrugIDActionPerformed(evt);
            }
        });

        DrugPrice.setBackground(new java.awt.Color(175, 211, 226));
        DrugPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrugPriceActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Available Quantity");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setText("Drug Price");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setText("Drug ID");

        DrugCategory.setBackground(new java.awt.Color(175, 211, 226));
        DrugCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrugCategoryActionPerformed(evt);
            }
        });

        AvailableQuantity.setBackground(new java.awt.Color(175, 211, 226));

        BackMainMenu.setBackground(new java.awt.Color(255, 234, 210));
        BackMainMenu.setText("Back to Main Menu");
        BackMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DrugPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrugID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrugName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrugCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AvailableQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(BackMainMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DrugID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DrugPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DrugCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AvailableQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackMainMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 400, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\KENZY\\OneDrive\\Desktop\\Images\\27374040_72834941.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public double price=0.0;
    public  int quantity=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Get the capacity of the pharmacy
        int capacity = capcitynumber.getCapacity();
try {
    // Retrieve the input values from the text fields
    String drugName = DrugName.getText();
    String drugId = DrugID.getText();
    price = Double.parseDouble(DrugPrice.getText());
    String category = DrugCategory.getText();
     quantity = Integer.parseInt(AvailableQuantity.getText());

    // Check if any of the fields are empty
    if (drugName.isEmpty() || drugId.isEmpty() || DrugPrice.getText().isEmpty() ||
            category.isEmpty() || AvailableQuantity.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter all the fields.");
        return;
    }

    // Create a new Drug object
    int id = Integer.parseInt(drugId);
    if(id<0||price<0||quantity<0){
        throw new IllegalArgumentException("You Entered Negative Number");
    }
    Drug newDrug = new Drug(drugName, id, price, category, quantity);

    // Check if the pharmacy has space to add the new drug
    if (Drug.userList.size() <= capacity) {
        // Add the new drug to the userList
        Drug.userList.add(newDrug);
        JOptionPane.showMessageDialog(this, "Drug added successfully!");

        // Clear the text fields
        DrugName.setText("");
        DrugID.setText("");
        DrugPrice.setText("");
        DrugCategory.setText("");
        AvailableQuantity.setText("");

        // Save the drug to a file
        saveUserToFile(newDrug);
    } else {
        JOptionPane.showMessageDialog(this, "The pharmacy is full!");
    }
}catch (IllegalArgumentException e){
    JOptionPane.showMessageDialog(this, e.getMessage());
}
    }


    private void saveUserToFile(Drug d) {
        String drugData = d.getName() + "," +
                d.getCategory() + "," +
                d.getId() + "," +
                d.getPrice() +
                d.getQuantity()+"\n";

        try {
            FileWriter fileWriter = new FileWriter("Drugs.txt", true);
            fileWriter.write(drugData);
            fileWriter.close();
            System.out.println("User data saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving user data.");
            e.printStackTrace();
        }
    }

    private void DrugIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrugIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrugIDActionPerformed

    private void DrugPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrugPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrugPriceActionPerformed

    private void DrugCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrugCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrugCategoryActionPerformed

    private void BackMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMainMenuActionPerformed
        // TODO add your handling code here:
        Mainmenu m= new Mainmenu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackMainMenuActionPerformed

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
            java.util.logging.Logger.getLogger(AddDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDrug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDrug().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AvailableQuantity;
    private javax.swing.JButton BackMainMenu;
    private javax.swing.JTextField DrugCategory;
    private javax.swing.JTextField DrugID;
    private javax.swing.JTextField DrugName;
    private javax.swing.JTextField DrugPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}