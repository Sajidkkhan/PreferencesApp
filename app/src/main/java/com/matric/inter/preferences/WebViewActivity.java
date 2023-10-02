package com.matric.inter.preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView mywebview =  findViewById(R.id.webview_q);
        EditText editText=findViewById(R.id.editTextText_url);
        Button button_search=findViewById(R.id.button_search);


        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= editText.getText().toString();
                String ful_url="https://"+url;
                mywebview.loadUrl(ful_url);
            }
        });


    }
}