package technicalhub.io.purshotam.adityabloodcross;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class MyApplicationName extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
