/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Craig
 */
public class DaGUI extends javax.swing.JFrame {

    /**
     * Creates new form DaGUI
     */
    private Object originAirport;
    private String originString;
    private Object destAirport;
    private String destString;
    Director d;
    //addAirport a = new addAirport();
    
    public DaGUI(Director d) {
    	this.d=d;
        initComponents();
        setLocationRelativeTo(null);
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
        categoriesBox = new javax.swing.JComboBox();
        categoriesLabel = new javax.swing.JLabel();
        subcatigoriesLabel = new javax.swing.JLabel();
        subcategoriesBox = new javax.swing.JComboBox();
        airportValidationLabel = new javax.swing.JLabel();
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
        deleteRouteOption = new javax.swing.JMenuItem();
        airportsTab = new javax.swing.JMenu();
        openCloseOption = new javax.swing.JMenuItem();
        newAirportOption = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Route Planner");
        setName("DaGUI"); // NOI18N
        setResizable(false);

        originLabel.setText("Origin Airport");

        destLabel.setText("Destination Airport");

        originBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "ATL", "ORL", "LAX" }));
        originBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originBoxActionPerformed(evt);
            }
        });

        destBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "ATL", "ORL", "LAX" }));

        filterLabel.setText("Filters");

        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        categoriesBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "Cost", "Airline", "Time" }));
        categoriesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriesBoxActionPerformed(evt);
            }
        });

        categoriesLabel.setText("Categories");

        subcatigoriesLabel.setText("Subcatigories");

        subcategoriesBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----" }));

        javax.swing.GroupLayout selectionPanelLayout = new javax.swing.GroupLayout(selectionPanel);
        selectionPanel.setLayout(selectionPanelLayout);
        selectionPanelLayout.setHorizontalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(findButton))
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(selectionPanelLayout.createSequentialGroup()
                                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(filterLabel)
                                        .addComponent(destLabel))
                                    .addComponent(originLabel))
                                .addGap(18, 18, 18)
                                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(originBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(destBox, 0, 66, Short.MAX_VALUE)))
                            .addComponent(airportValidationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoriesLabel)
                            .addComponent(subcatigoriesLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subcategoriesBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categoriesBox, 0, 66, Short.MAX_VALUE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        selectionPanelLayout.setVerticalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(originBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(originLabel))
                .addGap(63, 63, 63)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destLabel)
                    .addComponent(destBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(airportValidationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(filterLabel)
                .addGap(35, 35, 35)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(categoriesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriesLabel))
                .addGap(46, 46, 46)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subcatigoriesLabel)
                    .addComponent(subcategoriesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
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

        deleteRouteOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        deleteRouteOption.setText("Delete Route");
        deleteRouteOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRouteOptionActionPerformed(evt);
            }
        });
        routesTab.add(deleteRouteOption);

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

private void originBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originBoxActionPerformed
        
        //Pattern p = Pattern.compile("[A-Z]");
        
        //originAirport = originBox.getSelectedItem();
        
        //destBox.addItem(originAirport);
        
       // originString = originAirport.toString();
        
       // Matcher m = p.matcher(originString);
             
       // destBox.removeItem(originAirport);
        
    }//GEN-LAST:event_originBoxActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
       
       originAirport = originBox.getSelectedItem();
       originString = originAirport.toString();
       destAirport = destBox.getSelectedItem();
       destString = destAirport.toString();
       
       
    }//GEN-LAST:event_findButtonActionPerformed

    private void saveOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveOptionActionPerformed

    private void newRouteOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRouteOptionActionPerformed
      // d=a.updateDirector();
       originBox.setModel(new javax.swing.DefaultComboBoxModel(d.getAirports().toArray()));
       new routeFrame(d);
    	//r.setVisible(true);
    	//r.passDirector(d);
    }//GEN-LAST:event_newRouteOptionActionPerformed

    private void openCloseOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCloseOptionActionPerformed
       new Open_Close_Box();
    }//GEN-LAST:event_openCloseOptionActionPerformed

    private void newAirportOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAirportOptionActionPerformed
    	new addAirport(d);
    	   
    }//GEN-LAST:event_newAirportOptionActionPerformed
    
    private void deleteRouteOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRouteOptionActionPerformed
    	new DeleteRoute(d);
        System.out.println(d.getAirports().get(d.getAirports().size()-1).toString());
    }//GEN-LAST:event_deleteRouteOptionActionPerformed

    private void categoriesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriesBoxActionPerformed
        
        if(categoriesBox.getSelectedItem() ==  "Cost"){
            subcategoriesBox.removeAllItems();
            subcategoriesBox.addItem("-----");
            subcategoriesBox.addItem("Lowest");
            subcategoriesBox.addItem("Highest");
        }
        if(categoriesBox.getSelectedItem() == "Time"){
            subcategoriesBox.removeAllItems();
            subcategoriesBox.addItem("-----");
            subcategoriesBox.addItem("Shortest");
            subcategoriesBox.addItem("Longest");
          
        }
        if(categoriesBox.getSelectedItem() == "Airline"){
            subcategoriesBox.removeAllItems();
            subcategoriesBox.addItem("-----");
            subcategoriesBox.addItem("DELTA");  // placeholder for variable containing list of Airlines
            
        }
        if(categoriesBox.getSelectedItem() == "-----"){
            subcategoriesBox.removeAllItems();
            subcategoriesBox.addItem("-----");   
        }
    }//GEN-LAST:event_categoriesBoxActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airportValidationLabel;
    private javax.swing.JMenu airportsTab;
    private javax.swing.JComboBox categoriesBox;
    private javax.swing.JLabel categoriesLabel;
    private javax.swing.JMenuBar daMenu;
    private javax.swing.JMenuItem deleteRouteOption;
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
    private javax.swing.JComboBox subcategoriesBox;
    private javax.swing.JLabel subcatigoriesLabel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JScrollPane tableScroll;
    // End of variables declaration//GEN-END:variables
}
