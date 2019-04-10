package project.blue;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "BLUE_CLIENTS")
public class BlueClient {
	
	@Id
	private Long clientId;
	private String clientName;
	private String email;
	private Long phone;
	
	
	public BlueClient() {
		
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


