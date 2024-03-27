package es.ieslavereda.nacionalidad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private EditText name;
    private EditText surname;
    private Button buttonAdd;
    private ImageView icon;
    private ImageView image;
    private TextView nationality;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        buttonAdd = findViewById(R.id.buttonAdd);
        icon = findViewById(R.id.icon);
        image = findViewById(R.id.image);
        nationality=findViewById(R.id.nationality);

        spinner.setAdapter(new MyOwnArrayAdapter<>(this,R.layout.custom_spinner_item, Nation.values()));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                image.setImageResource(((Listable)parent.getSelectedItem()).getDrawableImage());
                icon.setImageResource(((Listable) parent.getSelectedItem()).getDrawableSymbol());
                nationality.setText(((Listable) parent.getSelectedItem()).getDescription());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}