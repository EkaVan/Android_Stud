package vanina.example.lab_09;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class activity2class extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        findViewById(R.id.close).setOnClickListener(v -> {
            int n = Integer.parseInt(((EditText)findViewById(R.id.n)).getText().toString());
            int xMin = Integer.parseInt(((EditText)findViewById(R.id.x_min)).getText().toString());
            int xMax = Integer.parseInt(((EditText)findViewById(R.id.x_max)).getText().toString());

            Intent newIntent = new Intent();
            newIntent.putExtra("n", n);
            newIntent.putExtra("xMin", xMin);
            newIntent.putExtra("xMax", xMax);

            setResult(0, newIntent);
            finish();
        });
    }
}