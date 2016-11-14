package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.liujie.lenovo.yulin.R;

import adapter.My_wode_ListView_Adapter;

/**
 * Created by lenovo on 2016/11/1.
 */
public class wode_fragment extends Fragment {
    private ListView lv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      View view=View.inflate(getActivity(), R.layout.wode_fragment,null);
        lv=(ListView)view.findViewById(R.id.wode_fragment_lv);
        lv.setAdapter(new My_wode_ListView_Adapter(getActivity()));
        return view;

    }
}
