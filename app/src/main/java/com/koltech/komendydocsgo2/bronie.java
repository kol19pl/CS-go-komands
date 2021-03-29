package com.koltech.komendydocsgo2;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class bronie extends AppCompatActivity {
    private AdView adView;
    private FrameLayout adContainerView;
    private static final String AD_UNIT_ID = "ca-app-pub-4834003578511022/1023563551";
    AdView adViewM;
    FrameLayout adContainerViewM;
    String AD_UNIT_ID_POP_UP = "ca-app-pub-4834003578511022/1187215082";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bronie);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        adContainerView = findViewById(R.id.adConBronie);

        // Since we're loading the banner based on the adContainerView size, we need to wait until this
        // view is laid out before we can get the width.
        adContainerView.post(new Runnable() {
            @Override
            public void run() {
                loadBanner();
            }
        });
    }

   public void Noze(View w){
        setContentView(R.layout.noze);
       adContainerView = findViewById(R.id.adConNz);
       adContainerView.post(new Runnable() {
           @Override
           public void run() {
               loadBanner();
           }
       });
    }

    public void NozeBulider(View w){
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(bronie.this);
        View mView = getLayoutInflater().inflate(R.layout.noze_pop_up, null);
        TextView wiad = (TextView) mView.findViewById(R.id.Nozeinfo);
        ImageView imageView = (ImageView) mView.findViewById(R.id.imagenuz);


     //    AdView mxAdView = (AdView) mView.findViewById(R.id.adViewnuzinfo);
     //   AdRequest adRequest = new AdRequest.Builder().build();
     //   mxAdView.loadAd(adRequest);


        String comenda=w.getTag().toString();

        Drawable drawable = null;
        //drawable = getResources().getDrawable(R.drawable.knife_t);
        if(comenda.contains("knife")){
            drawable = getResources().getDrawable(R.drawable.knife);

        }
        if(comenda.contains("knife_t")){
            drawable = getResources().getDrawable(R.drawable.knife_t);

        }
        if(comenda.contains("knife_css")){
            drawable = getResources().getDrawable(R.drawable.css);

        }
        if(comenda.contains("bayonet")){
            drawable = getResources().getDrawable(R.drawable.bayonet);

        }
        if(comenda.contains("knife_flip")){
            drawable = getResources().getDrawable(R.drawable.flip);

        }
        if(comenda.contains("knife_gut")){
            drawable = getResources().getDrawable(R.drawable.gut);

        }
        if(comenda.contains("knife_karambit")){
            drawable = getResources().getDrawable(R.drawable.karambit);

        }
        if(comenda.contains("knife_m9")){
            drawable = getResources().getDrawable(R.drawable.m9_bayonet);

        }
        if(comenda.contains("knife_tactical")){
            drawable = getResources().getDrawable(R.drawable.tactical);

        }
        if(comenda.contains("knife_butterfly")){
            drawable = getResources().getDrawable(R.drawable.baterfly);

        }
        if(comenda.contains("knife_falchion")){
            drawable = getResources().getDrawable(R.drawable.falchion);

        }
        if(comenda.contains("knife_push")){
            drawable = getResources().getDrawable(R.drawable.push);

        }
        if(comenda.contains("knifegg")){
            drawable = getResources().getDrawable(R.drawable.knifegg);

        }
        if(comenda.contains("knife_survival_bowie")){
            drawable = getResources().getDrawable(R.drawable.survival_bowie);

        }
        if(comenda.contains("knife_ursus")){
            drawable = getResources().getDrawable(R.drawable.ursus);

        }
        if(comenda.contains("knife_gypsy_jackknife")){
            drawable = getResources().getDrawable(R.drawable.jackknife);

        }
        if(comenda.contains("knife_stiletto")){
            drawable = getResources().getDrawable(R.drawable.stiletto);

        }
        if(comenda.contains("knife_widowmaker")){
            drawable = getResources().getDrawable(R.drawable.widolmakier);

        }
        if(comenda.contains("knife_ghost")){
            drawable = getResources().getDrawable(R.drawable.gost);

        }
        if(comenda.contains("knife_canis")){
            drawable = getResources().getDrawable(R.drawable.canis);

        }
        if(comenda.contains("knife_cord")){
            drawable = getResources().getDrawable(R.drawable.cord);

        }
        if(comenda.contains("knife_skeleton")){
            drawable = getResources().getDrawable(R.drawable.skeleton);

        }
        if(comenda.contains("knife_outdoor")){
            drawable = getResources().getDrawable(R.drawable.outdoor);

        }

        imageView.setImageDrawable(drawable);






       // Button ok = (Button) mView.findViewById(R.id.powiadmienieok);
        try {


        wiad.setText(comenda+"; ");
        } catch (Exception e) {
            wiad.setText("error");
            e.printStackTrace();
        }

        mBuilder.setView(mView);
        final AlertDialog dialog = mBuilder.create();

        dialog.show();

    }

   public void Pistolety(View w){
        setContentView(R.layout.pistolety);
       adContainerView = findViewById(R.id.adConNz);
       adContainerView.post(new Runnable() {
           @Override
           public void run() {
               loadBanner();
           }
       });
    }
    public void SMG(View v){
        setContentView(R.layout.smg);
        adContainerView = findViewById(R.id.adConNz);
        adContainerView.post(new Runnable() {
            @Override
            public void run() {
                loadBanner();
            }
        });
    }
    public void Hewi(View v){
        setContentView(R.layout.bron_cienszka);
        adContainerView = findViewById(R.id.adConNz);
        adContainerView.post(new Runnable() {
            @Override
            public void run() {
                loadBanner();
            }
        });
    }
    public void Karabiny(View v){
        setContentView(R.layout.karabiny);
        adContainerView = findViewById(R.id.adConNz);
        adContainerView.post(new Runnable() {
            @Override
            public void run() {
                loadBanner();
            }
        });
    }
    public void Granaty(View v){
        Intent intent = new Intent(bronie.this,Granaty.class);
        startActivity(intent);
      //  setContentView(R.layout.granaty);
    }
    public void Ekwipunek(View v){
        setContentView(R.layout.ekwipunek);
        adContainerView = findViewById(R.id.adConNz);
        adContainerView.post(new Runnable() {
            @Override
            public void run() {
                loadBanner();
            }
        });
    }

    public void DangerZone(View v){
        setContentView(R.layout.danger_zone);
    }

    public void Inne(View v){
        setContentView(R.layout.brn_inne);
        adContainerView = findViewById(R.id.adConNz);
        adContainerView.post(new Runnable() {
            @Override
            public void run() {
                loadBanner();
            }
        });
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
        // Step 2 - Determine the screen width (less decorations) to use for the ad width.
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;

        int adWidth = (int) (widthPixels / density);

        // Step 3 - Get adaptive ad size and return for setting on the ad view.
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth);
    }





}
