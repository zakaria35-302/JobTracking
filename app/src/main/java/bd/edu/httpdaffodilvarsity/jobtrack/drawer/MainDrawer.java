package bd.edu.httpdaffodilvarsity.jobtrack.drawer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import bd.edu.httpdaffodilvarsity.jobtrack.JobManagement.JobManagement;
import bd.edu.httpdaffodilvarsity.jobtrack.R;
import bd.edu.httpdaffodilvarsity.jobtrack.ui.login.EditEmployeeAccount;
import bd.edu.httpdaffodilvarsity.jobtrack.ui.login.HomeSettingTab;
import bd.edu.httpdaffodilvarsity.jobtrack.ui.login.HomeTabActivity;
import bd.edu.httpdaffodilvarsity.jobtrack.ui.login.HomeTaskManagement;
import bd.edu.httpdaffodilvarsity.jobtrack.ui.login.Home_Admin_Tab;
import bd.edu.httpdaffodilvarsity.jobtrack.ui.login.ProfileViewActivity;
import bd.edu.httpdaffodilvarsity.jobtrack.ui.login.TaskManagement;

public class MainDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            //Intent intent = new Intent(this, HomeSettingTab.class);
            //startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        /*SearchView searchView = (SearchView)menu.findItem(R.id.nav_camera).getActionView();

        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));*/

        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            //View rootViewEmployeeTaskManagement = inflater.inflate(R.layout.activity_home_task_management, container, false);
            final MenuItem btnEmployeeTaskManagement = (MenuItem) findViewById(R.id.nav_camera);
            btnEmployeeTaskManagement.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    Intent intent = new Intent(MainDrawer.this, ProfileViewActivity.class);
                    MainDrawer.this.startActivity(intent);
                    return true;
                }
            });

           /* Intent intent = new Intent(MainDrawer.this, ProfileViewActivity.class);
            startActivity(intent);*/
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(MainDrawer.this, HomeTaskManagement.class);
            startActivity(intent);

        } else if (id == R.id.nav_slideshow) {
            Intent intent = new Intent(MainDrawer.this, JobManagement.class);
            startActivity(intent);

        } else if (id == R.id.nav_manage) {
            Intent intent = new Intent(MainDrawer.this, HomeSettingTab.class);
            startActivity(intent);

        } else if (id == R.id.nav_share) {
            Intent intent = new Intent(MainDrawer.this, Home_Admin_Tab.class);
            startActivity(intent);

        } else if (id == R.id.nav_send) {
            Intent intent = new Intent(MainDrawer.this, JobManagement.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
