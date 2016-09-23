package github.com.anurag145.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onClick(View view)
    {
        Toast.makeText(getApplicationContext(),"This button will Display App : "
                +((Button)(view)).getText(),Toast.LENGTH_LONG).show();
    }
}
