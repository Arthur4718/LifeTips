package devarthur.com.lifetips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import devarthur.com.lifetips.data.QuoteData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Request data
        new QuoteData().getQuotes();

    }
}
