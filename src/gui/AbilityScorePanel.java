/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import character.Player;
import character.CharacterAbilityScore;
import character.IntegerVerifier;
import enumerations.AbilityScore;
import gui.abilityscore.AbilityScoreBonusModifierDialog;
import java.util.HashMap;
import javax.swing.JTextField;

/**
 *
 * @author Japhez
 */
public final class AbilityScorePanel extends javax.swing.JPanel
{

    private Player player;

    /**
     * Creates new form AbilityScorePanel
     */
    public AbilityScorePanel(Player player)
    {
        this.player = player;
        initComponents();
        //Set initial ability score values from the player object
        updateVisibleAbilityScoreBase();
        updateVisibleAbilityScoreBonus();
        updateVisibleAbilityScoreTotal();
        updateVisibleAbilityScoreModifiers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        baseValueWis = new javax.swing.JTextField();
        baseValueInt = new javax.swing.JTextField();
        baseValueCon = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        baseValueDex = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        baseValueStr = new javax.swing.JTextField();
        totalDexLabel = new javax.swing.JLabel();
        totalStrLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalChaLabel = new javax.swing.JLabel();
        baseValueCha = new javax.swing.JTextField();
        totalWisLabel = new javax.swing.JLabel();
        bonusValueStr = new javax.swing.JTextField();
        totalConLabel = new javax.swing.JLabel();
        bonusValueDex = new javax.swing.JTextField();
        totalIntLabel = new javax.swing.JLabel();
        bonusValueCon = new javax.swing.JTextField();
        bonusValueInt = new javax.swing.JTextField();
        bonusValueCha = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        bonusValueWis = new javax.swing.JTextField();
        abilityScoreModifyBonusesAndPenaltiesButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        wisModifier = new javax.swing.JLabel();
        intModifier = new javax.swing.JLabel();
        chaModifier = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        dexModifier = new javax.swing.JLabel();
        strModifier = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        conModifier = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();

        baseValueWis.setColumns(2);
        baseValueWis.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        baseValueWis.setText("jTextField1");
        baseValueWis.setInputVerifier(new IntegerVerifier(1,60));
        baseValueWis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                baseValueFieldFocusLost(evt);
            }
        });

        baseValueInt.setColumns(2);
        baseValueInt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        baseValueInt.setText("jTextField1");
        baseValueInt.setInputVerifier(new IntegerVerifier(1,60));
        baseValueInt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                baseValueFieldFocusLost(evt);
            }
        });

        baseValueCon.setColumns(2);
        baseValueCon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        baseValueCon.setText("jTextField1");
        baseValueCon.setInputVerifier(new IntegerVerifier(1,60));
        baseValueCon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                baseValueFieldFocusLost(evt);
            }
        });

        jLabel37.setText("Dexterity");

        baseValueDex.setColumns(2);
        baseValueDex.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        baseValueDex.setText("jTextField1");
        baseValueDex.setInputVerifier(new IntegerVerifier(1,60));
        baseValueDex.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                baseValueFieldFocusLost(evt);
            }
        });

        jLabel41.setText("Charisma");

        jLabel40.setText("Wisdom");

        jLabel39.setText("Constitution");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel56.setText("Ability Score");

        jLabel38.setText("Intelligence");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setText("Base value");

        jLabel36.setText("Strength");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setText("<HTML>Bonuses and <BR>penalties</HTML>");

        baseValueStr.setColumns(2);
        baseValueStr.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        baseValueStr.setText("jTextField1");
        baseValueStr.setInputVerifier(new IntegerVerifier(1,60));
        baseValueStr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                baseValueFieldFocusLost(evt);
            }
        });

        totalDexLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalDexLabel.setText("[total value]");

        totalStrLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalStrLabel.setText("[total value]");

        jLabel9.setText("+");

        jLabel8.setText("=");

        totalChaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalChaLabel.setText("[total value]");

        baseValueCha.setColumns(2);
        baseValueCha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        baseValueCha.setText("jTextField1");
        baseValueCha.setInputVerifier(new IntegerVerifier(1,60));
        baseValueCha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                baseValueFieldFocusLost(evt);
            }
        });

        totalWisLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalWisLabel.setText("[total value]");

        bonusValueStr.setColumns(2);
        bonusValueStr.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bonusValueStr.setText("jTextField13");
        bonusValueStr.setInputVerifier(new IntegerVerifier(-60,60));
        bonusValueStr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bonusValueFieldFocusLost(evt);
            }
        });

        totalConLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalConLabel.setText("[total value]");

        bonusValueDex.setColumns(2);
        bonusValueDex.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bonusValueDex.setText("jTextField14");
        bonusValueDex.setInputVerifier(new IntegerVerifier(-60,60));
        bonusValueDex.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bonusValueFieldFocusLost(evt);
            }
        });

        totalIntLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalIntLabel.setText("[total value]");

        bonusValueCon.setColumns(2);
        bonusValueCon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bonusValueCon.setText("jTextField15");
        bonusValueCon.setInputVerifier(new IntegerVerifier(-60,60));
        bonusValueCon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bonusValueFieldFocusLost(evt);
            }
        });

        bonusValueInt.setColumns(2);
        bonusValueInt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bonusValueInt.setText("jTextField16");
        bonusValueInt.setInputVerifier(new IntegerVerifier(-60,60));
        bonusValueInt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bonusValueFieldFocusLost(evt);
            }
        });

        bonusValueCha.setColumns(2);
        bonusValueCha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bonusValueCha.setText("jTextField18");
        bonusValueCha.setInputVerifier(new IntegerVerifier(-60,60));
        bonusValueCha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bonusValueFieldFocusLost(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel59.setText("Total value");

        bonusValueWis.setColumns(2);
        bonusValueWis.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bonusValueWis.setText("jTextField17");
        bonusValueWis.setInputVerifier(new IntegerVerifier(-60,60));
        bonusValueWis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bonusValueFieldFocusLost(evt);
            }
        });

        abilityScoreModifyBonusesAndPenaltiesButton.setText("Modify Bonuses and Penalties");
        abilityScoreModifyBonusesAndPenaltiesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abilityScoreModifyBonusesAndPenaltiesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel36)
                            .addComponent(jLabel39)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalChaLabel)
                            .addComponent(totalWisLabel)
                            .addComponent(totalIntLabel)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8))
                            .addComponent(totalDexLabel)
                            .addComponent(totalConLabel)
                            .addComponent(totalStrLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addComponent(baseValueCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(baseValueDex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(baseValueStr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(baseValueCha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(baseValueWis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(baseValueInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bonusValueInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bonusValueStr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bonusValueDex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bonusValueCha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bonusValueCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bonusValueWis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(abilityScoreModifyBonusesAndPenaltiesButton))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel56)
                                .addComponent(jLabel59))
                            .addComponent(jLabel8))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(totalStrLabel)
                            .addComponent(baseValueStr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bonusValueStr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(totalDexLabel)
                        .addComponent(baseValueDex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bonusValueDex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(totalConLabel)
                    .addComponent(baseValueCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bonusValueCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(baseValueInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bonusValueInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(totalIntLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalWisLabel)
                    .addComponent(baseValueWis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bonusValueWis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(totalChaLabel)
                    .addComponent(baseValueCha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bonusValueCha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(abilityScoreModifyBonusesAndPenaltiesButton)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ability Score Values", jPanel4);

        wisModifier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        wisModifier.setText("jLabel23");

        intModifier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        intModifier.setText("jLabel23");

        chaModifier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chaModifier.setText("jLabel23");

        jLabel18.setText("Dexterity Modifier");

        jLabel19.setText("Constitution Modifier ");

        jLabel22.setText("Charisma Modifier");

        jLabel20.setText("Intelligence Modifier");

        jLabel21.setText("Wisdom Modifier");

        dexModifier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dexModifier.setText("jLabel23");

        strModifier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        strModifier.setText("jLabel23");

        jLabel17.setText("Strength Modifier ");

        conModifier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        conModifier.setText("jLabel23");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("Ability score modifiers");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(conModifier)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chaModifier))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(strModifier)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(wisModifier))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dexModifier)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(intModifier)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel21)
                            .addComponent(wisModifier)
                            .addComponent(strModifier))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel18))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(intModifier)
                        .addComponent(dexModifier)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(conModifier)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(chaModifier)))))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ability Score Modifiers", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void abilityScoreModifyBonusesAndPenaltiesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_abilityScoreModifyBonusesAndPenaltiesButtonActionPerformed
    {//GEN-HEADEREND:event_abilityScoreModifyBonusesAndPenaltiesButtonActionPerformed
        new AbilityScoreBonusModifierDialog(this, false, player).setVisible(true);
    }//GEN-LAST:event_abilityScoreModifyBonusesAndPenaltiesButtonActionPerformed

    private void baseValueFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_baseValueFieldFocusLost
                JTextField field = (JTextField) evt.getSource();
        IntegerVerifier verifier = (IntegerVerifier) field.getInputVerifier();
        CharacterAbilityScore info = player.getAbilityScore();
        boolean valueChanged = false;
        if (field.equals(baseValueStr) && verifier.isValueChanged())
        {
            info.setBaseAbilityScore(AbilityScore.STRENGTH, Integer.parseInt(baseValueStr.getText()));
            valueChanged = true;
        } else if (field.equals(baseValueDex) && verifier.isValueChanged())
        {
            info.setBaseAbilityScore(AbilityScore.DEXTERITY, Integer.parseInt(baseValueDex.getText()));
            valueChanged = true;
        } else if (field.equals(baseValueCon) && verifier.isValueChanged())
        {
            info.setBaseAbilityScore(AbilityScore.CONSTITUTION, Integer.parseInt(baseValueCon.getText()));
            valueChanged = true;

        } else if (field.equals(baseValueInt) && verifier.isValueChanged())
        {
            info.setBaseAbilityScore(AbilityScore.INTELLIGENCE, Integer.parseInt(baseValueInt.getText()));
            valueChanged = true;

        } else if (field.equals(baseValueWis) && verifier.isValueChanged())
        {
            info.setBaseAbilityScore(AbilityScore.WISDOM, Integer.parseInt(baseValueWis.getText()));
            valueChanged = true;
        } else if (field.equals(baseValueCha) && verifier.isValueChanged())
        {
            info.setBaseAbilityScore(AbilityScore.CHARISMA, Integer.parseInt(baseValueCha.getText()));
            valueChanged = true;
        }
        if (valueChanged)
        {
            updateVisibleAbilityScoreTotal();
            updateVisibleAbilityScoreModifiers();
        }
    }//GEN-LAST:event_baseValueFieldFocusLost

    private void bonusValueFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bonusValueFieldFocusLost
       JTextField field = (JTextField) evt.getSource();
        IntegerVerifier verifier = (IntegerVerifier) bonusValueStr.getInputVerifier();
        CharacterAbilityScore info = player.getAbilityScore();
        boolean valueChanged = false;
        if (field.equals(bonusValueStr) && verifier.isValueChanged())
        {
            info.setBonusAbilityScore(AbilityScore.STRENGTH, Integer.parseInt(bonusValueStr.getText()));
            valueChanged = true;
        } else if (field.equals(bonusValueDex) && verifier.isValueChanged())
        {
            info.setBonusAbilityScore(AbilityScore.DEXTERITY, Integer.parseInt(bonusValueDex.getText()));
            valueChanged = true;
        } else if (field.equals(bonusValueCon) && verifier.isValueChanged())
        {
            info.setBonusAbilityScore(AbilityScore.CONSTITUTION, Integer.parseInt(bonusValueCon.getText()));
            valueChanged = true;

        } else if (field.equals(bonusValueInt) && verifier.isValueChanged())
        {
            info.setBonusAbilityScore(AbilityScore.INTELLIGENCE, Integer.parseInt(bonusValueInt.getText()));
            valueChanged = true;

        } else if (field.equals(bonusValueWis) && verifier.isValueChanged())
        {
            info.setBonusAbilityScore(AbilityScore.WISDOM, Integer.parseInt(bonusValueWis.getText()));
            valueChanged = true;
        } else if (field.equals(bonusValueCha) && verifier.isValueChanged())
        {
            info.setBonusAbilityScore(AbilityScore.CHARISMA, Integer.parseInt(bonusValueCha.getText()));
            valueChanged = true;
        }
        if (valueChanged)
        {
            updateVisibleAbilityScoreTotal();
            updateVisibleAbilityScoreModifiers();
        }
    }//GEN-LAST:event_bonusValueFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abilityScoreModifyBonusesAndPenaltiesButton;
    private javax.swing.JTextField baseValueCha;
    private javax.swing.JTextField baseValueCon;
    private javax.swing.JTextField baseValueDex;
    private javax.swing.JTextField baseValueInt;
    private javax.swing.JTextField baseValueStr;
    private javax.swing.JTextField baseValueWis;
    private javax.swing.JTextField bonusValueCha;
    private javax.swing.JTextField bonusValueCon;
    private javax.swing.JTextField bonusValueDex;
    private javax.swing.JTextField bonusValueInt;
    private javax.swing.JTextField bonusValueStr;
    private javax.swing.JTextField bonusValueWis;
    private javax.swing.JLabel chaModifier;
    private javax.swing.JLabel conModifier;
    private javax.swing.JLabel dexModifier;
    private javax.swing.JLabel intModifier;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel strModifier;
    private javax.swing.JLabel totalChaLabel;
    private javax.swing.JLabel totalConLabel;
    private javax.swing.JLabel totalDexLabel;
    private javax.swing.JLabel totalIntLabel;
    private javax.swing.JLabel totalStrLabel;
    private javax.swing.JLabel totalWisLabel;
    private javax.swing.JLabel wisModifier;
    // End of variables declaration//GEN-END:variables

    /**
     * Updates the base ability score labels in the ability score tab. It
     * retrieves a reference to the base ability score HashMap, then gets each
     * value from it.
     */
    public void updateVisibleAbilityScoreBase()
    {
        //Set all 6 labels for the base stats
        HashMap<AbilityScore, Integer> base = player.getAbilityScore().getAbilityScoresBases();
        baseValueStr.setText(base.get(AbilityScore.STRENGTH).toString());
        baseValueDex.setText(base.get(AbilityScore.DEXTERITY).toString());
        baseValueCon.setText(base.get(AbilityScore.CONSTITUTION).toString());
        baseValueInt.setText(base.get(AbilityScore.INTELLIGENCE).toString());
        baseValueWis.setText(base.get(AbilityScore.WISDOM).toString());
        baseValueCha.setText(base.get(AbilityScore.CHARISMA).toString());
    }

    /**
     * Updates the bonus ability score labels in the ability score tab. It
     * retrieves a reference to the bonus ability score HashMap, then gets each
     * value from it.
     */
    public void updateVisibleAbilityScoreBonus()
    {
        //Set all 6 labels for the bonus stats
        HashMap<AbilityScore, Integer> bonus = player.getAbilityScore().getAbilityScoresBonuses();
        bonusValueStr.setText(bonus.get(AbilityScore.STRENGTH).toString());
        bonusValueDex.setText(bonus.get(AbilityScore.DEXTERITY).toString());
        bonusValueCon.setText(bonus.get(AbilityScore.CONSTITUTION).toString());
        bonusValueInt.setText(bonus.get(AbilityScore.INTELLIGENCE).toString());
        bonusValueWis.setText(bonus.get(AbilityScore.WISDOM).toString());
        bonusValueCha.setText(bonus.get(AbilityScore.CHARISMA).toString());
    }

    /**
     * Updates the total ability score labels in the ability score tab. It
     * retrieves each base and bonus values from the player and adds them before
     * displaying the result.
     */
    public void updateVisibleAbilityScoreTotal()
    {
        CharacterAbilityScore info = player.getAbilityScore();
        totalStrLabel.setText(""
                + (info.getAbilityScoreBaseValue(AbilityScore.STRENGTH)
                + info.getAbilityScoreBonusValue(AbilityScore.STRENGTH)));
        totalDexLabel.setText(""
                + (info.getAbilityScoreBaseValue(AbilityScore.DEXTERITY)
                + info.getAbilityScoreBonusValue(AbilityScore.DEXTERITY)));
        totalConLabel.setText(""
                + (info.getAbilityScoreBaseValue(AbilityScore.CONSTITUTION)
                + info.getAbilityScoreBonusValue(AbilityScore.CONSTITUTION)));
        totalIntLabel.setText(""
                + (info.getAbilityScoreBaseValue(AbilityScore.INTELLIGENCE)
                + info.getAbilityScoreBonusValue(AbilityScore.INTELLIGENCE)));
        totalWisLabel.setText(""
                + (info.getAbilityScoreBaseValue(AbilityScore.WISDOM)
                + info.getAbilityScoreBonusValue(AbilityScore.WISDOM)));
        totalChaLabel.setText(""
                + (info.getAbilityScoreBaseValue(AbilityScore.CHARISMA)
                + info.getAbilityScoreBonusValue(AbilityScore.CHARISMA)));
    }

    /**
     * Sets the character information ability score modifier text.
     */
    public void updateVisibleAbilityScoreModifiers()
    {
        CharacterAbilityScore score = player.getAbilityScore();
        strModifier.setText("" + score.getAbilityScoreModifier(AbilityScore.STRENGTH));
        dexModifier.setText("" + score.getAbilityScoreModifier(AbilityScore.DEXTERITY));
        conModifier.setText("" + score.getAbilityScoreModifier(AbilityScore.CONSTITUTION));
        intModifier.setText("" + score.getAbilityScoreModifier(AbilityScore.INTELLIGENCE));
        wisModifier.setText("" + score.getAbilityScoreModifier(AbilityScore.WISDOM));
        chaModifier.setText("" + score.getAbilityScoreModifier(AbilityScore.CHARISMA));
    }
}