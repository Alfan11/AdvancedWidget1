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

        Button bProses = new Button (this);

        final TextView tvHasil = new TextView(this);

        llMain.addView(tvHasil);

        bProses.setText("Proses");

        llMain.addView(bProses);

        bProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                    EditText etNama = (EditText) llMain.getChildAt(0);
                    EditText etUmur = (EditText) llMain.getChildAt(1) ;


                String nama = etNama.getText().toString();
                String umur = etUmur.getText().toString();

                tvHasil.setText(nama + " umur " + umur + " tahun");

            }
        });
    }

    private void addEditText(LinearLayout llMain) {
        final EditText etNama = new EditText(this);
        llMain.addView(etNama);
        etNama.setHint("Isikan nama Anak");

        final EditText etUmur = new EditText(this);
        llMain.addView(etUmur);
        etUmur.setHint("Isikan umur Anak");
        etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);
    }
}