package project.red;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RED_CLIENTS")
public class Client {
	@Id
	private long clientId;
	private String clientName;
	private String email;
	private String phone;
	private long hotelId;

	public Client() {

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

	public long getHotelId() {
		return hotelId;
	}

	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Client [clientName=" + clientName + ", email=" + email + ", phone=" + phone + ", hotelId=" + hotelId
				+ "]";
	}

}
