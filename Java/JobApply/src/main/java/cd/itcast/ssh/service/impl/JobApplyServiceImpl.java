package cd.itcast.ssh.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cd.itcast.ssh.dao.IJobApplyDAO;
import cd.itcast.ssh.domain.Job;
import cd.itcast.ssh.domain.JobApply;
import cd.itcast.ssh.service.IJobApplyService;
import cd.itcast.ssh.util.LuceneUtil;

@Transactional(propagation = Propagation.REQUIRED)
public class JobApplyServiceImpl implements IJobApplyService {
	private IJobApplyDAO dao;

	public void setDao(IJobApplyDAO dao) {
		this.dao = dao;
	}

	@Override
	public void saveJobApply(JobApply d) {
		this.dao.save(d);
	}

	@Override
	public void updateJobApply(JobApply d) {
		this.dao.update(d);
	}

	@Override
	public void deleteJobApply(Serializable id) {
		this.dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public JobApply getJobApply(Serializable id) {
		return this.dao.get(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<JobApply> listJobApplys() {
		return this.dao.list();
	}

	@Override
	public List<Job> search(String keywords) {
		System.out.println(keywords);
		String[] strings = {"Id","Title","City","SalaryLevel","Content","Company","Trade","CompanyType"};
		List<Job> list = new ArrayList<>();

		List<String> ids = new ArrayList<>();
		try {
			for (String string : strings) {
				List<Job> search = LuceneUtil.search(keywords, string,ids);
				if(search!=null&& search.size()!=0) {
					list.addAll(search);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
		return list;
	}

	public void createIndex() {
		List<JobApply> list = dao.list();
		try {
			for (JobApply jobApply : list) {

				System.out.println("标题  " + jobApply.getTitle());
				System.out.println("城市  " + jobApply.getCity().getName());
				System.out.println("内容  " + jobApply.getContent());
				System.out.println("公司  " + jobApply.getCompany().getName());
				System.out.println("行业  " + jobApply.getTrade().getName());

				Document document = new Document();
				Long id = jobApply.getId();
				document.add(new Field("Id", id.toString(), Store.YES,
						Index.ANALYZED));
				document.add(new Field("Title", jobApply.getTitle(), Store.YES,
						Index.ANALYZED));
				document.add(new Field("City", jobApply.getCity().getName(),
						Store.YES, Index.ANALYZED));
				document.add(new Field("Content", jobApply.getContent(),
						Store.YES, Index.ANALYZED));
				document.add(new Field("Company", jobApply.getCompany()
						.getName(), Store.YES, Index.ANALYZED));
				document.add(new Field("SalaryLevel", jobApply.getSalaryLevel()
						.getName(), Store.YES, Index.ANALYZED));
				document.add(new Field("Trade", jobApply.getTrade().getName(),
						Store.YES, Index.ANALYZED));
				document.add(new Field("CompanyType", jobApply.getTrade()
						.getName(), Store.YES, Index.ANALYZED));

				LuceneUtil.createIndex(document);

			}
		} catch (Exception e) {
			System.out.println("出现异常!!!");
			e.printStackTrace();
		}
	}

}
