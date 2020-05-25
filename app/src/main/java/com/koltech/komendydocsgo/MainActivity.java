package com.koltech.komendydocsgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        setContentView(R.layout.menu_g);
        MobileAds.initialize(this, "ca-app-pub-4834003578511022~3179021828");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void Celownik(View v){
       // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,Celownik.class);
        startActivity(intent);
    }

    public void Radar(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,Radar.class);
        startActivity(intent);
    }
    public void KomendydoCwiczen(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,Komendydocwiczen.class);
        startActivity(intent);
    }
    public void Boty(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,Boty.class);
        startActivity(intent);
    }
    public void Bronie(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,bronie.class);
        startActivity(intent);
    }
    public void Granaty(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,Granaty.class);
        startActivity(intent);
    }
    public void FPS(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,FPS.class);
        startActivity(intent);
    }
    public void Hud(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,HUD.class);
        startActivity(intent);
    }
    public void Myszka(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,Myszka.class);
        startActivity(intent);
    }
    public void PozycjaBroni(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,Pozycjabroni.class);
        startActivity(intent);
    }
    public void Dzwienk(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,Dzwienk.class);
        startActivity(intent);
    }
    public void ZarzadzanieSerwerem(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,ZarzondzanieSerwerem.class);
        startActivity(intent);
    }
    public void Loncze(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,Loncze.class);
        startActivity(intent);
    }

    public void Demo(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,Demo.class);
        startActivity(intent);
    }
    public void Inne(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,Inne.class);
        startActivity(intent);
    }

    public void Bindy(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,Bindy.class);
        startActivity(intent);
    }

    public void ParametryStartowe(View v){
        // setContentView(R.layout.celownik);

        Intent intent = new Intent(MainActivity.this,ParametryStartowe.class);
        startActivity(intent);
    }
}
