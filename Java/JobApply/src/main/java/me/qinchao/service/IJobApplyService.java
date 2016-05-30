package me.qinchao.service;

import java.io.Serializable;
import java.util.List;

import me.qinchao.domain.Job;
import me.qinchao.domain.JobApply;

public interface IJobApplyService {
	void saveJobApply(JobApply u);

	void updateJobApply(JobApply u);

	void deleteJobApply(Serializable id);

	JobApply getJobApply(Serializable id);

	List<JobApply> listJobApplys();

	void createIndex();

	List<Job> search(String keywords);

}
