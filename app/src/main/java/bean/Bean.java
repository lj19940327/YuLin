package bean;

import java.util.List;

/**
 * Created by lenovo on 2016/11/2.
 */
public class Bean {
    public List<TuiJian_Bean> data;

    public List<TuiJian_Bean> getData() {
        return data;
    }

    public void setData(List<TuiJian_Bean> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "data=" + data +
                '}';
    }
}
