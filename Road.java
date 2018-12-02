package App;

public class Road {
	private int number;
	private int xStart;
	private int yStart;
	private int xFinish;
	private int yFinish;
	private int time;
	private int distance;
	private int timeCost;
	private int fuelCost;
	
	
	public Road(int num, int xS, int yS, int xF, int yF) {
		this.setNumber(num);
		this.xStart = xS;
		this.yStart = yS;
		this.xFinish = xF;
		this.yFinish = yF;
	}
	
	
	
	
	public int getDistance() {
		return distance;
	}
	
	public int getTimeCost() {
		return timeCost;
	}

	public void setTimeCost(int timeCost) {
		this.timeCost = timeCost;
	}

	public int get_fuelCost(int distance) {
		int fuelPerKm = 29;
		fuelCost = distance * fuelPerKm;
		
		return fuelCost;
	}
	
	public int get_totalCost() {
		return fuelCost + timeCost;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public int getFuelCost(int fuelCost) {
		return fuelCost;
	}
	
	public void setFuelCost(int fuelCost) {
		this.fuelCost = fuelCost;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public int getxStart() {
		return xStart;
	}

	public void setxStart(int xStart) {
		this.xStart = xStart;
	}

	public int getyStart() {
		return yStart;
	}

	public void setyStart(int yStart) {
		this.yStart = yStart;
	}

	public int getxFinish() {
		return xFinish;
	}

	public void setxFinish(int xFinish) {
		this.xFinish = xFinish;
	}

	public int getyFinish() {
		return yFinish;
	}

	public void setyFinish(int yFinish) {
		this.yFinish = yFinish;
	}

	public int getFuelCost() {
		return fuelCost;
	}




	public int getNumber() {
		return number;
	}




	public void setNumber(int number) {
		this.number = number;
	}

}
