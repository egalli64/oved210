package trainer.apr.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EmpGen")
	@SequenceGenerator(sequenceName = "EMPLOYEES_SEQ", allocationSize = 1, name = "EmpGen")
	@Column(name = "EMPLOYEE_ID")
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private Date hireDate;
	private String jobId;

	protected Employee() {
	}

	public Employee(String firstName, String lastName, String jobId) {
		setPersonalData(firstName, lastName);
		this.hireDate = Date.valueOf(LocalDate.now());
		this.jobId = jobId;
	}

	public Employee(long id, String firstName, String lastName) {
		setPersonalData(firstName, lastName);
		this.id = id;
	}
	
	private void setPersonalData(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		setDefaultEmail();
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;		
	}

	public void setDefaultEmail() {
		this.email = firstName.charAt(0) + lastName.substring(0, Math.min(7, lastName.length())).toUpperCase();		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", hireDate=" + hireDate + ", jobId=" + jobId + "]";
	}
}