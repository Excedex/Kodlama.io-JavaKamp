package youtubeEgitim;

public class Customer {
	
	int id;
	String name;
	String lastname;
	String NationalIdentity;
	public Customer() {
		
	}
	
	public Customer(int i, String string, String string2, String string3) {
		this.id=i;
		this.name=string;
		this.lastname=string2;
		this.NationalIdentity=string3;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNationalIdentity() {
		return NationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}
	

}
