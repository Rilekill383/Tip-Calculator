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
    private CheckBoxlistener listenCheckbox;
    private EditText Tip_output;
    private EditText Total_output;
    private Button Calculatebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calc);

        listenCheckbox = new CheckBoxlistener();

        Bill_input = findViewById(R.id.BillAmmo_input);
        Party_input = findViewById(R.id.PartySize_input);
        seekBar = findViewById(R.id.seekbar);
        Splitbill_checkbox = findViewById(R.id.Splitbill_checkbox);
        Tip_output = findViewById(R.id.TipAmmo_output);
        Total_output = findViewById(R.id.Total_payment_output);
        Calculatebutton = findViewById(R.id.Calculatebutton);

    }

    public void onClick(View v){


        double Bill = Double.parseDouble(Bill_input.getText().toString());
        double Party = Double.parseDouble(Party_input.getText().toString());

        if(Splitbill_checkbox.isChecked()) {

            double Tip_output = ((Bill_input * seekBar)/Party_input);
            double Total_output = ((Bill_input / Party_input)+Tip_output);
        } else {

            double Tip_output = (Bill_input * seekBar);
            double Total_output = (Bill_input*(1.0 + seekBar));
        }
        Tip_output.setText(Tip_output +"");
        Total_output.setText(Total_output +"");
    }
}

