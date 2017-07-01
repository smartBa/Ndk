package c.newndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    {
        System.loadLibrary("Hello");
    }
    private TextView add;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String result =new JNI().sayHello();
        textView=(TextView) findViewById(R.id.text);
        textView.setText(result);
        add=(TextView)findViewById(R.id.add);
        add.setText(String.valueOf(new JavaCall().add(1,2)));
    }
}
