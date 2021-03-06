/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.Open_Close_Box;

/**
 *
 * @author Muraad Khan
 */
public class Open_Close_Box extends javax.swing.JFrame {

    /**
     * Creates new form Open_Close_Box
     */
    public Open_Close_Box() {
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

        Open_Airport_Ok = new javax.swing.JButton();
        Close_tab = new javax.swing.JTabbedPane();
        Air_Panel = new javax.swing.JPanel();
        Combo_Airport = new javax.swing.JComboBox();
        From_lbl = new javax.swing.JLabel();
        Until_lbl = new javax.swing.JLabel();
        Combo_Depart_Time = new javax.swing.JTextField();
        Combo_Arrive_Time = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Air_Panel1 = new javax.swing.JPanel();
        Combo_Airport1 = new javax.swing.JComboBox();
        From_lbl1 = new javax.swing.JLabel();
        Until_lbl1 = new javax.swing.JLabel();
        Combo_Depart_Time1 = new javax.swing.JTextField();
        Combo_Arrive_Time1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Open_Airport_Ok.setText("OK");

        Air_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose Your Airport"));

        Combo_Airport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATL", "DCA", "JFK", "ORL" }));

        From_lbl.setText("From:");

        Until_lbl.setText("Until:");

        jLabel3.setText("Airport:");

        javax.swing.GroupLayout Air_PanelLayout = new javax.swing.GroupLayout(Air_Panel);
        Air_Panel.setLayout(Air_PanelLayout);
        Air_PanelLayout.setHorizontalGroup(
            Air_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Air_PanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(Air_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Air_PanelLayout.createSequentialGroup()
                        .addGroup(Air_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(From_lbl)
                            .addComponent(jLabel3))
                        .addGap(51, 51, 51)
                        .addGroup(Air_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Combo_Depart_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Combo_Arrive_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Air_PanelLayout.createSequentialGroup()
                        .addComponent(Until_lbl)
                        .addGap(63, 63, 63)
                        .addComponent(Combo_Airport, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        Air_PanelLayout.setVerticalGroup(
            Air_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Air_PanelLayout.createSequentialGroup()
                .addGroup(Air_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Air_PanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(From_lbl))
                    .addGroup(Air_PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Air_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Until_lbl)
                            .addComponent(Combo_Airport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Combo_Depart_Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Combo_Arrive_Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        Close_tab.addTab("Open", Air_Panel);

        Air_Panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose Your Airport"));

        Combo_Airport1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATL", "DCA", "JFK", "ORL" }));

        From_lbl1.setText("From:");

        Until_lbl1.setText("Until:");

        jLabel4.setText("Airport:");

        javax.swing.GroupLayout Air_Panel1Layout = new javax.swing.GroupLayout(Air_Panel1);
        Air_Panel1.setLayout(Air_Panel1Layout);
        Air_Panel1Layout.setHorizontalGroup(
            Air_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Air_Panel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(Air_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Air_Panel1Layout.createSequentialGroup()
                        .addGroup(Air_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(From_lbl1)
                            .addComponent(jLabel4))
                        .addGap(51, 51, 51)
                        .addGroup(Air_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Combo_Depart_Time1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Combo_Arrive_Time1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Air_Panel1Layout.createSequentialGroup()
                        .addComponent(Until_lbl1)
                        .addGap(63, 63, 63)
                        .addComponent(Combo_Airport1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        Air_Panel1Layout.setVerticalGroup(
            Air_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Air_Panel1Layout.createSequentialGroup()
                .addGroup(Air_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Air_Panel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(From_lbl1))
                    .addGroup(Air_Panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Air_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Until_lbl1)
                            .addComponent(Combo_Airport1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Combo_Depart_Time1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Combo_Arrive_Time1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        Close_tab.addTab("Close", Air_Panel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Close_tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(Open_Airport_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Close_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Open_Airport_Ok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Open_Close_Box.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Open_Close_Box.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Open_Close_Box.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Open_Close_Box.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Open_Close_Box().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Air_Panel;
    private javax.swing.JPanel Air_Panel1;
    private javax.swing.JTabbedPane Close_tab;
    private javax.swing.JComboBox Combo_Airport;
    private javax.swing.JComboBox Combo_Airport1;
    private javax.swing.JTextField Combo_Arrive_Time;
    private javax.swing.JTextField Combo_Arrive_Time1;
    private javax.swing.JTextField Combo_Depart_Time;
    private javax.swing.JTextField Combo_Depart_Time1;
    private javax.swing.JLabel From_lbl;
    private javax.swing.JLabel From_lbl1;
    private javax.swing.JButton Open_Airport_Ok;
    private javax.swing.JLabel Until_lbl;
    private javax.swing.JLabel Until_lbl1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
