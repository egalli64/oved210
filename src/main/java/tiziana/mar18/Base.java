package tiziana.mar18;

public class Base {
	public void k() {
		System.out.println("Base.k()");
	}

	@Override
	public String toString() {
		return "Base [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	

}
