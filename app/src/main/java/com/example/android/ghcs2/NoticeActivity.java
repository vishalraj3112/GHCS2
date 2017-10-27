package com.example.android.ghcs2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.data;
import static android.R.attr.privateImeOptions;

/**
 * Created by VIshal on 10-09-2017.
 */

public class NoticeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter mAdapter;
    private List<DataModel> dataModel;
    private RecyclerView.LayoutManager mLayoutManager;

    //ArrayList<DataModel> dataModels;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.noticeTitle);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        dataModel = new ArrayList<>();
        mAdapter = new MyAdapter(this, dataModel);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
        prepareData();
    }
        private void prepareData() {
            int[] albums = new int[]{
                    R.drawable.album1,
                    R.drawable.album2,
                    R.drawable.album3,
                    R.drawable.album4,
                    R.drawable.album5,
                    R.drawable.album6,
                    R.drawable.album7,
                    R.drawable.album8,
                    R.drawable.album9,
                    R.drawable.album10,
                    R.drawable.album11
            };
            String[] notice = new String[]{"Notice 1.", "Notice 2.", "Notice 3.", "Notice 4.", "Notice 5.", "Notice 6.", "Notice 7.",
                    "Notice 8.", "Notice 9.", "Notice 10.", "Notice 11."
            };
            String[] des = new String[]{"Description 1.", "Description 2.", "Description 3.", "Description 4.", "Description 5.", "Description 6.",
                    "Description 7.", "Description 8.", "Description 9.", "Description 10.", "Description 11."};


            for (int i = 0; i < 11; i++) {
                DataModel d = new DataModel(notice[i], des[i], albums[i]);
                dataModel.add(d);
            }
            mAdapter.notifyDataSetChanged();
        }
        /*listView = (ListView) findViewById(R.id.notice_list);

        dataModels = new ArrayList<>();
        dataModels.add(new DataModel("Date 1", "Description 1", R.drawable.album1));
        dataModels.add(new DataModel("Date 2", "Description 2", R.drawable.album2));
        dataModels.add(new DataModel("Date 3", "Description 3", R.drawable.album3));
        dataModels.add(new DataModel("Date 4", "Description 4", R.drawable.album4));
        dataModels.add(new DataModel("Date 5", "Description 5", R.drawable.album5));
        dataModels.add(new DataModel("Date 6", "Description 6", R.drawable.album6));
        dataModels.add(new DataModel("Date 7", "Description 7", R.drawable.album7));
        dataModels.add(new DataModel("Date 8", "Description 8", R.drawable.album8));
        dataModels.add(new DataModel("Date 9", "Description 9", R.drawable.album9));
        dataModels.add(new DataModel("Date 10", "Description 10", R.drawable.album10));
        dataModels.add(new DataModel("Date 11", "Description 11", R.drawable.album11));

        adapter = new CustomAdapter(dataModels, getApplicationContext());
        listView.setAdapter(adapter);
        */

    }



