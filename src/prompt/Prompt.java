package prompt;

public class Prompt {
    private String name;
    private String prompt;

    public Prompt() {
        name = System.getProperty("user.name");
        prompt = "$";
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public void setDefoultPropmt(){
        prompt = "$";
    }

    @Override
    public String toString() {
        return "["+name+"] " + prompt + " >";  }
}
