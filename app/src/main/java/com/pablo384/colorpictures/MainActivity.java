package com.pablo384.colorpictures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int PETICION_FOTO = 1;
    public static final int PETICION_VIDEO = 2;
    public static final int PETICION_GALERIA_FOTOS = 3;
    public static final int PETICION_GALERIA_VIDEOS = 4;

    public static final int MEDIA_FOTO = 5;
    public static final int MEDIA_VIDEO = 6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void takePhoto(View view) {
        makeToast("Take Photo");
    }

    public void takeVideo(View view) {
        makeToast("Take Video");
    }

    public void galleryPhotos(View view) {
        makeToast("Gallery Photo");
    }

    public void galleryVideos(View view) {
        makeToast("Gallery Video");
    }
    public void makeToast(String text){

        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();

    }
}
