package com.example.donation15.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.donation15.R;
import com.example.donation15.models.Donation;

import java.util.ArrayList;
import java.util.List;

public class Report extends Base
{
    ListView listView;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        listView = (ListView) findViewById(R.id.reportList);
        DonationAdapter adapter = new DonationAdapter(this, donations);
        listView.setAdapter(adapter);
    }
}
