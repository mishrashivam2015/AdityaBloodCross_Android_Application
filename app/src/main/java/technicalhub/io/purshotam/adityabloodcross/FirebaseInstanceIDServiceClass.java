package technicalhub.io.purshotam.adityabloodcross;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseInstanceIDServiceClass extends FirebaseInstanceIdService {
    SharedPreferences sp;
    SharedPreferences.Editor ed;

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();
        sp = getSharedPreferences("TOKEN",MODE_PRIVATE);
        ed = sp.edit();
        ed.putString("Token",token);
        ed.apply();
    }
}
