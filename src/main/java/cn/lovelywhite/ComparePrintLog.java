package cn.lovelywhite;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComparePrintLog {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            System.out.println("输出" + i);
        }
        long end = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            logger.log(Level.WARN,"输出" + i);
        }
        System.out.printf("printf耗时：%d\n", end);
        System.out.printf("LOGGER 耗时：%d", System.currentTimeMillis() - start);
    }

}
