package kacak.stylemyself;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DailyWear extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
        Toolbar toolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_wear);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);

        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(this);

        mToggle.syncState();

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Style Myself");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.nav_icon);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button =(Button)findViewById(R.id.buttonDailyWear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DailyWear();
            }
        });


        button =(Button)findViewById(R.id.buttonByevent);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Events();
            }
        });


        button =(Button)findViewById(R.id.buttonMatchandPair);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MatchandPair();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mToggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if( id == R.id.my_wardrobe){
            Toast.makeText(this, "My Wardrobe", Toast.LENGTH_SHORT).show();
        }

        if ( id == R.id.add_collection){
            Intent changeActivity = new Intent(getApplicationContext(),AddCollection.class);
            startActivity(changeActivity);
        }

        if ( id == R.id.how_to_use){
            Toast.makeText(this, "How to Use", Toast.LENGTH_SHORT).show();
        }

        if ( id == R.id.previous_style){
            Toast.makeText(this, "Previous style", Toast.LENGTH_SHORT).show();
        }

        if ( id == R.id.favourite){
            Toast.makeText(this, "Favourite", Toast.LENGTH_SHORT).show();

        }

        return false;
    }


    public void DailyWear(){
        Intent mainpage= new Intent(getApplicationContext(), DailyWear2.class);
        startActivity(mainpage);
    }


    public void Events(){
        Intent mainpage= new Intent(getApplicationContext(), events.class);
        startActivity(mainpage);
    }


    public void MatchandPair(){
        Intent mainpage= new Intent(getApplicationContext(), MatchandPair.class);
        startActivity(mainpage);
    }
}
