package com.android.prayatna;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.NavUtils;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;

/**
 * Created by root on 26/7/15.
 */
public class EventDescription extends AppCompatActivity {

    private MaterialViewPager mViewPager;
    private HeaderDesign h;
    private DrawerLayout mDrawer;
    private ActionBarDrawerToggle mDrawerToggle;
    private Toolbar toolbar;
    static String[] event_array;
    static boolean paper=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventdescription);
        TextView eventname= (TextView)findViewById(R.id.logo_white);

 /*
*/          paper=false;



        switch(getIntent().getExtras().getString("event_id")){
            case "01":
                event_array = getResources().getStringArray(R.array.debugging);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.album));
                break;

            case "02":
        event_array=  getResources().getStringArray(R.array.reversecoding);
        h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.rc));
        break;
    case "03":
         event_array = getResources().getStringArray(R.array.webdesign);
        h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.wd));
        break;
    case "04":
        event_array = getResources().getStringArray(R.array.cwj);
        h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.cwj));
        break;
    case "05":
        event_array = getResources().getStringArray(R.array.paperpresentation);
        paper=true;
        h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.bombland));
        break;
    case "06":
        event_array = getResources().getStringArray(R.array.pentathlon);
        h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.hint));
        break;
    case "07":
        event_array = getResources().getStringArray(R.array.ospc);
        h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.ospc));
        break;
    case "08":
        event_array = getResources().getStringArray(R.array.select);
        h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.select));
        break;
            case "09":
                event_array = getResources().getStringArray(R.array.hack);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.hack));
                break;
            case "10":
                event_array = getResources().getStringArray(R.array.itr);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.it));
                break;
            case "11":
                event_array = getResources().getStringArray(R.array.hackathon);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.h));
                break;
            case "12":
                event_array = getResources().getStringArray(R.array.megaevent);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.nt));
                break;
            case "13":
                event_array = getResources().getStringArray(R.array.eucliddesk);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.euclid));
                break;
            case "14":
                event_array = getResources().getStringArray(R.array.business);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.bp));
                break;
            case "15":
                event_array = getResources().getStringArray(R.array.hunt);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.hunt));
                break;
            case "16":
                event_array = getResources().getStringArray(R.array.cricket);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.cricket));
                break;
            case "17":
                event_array = getResources().getStringArray(R.array.google);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.geek));
                break;
            case "18":
                event_array = getResources().getStringArray(R.array.gaming);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.gaming));
                break;
            case "21":
                event_array = getResources().getStringArray(R.array.odebug);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.debugging));
                break;
            case "22":
                event_array = getResources().getStringArray(R.array.olpc);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.olpc));
                break;
            case "23":
                event_array = getResources().getStringArray(R.array.euler);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.e));
                break;
            case "24":
                event_array = getResources().getStringArray(R.array.loht);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.legends1));
                break;
            case "25":
                event_array = getResources().getStringArray(R.array.bbb);
                h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.bbb));
                break;



            default:
        event_array = getResources().getStringArray(R.array.debugging);
        h=HeaderDesign.fromColorAndDrawable(0xcc000000,getResources().getDrawable(R.drawable.mybland));


}

        eventname.setText(event_array[0]);
      /*

*/
       // if(!BuildConfig.DEBUG)
        //    Fabric.with(this, new Crashlytics());

        setTitle("");

        mViewPager = (MaterialViewPager) findViewById(R.id.materialViewPager);
        mViewPager.setBackgroundResource(R.drawable.bg_card);
        toolbar = mViewPager.getToolbar();
       // mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (toolbar != null) {
            setSupportActionBar(toolbar);

            final ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setDisplayShowHomeEnabled(true);
                actionBar.setDisplayShowTitleEnabled(true);
                actionBar.setDisplayUseLogoEnabled(false);
                actionBar.setHomeButtonEnabled(true);
            }
        }

       mDrawerToggle = new ActionBarDrawerToggle(this, mDrawer, 0, 0);
       // mDrawer.setDrawerListener(mDrawerToggle);

        mViewPager.getViewPager().setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {

            @Override
            public Fragment getItem(int position) {
                switch (position % 4) {
                    //case 0:
                    //    return RecyclerViewFragment.newInstance();
                    case 1:
                        return ScrollFragment.newInstance();

                    //case 2:
                    //    return WebViewFragment.newInstance();
                    default:
                        return RecyclerViewFragment.newInstance();
                }
            }

            @Override
            public int getCount() {
                return 2;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position % 4) {
                    case 0:
                        return "Rules";
                    case 1:
                        return "Description";

                }
                return "";
            }
        });

        mViewPager.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {
            return h;

                //execute others actions if needed (ex : modify your header logo)


            }
        });

        mViewPager.getViewPager().setOffscreenPageLimit(mViewPager.getViewPager().getAdapter().getCount());
        mViewPager.getPagerTitleStrip().setTextColor(0xffffffff);
        mViewPager.getPagerTitleStrip().setViewPager(mViewPager.getViewPager());

        mViewPager.getViewPager().setCurrentItem(1);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        //mDrawerToggle.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            MainMenu.toevents=true;
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
