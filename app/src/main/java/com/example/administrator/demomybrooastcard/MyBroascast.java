package com.example.administrator.demomybrooastcard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroascast extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        String dulieunhan=intent.getStringExtra("data");
        Toast.makeText(context,dulieunhan, Toast.LENGTH_SHORT).show();
    }
}
