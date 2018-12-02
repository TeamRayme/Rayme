package App;

public class InputUsr {
	
	
	private int xStart, yStart;
	private int xFinal, yFinal;
	private int compansation;
	
	

	public InputUsr(int xS, int yS, int xF, int yF) {
		this.xStart= xS;
		this.xFinal = xF;
		this.yStart = yF;
		this.yFinal = yF;
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



	public int getxFinal() {
		return xFinal;
	}



	public void setxFinal(int xFinal) {
		this.xFinal = xFinal;
	}



	public int getyFinal() {
		return yFinal;
	}



	public void setyFinal(int yFinal) {
		this.yFinal = yFinal;
	}



	public int getCompansation() {
		return compansation;
	}



	public void setCompansation(int compansation) {
		this.compansation = compansation;
	}



	

}
