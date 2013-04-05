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
public class routeFrame extends javax.swing.JFrame {

    /**
     * Creates new form Routes
     */
    private String routeNumber;
    private String originAirport;
    private String destinationAirport;
    private String departText;
    private int departTime;
    private String arrivalText;
    private int arrivalTime;
    private String airlineString;
    private String costString;
    private double costDouble;
    private boolean departure;
    private boolean arrival;
    private boolean airports;
    private boolean times;
    private boolean airline;
    private boolean cost;
    private int flightDifference;
    
    Director d;
    
    public routeFrame(Director d) {
        this.d = d;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        routePanel = new javax.swing.JPanel();
        intructionsLabel = new javax.swing.JLabel();
        routeNumberText = new javax.swing.JTextField();
        routeNumberLabel = new javax.swing.JLabel();
        originLabel = new javax.swing.JLabel();
        destinationLabel = new javax.swing.JLabel();
        departLabel = new javax.swing.JLabel();
        departTimeText = new javax.swing.JTextField();
        arrivalLabel = new javax.swing.JLabel();
        arrivalTimeText = new javax.swing.JTextField();
        airlineLabel = new javax.swing.JLabel();
        costLabel = new javax.swing.JLabel();
        costText = new javax.swing.JTextField();
        acceptButton = new javax.swing.JButton();
        departValidationLabel = new javax.swing.JLabel();
        arrivalValidationLabel = new javax.swing.JLabel();
        costValidationLabel = new javax.swing.JLabel();
        originBox = new javax.swing.JComboBox();
        destinationBox = new javax.swing.JComboBox();
        airlineText = new javax.swing.JTextField();
        airlineValidationLabel = new javax.swing.JLabel();
        airportValidationLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Route");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(700, 250));
        setResizable(false);

        intructionsLabel.setText("Please Input The Route Information");

        routeNumberText.setEditable(false);
	routeNumberText.setText(Integer.toString(d.getAllRoutes().getLast().getNumber()+1));
        routeNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeNumberTextActionPerformed(evt);
            }
        });

        routeNumberLabel.setText("Route #");

        originLabel.setText("Origin");

        destinationLabel.setText("Destination");

        departLabel.setText("Depart Time");

        arrivalLabel.setText("Arrival Time");

        airlineLabel.setText("Airline");

        costLabel.setText("Cost");

        costText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        acceptButton.setText("Accept");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        departValidationLabel.setText("            ");

        arrivalValidationLabel.setText("           ");

        costValidationLabel.setText("           ");

        originBox.setModel(new javax.swing.DefaultComboBoxModel(d.getAirports().toArray()));
        originBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originBoxActionPerformed(evt);
            }
        });

        destinationBox.setModel(new javax.swing.DefaultComboBoxModel(d.getAirports().toArray()));

        airlineValidationLabel.setText("     ");

        javax.swing.GroupLayout routePanelLayout = new javax.swing.GroupLayout(routePanel);
        routePanel.setLayout(routePanelLayout);
        routePanelLayout.setHorizontalGroup(
            routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, routePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(intructionsLabel)
                .addGap(239, 239, 239))
            .addGroup(routePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(routeNumberLabel)
                    .addComponent(routeNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(routePanelLayout.createSequentialGroup()
                        .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(originLabel)
                            .addComponent(originBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(destinationLabel)
                            .addComponent(destinationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(airportValidationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acceptButton)
                    .addGroup(routePanelLayout.createSequentialGroup()
                        .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(departLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(departTimeText)
                            .addComponent(departValidationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arrivalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arrivalTimeText)
                            .addComponent(arrivalValidationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(airlineLabel)
                            .addComponent(airlineText)
                            .addComponent(airlineValidationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(costLabel)
                            .addComponent(costText, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(costValidationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        routePanelLayout.setVerticalGroup(
            routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(routePanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(intructionsLabel)
                .addGap(18, 18, 18)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeNumberLabel)
                    .addComponent(originLabel)
                    .addComponent(destinationLabel)
                    .addComponent(departLabel)
                    .addComponent(arrivalLabel)
                    .addComponent(airlineLabel)
                    .addComponent(costLabel))
                .addGap(18, 18, 18)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(originBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airlineText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(routePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departValidationLabel)
                    .addComponent(arrivalValidationLabel)
                    .addComponent(costValidationLabel)
                    .addComponent(airlineValidationLabel)
                    .addComponent(airportValidationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(acceptButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(routePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(routePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void routeNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routeNumberTextActionPerformed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
       
        Pattern p = Pattern.compile("[A-Z]+");
       
        Matcher m = p.matcher(airlineText.getText());
        
        if(m.matches()){
             airlineValidationLabel.setText("Valid");
             airline = true;
        }
        else{
            airlineValidationLabel.setText("Invalid");
        }
        
        Pattern q = Pattern.compile("[0-9]{4}");      
        
        
                
        Matcher o = q.matcher(departTimeText.getText());
        
        
            
        if(o.matches()){
        
        departText = departTimeText.getText();
           
        departTime = Integer.parseInt(departText);
            
            if(0000 < departTime && departTime < 2400){
                
                departure = true; 
                               
            }
            
       }
        else{
            departValidationLabel.setText("Invalid");
        }
        
        Matcher n = q.matcher(arrivalTimeText.getText());
        
        
        
        if(n.matches()){
        
        arrivalText = arrivalTimeText.getText();
           
        arrivalTime = Integer.parseInt(arrivalText); 
        
            if(0000 < arrivalTime && arrivalTime < 2400){
            
                arrival = true;
            }
            
        }
        else{
            arrivalValidationLabel.setText("Invalid");
        }
        
        Pattern k = Pattern.compile("[0-9]+\\.+[0-9]*");
        
        Matcher l = k.matcher(costText.getText());
        
        if(l.matches()){
            costString = costText.getText();
            costDouble = Double.parseDouble(costString);
            costValidationLabel.setText("Valid");
            cost = true;
        }
        else{
            costValidationLabel.setText("Invalid");
        }
        if(departure == true && arrival == true){
            flightDifference = arrivalTime - departTime;
            if(flightDifference >= 30){
              
                departValidationLabel.setText("Valid");
                arrivalValidationLabel.setText("Valid");
                
                times = true;
            }
            else{
            
             departValidationLabel.setText("Invalid");
             arrivalValidationLabel.setText("Invalid");
            }    
        }
        else{
            
       departValidationLabel.setText("Invalid");
       arrivalValidationLabel.setText("Invalid");
        }    
        
        if(originBox.getSelectedItem() == destinationBox.getSelectedItem()){
            airportValidationLabel.setText("Origin or Destination Invalid");
            
        }
        else{
            airportValidationLabel.setText("Valid");
            airports = true;
        }
        
        if(cost == true && airports == true && times == true && airline == true){
            
        	d.addRoute(new Route(Integer.parseInt(routeNumberText.getText()), airlineText.getText(), new Node(originBox.getSelectedItem().toString()), departTime, new Node(destinationBox.getSelectedItem().toString()), arrivalTime, costDouble));
            System.out.println("Added!");
        }
        
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void originBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originBoxActionPerformed
       
    }//GEN-LAST:event_originBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void setRouteNumber(String routeNumber){
        routeNumber = this.routeNumber;
        
        routeNumberText.setText(routeNumber);
    }
    public String getRouteNumber(){
        
        return routeNumber;
    }
    public String getOrigin(){
        this.originAirport = originBox.getSelectedItem().toString();
       
            return originAirport;
    }
    public String getDestination(){
        this.destinationAirport = destinationBox.getSelectedItem().toString();
       
            return destinationAirport;
        
    }
    public int getDepartTime(){
       this.departText = departTimeText.getText();
       
       this.departTime = Integer.parseInt(departText);
       
       
       return departTime;
    }
    public int getArrivalTime(){
       this.arrivalText = arrivalTimeText.getText();
       
       this.arrivalTime = Integer.parseInt(arrivalText);
       
        return arrivalTime;
    }
    public String getAirline(){
        this.airlineString = airlineText.getText();
        
        return airlineString;
    }
    public double getCost(){
        this.costString = costText.getText();
        
        this.costDouble = Double.parseDouble(costString);
        
        return costDouble;
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JLabel airlineLabel;
    private javax.swing.JTextField airlineText;
    private javax.swing.JLabel airlineValidationLabel;
    private javax.swing.JLabel airportValidationLabel;
    private javax.swing.JLabel arrivalLabel;
    private javax.swing.JTextField arrivalTimeText;
    private javax.swing.JLabel arrivalValidationLabel;
    private javax.swing.JLabel costLabel;
    private javax.swing.JTextField costText;
    private javax.swing.JLabel costValidationLabel;
    private javax.swing.JLabel departLabel;
    private javax.swing.JTextField departTimeText;
    private javax.swing.JLabel departValidationLabel;
    private javax.swing.JComboBox destinationBox;
    private javax.swing.JLabel destinationLabel;
    private javax.swing.JLabel intructionsLabel;
    private javax.swing.JComboBox originBox;
    private javax.swing.JLabel originLabel;
    private javax.swing.JLabel routeNumberLabel;
    private javax.swing.JTextField routeNumberText;
    private javax.swing.JPanel routePanel;
    // End of variables declaration//GEN-END:variables
}
