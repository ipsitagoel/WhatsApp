package com.example.whatsapp;

import java.util.ArrayList;

public class ChatListClass {

    String Name, Msg;

    public ChatListClass(){}

    public ChatListClass(String name, String msg)
    {
        setName(name);
        setMsg(msg);
    }

    public ArrayList<ChatListClass> setChatList()
    {
        ChatListClass item;
        ArrayList<ChatListClass> chatArray = new ArrayList<ChatListClass>();
        item = new ChatListClass("Ipsita", "Heyy!!");
        chatArray.add(item);
        item = new ChatListClass("Vinamrrata", "Hi");
        chatArray.add(item);
        item = new ChatListClass("Rishika", "Wassup");
        chatArray.add(item);
        item = new ChatListClass("Pragya", "Hello!");
        chatArray.add(item);
        item = new ChatListClass("Dhruv", "Yo!!");
        chatArray.add(item);
        item = new ChatListClass("Ipsita", "Heyy!!");
        chatArray.add(item);
        item = new ChatListClass("Vinamrrata", "Hi");
        chatArray.add(item);
        item = new ChatListClass("Rishika", "Wassup");
        chatArray.add(item);
        item = new ChatListClass("Pragya", "Hello!");
        chatArray.add(item);
        item = new ChatListClass("Dhruv", "Yo!!");
        chatArray.add(item);
        item = new ChatListClass("Pragya", "Hello!");
        chatArray.add(item);
        item = new ChatListClass("Dhruv", "Yo!!");
        chatArray.add(item);
        item = new ChatListClass("Ipsita", "Heyy!!");
        chatArray.add(item);
        item = new ChatListClass("Vinamrrata", "Hi");
        return chatArray;

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String Msg) {
        this.Msg = Msg;
    }
}
