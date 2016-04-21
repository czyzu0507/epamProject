package commands;

import java.io.File;

public class Tree implements Command {

    @Override
    public void operation() {
        getDirList(new File(System.getProperty("user.dir")),0);
    }

    private void getDirList(File folder, int i){
        i++;
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles != null) {
            for (File listOfFile : listOfFiles) {
                if (listOfFile.isDirectory()) {
                    StringBuilder builder = new StringBuilder();
                    for (int j = 0; j < i ; j++) {
                        builder.append("-");
                    }
                    System.out.println(builder.append(listOfFile.getName()));
                    getDirList(listOfFile.getAbsoluteFile(),i);
                }
            }
        }
    }
}
