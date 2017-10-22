package consistent4444.dealingwithnetworkdata;

import android.content.Loader;
import android.os.AsyncTask;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    private static String networkURL="https://www.klm.com/corporate/nl/index.html";
    String jsonResponse=null;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        new GetJson().execute();

    }
    private class GetJson extends AsyncTask<Void,Void,String>{

        @Override
        protected String doInBackground(Void... voids) {
            try {
                URL url = NetworkUtils.createURL(networkURL);
                 jsonResponse= NetworkUtils.getJsonResponse(url);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return jsonResponse;


        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            textView.setText(s);

        }
    }


}
