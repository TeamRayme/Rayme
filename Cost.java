package App;

public class Cost {
	
	
	private int cost1, cost2, cost3;
	
	public int calculate(int route, int timetoEventZone, int delayTimeConnCar, int delayCompensation){
		int change = (delayTimeConnCar - timetoEventZone) * delayCompensation;
		switch(route) {
		case 1:
			return cost1 - change; 
		case 2:
			return cost2 - change;
		case 3:
			return cost3 - change;
		}
		return -1;
	}

	public int getCost1() {
		return cost1;
	}

	public void setCost1(int cost1) {
		this.cost1 = cost1;
	}

	public int getCost2() {
		return cost2;
	}

	public void setCost2(int cost2) {
		this.cost2 = cost2;
	}

	public int getCost3() {
		return cost3;
	}

	public void setCost3(int cost3) {
		this.cost3 = cost3;
	}

}
