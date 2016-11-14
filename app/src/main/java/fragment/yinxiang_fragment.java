package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.liujie.lenovo.yulin.R;

/**
 * Created by lenovo on 2016/11/1.
 */
public class yinxiang_fragment extends Fragment implements View.OnClickListener {

    private RadioButton rb_tuijian;
    private RadioButton rb_ouyu;
    private FragmentManager manager;
    private tuijian_fragment tuijian;
    private ouyu_fragment ouyu;

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.yinxiang_fragment, null);
        rb_tuijian = (RadioButton) view.findViewById(R.id.rb_tuijian);
        rb_ouyu = (RadioButton) view.findViewById(R.id.rb_ouyu);

        rb_tuijian.setOnClickListener(this);
        rb_ouyu.setOnClickListener(this);

        getFragment();
        changeFragment("f1");
        return view;
    }

    private void changeFragment(String tag) {
        // TODO Auto-generated method stub
        FragmentTransaction trans = manager.beginTransaction();

        if ("f1".equals(tag)) {
            trans.show(tuijian);
            trans.hide(ouyu);

        } else if ("f2".equals(tag)) {
            trans.show(ouyu);
            trans.hide(tuijian);

        }
        trans.commit();
    }

    private void getFragment() {
        manager =getChildFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();
        tuijian = new tuijian_fragment();
        ouyu = new ouyu_fragment();
        trans.add(R.id.fg, tuijian, "f1");
        trans.add(R.id.fg, ouyu, "f2");
        trans.commit();
    }



    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.rb_tuijian:
                changeFragment("f1");
                break;
            case R.id.rb_ouyu:
                changeFragment("f2");
                break;

            default:
                break;
        }
    }


}