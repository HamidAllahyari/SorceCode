package test.allahyari.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.TextureView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int Istart = 0 ;
    int IResume = 0;
    int Ipause = 0;
    int Istop = 0;
    int Idesttory = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG","Number of onCreate!!!");
        //Log

    }
    ///////////////
    @Override
    protected void onStart() {
        super.onStart();
        Istart +;
        Log.d("TAG","Number of onStart : "+ Istart);
    }
    ////////////////////
    @Override
    protected void onResume() {
        super.onResume();
        IResume +=1;
        Log.d("TAG","Number of onResume : "+ IResume);
    }
    /////////////
    @Override
    protected void onPause() {
        super.onPause();
        Ipause +=1;
        Log.d("TAG","Number of onPause : "+ Ipause);
    }
    ////////////
    @Override
    protected void onStop() {
        super.onStop();
        Istop +=1;
        Log.d("TAG","Number of onStop : "+ Istop);
    }
    ////////////
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Idesttory +=1;
        Log.d("TAG","Number os onDesttory : "+ Idesttory);
    }
}
