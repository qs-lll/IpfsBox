package org.ipfsbox.box.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import org.ipfsbox.box.R;

public class ListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
}