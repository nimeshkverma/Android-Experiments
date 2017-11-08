package beginnersguide.nimesh.com.lightchanger;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main_id);
        bgElement.setBackgroundColor(Color.RED);
        myButtonListenerMethod();

    }

    public void myButtonListenerMethod() {
        Button button = (Button) findViewById(R.id.button_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("In the OnClick","in onclick");
                ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main_id);
                int color = ((ColorDrawable) bgElement.getBackground()).getColor();
                Log.d("color1"+color,"Color1"+color);
                if (color == Color.RED) {
                    bgElement.setBackgroundColor(Color.BLUE);
                    Log.d("Blue","blue");
                }
                else {
                    bgElement.setBackgroundColor(Color.RED);
                    Log.d("RED","red");
                }

            }
        });
    }
}
