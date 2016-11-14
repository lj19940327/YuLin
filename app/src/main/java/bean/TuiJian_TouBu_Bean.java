package bean;

/**
 * Created by lenovo on 2016/11/3.
 */
public class TuiJian_TouBu_Bean {
    private String indexImg;
    private String title;

    public TuiJian_TouBu_Bean(String indexImg, String title) {
        this.indexImg = indexImg;
        this.title = title;
    }

    public String getIndexImg() {
        return indexImg;
    }

    public String getTitle() {
        return title;
    }

    public void setIndexImg(String indexImg) {
        this.indexImg = indexImg;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TuiJian_TouBu_Bean{" +
                "indexImg='" + indexImg + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
