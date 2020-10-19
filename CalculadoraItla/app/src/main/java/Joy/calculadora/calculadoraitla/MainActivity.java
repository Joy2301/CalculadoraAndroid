package Joy.calculadora.calculadoraitla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSuma;
    private Button btnResta;
    private Button btnProducto;
    private Button btnDivision;

    private TextView txtResultado;

    private EditText txtEditN1;
    private EditText txtEditN2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Usamos findViewById para enlazar los recursos de la interfaz con mis variables*/
        txtResultado = findViewById(R.id.txtResultado);

        txtEditN1 = findViewById(R.id.txtEditN1);
        txtEditN2 = findViewById(R.id.txtEditN2);

        /* Obtenemos los valores de los editText y luego los convertimos
        * Le pasamos los valores al metodo
        * el valor retornado se establece en el textview*/

        btnSuma = findViewById(R.id.btnSuma);
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(suma( Double.parseDouble(txtEditN1.getText().toString()), Double.parseDouble(txtEditN2.getText().toString()) )+ "");
            }
        });

        btnResta = findViewById(R.id.btnResta);
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(Resta( Double.parseDouble(txtEditN1.getText().toString()), Double.parseDouble(txtEditN2.getText().toString()) )+ "");
            }
        });

        btnProducto = findViewById(R.id.btnProducto);
        btnProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(Producto( Double.parseDouble(txtEditN1.getText().toString()), Double.parseDouble(txtEditN2.getText().toString()) )+ "");
            }
        });

        btnDivision = findViewById(R.id.btnDivision);
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(Division( Double.parseDouble(txtEditN1.getText().toString()), Double.parseDouble(txtEditN2.getText().toString()) )+ "");
            }
        });

    }

    /*Creamos los metodos para las operaciones*/
    public double suma(double n1, double n2){
        return n1 + n2;
    }

    public double Resta(double n1, double n2){
        return n1 - n2;
    }

    public double Producto(double n1, double n2){
        return n1 * n2;
    }

    public double Division(double n1, double n2){
        double respuesta = 0;
        if(n2!=0) {
            respuesta =  n1 / n2;
        }
        return respuesta;
    }
}