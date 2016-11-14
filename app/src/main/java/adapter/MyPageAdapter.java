package adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.liujie.lenovo.yulin.R;

/**
 * Created by lenovo on 2016/10/31.
 */
public class MyPageAdapter extends PagerAdapter {
    private int[] image = {R.mipmap.start1, R.mipmap.start2, R.mipmap.start3, R.mipmap.start4};
    private Context context;

    public MyPageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = View.inflate(context, R.layout.navigation_image, null);
        ImageView image_view = (ImageView) view.findViewById(R.id.image_view);
        image_view.setImageResource(image[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((View) object);
    }
}
