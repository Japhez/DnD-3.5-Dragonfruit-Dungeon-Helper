/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.chat;

import java.awt.Desktop;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JToolTip;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/**
 *
 * @author labtech
 */
public class AdvancedChatPanel extends javax.swing.JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new AdvancedChatPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Creates new form AdvancedChatPanel
     */
    public AdvancedChatPanel() {
        initComponents();
        //Handles hyperlink behavior
        jEditorPane1.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ENTERED) {
                    if (Desktop.isDesktopSupported()) {
//                        try {
                            JToolTip tooltip = new JToolTip();
                            tooltip.setTipText("Flawless execution.");
                            tooltip.setVisible(true);
                            //Opens in browser
//                            Desktop.getDesktop().browse(e.getURL().toURI());
//                        } catch (IOException | URISyntaxException e1) {
//                            // TODO Auto-generated catch block
//                            e1.printStackTrace();
//                        }
                    }
                }
            }
        });
        //Allows HTML to be used
        jEditorPane1.setEditorKit(JEditorPane.createEditorKitForContentType("text/html"));
        //Sets HTML text to test
        jEditorPane1.setText("<a href=\"http://google.com\" title=\"Here's the tooltip info\"> Literal text</a> ");
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
        jEditorPane1 = new javax.swing.JEditorPane();
        commandBarField = new javax.swing.JTextField();

        jEditorPane1.setEditable(false);
        jScrollPane1.setViewportView(jEditorPane1);

        commandBarField.setText("[type /help for commands]");
        commandBarField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(commandBarField))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(commandBarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField commandBarField;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
