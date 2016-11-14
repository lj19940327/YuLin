package adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.liujie.lenovo.yulin.R;
import com.liujie.lenovo.yulin.WebActivity;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import bean.TuiJian_Bean;

/**
 * Created by lenovo on 2016/11/2.
 */
public class Tuijian_listview_Adapter extends BaseAdapter {
    private List<TuiJian_Bean> list;
    private Context context;

    public Tuijian_listview_Adapter(List<TuiJian_Bean> list, Context context) {
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.tuijian_list_item, null);
            vh = new ViewHolder();
            vh.tuijian_list_item_img = (ImageView) convertView.findViewById(R.id.tuijian_list_item_img);
            vh.tuijian_list_item_tv1 = (TextView) convertView.findViewById(R.id.tuijian_list_item_tv1);
            vh.tuijian_list_item_btn1 = (Button) convertView.findViewById(R.id.tuijian_list_item_btn1);
            vh.tuijian_list_item_btn2 = (Button) convertView.findViewById(R.id.tuijian_list_item_btn2);
            vh.tuijian_list_item_tv4 = (TextView) convertView.findViewById(R.id.tuijian_list_item_tv4);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        ImageLoader.getInstance().displayImage(list.get(position).img,vh.tuijian_list_item_img);
        vh.tuijian_list_item_tv1.setText(list.get(position).getUserName());
        vh.tuijian_list_item_btn1.setText(list.get(position).getUserAge()+"");
        vh.tuijian_list_item_btn2.setText(list.get(position).getOccupation());
        vh.tuijian_list_item_tv4.setText(list.get(position).getIntroduction());
        vh.tuijian_list_item_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, WebActivity.class);
                intent.putExtra("url",list.get(position).getUrl());
                context.startActivity(intent);
            }
        });
        return convertView;
    }

    class ViewHolder {
        ImageView tuijian_list_item_img;
        TextView tuijian_list_item_tv1;
        Button tuijian_list_item_btn1;
        Button tuijian_list_item_btn2;
        TextView tuijian_list_item_tv4;

    }
}
