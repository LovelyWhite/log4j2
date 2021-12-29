package cn.lovelywhite;

import java.io.IOException;

public class HackCode {
    static {
        System.out.println("HackCode");
        try {
            Runtime.getRuntime().exec("mkdir hackFolder");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
