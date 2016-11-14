package bean;

import java.util.List;

/**
 * Created by lenovo on 2016/11/5.
 */
public class TuiJian_ListView_Bean1 {
    public List<Bean_TuiJian_ListView> data;

    public TuiJian_ListView_Bean1(List<Bean_TuiJian_ListView> data) {
        this.data = data;
    }

    public List<Bean_TuiJian_ListView> getData() {
        return data;
    }

    public void setData(List<Bean_TuiJian_ListView> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TuiJian_ListView_Bean1{" +
                "data=" + data +
                '}';
    }
}
