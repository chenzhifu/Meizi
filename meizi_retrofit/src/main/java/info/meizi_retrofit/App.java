package info.meizi_retrofit;

import android.app.Application;
import android.content.Context;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Mr_Wrong on 15/10/30.
 */
public class App extends Application {
    private static Context mContext;
    //private RefWatcher mRefWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        //mRefWatcher = LeakCanary.install(this);
        mContext = getApplicationContext();
        RealmConfiguration config = new RealmConfiguration.Builder(getContext()).build();
        Realm.setDefaultConfiguration(config);
    }

    public static Context getContext() {
        return mContext;
    }

//    public static RefWatcher getRefWatcher(Context context) {
//        App application = (App) context.getApplicationContext();
//        return application.mRefWatcher;
//    }
}
