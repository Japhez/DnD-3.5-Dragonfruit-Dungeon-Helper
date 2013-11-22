package HelperApps;

import character.classes.CharacterClass;
import file.manipulation.FileManipulator;
import gui.classes.ClassBuilderDialog;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;

/**
 * An applet used to create and modify character classes for the main program.
 *
 * @author Japhez
 */
public class ClassEditorApp extends javax.swing.JFrame {

    private DefaultListModel model;

    /**
     * Creates new form ClassBuilder
     */
    public ClassEditorApp() {
        initComponents();
        model = (DefaultListModel) classList.getModel();
        //List classes
        String[] savedClasses = FileManipulator.getSavedClasses();
        if (savedClasses != null) {
            for (String s : savedClasses) {
                //Add the name of the file without the extension
                model.addElement(s.replace(".class", ""));
            }
        }
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
        classList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        editClassButton = new javax.swing.JButton();
        addClassButton = new javax.swing.JButton();
        removeClassButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Character Class Editor");
        setLocationByPlatform(true);
        setResizable(false);

        classList.setModel(new DefaultListModel());
        classList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        classList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                classListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(classList);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Classes:");

        editClassButton.setText("Edit Class");
        editClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClassButtonActionPerformed(evt);
            }
        });

        addClassButton.setText("Add Class");
        addClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassButtonActionPerformed(evt);
            }
        });

        removeClassButton.setText("Remove Class");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeClassButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addClassButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editClassButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addClassButton)
                        .addGap(18, 18, 18)
                        .addComponent(editClassButton)
                        .addGap(18, 18, 18)
                        .addComponent(removeClassButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassButtonActionPerformed
        ClassBuilderDialog dialog = new ClassBuilderDialog(this, true);
        dialog.setVisible(true);
        CharacterClass newClass = dialog.getNewClass();
        if (newClass != null) {
            //Serial the class
            FileManipulator.writeClass(newClass);
            //Add to list
            model.addElement(newClass.getName());
        }
    }//GEN-LAST:event_addClassButtonActionPerformed

    private void classListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_classListValueChanged
        //Ignore changing values, just get result
        if (!evt.getValueIsAdjusting()) {
            if (classList.getSelectedValue() != null) {
                editClassButton.setEnabled(true);
                removeClassButton.setEnabled(true);
            } else {
                editClassButton.setEnabled(false);
                removeClassButton.setEnabled(false);
            }
        }
    }//GEN-LAST:event_classListValueChanged

    private void editClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editClassButtonActionPerformed
        String className = (String) classList.getSelectedValue();
        CharacterClass readClass = FileManipulator.readClass(className);
        ClassBuilderDialog classBuilderDialog = new ClassBuilderDialog(this, true, readClass);
        classBuilderDialog.setVisible(true);
        CharacterClass newClass = classBuilderDialog.getNewClass();
        if (newClass != null) {
            //Serial the class
            FileManipulator.writeClass(newClass);
            //Remove old reference
            model.removeElement(className);
            //Add to list
            model.addElement(newClass.getName());
        }
    }//GEN-LAST:event_editClassButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassEditorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FileManipulator.verifiyFileHierarchy();
                new ClassEditorApp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClassButton;
    private javax.swing.JList classList;
    private javax.swing.JButton editClassButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeClassButton;
    // End of variables declaration//GEN-END:variables
}
