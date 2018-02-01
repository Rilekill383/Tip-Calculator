package com.example.android.tip_calc3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class TipCalc extends AppCompatActivity {

    private EditText Bill_input;
    private EditText Party_input;
    private SeekBar seekBar;
    private CheckBox Splitbill_checkbox;
    private EditText Tip_output;
    private EditText Total_output;
    private Button Calculatebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calc);

        Bill_input = findViewById(R.id.BillAmmo_input);
        Party_input = findViewById(R.id.PartySize_input);
        seekBar = findViewById(R.id.seekbar);
        Splitbill_checkbox = findViewById(R.id.Splitbill_checkbox);
        Tip_output = findViewById(R.id.TipAmmo_output);
        Total_output = findViewById(R.id.Total_payment_output);
        Calculatebutton = findViewById(R.id.Calculatebutton);
    }

    public void convert(View v) {
        String Bill_input = Bill_input.getText().toString();
        double input =Double.parseDouble(input);
        String Party_input = Party_input.getText().toString();
        double input =Double.parseDouble(input);
        double Tip_output = Float.parseFloat(input);
        double Total_output = (fahTemp-32.0)*5.0/9.0;
        celsius.setText(celTemp+””);
    }







    private class BoxListener implements OnClickListener {
        public void onClick(View v) {
            if(Splitbill_checkbox.isChecked()) {
                messageDisplay.setText(“Checked!”);
            } else {
                messageDisplay.setText(“Not checked.”);
            }
        }






}








        public class MainActivity extends Activity {
            private CheckBox
                    checkBox;
            private TextView messageDisplay;
            private BoxListener listenCheckBox;
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                checkbox = findViewById(R.id.checkBox);
                messageDisplay =findViewById(R.id.message);
                listenCheckBox = new BoxListener();
                checkBox.setOnClickListener(listenCheckBox);
            }
            private class BoxListener implements OnClickListener {
                public void onClick(View v) {
                    if(checkBox.isChecked()) {
                        messageDisplay.setText(“Checked!”);
                    } else {
                        messageDisplay.setText(“Not checked.”);
                    }
                }
            }


















