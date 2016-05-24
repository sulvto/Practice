package me.qinchao.pss.web;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public abstract class CRUDAction<T> extends BaseAction implements
		ModelDriven<T>, Preparable {
	private static final long serialVersionUID = 1L;
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	protected abstract void list();

	@Override
	public String execute() throws Exception {
		list();
		return SUCCESS;
	}

	public abstract String save() throws Exception;

	public abstract String delete() throws Exception;

	public void prepare() throws Exception {

	}

	public void prepareSave() throws Exception {
		beforeSave();
	}

	public void prepareInput() throws Exception {
		beforeInput();
	}

	public abstract void beforeSave();

	public abstract void beforeInput();

}