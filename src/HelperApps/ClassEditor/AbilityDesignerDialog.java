package HelperApps.ClassEditor;

import abstracts.Ability;
import character.IntegerVerifier;
import file.manipulation.FileManipulator;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * A JDialog for customizing the information for a ability.
 *
 * @author Japhez
 */
public class AbilityDesignerDialog extends javax.swing.JDialog {

    private Ability newAbility;

    public AbilityDesignerDialog(java.awt.Frame parent, boolean modal, Ability existingAbility) {
        super(parent, modal);
        initComponents();
        //If an existing ability is passed in, fill with that data
        if (existingAbility != null) {
            loadAbilityInformation(existingAbility);
        }
    }

    /**
     * @return the ability that has been created or modified
     */
    public Ability getNewAbility() {
        return newAbility;
    }

    /**
     * Loads the information from the passed ability.
     *
     * @param ability the ability to load information from
     */
    private void loadAbilityInformation(Ability ability) {
        nameTextField.setText(ability.getName());
        levelTextField.setText("" + ability.getLevel());
        descriptionTextArea.setText(ability.getDescription());
    }

    /**
     * Resets all the input fields to allow for a new ability to be created.
     */
    private void resetInputFields() {
        nameTextField.setText("");
        levelTextField.setText("");
        referenceTextField.setText("");
        pageTextField.setText("");
        typeButtonGroup.clearSelection();
        descriptionTextArea.setText("");
        numberOfDiceTextField.setText("0");
        numberOfSidesTextField.setText("0");
    }

    /**
     * Attempts to create a ability using the current values in the GUI. Returns
     * null if something went wrong.
     *
     * @return a new ability or null
     */
    private Ability createAbility() {
        //Don't allow unnamed abilitys
        if (nameTextField.getText().equals("")) {
            return null;
        }
        String name = nameTextField.getText();
        Ability ability = new Ability(name);
        ability.setLevel(Integer.parseInt(levelTextField.getText()));
        ability.setReference(referenceTextField.getText());
        ability.setDescription(descriptionTextArea.getText());
        ability.setPage(Integer.parseInt(pageTextField.getText()));
        //Get dice roll information
        ability.setDiceNumber(Integer.parseInt(numberOfDiceTextField.getText()));
        ability.setDiceSides(Integer.parseInt(numberOfSidesTextField.getText()));
        return ability;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeButtonGroup = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        referenceTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        pageTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        levelTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        numberOfSidesTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        numberOfDiceTextField = new javax.swing.JTextField();
        exportAbilityButton = new javax.swing.JToggleButton();
        importAbilityButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        saveAbilityButton = new javax.swing.JButton();
        resetAbilityInfoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Spell creation");
        setLocationByPlatform(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Ability name:");

        jLabel15.setText("Reference:");

        jLabel16.setText("Page:");

        pageTextField.setColumns(5);
        pageTextField.setText("0");
        pageTextField.setInputVerifier(new IntegerVerifier(0,9999));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Ability level:");

        levelTextField.setColumns(5);
        levelTextField.setText("0");
        levelTextField.setInputVerifier(new IntegerVerifier(0,9));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(descriptionTextArea);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ability description:");

        jLabel11.setText("Base roll without modifiers:");

        numberOfSidesTextField.setText("0");
        numberOfSidesTextField.setInputVerifier(new IntegerVerifier(1,100));

        jLabel13.setText("Number of dice:");

        numberOfDiceTextField.setText("0");
        numberOfDiceTextField.setInputVerifier(new IntegerVerifier(1,100));

        exportAbilityButton.setText("Export Ability");
        exportAbilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportAbilityButtonActionPerformed(evt);
            }
        });

        importAbilityButton.setText("Import Ability");
        importAbilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importAbilityButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Number of sides:");

        saveAbilityButton.setText("Save Ability");
        saveAbilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAbilityButtonActionPerformed(evt);
            }
        });

        resetAbilityInfoButton.setText("Reset Ability Info");
        resetAbilityInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAbilityInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(23, 23, 23)
                                .addComponent(levelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numberOfSidesTextField)
                                    .addComponent(numberOfDiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel16)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referenceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resetAbilityInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveAbilityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(importAbilityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exportAbilityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(levelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(referenceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(pageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(numberOfDiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(numberOfSidesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveAbilityButton)
                    .addComponent(importAbilityButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetAbilityInfoButton)
                    .addComponent(exportAbilityButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveAbilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAbilityButtonActionPerformed
        this.newAbility = createAbility();
        this.setVisible(false);
    }//GEN-LAST:event_saveAbilityButtonActionPerformed

    private void resetAbilityInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAbilityInfoButtonActionPerformed
        resetInputFields();
    }//GEN-LAST:event_resetAbilityInfoButtonActionPerformed

    private void importAbilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importAbilityButtonActionPerformed
        Ability userSelectAbility = FileManipulator.userSelectAbility();
        if (userSelectAbility != null) {
            loadAbilityInformation(userSelectAbility);
        }
    }//GEN-LAST:event_importAbilityButtonActionPerformed

    private void exportAbilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportAbilityButtonActionPerformed
        Ability createAbility = createAbility();
        if (createAbility == null) {
            JOptionPane.showMessageDialog(this, "Invalid information.  Did you fill the bolded fields in?", "Export", JOptionPane.ERROR_MESSAGE);
        } else {
            FileManipulator.writeAbility(createAbility);
            JOptionPane.showMessageDialog(this, "Export successful!", "Export", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_exportAbilityButtonActionPerformed

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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AbilityDesignerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbilityDesignerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbilityDesignerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbilityDesignerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AbilityDesignerDialog dialog = new AbilityDesignerDialog(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JToggleButton exportAbilityButton;
    private javax.swing.JButton importAbilityButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField levelTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField numberOfDiceTextField;
    private javax.swing.JTextField numberOfSidesTextField;
    private javax.swing.JTextField pageTextField;
    private javax.swing.JTextField referenceTextField;
    private javax.swing.JButton resetAbilityInfoButton;
    private javax.swing.JButton saveAbilityButton;
    private javax.swing.ButtonGroup typeButtonGroup;
    // End of variables declaration//GEN-END:variables
}
