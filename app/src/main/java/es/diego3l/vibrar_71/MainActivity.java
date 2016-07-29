package es.diego3l.vibrar_71;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button)findViewById(R.id.boton);
        final Vibrator vibrator = (Vibrator)this.getSystemService(Context.VIBRATOR_SERVICE);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //vibrator.vibrate(600);
                Vibrator v = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                if (v.hasVibrator()){
                    Log.v("Podemos vibrar", "Sí");
                } else {
                    Log.v("Podemos vibrar", "No");
                }
            }
        });

    }
}