package vanina.example.lab_09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    EditText countPoints;
    EditText eMaxX;
    EditText eMinX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countPoints = findViewById(R.id.editCountPoints);
        eMaxX = findViewById(R.id.editMaxX);
        eMinX = findViewById(R.id.editMinX);
    }

    public void onClickSurface(View v) {
        float xMin, xMax;
        int points;

        try {
            xMin = Float.parseFloat(eMinX.getText().toString());
            xMax = Float.parseFloat(eMaxX.getText().toString());
            points = Integer.parseInt(countPoints.getText().toString());
        }
        catch (Exception ex) {
            Toast.makeText(this, "Input was incorrect", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, activity2class.class);
        intent.putExtra("points", points);
        intent.putExtra("xMin", xMin);
        intent.putExtra("xMax", xMax);

        startActivityForResult(intent, 414);
    }
}