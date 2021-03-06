package gui.level.up;

import character.Player;
import character.classes.CharacterClass;
import enumerations.AbilityScore;

/**
 * A dialog that guides a player through the process of leveling up, and handles
 * all level-up modifications to the player.
 * 
 * @author Jacob
 */
public class LevelUpDialog extends javax.swing.JDialog {

    private Player player;
    private CharacterClass cc;

    /** Creates new form LevelUpDialog */
    public LevelUpDialog(java.awt.Frame parent, boolean modal, Player player, CharacterClass cc) {
        super(parent, modal);
        this.player = player;
        this.cc = cc;
        initComponents();
        //Set the display of the class and the level transition
        int classLevel = player.getClassInfo().getClassLevel(cc);
        levelToLeveLabel.setText(cc.getName() + " (" + classLevel + " -> " + (classLevel + 1) + ")");
        AbilityScore[] abilityScores = AbilityScore.getAbilityScores();
        //List ability scores
        for (AbilityScore as : abilityScores) {
            abilityScoreComboBox.addItem(as);
        }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rollHitDieButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hitHighestRollLabel = new javax.swing.JLabel();
        hitRollResultLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        unallocatedSkillPointsLabel = new javax.swing.JLabel();
        allocateSkillsButton = new javax.swing.JButton();
        levelToLeveLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        abilityScoreComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        featSelectionButton = new javax.swing.JButton();
        commitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        takeHighestValueButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Level up!");

        jLabel2.setText("Base attack bonus:");

        jLabel3.setText("Automatically improved.");

        jLabel4.setText("Hit die:");

        rollHitDieButton.setText("Roll Hit Die");

        jLabel5.setText("Result:");

        jLabel6.setText("Highest roll:");

        hitHighestRollLabel.setText("jLabel7");

        hitRollResultLabel.setText("jLabel7");

        jLabel7.setText("Unallocated skill points:");

        unallocatedSkillPointsLabel.setText("jLabel8");

        allocateSkillsButton.setText("Allocate Skill Points");

        levelToLeveLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        levelToLeveLabel.setText("[class level transition]");

        jLabel8.setText("Ability Score improvement:");

        jLabel9.setText("New feat:");

        featSelectionButton.setText("Select Feat");

        commitButton.setText("Commit Level Up");
        commitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel Level Up");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        takeHighestValueButton.setText("Take Highest Value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(commitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(levelToLeveLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hitRollResultLabel)
                                            .addComponent(hitHighestRollLabel)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rollHitDieButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(takeHighestValueButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(unallocatedSkillPointsLabel)
                                .addGap(18, 18, 18)
                                .addComponent(allocateSkillsButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(abilityScoreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(featSelectionButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(levelToLeveLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(unallocatedSkillPointsLabel)
                    .addComponent(allocateSkillsButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rollHitDieButton)
                    .addComponent(takeHighestValueButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hitRollResultLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hitHighestRollLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(abilityScoreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(featSelectionButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commitButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void commitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitButtonActionPerformed
        /**
         * Increase BAB (implicit). 
         * Increase saves (implicit). 
         * Gain ability to prepare new spells if eligible. 
         * Gain access to new spells. (Automatically learn available spells if innate)
         */
        player.getClassInfo().levelUp(cc);
        //TODO: Hit die
        //TODO: Skill points
        //TODO: A new feat is selected if the class level % 3 = 0.
        //TODO: A point is added to an AbilityScore if the class level % 4 = 0.
        this.setVisible(false);
    }//GEN-LAST:event_commitButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox abilityScoreComboBox;
    private javax.swing.JButton allocateSkillsButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton commitButton;
    private javax.swing.JButton featSelectionButton;
    private javax.swing.JLabel hitHighestRollLabel;
    private javax.swing.JLabel hitRollResultLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel levelToLeveLabel;
    private javax.swing.JButton rollHitDieButton;
    private javax.swing.JButton takeHighestValueButton;
    private javax.swing.JLabel unallocatedSkillPointsLabel;
    // End of variables declaration//GEN-END:variables
}
