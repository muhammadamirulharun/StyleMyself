package kacak.stylemyself;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {
    public static int SPLASH_TIMEOUT = 3000; //how long the splash screen will be

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent signIn = new Intent(splashscreen.this, DailyWear.class); //temporary
                startActivity(signIn);
                finish();

            }
        },SPLASH_TIMEOUT);
    }
}
