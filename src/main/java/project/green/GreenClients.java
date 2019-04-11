package project.green;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GREEN_CLIENTS")
public class GreenClients { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Generate")
	@SequenceGenerator(sequenceName = "Green_clients_seq", allocationSize = 1, name = "Generate")

	
	
	private long clientId;
	private String clientName;
	private String email;
	private Long phone;
	
	public GreenClients(String clientName, String email, Long phone) {
		this.clientName = clientName;
		this.email = email;
		this.phone = phone;
	}

	
	public GreenClients() {
		
	}


	public long getClientId() {
		return clientId;
	}


	public void setClientId(long clientId) {
		this.clientId = clientId;
	}


	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "GreenClients [clientId=" + clientId + ", clientName=" + clientName + ", email=" + email + ", phone="
				+ phone + "]";
	}

}