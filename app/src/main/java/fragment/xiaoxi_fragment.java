package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liujie.lenovo.yulin.R;

/**
 * Created by lenovo on 2016/11/1.
 */
public class xiaoxi_fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
      View view=View.inflate(getActivity(), R.layout.xiaoxi_fragment,null);
        return view;
    }
}
