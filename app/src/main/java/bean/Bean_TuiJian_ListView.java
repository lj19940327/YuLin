package bean;

/**
 * Created by lenovo on 2016/11/5.
 */
public class Bean_TuiJian_ListView {
    private String url;

    public Bean_TuiJian_ListView(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Bean_TuiJian_ListView{" +
                "url='" + url + '\'' +
                '}';
    }
}
