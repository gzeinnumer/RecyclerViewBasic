package com.zein.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate Oke");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps oke");

        mImageUrls.add("https://blog.tiket.com/wp-content/uploads/Gambar-Pemandangan-Alam-Terindah-Danau-Weekuri.jpg");
        mNames.add("Danau");

        mImageUrls.add("https://blog.tiket.com/wp-content/uploads/Gambar-Pemandangan-Alam-Terindah-Danau-Toba.jpg");
        mNames.add("Danau Toba");

        mImageUrls.add("https://blog.tiket.com/wp-content/uploads/Gambar-Pemandangan-Alam-Terindah-Danau-Kelimutu.jpg");
        mNames.add("Danau Kelimutu");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbrRMaziA1vnpoIBu0VHIFbrdz0whR2vRGNsI6E9w4DYb8NFxq");
        mNames.add("Jembatan");

        mImageUrls.add("https://c1.staticflickr.com/1/944/40484682670_e424a3dbdb_c.jpg");
        mNames.add("Lembah");

        mImageUrls.add("https://1.bp.blogspot.com/-PH8tZN-hc9Y/WP8Rn-1rtpI/AAAAAAAAAT0/7qJ2DKuWAs4TPn_TgHpCPdNM8_Uu9x5vgCLcB/s1600/gambar%2Bpemandangan%2Bhutan%2Byang%2Bindah%2B%25281%2529.jpg");
        mNames.add("Hutan Bambu");

        mImageUrls.add("https://s3-ap-southeast-1.amazonaws.com/plukme/upload/media/posts/2018-06/05/1528204872-keindahan-pemandangan-alam-bawah-laut_1528204872-b.jpg");
        mNames.add("Sotong");

        mImageUrls.add("https://www.pemburuombak.com/media/k2/items/cache/f281ac802210810c0fb503efc1b12ce0_XL.jpg");
        mNames.add("Komodo");

        mImageUrls.add("http://cdn2.tstatic.net/jambi/foto/bank/images/ikan-koi_20161117_134851.jpg");
        mNames.add("Koi");

        mImageUrls.add("http://www.distributorwallpaperdinding.com/wp-content/uploads/2017/07/Wallpaper-Custom-Gambar-Pemandangan-034.jpg");
        mNames.add("Bambu");

        mImageUrls.add("https://www.rimma.co/wp-content/uploads/2017/01/8-10.jpg");
        mNames.add("Sun Rise");

        mImageUrls.add("https://www.superadventure.co.id/uploads/news/2018/06/08/2d31eb2997f1_resize_800_600_rel_left_top.jpg");
        mNames.add("Tree");

        initRecycleView();

    }

    public void initRecycleView(){
        Log.d(TAG, "inRecycleView Oke");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
