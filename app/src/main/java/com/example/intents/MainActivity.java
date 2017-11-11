package com.example.intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void process(View view) {
        Intent intent = null, chooser = null;

        if (view.getId() == R.id.startNewActivity) {
            intent = new Intent(MainActivity.this, NewActivity.class);
            MainActivity.this.startActivity(intent);
        }
        if (view.getId() == R.id.launchMap) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:28.704, 77.102"));
            chooser = Intent.createChooser(intent, "Launch Maps");
            startActivity(chooser);
        }
        if (view.getId() == R.id.launchMarket) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=com.android.chrome&hl=en"));
            chooser = Intent.createChooser(intent, "Launch Market");
            startActivity(chooser);
        }
        if (view.getId() == R.id.sendMail) {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to = {"emailAddress1", "emailAddress2"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Email test");
            intent.putExtra(Intent.EXTRA_TEXT, "Hi there. Testing the mail app");
            intent.setType("message/rfc822");
            chooser = Intent.createChooser(intent, "Send Email");
            startActivity(chooser);
        }

        if (view.getId() == R.id.makeToast) {
            Toast toast = new Toast(this);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setGravity(Gravity.BOTTOM, 0, 0);
            LayoutInflater inflater = getLayoutInflater();
            View appearance = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.llToast));
            toast.setView(appearance);
            toast.show();
        }
    }
}
