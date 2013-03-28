
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileInput{

	LinkedList<Route> Routes;
	ArrayList<Airport> Airports;
	
   public FileInput() throws IOException{
        
        BufferedReader br = null;
        String line = null;
        
        Airports = new ArrayList<Airport>();
        Routes = new LinkedList<Route>();
        
        
        try{
           br = new BufferedReader(
                     new FileReader("input.txt"));
    
        }catch(FileNotFoundException e){
        	
        	System.out.println("File not found!");
        	
        }

			 line = br.readLine();
		

			 String regex = "R(\\d{3})\\W*([A-Z]+)\\W*([A-Z]{3})\\W*([0-9]{4})\\W*([A-Z]{3})\\W*([0-9]{4})\\W*([0-9]*\\.*[0-9]*).*";
			 Pattern pattern = Pattern.compile(regex);
			 String regexClose = "([A-Z]{3})\\W*([0-9]{4})\\W*([0-9]{4}).*";
			 Pattern patternClose = Pattern.compile(regexClose);
			 
			 
           while(line != null){
        	   Matcher matcher = pattern.matcher(line);
        	   Matcher matcherClose = patternClose.matcher(line);
        	   if(!line.contains("#")){
        		   if(line.length()==3 && !line.matches("[0-9]+")){
  
        			Airports.add(new Airport(true,line,0,0));
        			   
        		   }
        		   
        	   		if(matcher.matches()){
                			if(Integer.parseInt(matcher.group(3))>Integer.parseInt(matcher.group(6))){
	
					Sysem.out.println("The flight departs before it arrives!");
						
					}
        	   			else if(Integer.parseInt(matcher.group(6))-Integer.parseInt(matcher.group(3))>30){
					
					System.out.println("The flight duration is less than 30 minutes!");	
					
					}
					
					else{
        	   			
					Routes.add(new Route(Integer.parseInt(matcher.group(1)),matcher.group(2).toUpperCase(), new Node(matcher.group(3)), Integer.parseInt(matcher.group(4)), new Node(matcher.group(5)), Integer.parseInt(matcher.group(6)),Double.parseDouble(matcher.group(7))));
					
					}
        	   		}
        	   		if(matcherClose.matches()){
        	   			
        	   			for(int i=0;i<Airports.size();i++){
        	   				
        	   				if(matcherClose.group(1).matches(Airports.get(i).getCode())){
        	   					
        	   					Airports.get(i).setCloseBegin(Integer.parseInt(matcherClose.group(2)));
        	   					Airports.get(i).setCloseEnd(Integer.parseInt(matcherClose.group(3)));
        	   					
        	   				}
        	   				
        	   			}
        	   			
        	   		}
        	   		
        	   		
        	   }
                   line = br.readLine();
           }

           br.close();
  
        
   } //constructor
   
public LinkedList<Route> getRoutes(){
	  
	  return Routes;
  }

public ArrayList<Airport> getAirports(){
	
	return Airports;
}
   
} //class