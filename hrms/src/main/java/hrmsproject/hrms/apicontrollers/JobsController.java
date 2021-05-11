package hrmsproject.hrms.apicontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrmsproject.hrms.business.concretes.JobManager;
import hrmsproject.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	
	private JobManager jobManager;
	
	@Autowired
	public JobsController(JobManager jobManager) {
		super();
		this.jobManager = jobManager;
	}
	
	@GetMapping("/getall")
	public List<Job> getAll(){
		return this.jobManager.getAll();
	}
	
}
