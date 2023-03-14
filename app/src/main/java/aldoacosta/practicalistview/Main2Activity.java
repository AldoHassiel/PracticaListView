package aldoacosta.practicalistview;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    ImageView imagenes;
    TextView lblTitulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imagenes = (ImageView) findViewById(R.id.imageView);
        lblTitulo = (TextView) findViewById(R.id.lblTitulo);
        String imgSeleccionado = getIntent().getStringExtra("imagenes");
        if (imgSeleccionado.equals("Pablo")){
            lblTitulo.setText("Pablo elegante");
            imagenes.setImageResource(R.drawable.pablo);
        }else if(imgSeleccionado.equals("Uniqua")){
            lblTitulo.setText("Uniqua sentada");
            imagenes.setImageResource(R.drawable.uniqua);
        }else if(imgSeleccionado.equals("Austin")){
            lblTitulo.setText("Austin detective");
            imagenes.setImageResource(R.drawable.austin);
        }else if(imgSeleccionado.equals("Tacha")){
            lblTitulo.setText("Tacha filosofiando");
            imagenes.setImageResource(R.drawable.tacha);
        }
    }

    public void clic(View v){
        finish();
    }
}
