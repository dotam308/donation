package com.example.donation15.activities;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.example.donation15.models.Donation;

import java.util.ArrayList;
import java.util.List;

public class DonationApp extends Application
{
    public final int target = 10000;
    public int totalDonated = 0;
    public List <Donation> donations = new ArrayList<Donation>();
    public boolean newDonation(Donation donation)
    {
        boolean targetAchieved = totalDonated > target;
        if (!targetAchieved)
        {
            donations.add(donation);
            totalDonated += donation.amount;
        }
        else
        {
            Toast.makeText(this, "Target Exceeded!", Toast.LENGTH_SHORT).show();
        }
        return targetAchieved;
    }
    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.v("Donation", "Donation App Started");
    }
}