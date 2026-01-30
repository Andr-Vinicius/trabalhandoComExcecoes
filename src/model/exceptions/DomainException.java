package model.exceptions;

public class DomainException extends Exception{
	private static final long serialVersionUID = 1L; // Classe serializable
	
	public DomainException(String msg) {
		super(msg);
	}
	

}
