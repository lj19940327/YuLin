package bean;

import java.util.List;

/**
 * Created by lenovo on 2016/11/3.
 */
public class Bean_TouBu {

    public List<TuiJian_TouBu_Bean> data;

    public void setData(List<TuiJian_TouBu_Bean> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Bean_TouBu{" +
                "data=" + data +
                '}';
    }
}
