package claudia.mar18;

public class Inferior extends Superior implements Happy {
	public void k() {
		System.out.println("Inferior.k()");
		super.k();
	}

	@Override
	public void smile() {
		System.out.println("Inferior.smile()");
		
	}

	
	

}
