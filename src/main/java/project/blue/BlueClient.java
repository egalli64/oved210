package project.blue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "BLUE_CLIENTS")
public class BlueClient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClientGen")
	@SequenceGenerator(sequenceName = "BLUE_CLIENTS_SEQ", allocationSize = 1, name = "ClientGen")
	private Long clientId;
	private String clientName;
	private String email;
	private Long phone;
	
	public BlueClient(Long clientId, String clientName, String email, Long phone) {
		this.clientId = clientId;
		this.clientName = clientName;
		this.email = email;
		this.phone = phone;		
	}
	
	public BlueClient(String clientName, String email, Long phone) {
		this.clientName = clientName;
		this.email = email;
		this.phone = phone;
	}
	protected BlueClient() {
		
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
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

	@Override
	public String toString() {
		return "BlueClient [clientId=" + clientId + ", clientName=" + clientName + ", email=" + email + ", phone="
				+ phone + "]";
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	
}


