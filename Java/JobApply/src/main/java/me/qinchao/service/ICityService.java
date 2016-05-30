package me.qinchao.service;

import java.io.Serializable;
import java.util.List;

import me.qinchao.domain.City;

public interface ICityService {
	void saveCity(City u);

	void updateCity(City u);

	void deleteCity(Serializable id);

	City getCity(Serializable id);

	List<City> listCitys();
}
