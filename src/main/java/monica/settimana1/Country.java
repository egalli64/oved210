package monica.settimana1;

public class Country {

	private String id;
	private String name;

	public Country(String id, String name)  {
		if ( id == null || id.length() != 2  ) {
			throw new IllegalArgumentException ("Bad Id");
		}
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
