package App;
import java.util.*;
public class InputAPI {
	
	private LinkedList<Integer> roadCoords = new LinkedList<Integer>();
	private boolean isTrafficHighGoogle;
	private int remTimeGoogle;
	private int delayTimeConnCar;
	private int trafficConnCar;
	private boolean failedEqp;
	private int timeToEventZone;
	private int[][] routes;
	private int xS,xF,yS,yF;
	
	
	
	
	public int getxS() {
		return xS;
	}
	public void setxS(int xS) {
		this.xS = xS;
	}
	public int getxF() {
		return xF;
	}
	public void setxF(int xF) {
		this.xF = xF;
	}
	public int getyS() {
		return yS;
	}
	public void setyS(int yS) {
		this.yS = yS;
	}
	public int getyF() {
		return yF;
	}
	public void setyF(int yF) {
		this.yF = yF;
	}
	public boolean getisTrafficHighGoogle() {
		return isTrafficHighGoogle;
	}
	public void setTrafficHighGoogle(boolean isTrafficHighGoogle) {
		this.isTrafficHighGoogle = isTrafficHighGoogle;
	}
	public int getRemTimeGoogle() {
		return remTimeGoogle;
	}
	public void setRemTimeGoogle(int remTimeGoogle) {
		this.remTimeGoogle = remTimeGoogle;
	}

	public boolean getFailedEqp() {
		return failedEqp;
	}
	public void setFailedEqp(boolean failedEqp) {
		this.failedEqp = failedEqp;
	}
	public LinkedList<Integer> getRoadCoords() {
		return roadCoords;
	}
	public void setRoadCoords(LinkedList<Integer> roadCoords) {
		this.roadCoords = roadCoords;
	}

	public int getDelayTimeConnCar() {
		return delayTimeConnCar;
	}
	public void setDelayTimeConnCar(int delayTimeConnCar) {
		this.delayTimeConnCar = delayTimeConnCar;
	}
	public int getTrafficConnCar() {
		return trafficConnCar;
	}
	public void setTrafficConnCar(int trafficConnCar) {
		this.trafficConnCar = trafficConnCar;
	}
	public int getTimeToEventZone() {
		return timeToEventZone;
	}
	public void setTimeToEventZone(int timeToEventZone) {
		this.timeToEventZone = timeToEventZone;
	}
	public int[][] getRoutes() {
		int[][] routes = {{0, 1, 2, 6}, {0, 3, 4, 6}, {0, 1, 5, 6}};
		return routes;
	}

	
	
	

}
