package me.qinchao.pss.service.impl;

import java.util.Date;
import java.util.List;

import me.qinchao.pss.dao.BaseDao;
import me.qinchao.pss.domain.ProductStock;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import me.qinchao.pss.service.IQuartzJobServiceImpl;

public class QuartzJobServiceImpl implements IQuartzJobServiceImpl {
	private BaseDao<ProductStock> baseDao;
	private MailSender mailSender;

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void setBaseDao(BaseDao<ProductStock> baseDao) {
		this.baseDao = baseDao;
	}

	public void work() {
		System.out.println("work: " + new Date().toLocaleString());
		String hql = "select o from ProductStock o where (o.num>=o.topNum or o.unm<=o.bottomNum) and o.warning=?";
		List<ProductStock> list = baseDao.findByHql(hql, true);
		for (ProductStock productStock : list) {
			// System.out.println(list.size());
			// 邮件对象
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			// 发件人
			mailMessage.setFrom("592158826@qq.com");
			// 收件人
			mailMessage.setTo("qinchao70@163.com");
			// 抄送
			mailMessage.setBcc("qinchao0303@gmail.com");
			// 密送
			mailMessage.setCc("qinchao_main@163.com");
			// 标题
			mailMessage.setSubject("work");
			// 内容
			mailMessage.setText(new Date().toLocaleString());
			// 发送
			mailSender.send(mailMessage);
		}
	}
}
