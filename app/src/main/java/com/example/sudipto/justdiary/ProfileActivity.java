package com.example.sudipto.justdiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppBaseActivity {
    private TextView info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        info = findViewById(R.id.profileText);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String childItem = bundle.getString("name");
            showDetails(childItem);
        }
    }

    void showDetails(String childItem) {
        if (childItem.equals("regentBoard")){
            info.setText(R.string.regentId);

        }if (childItem.equals("rg_member")){
            info.setText(R.string.rg_member);

        }if (childItem.equals("regentBoard2")){
            info.setText(R.string.regentId);

        }if (childItem.equals("rg_member2")){
            info.setText(R.string.rg_member);

        }if (childItem.equals("regentBoard3")){
            info.setText(R.string.regentId);

        }if (childItem.equals("auditCell")){
            info.setText(R.string.auditCell);

        }if (childItem.equals("treasurer")){
            info.setText(R.string.treasurer);

        }if (childItem.equals("Dean1")){
            info.setText(R.string.Dean1);

        }if (childItem.equals("Computer")){
            info.setText(R.string.Computer);

        }if (childItem.equals("Chemical")){
            info.setText(R.string.Chemical);

        }if (childItem.equals("Ipe")){
            info.setText(R.string.Ipe);

        }if (childItem.equals("Pme")){
            info.setText(R.string.Pme);

        }if (childItem.equals("EEE")){
            info.setText(R.string.EEE);

        }if (childItem.equals("Bme")){
            info.setText(R.string.Bme);

        }if (childItem.equals("TE")){
            info.setText(R.string.TE);

        }if (childItem.equals("Dean2")){
            info.setText(R.string.Dean2);

        }if (childItem.equals("Microbiology")){
            info.setText(R.string.Microbiology);

        }if (childItem.equals("Pharmacy")){
            info.setText(R.string.Pharmacy);

        }if (childItem.equals("Genetic")){
            info.setText(R.string.Genetic);

        }if (childItem.equals("Fisheries")){
            info.setText(R.string.Fisheries);

        }if (childItem.equals("Dean3")){
            info.setText(R.string.Dean3);

        }if (childItem.equals("Environmental")){
            info.setText(R.string.Environmental);

        }if (childItem.equals("Nutrition")){
            info.setText(R.string.Nutrition);

        }if (childItem.equals("Agro")){
            info.setText(R.string.Agro);

        }if (childItem.equals("Dean4")){
            info.setText(R.string.Dean4);

        }if (childItem.equals("Mathematics")){
            info.setText(R.string.Mathematics);

        }if (childItem.equals("Physics")){
            info.setText(R.string.Physics);

        }if (childItem.equals("Chemistry")){
            info.setText(R.string.Chemistry);

        }if (childItem.equals("Dean5")){
            info.setText(R.string.Dean5);

        }if (childItem.equals("Dean6")){
            info.setText(R.string.Dean6);

        }if (childItem.equals("English")){
            info.setText(R.string.English);

        }if (childItem.equals("Business_Studies")){
            info.setText(R.string.Business_Studies);

        }if (childItem.equals("Accounting")){
            info.setText(R.string.Accounting);

        }if (childItem.equals("Management")){
            info.setText(R.string.Management);

        }if (childItem.equals("Finance")){
            info.setText(R.string.Finance);

        }if (childItem.equals("Dean7")){
            info.setText(R.string.Dean7);

        }if (childItem.equals("Physical")){
            info.setText(R.string.Physical);

        }
    }
}
