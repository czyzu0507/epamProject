package commands;

import prompt.Prompt;

public class PromptCommand implements Command {
    private String promptOperation;
    private Prompt prompt;

    public PromptCommand(Prompt prompt, String promptOperation) {
        this.prompt = prompt;
        this.promptOperation = promptOperation;
    }

    @Override
    public void operation() {
        switch (promptOperation) {
            case "$cwd":
                prompt.setPrompt(true);
                break;
            case "reset":
                prompt.defaultMessage();
                break;
            default:
                prompt.setMessage(promptOperation);
        }
    }
}
