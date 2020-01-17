package com.koltech.komendydocsgo;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class bronie extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bronie);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

   public void Noze(View w){
        setContentView(R.layout.noze);
    }

   public void Pistolety(View w){
        setContentView(R.layout.pistolety);
    }
    public void SMG(View v){
        setContentView(R.layout.smg);
    }
    public void Hewi(View v){
        setContentView(R.layout.bron_cienszka);
    }
    public void Karabiny(View v){
        setContentView(R.layout.karabiny);
    }
    public void Granaty(View v){
        setContentView(R.layout.granaty);
    }
    public void Ekwipunek(View v){
        setContentView(R.layout.ekwipunek);
    }

    public void Inne(View v){
        setContentView(R.layout.brn_inne);
    }





}
