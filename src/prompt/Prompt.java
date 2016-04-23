package prompt;

public class Prompt {
    private String name;
    private boolean prompt;
    private String message;

    public Prompt() {
        name = System.getProperty("user.name");
        prompt = false;
        message = "$";
    }

    public void setPrompt(boolean prompt) {
        this.prompt = prompt;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void defaultMessage() {
        message = "$";
        prompt = false;
    }

    @Override
    public String toString() {
        return "[" + name + "] " + (prompt ? System.getProperty("user.dir") : message) + " >";
    }

}
