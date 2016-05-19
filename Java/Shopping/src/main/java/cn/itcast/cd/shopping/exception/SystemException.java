package cn.itcast.cd.shopping.exception;

//自定义异常,专指挡墙项目中的,系统异常.
public class SystemException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public SystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public SystemException(String message) {
		super(message);
	}
}
