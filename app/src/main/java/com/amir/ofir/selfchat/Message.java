package com.amir.ofir.selfchat;

/**
 * Created by ofir on 21/04/18.
 */

public class Message {

    String msg;
    String user;
    String time;

    public Message(String msg, String user, String time) {
        this.msg = msg;
        this.user = user;
        this.time = time;
    }



    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
