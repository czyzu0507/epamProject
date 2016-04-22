package prompt;

public class Prompt {
    private String name;
    private boolean prompt;

    public Prompt() {
        name = System.getProperty("user.name");
        prompt = false;
    }

    public void setPrompt(boolean prompt) {
        this.prompt = prompt;
    }

    @Override
    public String toString() {
        return "[" + name + "] " + (prompt ? System.getProperty("user.dir") : "$") + " >";
    }
}
