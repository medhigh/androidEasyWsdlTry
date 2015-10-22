package com.example.medhigh.testapplicationconnecttowsdl;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import Wsdl2Code.WebServices.ServiceProviderBinding.AuthtokenXml;
import Wsdl2Code.WebServices.ServiceProviderBinding.PatientBinding;
import Wsdl2Code.WebServices.ServiceProviderBinding.RequestResultOfAuthtokenXmlkZUuIBUF;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.text)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        new AsyncCaller().execute();
    }
    private class AsyncCaller extends AsyncTask<Void, Void, String>
    {
        ProgressDialog pdLoading = new ProgressDialog(MainActivity.this);

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            //this method will be running on UI thread
            pdLoading.setMessage("\tLoading...");
            pdLoading.show();
        }
        @Override
        protected String doInBackground(Void... params) {
            PatientBinding binding = new PatientBinding();
            RequestResultOfAuthtokenXmlkZUuIBUF rq = binding.PatientLogin("ilya123", "test123");
            //AuthtokenXml token = rq.result;
            return "";//token.token;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            textView.setText(result);
            pdLoading.dismiss();
        }

    }
}
