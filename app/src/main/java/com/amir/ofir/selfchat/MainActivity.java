package com.amir.ofir.selfchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    EditText edi;
    ListView lv;
    MessageAdaptor messageAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        edi = findViewById(R.id.textbox);
        lv = findViewById(R.id.lv);
        setContentView(R.layout.activity_main);
        messageAdaptor = new MessageAdaptor(this,new ArrayList<Message>());
        lv.setAdapter(messageAdaptor);
    }


    public void sendClicked(View view) {
        String curr_msg = edi.getText().toString();
        if (curr_msg != null){
            messageAdaptor.add(new Message(curr_msg, "ofir", new Date().toString()));
        }

        edi.setText(null);

    }
}
