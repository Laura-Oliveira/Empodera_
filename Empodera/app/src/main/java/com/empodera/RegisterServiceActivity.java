package com.empodera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterServiceActivity extends AppCompatActivity
{
    View view;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();

    private EditText name, surname, price_service, price_ticket;
    private EditText address, email, phone;
    private CheckBox checkbox_cake, checkbox_hair_style, checkbox_chef;
    private TextView check_cake, check_hair_style, check_chef;

    private String txt_name, txt_surname, txt_address, txt_email, txt_phone;
    private Double db_price_service, db_price_ticket;

  //  private CheckBox checkbox_nails, checkbox_color_hair, checkbox_lunch, checkbox_pizza;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_service);

        view = findViewById(R.id.screen_register_service);
        view.setBackgroundColor(getResources().getColor(R.color.color_background));

        name = findViewById(R.id.txt_name);
        surname = findViewById(R.id.txt_surname);
        address = findViewById(R.id.txt_address);
        phone = findViewById(R.id.txt_phone);
        email = findViewById(R.id.txt_email);

        checkbox_cake = findViewById(R.id.checkbox_cake);
        checkbox_hair_style = findViewById(R.id.checkbox_hair_style);
        checkbox_chef = findViewById(R.id.checkbox_chef);
        check_cake = findViewById(R.id.txt_check_cake);
        check_chef = findViewById(R.id.txt_check_chef);
        check_hair_style = findViewById(R.id.txt_check_hair_style);
      /*  checkbox_lunch = findViewById(R.id.checkbox_lunch);
        checkbox_pizza = findViewById(R.id.check_box_pizza);
        checkbox_nails = findViewById(R.id.checkbox_nails);
        checkbox_color_hair = findViewById(R.id.checkbox_color_hair); */
        price_service = findViewById(R.id.txt_price_service);
        price_ticket = findViewById(R.id.txt_price_ticket);
    }

    public void registerServiceWorker(View view)
    {
        String serviceOptions = "";
        ServiceApp serviceApp = new ServiceApp();

        /* TAkes the database reference */
        DatabaseReference dbReferenceInstance = database.getReference();

        /* Create a child Service in each instance created */
        DatabaseReference dbReference = dbReferenceInstance.child("service");

        /* Converting EditText type into String type */
        txt_name = name.getText().toString();
        txt_surname = surname.getText().toString();
        txt_address = address.getText().toString();
        txt_phone = phone.getText().toString();
        txt_email = email.getText().toString();

        /* Converting EditText type into String type for can covert into Double type */
        db_price_service = Double.parseDouble(price_service.getText().toString());
        db_price_ticket = Double.parseDouble(price_ticket.getText().toString());

        if(checkbox_cake.isChecked())
        {
            serviceOptions+= (check_cake.getText().toString()+ "\n");
        }
        if(checkbox_chef.isChecked())
        {
            serviceOptions+= (check_chef.getText().toString()+ "\n");
        }
        if(checkbox_hair_style.isChecked())
        {
            serviceOptions+= (check_hair_style.getText().toString()+ "\n");
        }

        if(serviceOptions!= "" || serviceOptions!= " ")
        {
            dbReference = database.getReference("service");

            /* Setting data into ServiceApp class */
            serviceApp.setName(txt_name);
            serviceApp.setSurname(txt_surname);
            serviceApp.setAddress(txt_address);
            serviceApp.setPhone(txt_phone);
            serviceApp.setEmail(txt_email);
            serviceApp.setPriceService(db_price_service);
            serviceApp.setPriceTicket(db_price_ticket);
            serviceApp.setTypeService(serviceOptions);
            //  serviceApp.setTypeService(type_service);

            /* Transfering data into Firebase object reference */
            serviceApp.setId(dbReference.push().getKey());

            /* Data ransfered from object to Firebase database */
            dbReference.child(serviceApp.getId()).setValue(serviceApp);

            Intent intenet = new Intent(RegisterServiceActivity.this, LoginActivity.class);
            startActivity(intenet);
            Toast.makeText(this, "Serviço Registrado com Sucesso!", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Preencha todos os campos obrigatórios", Toast.LENGTH_SHORT).show();
        }
    }
}
