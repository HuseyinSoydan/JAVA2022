package week3.homework3.logger;

public class FileLogger implements Logger{
    
	@Override
    public void log(String logMessage) {
        System.out.println("Logged into the File : " + logMessage );
    }
}