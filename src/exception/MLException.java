package exception;

public class MLException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public MLException()
	{
		super();
	}
	
	public MLException(String message)
	{
		super(message);
	}
	
	public MLException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
	
	public MLException(Throwable throwable)
	{
		super(throwable);
	}
}
