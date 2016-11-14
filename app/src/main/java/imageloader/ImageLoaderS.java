package imageloader;

import android.app.Application;

import com.liujie.lenovo.yulin.R;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.memory.impl.UsingFreqLimitedMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by lenovo on 2016/11/2.
 */
public class ImageLoaderS extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .cacheOnDisk(true).cacheInMemory(true)
                .showImageOnLoading(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.ic_launcher).build();
        int maxSize = (int) (Runtime.getRuntime().maxMemory() / 8);
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(
                getApplicationContext())
                .discCache(new UnlimitedDiskCache(getCacheDir()))
                .memoryCache(new UsingFreqLimitedMemoryCache(maxSize))
                .threadPoolSize(3).threadPriority(Thread.NORM_PRIORITY - 1)
                .defaultDisplayImageOptions(options).build();
        ImageLoader.getInstance().init(configuration);
    }
}
