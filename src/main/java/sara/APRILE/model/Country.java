package sara.APRILE.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name= "COUNTRIES")
	public class Country {
		@Id
		private long countryId;
		private String countryName;
		@Override
		public String toString() {
			return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
		}
		public long getCountryId() {
			return countryId;
		}
		public void setCountryId(long countryId) {
			this.countryId = countryId;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		
		
}
