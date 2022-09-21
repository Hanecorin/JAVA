package step03.app;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jTest {

	/*

  public static  Logger getLogger(Class clazz) {
    return LogManager.getLogger(clazz.getName());
  }
	 */
	static Logger logger = Logger.getLogger("Log4jTest");
	
	static void test() {
		logger.debug("debug �޼��� ---");
		logger.info("info ���� �޼��� ---");
	}
	
	public static void main(String[] args) {
		test();
	}

}