package sg.edu.rp.c346.id19004781.petboardingapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class MainActivity extends AppCompatActivity {

    EditText etName, etDays, etBoardingDate;
    Spinner spinner;
    CheckBox checkBox;
    Button btnSendRequest;

    private FirebaseFirestore db;
    private CollectionReference colRef;
    private DocumentReference docRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etDays = findViewById(R.id.etDays);
        etBoardingDate = findViewById(R.id.etBoardingDate);
        spinner = findViewById(R.id.spinner);
        checkBox = findViewById(R.id.checkBox);
        btnSendRequest = findViewById(R.id.button);

        btnSendRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSendRequest(v);
            }
        });

        db = FirebaseFirestore.getInstance();

        colRef = db.collection("petboardingapp");
        docRef = colRef.document("message");
        




    }

    private void btnSendRequest(View v) {
//        String text = etMessage.getText().toString();
//        docRef.update("text", text, "color", "blue");
        String name = etName.getText().toString();
        Integer numOfDays = Integer.parseInt(etDays.getText().toString());
        String boardingDate = etBoardingDate.getText().toString();
        boolean vaccinatedCheck = checkBox.isChecked();
        String animals = spinner.getSelectedItem().toString();


        Message msg = new Message(name, numOfDays, boardingDate, animals, vaccinatedCheck);
        docRef.set(msg);



    }
}
