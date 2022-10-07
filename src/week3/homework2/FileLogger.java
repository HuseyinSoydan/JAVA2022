package week3.homework2;

public class FileLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Logged to file : " + message);
	}
}