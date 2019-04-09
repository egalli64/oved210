package project.green;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GREEN_HOTELS")
public class GreenHotel {
	public GreenHotel() {

	}

	@Id
	private String hotelId;
	private String hotelName;

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	@Override
	public String toString() {
		return "GreenHotel [hotelId=" + hotelId + ", hotelName=" + hotelName + "]";
	}
}
