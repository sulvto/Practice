package cd.itcast.ssh.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cd.itcast.ssh.dao.ICityDAO;
import cd.itcast.ssh.domain.City;
import cd.itcast.ssh.service.ICityService;

@Transactional(propagation = Propagation.REQUIRED)
public class CityServiceImpl implements ICityService {
	private ICityDAO dao;

	public void setDao(ICityDAO dao) {
		this.dao = dao;
	}

	@Override
	public void saveCity(City d) {
		this.dao.save(d);
	}

	@Override
	public void updateCity(City d) {
		this.dao.update(d);
	}

	@Override
	public void deleteCity(Serializable id) {
		this.dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public City getCity(Serializable id) {
		return this.dao.get(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<City> listCitys() {
		return this.dao.list();
	}

}
