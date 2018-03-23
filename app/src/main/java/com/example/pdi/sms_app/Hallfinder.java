package com.example.pdi.sms_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import android.util.Log;
import android.support.annotation.NonNull;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class Hallfinder extends AppCompatActivity {

    public static final String TAG = "TAG: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hallfinder);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        //El siguiente fragmento de codigo es el que borra el usuario automaticamente
        user.delete()
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Log.d(TAG, "User account deleted.");
                        }
                    }
                });
        Toast.makeText(getApplicationContext(), "Verificación correcta", Toast.LENGTH_LONG).show();
    }
}
