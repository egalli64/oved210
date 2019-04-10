package project.red;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "RED_CLIENTS")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CliGen")
	@SequenceGenerator(sequenceName = "RED_CLIENTS_SEQ", allocationSize = 1, name = "CliGen")
	private long clientId;

	private String clientName;
	private String email;
	private String phone;


	public Client(String clientName, String email, String phone) {
		this.clientName = clientName;
		this.email = email;
		this.phone = phone;
		
	}
	
	protected Client() {
		
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", email=" + email + ", phone=" + phone
				 + "]";
	}


}
