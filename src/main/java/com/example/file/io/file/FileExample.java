package com.example.file.io.file;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {
        File dir = new File("/");
        String filenames[] = dir.list();

        for (String filename : filenames) {
            System.out.println(filename);
        }

        info(dir);
    }

    private static void info(File dir) {
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(
                file.getName() +
                    " Can Write: " + file.canWrite() +
                    " Is Hidden: " + file.isHidden() +
                    " Length: " + file.length() + " bytes"
            );
        }
    }
}
