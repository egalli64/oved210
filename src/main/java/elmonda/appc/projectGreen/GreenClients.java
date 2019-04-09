package elmonda.appc.projectGreen;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTS")
public class GreenClients {
	
	@Id
	private long clientId;
	private String clientName;
	


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
	
	@Override
	public String toString() {
		return "GreenClients [clientId=" + clientId + ", clientName=" + clientName + "]";
	}
	
	public GreenClients() {
	}
	
}
