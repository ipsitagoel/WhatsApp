package com.example.whatsapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChatsRecyclerAdapter extends RecyclerView.Adapter<ChatsRecyclerAdapter.ChatsViewHolder> {
    ArrayList<ChatListClass> chatArray;

    public ChatsRecyclerAdapter()
    {
        ChatListClass c = new ChatListClass();
        chatArray = new ArrayList<ChatListClass>();
        chatArray = c.setChatList();
    }

    @NonNull
    @Override
    public ChatsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.chats_recycler_view,parent,false);
        return new ChatsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatsViewHolder holder, int position) {
        String n = chatArray.get(position).getName();
        String m = chatArray.get(position).getMsg();

        holder.nameText.setText(n);
        holder.msgText.setText(m);

    }

    @Override
    public int getItemCount() {

            return chatArray.size();
    }

    public class ChatsViewHolder extends RecyclerView.ViewHolder{

        ImageView chat_pro_image;
        TextView nameText, msgText;

        public ChatsViewHolder(View itemView) {
            super(itemView);

            chat_pro_image = itemView.findViewById(R.id.chat_image_holder);
            nameText = itemView.findViewById(R.id.chat_name_holder);
            msgText = itemView.findViewById(R.id.chat_message_holder);

        }
    }

    void searchList(ArrayList<ChatListClass> chatListClasses)
    {
        chatArray = new ArrayList<ChatListClass>();
        for(int i = 0; i< chatListClasses.size(); i++)
        {
            chatArray.add(chatListClasses.get(i));
        }
        notifyDataSetChanged();
    }
}
