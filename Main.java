package App;
 
import java.io.FileReader;
import java.util.Iterator;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.*;


public class Main {

	public static void main(String[] args) {

		Truck truck = new Truck();
		truck.setCompensation(1000);
		
		Cost cost = new Cost();
		InputAPI inputapi = new InputAPI();
		
		LinkedList<Road> roads = new LinkedList<Road>();

		int[][] routes = inputapi.getRoutes();
		
		for(int i = 0; i < checkpoints; i++) {
			
			roads.add(new Road(i, inputapi.getxS(), inputapi.getyS(), inputapi.getxF(), inputapi.getyF())); 
		}
		
		while(truck.getX() != inputapi.getxF() && truck.getY() != inputapi.getxS()){
			
			truck.setX(roads.get(0).getxStart());
			truck.setY(roads.get(0).getyStart());
			
			System.out.println("The truck starts its travel from " + truck.getX() + ", " + truck.getY());

			
			if(inputapi.getisTrafficHighGoogle()) {
			System.out.println("The truck had ");
				switch(inputapi.getTrafficConnCar()) {
					case 0:
						inputapi.setDelayTimeConnCar(15);
						cost.calculate(inputapi.getRouteNum(), inputapi.getTimeToEventZone(), inputapi.getDelayTimeConnCar(),
								truck.getCompensation());
						break;
					case -1:
					
					
					////etga did this part
					case 1: case 2: case 3: case 4: case 5: 
					case 6: case 7: case 8: case 9: case 10:
						inputapi.setTrafficConnCar(trafficConnCar);
						cost.calculate(route, timetoEventZone, delayTimeConnCar, delayCompensation)
						
								}
		}
		
		
		
		
		
		
		
	}

}}
