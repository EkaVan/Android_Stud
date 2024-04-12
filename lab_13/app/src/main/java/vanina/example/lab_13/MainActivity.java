package vanina.example.lab_13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
TextView txt_res;

@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    txt_res = findViewById(R.id.txt_res);
}

public void on_button3_click(View v)
{
    HttpRequest r = new HttpRequest(this)
    {
        @Override
        public void on_request_complete(String response)
        {
            Log.e("RESULT", response);
            tv.
        }
    }
}
}
