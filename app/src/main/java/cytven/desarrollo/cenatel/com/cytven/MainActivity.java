package cytven.desarrollo.cenatel.com.cytven;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Defining Variables
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    //****************Integer**************************//
    int unicode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unicode = 0;

        // Initializing Toolbar and setting it as the actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initializing NavigationView
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                //Checking if the item is in checked state or not, if not make it in checked state
                if(menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()){


                    //Replacing the main content with ContentFragment Which is our Inbox View;
                    case R.id.inbox:
                        //Toast.makeText(getApplicationContext(),"Inbox Selected",Toast.LENGTH_SHORT).show();
                        ContentFragment fragment = new ContentFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.frame,fragment);
                        fragmentTransaction.commit();
                        return true;

                    // For rest of the options we just show a toast on click

                    case R.id.starred:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        VerRegistrosFragment fragment3 = new VerRegistrosFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction3.replace(R.id.frame, fragment3);
                        fragmentTransaction3.commit();
                        return true;
                    case R.id.sent_mail:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        ContactoFragment fragment5 = new ContactoFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransaction5 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction5.replace(R.id.frame, fragment5);
                        fragmentTransaction5.commit();
                        return true;
                    case R.id.drafts:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        AcercaDeFragment fragment2 = new AcercaDeFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction2.replace(R.id.frame, fragment2);
                        fragmentTransaction2.commit();
                        return true;
                    default:
                        Toast.makeText(getApplicationContext(),"Somethings Wrong",Toast.LENGTH_SHORT).show();
                        return true;

                }
            }
        });

        ContentFragment fragment = new ContentFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();

        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer, R.string.closeDrawer){

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank

                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void setVariable(int var) {
        unicode = var;
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK || keyCode == KeyEvent.KEYCODE_HOME) {
            switch (unicode) {
                case 0:
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
                    // Setting Dialog Title
                    alertDialog.setTitle("Salir de la Aplicaci\u00f3n");
                    // Setting Dialog Message
                    alertDialog.setMessage("\u00bfQuieres salir de la aplicaci\u00f3n?");
                    // Setting Icon to Dialog
                    // alertDialog.setIcon(R.drawable.delete);
                    // On pressing Settings button
                    alertDialog.setPositiveButton("No",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    // on pressing cancel button
                    alertDialog.setNegativeButton("Si",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    MainActivity.this.finish();
                                }
                            });
                    // Showing Alert Message
                    alertDialog.show();
                    break;
                case 1:
                    ContentFragment fragment = new ContentFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    return true;
                case 2:
                    VerRegistrosFragment fragment1 = new VerRegistrosFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.frame, fragment1);
                    fragmentTransaction1.addToBackStack(null);
                    fragmentTransaction1.commit();
                    return true;
            }

        }
        return true;
    }



}
