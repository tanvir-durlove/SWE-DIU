package spurs.cafesoft.swe_diu;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import spurs.cafesoft.fragment.Fragment_about;
import spurs.cafesoft.fragment.Fragment_dept;
import spurs.cafesoft.fragment.Fragment_home;
import spurs.cafesoft.fragment.Fragment_leve_one;
import spurs.cafesoft.fragment.Fragment_level_four;
import spurs.cafesoft.fragment.Fragment_level_three;
import spurs.cafesoft.fragment.Fragment_level_two;
import spurs.cafesoft.fragment.Fragment_main;
import spurs.cafesoft.fragment.Fragment_massege_of_head;
import spurs.cafesoft.fragment.Fragment_message_of_chairman;
import spurs.cafesoft.fragment.Fragment_photo;
import spurs.cafesoft.fragment.Fragment_teachers;
import spurs.cafesoft.fragment.Fragment_versity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Share this application");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //drawer.setDescendantFocusability(ViewGroup.FOCUS_BLOCK_DESCENDANTS);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.frame_layout, new Fragment_main()).commit();
    }

    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this).setIcon(R.drawable.exit)
                .setTitle("EXIT???")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.super.onBackPressed();
                    }
                }).create().show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        FragmentManager fm =getFragmentManager();

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            fm.beginTransaction().replace(R.id.frame_layout, new Fragment_home()).commit();
        }else if (id == R.id.msgofchairman) {
            fm.beginTransaction().replace(R.id.frame_layout, new Fragment_message_of_chairman()).commit();
        }else if (id == R.id.vrsty) {
            fm.beginTransaction().replace(R.id.frame_layout, new Fragment_versity()).commit();
        } else if (id == R.id.dept) {
            fm.beginTransaction().replace(R.id.frame_layout, new Fragment_dept()).commit();
        }else if (id == R.id.msgofhead) {
            fm.beginTransaction().replace(R.id.frame_layout, new Fragment_massege_of_head()).commit();
        }else if (id == R.id.deptteacher) {
            fm.beginTransaction().replace(R.id.frame_layout, new Fragment_teachers()).commit();
        } else if (id == R.id.fstyr) {
            fm.beginTransaction().replace(R.id.frame_layout, new Fragment_leve_one()).commit();
        } else if (id == R.id.scndyr) {
            fm.beginTransaction().replace(R.id.frame_layout, new Fragment_level_two()).commit();
        } else if (id == R.id.thrdyr) {
            fm.beginTransaction().replace(R.id.frame_layout, new Fragment_level_three()).commit();
        }else if (id == R.id.fourthyr) {
            fm.beginTransaction().replace(R.id.frame_layout, new Fragment_level_four()).commit();
        }else if (id == R.id.about) {
            fm.beginTransaction().replace(R.id.frame_layout, new Fragment_about()).commit();
        }else if (id == R.id.photogelary) {
            fm.beginTransaction().replace(R.id.frame_layout, new Fragment_photo()).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}
