package adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.liujie.lenovo.yulin.R;

import java.util.ArrayList;
import java.util.List;

import bean.OuYu_Bean;

/**
 * Created by lenovo on 2016/11/5.
 */
public class OuYu_ListView_Adapter extends BaseAdapter {
    private List<OuYu_Bean> list=new ArrayList<OuYu_Bean>();
    private Context context;
    private TextView ouyu_tv1;
    private TextView ouyu_tv2;
    public OuYu_ListView_Adapter(List<OuYu_Bean> list, Context context) {
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
        View view=View.inflate(context, R.layout.ouyu_fragment_listview_item,null);
        ouyu_tv1=(TextView)view.findViewById(R.id.ouyu_tv1);
        ouyu_tv1.setText(list.get(position).getTitle());
        ouyu_tv2=(TextView)view.findViewById(R.id.ouyu_tv2);
        ouyu_tv2.setText(list.get(position).getContent());
        return view;
    }
}
