package gui;

import character.Player;
import gui.chat.ChatPanel;
import gui.inventory.WalletPanel;
import java.io.IOException;
import javax.swing.JTabbedPane;

/**
 *
 * @author Jacob Dorman
 */
public final class BaseFrame extends javax.swing.JFrame {

    private Player player;

    public BaseFrame() throws IOException {
        player = new Player();
        initComponents();
        addPanels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        tabbedPane2 = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D&D 3.5 Helper");
        setResizable(false);

        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jButton1.setText("Show combat info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addComponent(tabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addComponent(tabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTabbedPane tabbedPane2;
    // End of variables declaration//GEN-END:variables

    /**
     * Adds the child panels into the window tabbed pane, and then adds the chat
     * panel below.
     */
    private void addPanels() throws IOException, IOException {
        tabbedPane.addTab("General", new BasicInfoPanel(player));
        tabbedPane.addTab("Ability Score", new AbilityScorePanel(player));
        tabbedPane.addTab("Class", new ClassPanel(player.getClassInfo()));
        tabbedPane.addTab("Skills", new SkillsPanel(player));
        tabbedPane.addTab("Attack", new AttackPanel(player));
        tabbedPane.addTab("Defense", new DefensePanel(player));
        tabbedPane.addTab("Proficiencies", new ProficiencyPanel(player));
        JTabbedPane inventoryTabbedPane = new JTabbedPane();
        inventoryTabbedPane.add("Items", new InventoryPanel(player));
        //Tries to read in data from a file if possible, throwing an exception 
        //shouldn't happen under normal circumstances though
        inventoryTabbedPane.add("Coin Pouch", new WalletPanel(player));
        tabbedPane.add("Inventory", inventoryTabbedPane);
        tabbedPane2.add("All", new ChatPanel(player));
        pack();
    }
}
