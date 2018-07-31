package sg.edu.rp.c346.practicalquiz;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText acc;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acc=findViewById(R.id.editTextAcc);
        btn=findViewById(R.id.buttonSubmit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                final String accName = acc.getText().toString();
                myBuilder.setTitle("Account's Submission");
                myBuilder.setMessage("Submit: "+acc);
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which){
                        Toast.makeText(MainActivity.this,"Submitted: ",Toast.LENGTH_LONG).show();

                    }
                 });
                myBuilder.setNegativeButton("CANCEL", null);


                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
    }
}
