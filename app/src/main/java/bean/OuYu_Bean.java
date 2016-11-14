package bean;

/**
 * Created by lenovo on 2016/11/5.
 */
public class OuYu_Bean {
    private String title;
    private String content;

    public OuYu_Bean(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "OuYu_Bean{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
