package Prog.gl.LSP;

public class robotType1 extends robot {
	
	private int position ;

	public robotType1(int position) {
		this.setPosition(position) ;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void avance() {
		this.setPosition(this.getPosition() + 5) ; 
		
	}
	
	

}
