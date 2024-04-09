package vanina.example.lab10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    Bitmap bmp1;
    Bitmap bmp2;
    int w, h;
    ImageView img1;
    ImageView img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AssetManager asset = getAssets();
        InputStream stream = null;

        try {
            stream = asset.open("lenna.png");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            stream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        bmp1 = BitmapFactory.decodeStream(stream);

        w = bmp1.getWidth();
        h = bmp1.getHeight();

        bmp2 = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);

        img1 = findViewById(R.id.Image1);
        img2 = findViewById(R.id.im2);

        img1.setImageBitmap(bmp1);
        img2.setImageBitmap(bmp2);
    }

    public void copy(View v)
    {
        for (int y = 0; y < h; y++)
        {
            for (int x = 0; y < w; x++)
            {
                int c = bmp1.getPixel(x,y);
                bmp2.setPixel(x,y,c);
            }
        }
    }

    public void invert(View v)
    {
        for (int y = 0; y < h; y++)
        {
            for (int x = 0; x < w; x++)
            {
                int c0 = bmp1.getPixel(x,y);
                int r = 255 - Color.red(c0);
                int g = 255 - Color.green(c0);
                int b = 255 - Color.blue(c0);
                int c1 = Color.argb(255,r,g,b);
                bmp2.setPixel(x,y,c1);
            }
        }
    }}