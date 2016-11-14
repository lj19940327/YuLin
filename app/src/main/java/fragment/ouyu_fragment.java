package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.liujie.lenovo.yulin.R;

import java.util.ArrayList;
import java.util.List;

import adapter.OuYu_ListView_Adapter;
import bean.OuYu_Bean;
import bean.OuYu_Data_Bean;

/**
 * Created by lenovo on 2016/11/1.
 */
public class ouyu_fragment extends Fragment {
    private List<OuYu_Bean> list=new ArrayList<OuYu_Bean>();
    private String puth="http://www.yulin520.com/a2a/forum/allTypeList?sign=376C5BFC22179A1B8FF3A86D4588B29F&pageSize=10&sort=2&ts=1877785007&page=1&forumType=0";
    private ListView lv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getActivity(), R.layout.ouyu_fragment,null);
        lv=(ListView)view.findViewById(R.id.ouyu_fragment_lv);
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        StringRequest request = new StringRequest(Request.Method.GET, puth, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                // 打印出GET请求返回的字符串
//                Toast.makeText(getActivity(), s, Toast.LENGTH_LONG).show();
                Log.d("volley_mmmmmmmmmmmm", s);
                Gson gson = new Gson();
                OuYu_Data_Bean bean = gson.fromJson(s, OuYu_Data_Bean.class);
                list = bean.data;
               OuYu_ListView_Adapter adapter = new OuYu_ListView_Adapter(list, getActivity());
                lv.setAdapter(adapter);
                Log.i("发士大夫的", bean.data.toString());

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });

        // 设置该请求的标签
        request.setTag("abcGet");

        // 将请求添加到队列中
        requestQueue.add(request);

        return view;
    }

    }

