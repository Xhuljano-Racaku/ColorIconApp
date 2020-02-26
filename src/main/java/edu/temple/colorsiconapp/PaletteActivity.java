package edu.temple.colorsiconapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class PaletteActivity extends AppCompatActivity {

    public static final String INTENT_COLOR_KEY = "color";
    private boolean firstSelection = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        Spinner spinner;
        spinner = findViewById(R.id.spinner);


        String[] colors = {
                "Lime",
                "Red",
                "Blue",
                "Yellow",
                "Green",
                "Silver",
                "Olive",
                "White",
                "Cyan",
                "Purple"
        };

        ColorAdapter colAdap = new ColorAdapter(this, colors);
        spinner.setAdapter(colAdap);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (!firstSelection) {   //Prevent onItemSelected() from running this code automatically (i.e. before the user chooses anything)
                    Intent launchIntent = new Intent(PaletteActivity.this, CanvasActivity.class);
                    launchIntent.putExtra(INTENT_COLOR_KEY, parent.getItemAtPosition(position).toString());
                    startActivity(launchIntent);
                } else {
                    firstSelection = false;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
