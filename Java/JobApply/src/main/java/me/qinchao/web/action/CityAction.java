package me.qinchao.web.action;

import java.util.List;

import me.qinchao.domain.City;
import me.qinchao.service.ICityService;

import com.opensymphony.xwork2.ActionSupport;

public class CityAction  extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private ICityService cityService;

	private City city = new City();
	private Long id;
	private List<City> citys;


	public void setCityService(ICityService cityService) {
		System.out.println(cityService);
		this.cityService = cityService;
	}


	public String list() {
		this.citys = this.cityService.listCitys();
		return "list";
	}

	public String edit() {
		if (id != null)
			this.city = this.cityService.getCity(id);
		return INPUT;
	}

	public String update() {
		System.out.println(this.cityService);

		if (this.city.getId() != null)
			this.cityService.updateCity(city);
		else
			this.cityService.saveCity(city);
		return SUCCESS;
	}

	public String delete() {
		if (this.id != null) {
			this.cityService.deleteCity(id);
		}
		return SUCCESS;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City City) {
		this.city = City;
	}

	public List<City> getCitys() {
		return citys;
	}

	public void setCitys(List<City> citys) {
		this.citys = citys;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ICityService getCityService() {
		return cityService;
	}

}
