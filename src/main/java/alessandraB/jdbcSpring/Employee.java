package alessandraB.jdbcSpring;

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
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "HIRE_DATE")
	private Date hireDate;
	
	@Column(name = "JOB_ID")
	private String jobId;
	
    public Employee(String firstName, String lastName, String email, String jobId) {
    	
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.email = email;
    	this.jobId = jobId;
    	this.hireDate = Date.valueOf(LocalDate.now()); //genera la data di oggi, è di java 8
    	
    }
    
   
   
	protected Employee() {
		
	}
	

	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", hireDate=" + hireDate + ", jobId=" + jobId + "]";
	}
	
	
}
