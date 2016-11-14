package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.liujie.lenovo.yulin.R;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import bean.TuiJian_TouBu_Bean;

/**
 * Created by lenovo on 2016/11/3.
 */
public class TuiJian_TouBu_Adapter extends BaseAdapter {
    private List<TuiJian_TouBu_Bean> list;
    private Context context;

    public TuiJian_TouBu_Adapter(List<TuiJian_TouBu_Bean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if(convertView==null){
            convertView= View.inflate(context, R.layout.tuijian_list_item, null);
            vh=new ViewHolder();
            vh.tuijian_toubu_img=(ImageView)convertView.findViewById(R.id.tuijian_toubu_img);
            vh.tuijian_toubu_tv=(TextView)convertView.findViewById(R.id.tuijian_toubu_tv);
            convertView.setTag(vh);
        }else{
            vh=(ViewHolder) convertView.getTag();
        }
        ImageLoader.getInstance().displayImage(list.get(position).getIndexImg(),vh.tuijian_toubu_img);
        vh.tuijian_toubu_tv.setText(list.get(position).getTitle());


        return convertView;
    }

    class  ViewHolder{
        ImageView tuijian_toubu_img;
        TextView tuijian_toubu_tv;
    }
}
