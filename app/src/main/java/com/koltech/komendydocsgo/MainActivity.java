package com.koltech.komendydocsgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    //private AdView AdView;
    private AdView adView;
    private FrameLayout adContainerView;
    private static final String AD_UNIT_ID = "ca-app-pub-4834003578511022/6879713249";

    private static long back_pressed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        setContentView(R.layout.menu_g);
      //  MobileAds.initialize(this, "ca-app-pub-4834003578511022~3179021828");

     //   mAdView = findViewById(R.id.adView);
      //  AdRequest adRequest = new AdRequest.Builder().build();
      //  mAdView.loadAd(adRequest);

        // Initialize the Mobile Ads SDK.
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });

       // MobileAds.setRequestConfiguration(
        //        new RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList("ABCDEF012345")).build());




        adContainerView = findViewById(R.id.ad_view_container_menu);

        // Since we're loading the banner based on the adContainerView size, we need to wait until this
        // view is laid out before we can get the width.
        adContainerView.post(new Runnable() {
            @Override
            public void run() {
                loadBanner();
            }
        });


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





    @Override
    public void onBackPressed()
    {
        if (back_pressed + 4000 > System.currentTimeMillis()) super.onBackPressed();
        else Toast.makeText(getBaseContext(), "Wciśnij jeszcze raz, aby zamknąć!", Toast.LENGTH_SHORT).show();
        back_pressed = System.currentTimeMillis();
    }


    /** Called when leaving the activity */
    @Override
    public void onPause() {
        if (adView != null) {
            adView.pause();
        }
        super.onPause();
    }

    /** Called when returning to the activity */
    @Override
    public void onResume() {
        super.onResume();
        if (adView != null) {
            adView.resume();
        }
    }

    /** Called before the activity is destroyed */
    @Override
    public void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }

    private void loadBanner() {
        // Create an ad request.
        adView = new AdView(this);
        adView.setAdUnitId(AD_UNIT_ID);
        adContainerView.removeAllViews();
        adContainerView.addView(adView);

        AdSize adSize = getAdSize();
        adView.setAdSize(adSize);

        AdRequest adRequest = new AdRequest.Builder().build();

        // Start loading the ad in the background.
        adView.loadAd(adRequest);
    }

    private AdSize getAdSize() {
        // Determine the screen width (less decorations) to use for the ad width.
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float density = outMetrics.density;

        float adWidthPixels = adContainerView.getWidth();

        // If the ad hasn't been laid out, default to the full screen width.
        if (adWidthPixels == 0) {
            adWidthPixels = outMetrics.widthPixels;
        }

        int adWidth = (int) (adWidthPixels / density);

        return AdSize.getCurrentOrientationBannerAdSizeWithWidth(this, adWidth);
    }
}
