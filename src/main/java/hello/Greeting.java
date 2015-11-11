package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final String testSSH;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.testSSH = "";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
