package com.marksmith.parsetodolist;

import android.app.Application;
import com.parse.Parse;

/**
 * Created by mark on 11/9/2015.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this,"9mQviHzF8OdeKGoxfSlH3e6u62wDRMQHwd6rSYHt", "Cjq7jURr14HDUiCLE2Dj4SNVZ4p2WXwuYkjcYkso");
    }
}
