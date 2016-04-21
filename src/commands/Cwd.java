package commands;

import prompt.Prompt;

public class Cwd implements Command{
    private Prompt prompt;

    public Cwd(Prompt prompt) {
        this.prompt = prompt;
    }

    @Override
    public void operation() {
        prompt.setPrompt(System.getProperty("user.dir"));
    }
}
