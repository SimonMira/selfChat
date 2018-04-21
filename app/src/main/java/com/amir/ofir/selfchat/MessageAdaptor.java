package com.amir.ofir.selfchat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.amir.ofir.selfchat.Message;
import com.amir.ofir.selfchat.R;

import java.util.List;



public class MessageAdaptor extends ArrayAdapter<Message> {
    List<Message> messages;
    private Context context;

    public MessageAdaptor(@NonNull Context context, @NonNull List msgs) {
        super(context, 0, msgs);
        messages = msgs;
        this.context = context;
    }


    public void add(Message toAdd){
        messages.add(toAdd);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // init a new view to be the xml?
        View listitem = convertView;

        if (listitem == null) {
            listitem = LayoutInflater.from(context).inflate(R.layout.message_layout, parent, false);
        }

        Message msg = messages.get(position);
        TextView tv_user = listitem.findViewById(R.id.user);
        tv_user.setText(msg.getUser());

        TextView tv_msg = listitem.findViewById(R.id.msg);
        tv_msg.setText(msg.getMsg());

        TextView tv_time = listitem.findViewById(R.id.hour);
        tv_time.setText(msg.getTime());

        return listitem;
    }

}
