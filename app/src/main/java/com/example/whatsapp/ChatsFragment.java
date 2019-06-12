package com.example.whatsapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;


public class ChatsFragment extends Fragment implements SearchView.OnQueryTextListener{

    RecyclerView recyclerView;
    ChatsRecyclerAdapter chatsRecyclerAdapter = new ChatsRecyclerAdapter();
    FloatingActionButton floatingActionButton;


    public ChatsFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_chats, container, false);
        recyclerView= rootview.findViewById(R.id.chats_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(chatsRecyclerAdapter);
        return rootview;
    }

    void updatesearch(ArrayList<ChatListClass> newsearchList){
        chatsRecyclerAdapter.searchList(newsearchList);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View mainview = getActivity().findViewById(R.id.f_a_btn);
        floatingActionButton = (FloatingActionButton) mainview;
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {

        MenuItem searchItem = menu.findItem(R.id.search_view);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(this);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        int count = 0;
        String inputText = newText.toLowerCase();
        ChatListClass chatListClass = new ChatListClass();
        ArrayList<ChatListClass> searchList = chatListClass.setChatList();
        ArrayList<ChatListClass> newsearchList = new ArrayList<ChatListClass>();

        for(int i = 0 ; i<searchList.size() ; i++)
        {
            if(searchList.get(i).getName().toLowerCase().contains(inputText))
            {
                count++;
                newsearchList.add(searchList.get(i));
            }
        }
        updatesearch(newsearchList);

        for(int i = 0 ; i<searchList.size() ; i++)
        {
            if(searchList.get(i).getMsg().toLowerCase().contains(inputText))
            {
                count++;
                newsearchList.add(searchList.get(i));
            }
        }
        updatesearch(newsearchList);

        return true;
    }
}
