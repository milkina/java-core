package io;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String catalogName = "src";
        File catalog = new File(catalogName);

        if (catalog.isDirectory()) {
            System.out.println("Папка " + catalogName);
            String[] list = catalog.list();
            if (list != null) {
                for (String fileName : list) {
                    File file = new File(catalogName + "/" + fileName);
                    if (file.isDirectory()) {
                        System.out.printf("\t%s каталог%n", fileName);
                    } else {
                        System.out.printf("\t%s файл%n", fileName);
                    }
                }
            }
        } else {
            System.out.println(catalogName + " не является каталогом");
        }
    }
}
