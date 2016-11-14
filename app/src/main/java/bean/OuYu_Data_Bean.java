package bean;

import java.util.List;

/**
 * Created by lenovo on 2016/11/5.
 */
public class OuYu_Data_Bean {
    public List<OuYu_Bean> data;

    public OuYu_Data_Bean(List<OuYu_Bean> data) {
        this.data = data;
    }

    public List<OuYu_Bean> getData() {
        return data;
    }

    public void setData(List<OuYu_Bean> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "OuYu_Data_Bean{" +
                "data=" + data +
                '}';
    }
}
