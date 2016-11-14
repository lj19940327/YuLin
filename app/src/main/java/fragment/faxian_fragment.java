package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.liujie.lenovo.yulin.R;

import adapter.My_faxian_ListView_Adapter;

/**
 * Created by lenovo on 2016/11/1.
 */
public class faxian_fragment extends Fragment {
    private ListView lv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view=View.inflate(getActivity(), R.layout.faxian_fragment,null);
        lv=(ListView)view.findViewById(R.id.faxian_fragment_lv);
        lv.setAdapter(new My_faxian_ListView_Adapter(getActivity()));
        return view;
    }
}
