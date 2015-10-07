package andres_sjsu.simplechat;

import android.app.Application;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by andres on 9/30/15.
 */
public class ChatApplication extends Application {
    public static final String YOUR_APPLICATION_ID = "YFdBmwLFVvbdoKadbCtr8z1IKGongELNfynxzNi1";
    public static final String YOUR_CLIENT_KEY = "lA2isCvA1wvAaPFgBsRe1yPHS3S07frrBcpmyWR2";

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models here
        ParseObject.registerSubclass(Message.class);

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);

        // Test creation of object
       // ParseObject testObject = new ParseObject("TestObject");
       // testObject.put("foo", "bar");
       // testObject.saveInBackground();
    }
}