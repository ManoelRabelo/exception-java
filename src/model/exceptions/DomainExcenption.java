package model.exceptions;

public class DomainExcenption extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainExcenption (String msg) {
		super(msg);
	}

}
