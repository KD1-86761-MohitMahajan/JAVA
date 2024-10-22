package customexceptions;

public class StrTooLongException extends Exception {
	
	
	public StrTooLongException() {};
	
	public StrTooLongException(String msg) {
		super (msg);
	}
	
	
}

