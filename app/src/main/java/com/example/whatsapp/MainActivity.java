package com.example.whatsapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private ViewPager myViewPager;
    private TabLayout myTablayout;
    private ChatsRecyclerAdapter myChatsRecyclerAdapter;
    private ChatsFragment myChatsFragment;
    private TabsAccessorAdapter myTabsAccessorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("WhatsApp");


        myViewPager = (ViewPager) findViewById(R.id.main_tabs_pager);
        myTabsAccessorAdapter = new TabsAccessorAdapter(getSupportFragmentManager());
        myViewPager.setAdapter(myTabsAccessorAdapter);

        myTablayout=(TabLayout) findViewById(R.id.main_tabs);
        myTablayout.setupWithViewPager(myViewPager);

        FloatingActionButton fabtn = (FloatingActionButton) findViewById(R.id.f_a_btn);

        fabtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Your Action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }

        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if(item.getItemId()==R.id.main_new_group_option){

        }
        if(item.getItemId()==R.id.main_new_broadcast_option){

        }
        if(item.getItemId()==R.id.main_whatsapp_web_option){

        }
        if(item.getItemId()==R.id.main_starred_messages_option){

        }
        if(item.getItemId()==R.id.main_settings_option){

        }

        return true;
    }
}
