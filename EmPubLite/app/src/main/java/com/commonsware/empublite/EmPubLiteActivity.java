package com.commonsware.empublite;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class EmPubLiteActivity extends Activity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    TextView textView;
    Button button;
    CheckBox checkBox;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initapp();
    }

    private void initapp() {
        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener(this);

    }

    @Override
    public void onClick(View v) {
        count++;
        textView.setText(String.format("You clicked %s times",count));

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked)
            checkBox.setText("You checked");
        else
            checkBox.setText("It is unchecked");
    }
}
