package br.iesb.android.aulaandroid18do8de2017.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        View name = (View) findViewById(R.id.name);
    }
}
