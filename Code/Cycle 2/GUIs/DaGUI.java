/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Craig
 */
public class DaGUI extends javax.swing.JFrame {

    /**
     * Creates new form DaGUI
     */
    public DaGUI() {
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

        selectionPanel = new javax.swing.JPanel();
        originLabel = new javax.swing.JLabel();
        destLabel = new javax.swing.JLabel();
        originBox = new javax.swing.JComboBox();
        destBox = new javax.swing.JComboBox();
        filterLabel = new javax.swing.JLabel();
        findButton = new javax.swing.JButton();
        costLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        airlineLabel = new javax.swing.JLabel();
        costBox = new javax.swing.JComboBox();
        tartus = new javax.swing.JComboBox();
        airlineBox = new javax.swing.JComboBox();
        tablePanel = new javax.swing.JPanel();
        tableScroll = new javax.swing.JScrollPane();
        info = new javax.swing.JTable();
        historyScroll = new javax.swing.JScrollPane();
        history = new javax.swing.JTextArea();
        resultsScroll = new javax.swing.JScrollPane();
        results = new javax.swing.JTextArea();
        daMenu = new javax.swing.JMenuBar();
        fileTab = new javax.swing.JMenu();
        saveOption = new javax.swing.JMenuItem();
        routesTab = new javax.swing.JMenu();
        newRouteOption = new javax.swing.JMenuItem();
        airportsTab = new javax.swing.JMenu();
        openCloseOption = new javax.swing.JMenuItem();
        newAirportOption = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        originLabel.setText("Origin Airport");

        destLabel.setText("Destination Airport");

        originBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Item 1", "Item 2", "Item 3" }));
        originBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originBoxActionPerformed(evt);
            }
        });

        destBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Item 1", "Item 2", "Item 3", "Item 4" }));

        filterLabel.setText("Filters");

        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        costLabel.setText("Cost");

        timeLabel.setText("Time");

        airlineLabel.setText("Airline");

        costBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Least", "Most" }));

        tartus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Shortest", "Longest" }));

        airlineBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout selectionPanelLayout = new javax.swing.GroupLayout(selectionPanel);
        selectionPanel.setLayout(selectionPanelLayout);
        selectionPanelLayout.setHorizontalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(findButton))
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(filterLabel)
                            .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(originLabel)
                                .addComponent(destLabel)
                                .addComponent(costLabel)
                                .addComponent(timeLabel)
                                .addComponent(airlineLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tartus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(costBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(originBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(airlineBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        selectionPanelLayout.setVerticalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(originLabel)
                    .addComponent(originBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destLabel)
                    .addComponent(destBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(filterLabel)
                .addGap(51, 51, 51)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costLabel)
                    .addComponent(costBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel)
                    .addComponent(tartus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlineLabel)
                    .addComponent(airlineBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(findButton)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Route #", "Origin", "Destination", "Departure Time", "Arrival Time", "Airline", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        info.setColumnSelectionAllowed(true);
        info.getTableHeader().setResizingAllowed(false);
        info.getTableHeader().setReorderingAllowed(false);
        tableScroll.setViewportView(info);
        info.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        history.setEditable(false);
        history.setColumns(20);
        history.setRows(5);
        historyScroll.setViewportView(history);

        results.setEditable(false);
        results.setColumns(20);
        results.setLineWrap(true);
        results.setRows(5);
        resultsScroll.setViewportView(results);

        fileTab.setText("File");

        saveOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveOption.setText("Save");
        saveOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveOptionActionPerformed(evt);
            }
        });
        fileTab.add(saveOption);

        daMenu.add(fileTab);

        routesTab.setText("Routes");

        newRouteOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        newRouteOption.setText("Create New Route");
        newRouteOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRouteOptionActionPerformed(evt);
            }
        });
        routesTab.add(newRouteOption);

        daMenu.add(routesTab);

        airportsTab.setText("Airports");

        openCloseOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        openCloseOption.setText("Open/Close Airport");
        openCloseOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCloseOptionActionPerformed(evt);
            }
        });
        airportsTab.add(openCloseOption);

        newAirportOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        newAirportOption.setText("Create New Airport");
        newAirportOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAirportOptionActionPerformed(evt);
            }
        });
        airportsTab.add(newAirportOption);

        daMenu.add(airportsTab);

        setJMenuBar(daMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(selectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultsScroll)))
            .addComponent(historyScroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultsScroll))
                    .addComponent(selectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historyScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents                        

    private void originBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originBoxButtonActionPerformed                                          
        // TODO add your handling code here:
    }//GEN-LAST:event_originBoxButtonActionPerformed                                         

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed                                           
        // TODO add your handling code here:
    }//GEN-LAST:event_findButtonActionPerformed                                          

    private void saveOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOptionButtonActionPerformed                                           
        // TODO add your handling code here:
    }//GEN-LAST:event_saveOptionActionPerformed                                          

    private void newRouteOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRouteOptionActionPerformed                                              
        // TODO add your handling code here:
    }//GEN-LAST:event_newRouteOptionActionPerformed                                              

    private void openCloseOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCloseOptionActionPerformed                                                
        // TODO add your handling code here:
    }//GEN-LAST:event_openCloseOptionActionPerformed                                               

    private void newAirportOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAirportOptionActionPerformed                                                 
        // TODO add your handling code here:
    }//GEN-LAST:event_newAirportOptionActionPerformed                                                

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables                     
    private javax.swing.JComboBox airlineBox;
    private javax.swing.JLabel airlineLabel;
    private javax.swing.JMenu airportsTab;
    private javax.swing.JComboBox costBox;
    private javax.swing.JLabel costLabel;
    private javax.swing.JMenuBar daMenu;
    private javax.swing.JComboBox destBox;
    private javax.swing.JLabel destLabel;
    private javax.swing.JMenu fileTab;
    private javax.swing.JLabel filterLabel;
    private javax.swing.JButton findButton;
    private javax.swing.JTextArea history;
    private javax.swing.JScrollPane historyScroll;
    private javax.swing.JTable info;
    private javax.swing.JMenuItem newAirportOption;
    private javax.swing.JMenuItem newRouteOption;
    private javax.swing.JMenuItem openCloseOption;
    private javax.swing.JComboBox originBox;
    private javax.swing.JLabel originLabel;
    private javax.swing.JTextArea results;
    private javax.swing.JScrollPane resultsScroll;
    private javax.swing.JMenu routesTab;
    private javax.swing.JMenuItem saveOption;
    private javax.swing.JPanel selectionPanel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JComboBox tartus;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables                   
}
