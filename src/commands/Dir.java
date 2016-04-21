package commands;

import java.io.File;

public class Dir implements Command {

    @Override
    public void operation() {
        File folder = new File(System.getProperty("user.dir"));
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles != null) {
            for (File listOfFile : listOfFiles) {
                if (listOfFile.isFile()) {
                    System.out.println("FILE " + listOfFile.getName());
                } else if (listOfFile.isDirectory()) {
                    System.out.println("DIR " + listOfFile.getName());
                }
            }
        }
    }
}
