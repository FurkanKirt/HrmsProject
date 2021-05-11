package hrmsproject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Jobs")
public class Job {
	@Id
	@GeneratedValue
	@Column(name="JobId")
	private int jobId;
	
	@Column(name="JobName")
	private String jobName;
	
	@Column(name="CreaterId")
	private int createrId;


	public Job() {
		super();
	}


	public Job(int jobId, String jobName, int createrId) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.createrId = createrId;
	}


	public int getJobId() {
		return jobId;
	}


	public void setJobId(int jobId) {
		this.jobId = jobId;
	}


	public String getJobName() {
		return jobName;
	}


	public void setJobName(String jobName) {
		this.jobName = jobName;
	}


	public int getCreaterId() {
		return createrId;
	}


	public void setCreaterId(int createrId) {
		this.createrId = createrId;
	}
	
	

	
}
