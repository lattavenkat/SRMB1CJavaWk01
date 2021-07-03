package com.srm.cjava.wk02.day11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class FileProps {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("config.properties")) {

            Properties prop = new Properties();

            prop.setProperty("url", "http://localhost:3000");
            prop.setProperty("user", "Latha");
            prop.setProperty("password", "pass@123");

            prop.store(output, null);

            System.out.println(prop);

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
