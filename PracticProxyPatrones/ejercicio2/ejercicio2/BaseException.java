package ejercicio2;

public class BaseException extends Exception {

	public BaseException(Exception ex, String msg) {
		super(msg, ex);
	}
}
