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
public class My_wode_ListView_Adapter extends BaseAdapter {
    int[] images = {R.mipmap.mypage_impression, R.mipmap.mycard, R.mipmap.photo_album, R.mipmap.mypage_weekends_activities, R.mipmap.work, R.mipmap.my_label, R.mipmap.my_sign, R.mipmap.feedback, R.mipmap.add_friend, R.mipmap.about_team};
    String[] name = {"印象", "我的帖子", "我的相册", "我的活动", "职业", "我的标签", "个性签名", "意见反馈", "邀请好友", "关于我们"};

    private Context context;
    private ImageView img;
    private TextView tname;

    public My_wode_ListView_Adapter(Context context) {
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
        View view=View.inflate(context,R.layout.wode_fragment_listview_item,null);
        img=(ImageView)view.findViewById(R.id.wode_fragment_list_item_img1);
        img.setImageResource(images[position]);
        tname=(TextView)view.findViewById(R.id.wode_fragment_list_item_tv);
        tname.setText(name[position]);
        return view;
    }
}
