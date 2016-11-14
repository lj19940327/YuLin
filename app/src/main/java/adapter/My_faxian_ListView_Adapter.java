package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.liujie.lenovo.yulin.R;

/**
 * Created by lenovo on 2016/11/2.
 */
public class My_faxian_ListView_Adapter extends BaseAdapter {
    int[] images={R.mipmap.three,R.mipmap.four,R.mipmap.weekends_activities,R.mipmap.first,R.mipmap.invite_friends};
    String[] name={"朋友圈","遇邻圈子","周末活动","好友搜索","好友推荐"};
    private Context context;
    private ImageView img;
    private TextView tname;

    public My_faxian_ListView_Adapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return name[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=View.inflate(context,R.layout.faxian_fragment_list_item,null);
        img=(ImageView)view.findViewById(R.id.faxian_fragment_list_item_img1);
        img.setImageResource(images[position]);
        tname=(TextView)view.findViewById(R.id.faxian_fragment_list_item_tv);
        tname.setText(name[position]);
         return view;
    }
}
