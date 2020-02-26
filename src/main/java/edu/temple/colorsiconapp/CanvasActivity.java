package edu.temple.colorsiconapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent intent = getIntent();
        String colorText = intent.getStringExtra(PaletteActivity.INTENT_COLOR_KEY);

        findViewById(R.id.canvasLayout).setBackgroundColor(Color.parseColor(colorText));

        TextView colorTextView = findViewById(R.id.colorText);
        colorTextView.setText(colorText);
    }
}

