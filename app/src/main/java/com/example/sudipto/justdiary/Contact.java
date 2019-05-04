package com.example.sudipto.justdiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

public class Contact extends AppBaseActivity implements View.OnClickListener {
    private Button submit;
    private EditText name,subject,message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        submit = findViewById(R.id.submitId);

        name = findViewById(R.id.name);
        subject = findViewById(R.id.subject);
        message = findViewById(R.id.msgId);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try {
            String Name = name.getText().toString();
            String Subject = subject.getText().toString();
            String Message = message.getText().toString();

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/email");
            intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"sudipta.just@gmail.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT,"Message from app");
            intent.putExtra(Intent.EXTRA_TEXT,"Name: "+Name+"\n Subject: "+Subject +"\n Message: "+ Message);
            startActivity(Intent.createChooser(intent,"Send Message With"));
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Fill Up The Forms"+e,Toast.LENGTH_SHORT);
        }



    }
}
