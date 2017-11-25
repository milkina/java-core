package io;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "src";
        File f1 = new File(dirname);

        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirname);
            String[] list = f1.list();
            if (list != null) {
                for (String fileName : list) {
                    File f = new File(dirname + "/" + fileName);
                    if (f.isDirectory()) {
                        System.out.println(fileName + " is a directory");
                    } else {
                        System.out.println(fileName + " is a file");
                    }
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }
    }
}
