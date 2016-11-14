package fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.liujie.lenovo.yulin.R;
import com.liujie.lenovo.yulin.TouBu_XiangQingActivity;
import com.nostra13.universalimageloader.core.ImageLoader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import adapter.Tuijian_listview_Adapter;
import bean.Bean;
import bean.TuiJian_Bean;
import bean.TuiJian_TouBu_Bean;

/**
 * Created by lenovo on 2016/11/1.
 */
public class tuijian_fragment extends Fragment {
    private String puth = "http://www.yulin520.com/a2a/impressApi/news/mergeList?sign=C7548DE604BCB8A17592EFB9006F9265&pageSize=10&gender=2&ts=1871746850&page=1";
    private String puth1 = "http://www.yulin520.com/a2a/news/sd/list?sign=8241B1C5FE73D12F7A740EB4F63AA7D1&pageSize=1&ts=1871746851&page=1";
   /* private String url1="http://www.yulin520.com/a2a/h5/impress/i1/319?a=1478305710026";
    private String url2="http://www.yulin520.com/a2a/h5/impress/i1/323?a=1478305710026";
    private String url3="http://www.yulin520.com/a2a/h5/impress/i1/340?a=1478305710026";
    private String url4="http://www.yulin520.com/a2a/h5/impress/i1/244?a=1478305710026";
    private String url5="http://www.yulin520.com/a2a/h5/impress/i1/353?a=1478305710026";
    private String url6="http://www.yulin520.com/a2a/h5/impress/i1/352?a=1478305710026";
    private String url7="http://www.yulin520.com/a2a/h5/impress/i1/350?a=1478305710026";
    private String url8="http://www.yulin520.com/a2a/h5/impress/i1/348?a=1478305710026";
    private String url9="http://www.yulin520.com/a2a/h5/impress/i1/346?a=1478305710026";
   */ private List<TuiJian_Bean> list = new ArrayList<TuiJian_Bean>();
    private List<TuiJian_TouBu_Bean> list1 = new ArrayList<TuiJian_TouBu_Bean>();
    private ListView lv;
    private ImageView tuijian_toubu_img;
    private TextView tuijian_toubu_tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.tuijian_fragment, null);
        tuijian_toubu_img=(ImageView)view.findViewById(R.id.tuijian_toubu_img);
        tuijian_toubu_tv=(TextView)view.findViewById(R.id.tuijian_toubu_tv);
        /*跳转到详情页面*/
        tuijian_toubu_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), TouBu_XiangQingActivity.class);
                startActivity(intent);
            }
        });
        /*请求推荐头部数据的方法*/
        GetGson();
        /*请求推荐ListView数据的方法  Volley请求*/
        lv = (ListView) view.findViewById(R.id.lv_tuijian);

        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        StringRequest request = new StringRequest(Request.Method.GET, puth, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                // 打印出GET请求返回的字符串
//                Toast.makeText(getActivity(), s, Toast.LENGTH_LONG).show();
                Log.d("volley_mmmmmmmmmmmm", s);
                Gson gson = new Gson();
                Bean bean = gson.fromJson(s, Bean.class);
                list = bean.data;
                Tuijian_listview_Adapter adapter = new Tuijian_listview_Adapter(list, getActivity());
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

/*
* 请求推荐头部的数据
* */
    public void GetGson() {
        RequestQueue requestQueue1 = Volley.newRequestQueue(getActivity());
        StringRequest request1 = new StringRequest(Request.Method.GET, puth1, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                // 打印出GET请求返回的字符串
//                Toast.makeText(getActivity(), s, Toast.LENGTH_LONG).show();
                Log.d("volley_mmmmmmmmmmmm", s);
                try {
                    JSONObject object = new JSONObject(s);
                    JSONArray array = object.optJSONArray("data");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject op = array.getJSONObject(i);
                        ImageLoader.getInstance().displayImage(op.getString("indexImg"),tuijian_toubu_img);
                        tuijian_toubu_tv.setText(op.getString("title"));

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });

        // 设置该请求的标签
        request1.setTag("abcGet");

        // 将请求添加到队列中
        requestQueue1.add(request1);

    }

}

