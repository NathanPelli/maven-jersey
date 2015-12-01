package andy.maven_jersey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LogbackDemo {
	public static void main(String[] args){
		Logger log = LoggerFactory.getLogger(LogbackDemo.class); 
		   log.info("Hello World"); 
	}
}
