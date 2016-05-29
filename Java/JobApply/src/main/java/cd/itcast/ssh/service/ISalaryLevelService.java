package cd.itcast.ssh.service;

import java.io.Serializable;
import java.util.List;

import cd.itcast.ssh.domain.SalaryLevel;

public interface ISalaryLevelService {
	void saveSalaryLevel(SalaryLevel u);

	void updateSalaryLevel(SalaryLevel u);

	void deleteSalaryLevel(Serializable id);

	SalaryLevel getSalaryLevel(Serializable id);

	List<SalaryLevel> listSalaryLevels();
}
