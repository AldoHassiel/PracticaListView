package aldoacosta.practicalistview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listaImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaImg = (ListView) findViewById(R.id.listaImg);
        String[] img = {"Pablo","Uniqua","Austin","Tacha"};
        listaImg.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, img));

        listaImg.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent sig = new Intent(MainActivity.this, Main2Activity.class);
                sig.putExtra("imagenes", parent.getItemAtPosition(position).toString());
                startActivity(sig);
            }
        });
    }
}
