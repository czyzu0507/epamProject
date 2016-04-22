package commands;

import java.io.File;

public class Cd implements Command {
    String path;

    public Cd(String path) {
        this.path = path;
    }

    @Override
    public void operation() {
        String property = System.getProperty("user.dir");
        File file = new File(property + "/" + path);
        if (("..").equals(path)) {
            System.setProperty("user.dir", new File(property).getParent());
        } else if (file.isDirectory()) {
            System.setProperty("user.dir", file.toString());
        } else {
            System.out.println(path + " is not valid Directory");
        }
    }

}

