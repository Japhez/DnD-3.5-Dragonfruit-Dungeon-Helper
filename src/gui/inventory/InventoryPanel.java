package gui.inventory;

import character.Player;
import character.inventory.Item;
import file.manipulation.FileManipulator;
import interfaces.CharacterInfoRetriever;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Japhez
 */
public class InventoryPanel extends javax.swing.JPanel implements CharacterInfoRetriever {

    private Player player;
    private DefaultListModel itemListModel;

    /**
     * Creates new form InventoryPanel
     */
    public InventoryPanel(Player player) {
        this.player = player;
        this.itemListModel = player.getInventory().getItemListModel();
        initComponents();
        inventoryList.setModel(player.getInventory().getItemListModel());
        //Info should be hidden by default, since no item is selected
        itemInfoPanel.setVisible(false);
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
        inventoryList = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        addNewItemButton = new javax.swing.JButton();
        currentWeightLabel = new javax.swing.JLabel();
        itemInfoPanel = new javax.swing.JPanel();
        currentlySelectedItemNameLabel = new javax.swing.JLabel();
        currentlySelectedItemWeightLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        currentlySelectedItemDescriptionTextArea = new javax.swing.JTextArea();
        modifyCurrentlySelectedItemButton = new javax.swing.JButton();
        activateCurrentlySelectedItemButton = new javax.swing.JButton();
        exportItemButton = new javax.swing.JButton();
        importItemButton = new javax.swing.JButton();
        removeSelectedItem = new javax.swing.JButton();

        inventoryList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        inventoryList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                inventoryListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(inventoryList);

        jLabel3.setText("Current Inventory");

        addNewItemButton.setText("Add New Item");
        addNewItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewItemButtonActionPerformed(evt);
            }
        });

        currentWeightLabel.setText("Inventory Weight: 0 ");

        currentlySelectedItemNameLabel.setText("[item name]");

        currentlySelectedItemWeightLabel.setText("[item weight]");

        jLabel7.setText("Item name:");

        jLabel11.setText("Item description:");

        jLabel35.setText("Item weight:");

        currentlySelectedItemDescriptionTextArea.setEditable(false);
        currentlySelectedItemDescriptionTextArea.setColumns(20);
        currentlySelectedItemDescriptionTextArea.setLineWrap(true);
        currentlySelectedItemDescriptionTextArea.setRows(5);
        currentlySelectedItemDescriptionTextArea.setWrapStyleWord(true);
        currentlySelectedItemDescriptionTextArea.setAutoscrolls(false);
        currentlySelectedItemDescriptionTextArea.setBorder(null);
        jScrollPane5.setViewportView(currentlySelectedItemDescriptionTextArea);

        javax.swing.GroupLayout itemInfoPanelLayout = new javax.swing.GroupLayout(itemInfoPanel);
        itemInfoPanel.setLayout(itemInfoPanelLayout);
        itemInfoPanelLayout.setHorizontalGroup(
            itemInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addGroup(itemInfoPanelLayout.createSequentialGroup()
                        .addGroup(itemInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(itemInfoPanelLayout.createSequentialGroup()
                                .addGroup(itemInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel35))
                                .addGap(38, 38, 38)
                                .addGroup(itemInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(currentlySelectedItemWeightLabel)
                                    .addComponent(currentlySelectedItemNameLabel))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        itemInfoPanelLayout.setVerticalGroup(
            itemInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentlySelectedItemNameLabel)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(itemInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentlySelectedItemWeightLabel)
                    .addComponent(jLabel35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        modifyCurrentlySelectedItemButton.setText("Modify Item");
        modifyCurrentlySelectedItemButton.setEnabled(false);
        modifyCurrentlySelectedItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyCurrentlySelectedItemButtonActionPerformed(evt);
            }
        });

        activateCurrentlySelectedItemButton.setText("Activate Item");
        activateCurrentlySelectedItemButton.setEnabled(false);

        exportItemButton.setText("Export Item");
        exportItemButton.setEnabled(false);
        exportItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportItemButtonActionPerformed(evt);
            }
        });

        importItemButton.setText("Import Item");
        importItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importItemButtonActionPerformed(evt);
            }
        });

        removeSelectedItem.setText("Remove Item");
        removeSelectedItem.setEnabled(false);
        removeSelectedItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSelectedItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currentWeightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addNewItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifyCurrentlySelectedItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activateCurrentlySelectedItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeSelectedItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exportItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(importItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(itemInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removeSelectedItem)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(importItemButton))
                                    .addComponent(exportItemButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(currentWeightLabel)
                                .addGap(18, 18, 18)
                                .addComponent(activateCurrentlySelectedItemButton)
                                .addGap(18, 18, 18)
                                .addComponent(modifyCurrentlySelectedItemButton)
                                .addGap(18, 18, 18)
                                .addComponent(addNewItemButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inventoryListValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_inventoryListValueChanged
    {//GEN-HEADEREND:event_inventoryListValueChanged
        if (!evt.getValueIsAdjusting()) {
            if (inventoryList.getSelectedValue() != null) {
                updateInventoryDisplayedInfo();
                activateCurrentlySelectedItemButton.setEnabled(true);
                modifyCurrentlySelectedItemButton.setEnabled(true);
                removeSelectedItem.setEnabled(true);
                exportItemButton.setEnabled(true);
            } else {
                activateCurrentlySelectedItemButton.setEnabled(false);
                modifyCurrentlySelectedItemButton.setEnabled(false);
                removeSelectedItem.setEnabled(false);
                exportItemButton.setEnabled(false);
            }
        }
    }//GEN-LAST:event_inventoryListValueChanged

    private void addNewItemButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addNewItemButtonActionPerformed
    {//GEN-HEADEREND:event_addNewItemButtonActionPerformed
        new InventoryAddNewItemDialog(this, false, player).setVisible(true);
    }//GEN-LAST:event_addNewItemButtonActionPerformed

    private void removeSelectedItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_removeSelectedItemActionPerformed
    {//GEN-HEADEREND:event_removeSelectedItemActionPerformed
        player.getInventory().getItemListModel().removeElement(inventoryList.getSelectedValue());
        updateInventoryDisplayedTotalWeight();
    }//GEN-LAST:event_removeSelectedItemActionPerformed

    private void modifyCurrentlySelectedItemButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_modifyCurrentlySelectedItemButtonActionPerformed
    {//GEN-HEADEREND:event_modifyCurrentlySelectedItemButtonActionPerformed
        if (!inventoryList.isSelectionEmpty()) {
            new InventoryModifyItemDialog(this, false, (Item) inventoryList.getSelectedValue()).setVisible(true);
        }
    }//GEN-LAST:event_modifyCurrentlySelectedItemButtonActionPerformed

    private void exportItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportItemButtonActionPerformed
        FileManipulator.writeItem((Item) inventoryList.getSelectedValue());
        JOptionPane.showMessageDialog(this, "Export successful!", "Export", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_exportItemButtonActionPerformed

    private void importItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importItemButtonActionPerformed
        Item userSelectItem = FileManipulator.userSelectItem();
        if (userSelectItem != null) {
            //TODO: Move inventory adding into the actual class
            itemListModel.addElement(userSelectItem);
        }
    }//GEN-LAST:event_importItemButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activateCurrentlySelectedItemButton;
    private javax.swing.JButton addNewItemButton;
    private javax.swing.JLabel currentWeightLabel;
    private javax.swing.JTextArea currentlySelectedItemDescriptionTextArea;
    private javax.swing.JLabel currentlySelectedItemNameLabel;
    private javax.swing.JLabel currentlySelectedItemWeightLabel;
    private javax.swing.JButton exportItemButton;
    private javax.swing.JButton importItemButton;
    private javax.swing.JList inventoryList;
    private javax.swing.JPanel itemInfoPanel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton modifyCurrentlySelectedItemButton;
    private javax.swing.JButton removeSelectedItem;
    // End of variables declaration//GEN-END:variables

    public void updateInventoryDisplayedInfo() {
        //If the selection is empty, hide descriptor fields
        if (inventoryList.isSelectionEmpty()) {
            itemInfoPanel.setVisible(false);
        } else {
            if (!itemInfoPanel.isVisible()) {
                itemInfoPanel.setVisible(true);
            }
            Item item = (Item) inventoryList.getSelectedValue();
            currentlySelectedItemDescriptionTextArea.setText(item.getDescription());
            currentlySelectedItemNameLabel.setText(item.getName());
            currentlySelectedItemWeightLabel.setText("" + item.getWeight());
        }
    }

    public void updateInventoryDisplayedTotalWeight() {
        currentWeightLabel.setText("Current weight: " + player.getInventory().getInventoryWeight());
    }

    @Override
    public void loadInfo() {
        updateInventoryDisplayedInfo();
        updateInventoryDisplayedTotalWeight();
    }
}