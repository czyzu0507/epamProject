package commands;

import prompt.Prompt;

public class Reset implements Command {
    private Prompt prompt;

    public Reset(Prompt prompt) {
        this.prompt = prompt;
    }

    @Override
    public void operation() {
        prompt.setPrompt(false);
    }
}
