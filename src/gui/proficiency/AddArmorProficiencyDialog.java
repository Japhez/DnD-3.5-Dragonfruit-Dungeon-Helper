/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.proficiency;

import character.Player;
import character.proficiencies.ArmorProficiency;
import gui.ProficiencyPanel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Japhez
 */
public class AddArmorProficiencyDialog extends javax.swing.JDialog {

    private Player character;
    private ProficiencyPanel parent;

    /**
     * Creates new form AddArmorProficiencyDialog
     */
    public AddArmorProficiencyDialog(ProficiencyPanel parent, Player character) {
        initComponents();
        this.parent = parent;
        //Create a list model to attach to the unknown proficiency list
        DefaultListModel model = new DefaultListModel();
        ArrayList<ArmorProficiency> unknownProfs = ArmorProficiency.getProficiencies();
        this.character = character;
        ArrayList<ArmorProficiency> characterProfs = character.getProficiencies().getArmorProficiencyList();
        //Remove each known proficiency from the unknown proficiency list
        for (ArmorProficiency ap : characterProfs) {
            unknownProfs.remove(ap);
        }
        //Add each unknown proficiency to the list
        for (ArmorProficiency ap : unknownProfs) {
            model.addElement(ap);
        }
        armorProficiencyList.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        armorProficiencyList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        learnProficiencyButton = new javax.swing.JToggleButton();
        cancelButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Learn new armor proficiency");
        setAlwaysOnTop(true);

        armorProficiencyList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(armorProficiencyList);

        jLabel1.setText("Unknown armor proficiencies:");

        learnProficiencyButton.setSelected(true);
        learnProficiencyButton.setText("Learn Proficiencies");
        learnProficiencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnProficiencyButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(learnProficiencyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(learnProficiencyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void learnProficiencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnProficiencyButtonActionPerformed
        List selectedValuesList = armorProficiencyList.getSelectedValuesList();
        for (Object o : selectedValuesList) {
            ArmorProficiency ap = (ArmorProficiency) o;
            character.getProficiencies().getArmorProficiencyList().add(ap);
        }
        parent.refreshDisplayedInformation();
        this.dispose();
    }//GEN-LAST:event_learnProficiencyButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList armorProficiencyList;
    private javax.swing.JToggleButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton learnProficiencyButton;
    // End of variables declaration//GEN-END:variables
}