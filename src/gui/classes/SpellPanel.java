/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.classes;

/**
 *
 * @author Japhez
 */
public class SpellPanel extends javax.swing.JPanel {

    /**
     * Creates new form SpellPanel
     */
    public SpellPanel() {
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

        spellsAddSpellButton = new javax.swing.JButton();
        spellsRemoveSpellbutton = new javax.swing.JButton();
        spellScrollPane = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        spellsMoreInfoButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        spellsAddSpellButton.setText("Add Spell");
        spellsAddSpellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spellsAddSpellButtonActionPerformed(evt);
            }
        });

        spellsRemoveSpellbutton.setText("Remove Spell");
        spellsRemoveSpellbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spellsRemoveSpellbuttonActionPerformed(evt);
            }
        });

        jList5.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        spellScrollPane.setViewportView(jList5);

        jButton1.setText("Cast Spell");

        spellsMoreInfoButton.setText("More Info");

        jLabel15.setText("Known spells:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(450, 450, 450))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spellScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spellsMoreInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spellsAddSpellButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spellsRemoveSpellbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(spellsMoreInfoButton)
                        .addGap(18, 18, 18)
                        .addComponent(spellsAddSpellButton)
                        .addGap(18, 18, 18)
                        .addComponent(spellsRemoveSpellbutton)
                        .addGap(0, 176, Short.MAX_VALUE))
                    .addComponent(spellScrollPane))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void spellsAddSpellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spellsAddSpellButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spellsAddSpellButtonActionPerformed

    private void spellsRemoveSpellbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spellsRemoveSpellbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spellsRemoveSpellbuttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JList jList5;
    private javax.swing.JScrollPane spellScrollPane;
    private javax.swing.JButton spellsAddSpellButton;
    private javax.swing.JButton spellsMoreInfoButton;
    private javax.swing.JButton spellsRemoveSpellbutton;
    // End of variables declaration//GEN-END:variables
}