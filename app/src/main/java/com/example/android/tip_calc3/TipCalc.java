package com.example.android.tip_calc3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class TipCalc extends AppCompatActivity {

    private EditText Bill;
    private EditText Party;

    private SeekBar seekBar;
    private int TipPercentValue = 15;
    private TextView Seekbar_number;

    private CheckBox Splitbill_checkbox;


    private TextView Tip_output;
    private TextView Total_output;
    private Button Calculatebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calc);

        Bill = (EditText) findViewById(R.id.BillAmmo_input);
        Party = (EditText) findViewById(R.id.PartySize_input);

        Splitbill_checkbox = (CheckBox) findViewById(R.id.Splitbill_checkbox);

        Tip_output = (TextView) findViewById(R.id.TipAmmo_output);
        Total_output = (TextView) findViewById(R.id.Total_payment_output);
        Calculatebutton = (Button) findViewById(R.id.Calculatebutton);

        seekBar = (SeekBar) findViewById(R.id.seekbar);
        Seekbar_number = (TextView) findViewById(R.id.SeekbarDisplay);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Seekbar_number.setText("" + progress + "%");
                TipPercentValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void onClickBtn(View v) {
        if (Bill.getText().toString().equals("") || Bill.getText().toString().isEmpty())  {
            Toast.makeText(this, "All Input fields must be filled", Toast.LENGTH_LONG).show();
            return;
        }
        double TotalBillInput = Double.parseDouble(Bill.getText().toString());
        if (Party.getText().toString().equals("") || Party.getText().toString().isEmpty())  {
            Toast.makeText(this, "All Input fields must be filled", Toast.LENGTH_LONG).show();
            return;
        }
        double TotalPartyInput = Double.parseDouble(Party.getText().toString());
        double IndividualTip = (TipPercentValue * TotalBillInput) / (100);
        double TotalPayment;
        double TotalTip;

        if(Splitbill_checkbox.isChecked()){
            TotalPayment = (TotalBillInput + IndividualTip) / TotalPartyInput;
            TotalTip = IndividualTip / TotalPartyInput;
        }else{
            TotalPayment = TotalBillInput + IndividualTip;
            TotalTip = IndividualTip;
        }

        Tip_output.setText(String.format("%.2f", TotalTip));
        Total_output.setText(String.format("%.2f", TotalPayment));
    }
}

