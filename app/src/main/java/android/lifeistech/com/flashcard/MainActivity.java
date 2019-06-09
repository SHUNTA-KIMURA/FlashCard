package android.lifeistech.com.flashcard;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Word apple;
    LinearLayout container;
    TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apple = new Word(R.drawable.apple_icon, "りんご");
        container = (LinearLayout) findViewById(R.id.container);
        nameTextView = new TextView(getApplicationContext());
        nameTextView.setText(apple.name);
        nameTextView.setTextSize(30);
        nameTextView.setTextColor(Color.rgb(0,0,0));
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(apple.resId);
        layout.addView(imageView);
        layout.addView(nameTextView);


        container.addView(layout);

    }
}
