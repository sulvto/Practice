package cd.itcast.ssh.service;

import java.io.Serializable;
import java.util.List;

import cd.itcast.ssh.domain.Job;
import cd.itcast.ssh.domain.JobApply;

public interface IJobApplyService {
	void saveJobApply(JobApply u);

	void updateJobApply(JobApply u);

	void deleteJobApply(Serializable id);

	JobApply getJobApply(Serializable id);

	List<JobApply> listJobApplys();

	void createIndex();

	List<Job> search(String keywords);

}
