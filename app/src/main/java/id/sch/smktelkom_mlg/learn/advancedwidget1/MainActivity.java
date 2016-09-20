package id.sch.smktelkom_mlg.learn.advancedwidget1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout llMain = (LinearLayout) findViewById(R.id.linearLayoutMain);

        addEditText(llMain);

        Button bProses = new Button(this);

        final TextView tvHasil = new TextView(this);

        llMain.addView(tvHasil);

        bProses.setText("Proses");

        llMain.addView(bProses);

        bProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProses(llMain);
            }
        });
    }

    private void doProses(LinearLayout llMain) {


        String hasil="";
        for (int i= 0; i < 5; i++){
            EditText etNama = (EditText) llMain.getChildAt(i*2);
            EditText etUmur = (EditText) llMain.getChildAt((1*2)+1);

            String Nama = etNama.getText().toString().trim();
            String Umur = etUmur.getText().toString();

            if(Umur.isEmpty())
                Umur="0";
            if(!Nama.isEmpty())
                hasil += "Anak ke-"+(i+1)+": "+Nama +" umur "+Umur+" tahun\n";
        }
        TextView tvHasil = (TextView) llMain.getChildAt(11);
        tvHasil.setText(hasil);
    }

    private void addEditText(LinearLayout llMain) {

        for (int i = 1; i <= 5; i++) {
            final EditText etNama = new EditText(this);
            llMain.addView(etNama);
            etNama.setHint("Isikan nama Anak");

            final EditText etUmur = new EditText(this);
            llMain.addView(etUmur);
            etUmur.setHint("Isikan umur Anak");
            etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);
        }
    }
}


