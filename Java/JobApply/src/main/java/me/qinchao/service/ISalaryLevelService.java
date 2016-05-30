package me.qinchao.service;

import java.io.Serializable;
import java.util.List;

import me.qinchao.domain.SalaryLevel;

public interface ISalaryLevelService {
	void saveSalaryLevel(SalaryLevel u);

	void updateSalaryLevel(SalaryLevel u);

	void deleteSalaryLevel(Serializable id);

	SalaryLevel getSalaryLevel(Serializable id);

	List<SalaryLevel> listSalaryLevels();
}
