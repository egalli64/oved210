package alessandraB.mar01;

public class Base {
	protected int x; // il fatto che siano private vuol dire che non posso accederli direttamente. L'
					// accesso a x io ce l'ho, ma per accedervi mi serve il getter o il setter
					// (su un altra classe posso settare x a un determinato valore).
	protected String y;
	

	public Base(int x, String y) {
		this.x = x;
		this.y = y;
	}
// getter and setter sono metodi base che mi permettono di accedere alle mie proprietà.

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	@Override   // il metodo toString non nasce in questa classe, ma è un override di un metodo che era stato
	            // scritto in una classe superiore che si sta estendendo.
	public String toString() {
		return "Base [x=" + x + ", y=" + y + "]";
	}
}
