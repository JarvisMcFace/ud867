package com.udacity.gradle.builditbigger.actvitiy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.udacity.gradle.builditbigger.R;
import com.udacity.gradle.builditbigger.backend.myApi.model.Joke;

import java.lang.ref.WeakReference;


public class MainActivity extends AppCompatActivity implements  EndpointsAsyncTask.Callback {

    public static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void progressIndicator(boolean enable) {
        Log.d(TAG, "David: " + "progressIndicator() called with: enable = [" + enable + "]");
    }

    @Override
    public void callBack(Joke joke) {
        Log.d(TAG, "David: " + "callBack() called with: joke = [" + joke + "]");
    }

    public void tellJoke(View view) {


//        Intent intent = new Intent(this, JokeTellerActivity.class);
//        intent.putExtra(IntentConsents.EXTRA_TELL_JOKE, test);
//        startActivity(intent);
      //  Toast.makeText(this, test, Toast.LENGTH_SHORT).show();

        WeakReference<EndpointsAsyncTask.Callback> weakReference = new WeakReference<EndpointsAsyncTask.Callback>(this);
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(weakReference);
        endpointsAsyncTask.execute();
    }


}
