package Prog.gl.LSP;

public class robotStatique /*extends robot*/{ /* on supprime le extends car ca ne respecte pas LSP */
	
	private int position;
	public robotStatique(int position) {
		this.setPosition(position) ; 
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void avance() {
		throw new UnsupportedOperationException();
		
	}
	
	
}
