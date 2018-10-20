package tw.dora.imagetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgView;
    private int imgW, imgH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = findViewById(R.id.imgView);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int vW = dm.widthPixels;
        int vH = dm.heightPixels;
        float dd = dm.density;
        Log.v("brad","Window: "+vW+" x "+vH);
        Log.v("brad","Window Density: "+dd);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("brad","onStart");
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        imgW  = imgView.getWidth();
        imgH = imgView.getHeight();
        Log.v("brad",imgW+" x "+imgH);
    }
}
