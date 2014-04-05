package com.google.gdg.bcn.juguete;

import android.app.Activity;
import android.os.Bundle;

import android.view.MenuItem;
import android.widget.TextView;

import com.google.gdg.bcn.juguete.core.MyClass;
import com.google.gdg.bcn.juguete.core.exception.ProgrammerMistake;

public class MainActivity extends Activity {

    //    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd");
    private TextView mTVCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyClass mc = new MyClass();
        inicializarcomponentes();
    }

    private void inicializarcomponentes() {

        mTVCategory = (TextView) findViewById(R.id.category);
    }

    public void displayNumberOfTransactions(int transactionCount){

        if (transactionCount<0){

            throw new ProgrammerMistake(new IllegalArgumentException(String.format(
                    "number of transactions can't be negative, but it's %1$d" , transactionCount)));

        }
        mTVCategory.setText(String.format("%1$d", transactionCount));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
