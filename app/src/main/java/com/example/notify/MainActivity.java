package com.example.notify;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotificationCompat.Builder builder=new android.support.v4.app.NotificationCompat.Builder(context:this);
        builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setContentTitle("whatsappmessage");
        builder.setContentText("message is hi how r u");

        Intent intent=new Intent(packageContext: this, ResultActivity.class);
        PendingIntent pendingIntent = pendingIntent.getActivity(Context:this,requestCode:0,intent,pendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);

        NotificationManager manager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE );
        manager.notify(id:1,builder.build());




    }
}
