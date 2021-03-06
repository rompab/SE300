import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

import javax.swing.table.DefaultTableModel;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Craig
 */
public class DaGUI extends javax.swing.JFrame {
	
	
	 // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airportValidationLabel;
    private javax.swing.JMenu airportsTab;
    private javax.swing.JComboBox categoriesBox;
    private javax.swing.JLabel categoriesLabel;
    private javax.swing.JMenuBar daMenu;
    private javax.swing.JMenuItem deleteAirport;
    private javax.swing.JMenuItem deleteRouteOption;
    private javax.swing.JComboBox destBox;
    private javax.swing.JLabel destLabel;
    private javax.swing.JButton destMoreInfo;
    private javax.swing.JMenuItem editRouteOption;
    private javax.swing.JMenu fileTab;
    private javax.swing.JLabel filterLabel;
    private javax.swing.JButton findButton;
    private javax.swing.JTextArea history = new javax.swing.JTextArea();
    private javax.swing.JScrollPane historyScroll;
    private javax.swing.JTable info;
    private javax.swing.JMenuItem newAirportOption;
    private javax.swing.JMenuItem newRouteOption;
    private javax.swing.JMenuItem openCloseOption;
    private javax.swing.JComboBox originBox;
    private javax.swing.JLabel originLabel;
    private javax.swing.JButton originMoreInfo;
    private javax.swing.JTextArea results;
    private javax.swing.JScrollPane resultsScroll;
    private javax.swing.JTable resultsTable;
    private javax.swing.JMenu routesTab;
    private javax.swing.JMenuItem saveOption;
    private javax.swing.JPanel selectionPanel;
    private javax.swing.JComboBox subcategoriesBox;
    private javax.swing.JLabel subcatigoriesLabel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JScrollPane tableScroll1;
    // End of variables declaration//GEN-END:variables
	

	/**
	 * Creates new form DaGUI
	 */
	private Object originAirport;
	private String originString;
	private Object destAirport;
	private String destString;
	Director d = new Director(history);
	Graph g; 
	
	LinkedList <Route> arrivingRoutes = new LinkedList<Route>();
	LinkedList <Route> departingRoutes = new LinkedList<Route>();
	Stack <Node> nodeStack = new Stack<Node>();
	LinkedList<Node> visible = new LinkedList<Node>();
	
	LinkedList <String> airlines = new LinkedList<String>();

	//addAirport a = new addAirport();

	public DaGUI() {
	
		initComponents();
	
		setLocationRelativeTo(null);
		g=new Graph(d);
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
        originMoreInfo = new javax.swing.JButton();
        destMoreInfo = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        tableScroll = new javax.swing.JScrollPane();
        info = new javax.swing.JTable();
        resultsScroll = new javax.swing.JScrollPane();
        results = new javax.swing.JTextArea();
        historyScroll = new javax.swing.JScrollPane();
       // history = new javax.swing.JTextArea();
        tableScroll1 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        daMenu = new javax.swing.JMenuBar();
        fileTab = new javax.swing.JMenu();
        saveOption = new javax.swing.JMenuItem();
        routesTab = new javax.swing.JMenu();
        newRouteOption = new javax.swing.JMenuItem();
        deleteRouteOption = new javax.swing.JMenuItem();
        editRouteOption = new javax.swing.JMenuItem();
        airportsTab = new javax.swing.JMenu();
        openCloseOption = new javax.swing.JMenuItem();
        newAirportOption = new javax.swing.JMenuItem();
        deleteAirport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Route Planner");
        setName("DaGUI"); // NOI18N
        setResizable(false);

        originLabel.setText("Origin Airport");

        destLabel.setText("Destination Airport");

        originBox.setModel(new javax.swing.DefaultComboBoxModel(d.getAirports().toArray()));
        originBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originBoxActionPerformed(evt);
            }
        });

        destBox.setModel(new javax.swing.DefaultComboBoxModel(d.getAirports().toArray()));

        filterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        originMoreInfo.setText("More Info");
        originMoreInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originMoreInfoActionPerformed(evt);
            }
        });

        destMoreInfo.setText("More Info");
        destMoreInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destMoreInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectionPanelLayout = new javax.swing.GroupLayout(selectionPanel);
        selectionPanel.setLayout(selectionPanelLayout);
        selectionPanelLayout.setHorizontalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(airportValidationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addComponent(destLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(destBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addComponent(originLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(originBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(originMoreInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(destMoreInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoriesLabel)
                            .addComponent(subcatigoriesLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoriesBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subcategoriesBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(105, 105, 105))
        );
        selectionPanelLayout.setVerticalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(originBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(originLabel)
                    .addComponent(originMoreInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(destLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(destMoreInfo)
                            .addComponent(destBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(airportValidationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filterLabel)
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(categoriesLabel)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectionPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoriesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectionPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(subcatigoriesLabel))
                    .addComponent(subcategoriesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(findButton)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Route #", "Origin", "Destination", "Dept. Time", "Arrival Time", "Airline", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        info.setAlignmentX(0.0F);
        info.setAlignmentY(0.0F);
        info.setColumnSelectionAllowed(true);
        info.getTableHeader().setResizingAllowed(false);
        info.getTableHeader().setReorderingAllowed(false);
        tableScroll.setViewportView(info);
        info.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        results.setEditable(false);
        results.setColumns(20);
        results.setLineWrap(true);
        results.setRows(5);
        resultsScroll.setViewportView(results);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultsScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
        );

        history.setEditable(false);
        history.setColumns(20);
        history.setRows(5);
        historyScroll.setViewportView(history);

        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Route #", "Origin", "Destination", "Dept. Time", "Arrival Time", "Airline", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        
        for(int i=0;i<d.getAllRoutes().size();i++){

			if ( i+1 < info.getRowCount()-1 )
				( (DefaultTableModel) info.getModel() ).insertRow(i+1,new String[]{Integer.toString(d.getAllRoutes().get(i).getNumber()),d.getAllRoutes().get(i).getOrigin().toString(),
						d.getAllRoutes().get(i).getDestination().toString(),Integer.toString(d.getAllRoutes().get(i).getDepTime()),
						Integer.toString(d.getAllRoutes().get(i).getArrivalTime()),d.getAllRoutes().get(i).getAirline(),"$"+Double.toString(d.getAllRoutes().get(i).getCost())});
			else
				( (DefaultTableModel) info.getModel() ).addRow(new String[]{Integer.toString(d.getAllRoutes().get(i).getNumber()),d.getAllRoutes().get(i).getOrigin().toString(),
						d.getAllRoutes().get(i).getDestination().toString(),Integer.toString(d.getAllRoutes().get(i).getDepTime()),
						Integer.toString(d.getAllRoutes().get(i).getArrivalTime()),d.getAllRoutes().get(i).getAirline(),"$"+Double.toString(d.getAllRoutes().get(i).getCost())});	
			
		}
  
        resultsTable.setAlignmentX(0.0F);
        resultsTable.setAlignmentY(0.0F);
        resultsTable.getTableHeader().setResizingAllowed(false);
        resultsTable.getTableHeader().setReorderingAllowed(false);
        tableScroll1.setViewportView(resultsTable);
        resultsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

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

        editRouteOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        editRouteOption.setText("Edit Route");
        routesTab.add(editRouteOption);

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

        deleteAirport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        deleteAirport.setText("Delete Airport");
        deleteAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAirportActionPerformed(evt);
            }
        });
        airportsTab.add(deleteAirport);

        daMenu.add(airportsTab);

        setJMenuBar(daMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tableScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(historyScroll)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tableScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(selectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historyScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
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

		LinkedList<Route> criteria = new LinkedList<Route>();
		double cost =0;
		
		if(originBox.getSelectedIndex()==destBox.getSelectedIndex()){

			history.append("Invalid! Origin and destination are the same!\n");

		}else{

			originAirport = originBox.getSelectedItem();
			originString = originAirport.toString();
			destAirport = destBox.getSelectedItem();
			destString = destAirport.toString();
			g.draw();
			g.getCheapest(g.getNode((Airport)originAirport), g.getNode((Airport)destAirport));
			/*
			for(int i=0;i<criteria.size();i++){
				cost+=criteria.get(i).getCost();
				
			}
			System.out.println(cost);
			*/
		}   

	}//GEN-LAST:event_findButtonActionPerformed

	private void saveOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOptionActionPerformed
		d.saveMeh();
		history.append("Information saved to savedOutput.txt\n");
	}//GEN-LAST:event_saveOptionActionPerformed

	private void newRouteOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRouteOptionActionPerformed
		new routeFrame(d);
	}//GEN-LAST:event_newRouteOptionActionPerformed

	private void openCloseOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCloseOptionActionPerformed
		new Open_Close_Box(d);
	}//GEN-LAST:event_openCloseOptionActionPerformed

	private void newAirportOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAirportOptionActionPerformed
		new addAirport(d,history);

	}//GEN-LAST:event_newAirportOptionActionPerformed

	private void deleteRouteOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRouteOptionActionPerformed
		new DeleteRoute(d);
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

			LinkedList <String> boxie = new LinkedList<String>();

			for(int i=0;i<d.getAllRoutes().size();i++){

				boxie.add(d.getAllRoutes().get(i).getAirline());


			}

			//LinkedList<String>newBoxies = boxie;

			LinkedList <String> newBoxies = new LinkedList<String>(new HashSet<String>(boxie));

			for(int i=0;i<newBoxies.size();i++){

				subcategoriesBox.addItem(newBoxies.get(i));

			}

		}
		if(categoriesBox.getSelectedItem() == "-----"){
			subcategoriesBox.removeAllItems();
			subcategoriesBox.addItem("-----");   
		}
	}//GEN-LAST:event_categoriesBoxActionPerformed

    private void deleteAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAirportActionPerformed
        new deleteAirport(d);
    }//GEN-LAST:event_deleteAirportActionPerformed

    private void destMoreInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destMoreInfoActionPerformed
    	deleteAllRows((DefaultTableModel) resultsTable.getModel());
    	results.setText("");
    	g.draw();
    	nodeStack.push(g.getNode((Airport)destBox.getSelectedItem()));
    	departingRoutes = g.getDepartingRoutes(g.getNode((Airport) destBox.getSelectedItem()));
    	arrivingRoutes = g.getArrivingRoutes(g.getNode((Airport)destBox.getSelectedItem()));
    	visible = g.getVisibleNodes(g.getNode((Airport) destBox.getSelectedItem()), nodeStack);
    	
    	
    	results.append("Directly reachable Airports: \n");
    	for(int i=0;i<visible.size();i++){
    		
    		results.append(visible.get(i).toString()+"  ");
    		
    		
    	}
    	results.append("\nRoutes that depart from "+destBox.getSelectedItem().toString()+" :\n");
    	
    	for(int i=0;i<departingRoutes.size();i++){
    		
    		results.append(departingRoutes.get(i).getNumber()+"\t");
    		
    	}
    	
    	results.append("\nRoutes that arrive at "+destBox.getSelectedItem().toString()+" :\n");
    	
    	for(int i=0;i<arrivingRoutes.size();i++){
    		
    		results.append(arrivingRoutes.get(i).getNumber()+"\t");
    	}
    	
    	for(int i=0;i<departingRoutes.size();i++){

			if ( i+1 < resultsTable.getRowCount()-1 )
				( (DefaultTableModel) resultsTable.getModel() ).insertRow(i+1,new String[]{Integer.toString(departingRoutes.get(i).getNumber()),departingRoutes.get(i).getOrigin().toString(),
						departingRoutes.get(i).getDestination().toString(),Integer.toString(departingRoutes.get(i).getDepTime()),
						Integer.toString(departingRoutes.get(i).getArrivalTime()),departingRoutes.get(i).getAirline(),"$"+Double.toString(departingRoutes.get(i).getCost())});
			else
				( (DefaultTableModel) resultsTable.getModel() ).addRow(new String[]{Integer.toString(departingRoutes.get(i).getNumber()),departingRoutes.get(i).getOrigin().toString(),
						departingRoutes.get(i).getDestination().toString(),Integer.toString(departingRoutes.get(i).getDepTime()),
						Integer.toString(departingRoutes.get(i).getArrivalTime()),departingRoutes.get(i).getAirline(),"$"+Double.toString(departingRoutes.get(i).getCost())});	
			
		}
    	
    	for(int i=0;i<arrivingRoutes.size();i++){

			if ( i+1 < resultsTable.getRowCount()-1 )
				( (DefaultTableModel) resultsTable.getModel() ).insertRow(i+1,new String[]{Integer.toString(arrivingRoutes.get(i).getNumber()),arrivingRoutes.get(i).getOrigin().toString(),
						arrivingRoutes.get(i).getDestination().toString(),Integer.toString(arrivingRoutes.get(i).getDepTime()),
						Integer.toString(arrivingRoutes.get(i).getArrivalTime()),arrivingRoutes.get(i).getAirline(),"$"+Double.toString(arrivingRoutes.get(i).getCost())});
			else
				( (DefaultTableModel) resultsTable.getModel() ).addRow(new String[]{Integer.toString(arrivingRoutes.get(i).getNumber()),arrivingRoutes.get(i).getOrigin().toString(),
						arrivingRoutes.get(i).getDestination().toString(),Integer.toString(arrivingRoutes.get(i).getDepTime()),
						Integer.toString(arrivingRoutes.get(i).getArrivalTime()),arrivingRoutes.get(i).getAirline(),"$"+Double.toString(arrivingRoutes.get(i).getCost())});	
			
		}
    	
    	
    	arrivingRoutes.clear();
    	departingRoutes.clear();
    	nodeStack.clear();
    	visible.clear();
    	
    	
    
    }//GEN-LAST:event_destMoreInfoActionPerformed

    private void originMoreInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originMoreInfoActionPerformed
    	deleteAllRows((DefaultTableModel) resultsTable.getModel());
    	results.setText("");
    	g.draw();
    	nodeStack.push(g.getNode((Airport)originBox.getSelectedItem()));
    	departingRoutes = g.getDepartingRoutes(g.getNode((Airport) originBox.getSelectedItem()));
    	arrivingRoutes = g.getArrivingRoutes(g.getNode((Airport)originBox.getSelectedItem()));
    	visible = g.getVisibleNodes(g.getNode((Airport) originBox.getSelectedItem()), nodeStack);
    	
    	results.append("Directly reachable Airports: \n");
    	for(int i=0;i<visible.size();i++){
    		
    		results.append(visible.get(i).toString()+"  ");
    		
    		
    	}
    	results.append("\nRoutes that depart from "+originBox.getSelectedItem().toString()+" :\n");
    	
    	for(int i=0;i<departingRoutes.size();i++){
    		
    		results.append(departingRoutes.get(i).getNumber()+"\t");
    		
    	}
    	
    	results.append("\nRoutes that arrive at "+originBox.getSelectedItem().toString()+" :\n");
    	
    	for(int i=0;i<arrivingRoutes.size();i++){
    		
    		results.append(arrivingRoutes.get(i).getNumber()+"\t");
    	}
    	
    	for(int i=0;i<departingRoutes.size();i++){

			if ( i+1 < resultsTable.getRowCount()-1 )
				( (DefaultTableModel) resultsTable.getModel() ).insertRow(i+1,new String[]{Integer.toString(departingRoutes.get(i).getNumber()),departingRoutes.get(i).getOrigin().toString(),
						departingRoutes.get(i).getDestination().toString(),Integer.toString(departingRoutes.get(i).getDepTime()),
						Integer.toString(departingRoutes.get(i).getArrivalTime()),departingRoutes.get(i).getAirline(),"$"+Double.toString(departingRoutes.get(i).getCost())});
			else
				( (DefaultTableModel) resultsTable.getModel() ).addRow(new String[]{Integer.toString(departingRoutes.get(i).getNumber()),departingRoutes.get(i).getOrigin().toString(),
						departingRoutes.get(i).getDestination().toString(),Integer.toString(departingRoutes.get(i).getDepTime()),
						Integer.toString(departingRoutes.get(i).getArrivalTime()),departingRoutes.get(i).getAirline(),"$"+Double.toString(departingRoutes.get(i).getCost())});	
			
		}
    	
    	for(int i=0;i<arrivingRoutes.size();i++){

			if ( i+1 < resultsTable.getRowCount()-1 )
				( (DefaultTableModel) resultsTable.getModel() ).insertRow(i+1,new String[]{Integer.toString(arrivingRoutes.get(i).getNumber()),arrivingRoutes.get(i).getOrigin().toString(),
						arrivingRoutes.get(i).getDestination().toString(),Integer.toString(arrivingRoutes.get(i).getDepTime()),
						Integer.toString(arrivingRoutes.get(i).getArrivalTime()),arrivingRoutes.get(i).getAirline(),"$"+Double.toString(arrivingRoutes.get(i).getCost())});
			else
				( (DefaultTableModel) resultsTable.getModel() ).addRow(new String[]{Integer.toString(arrivingRoutes.get(i).getNumber()),arrivingRoutes.get(i).getOrigin().toString(),
						arrivingRoutes.get(i).getDestination().toString(),Integer.toString(arrivingRoutes.get(i).getDepTime()),
						Integer.toString(arrivingRoutes.get(i).getArrivalTime()),arrivingRoutes.get(i).getAirline(),"$"+Double.toString(arrivingRoutes.get(i).getCost())});	
			
		}
    	
    	
    	arrivingRoutes.clear();
    	departingRoutes.clear();
    	nodeStack.clear();
    	visible.clear();
    	
    	
    }//GEN-LAST:event_originMoreInfoActionPerformed

    
    public static void deleteAllRows(final DefaultTableModel model) {
        for( int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }
    }

   
}
