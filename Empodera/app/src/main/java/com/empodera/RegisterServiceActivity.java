package com.empodera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterServiceActivity extends AppCompatActivity
{
    View view;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();

    private EditText name, surname, price_service, price_ticket;
    private EditText address, email, phone;
    private CheckBox checkbox_cake, checkbox_hair_style, checkbox_chef;
    private TextView txt_check_cake, txt_check_hair_style, txt_check_chef;

    private String txt_name, txt_surname_type_service;
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
        txt_check_cake = findViewById(R.id.txt_check_cake);
        txt_check_chef = findViewById(R.id.txt_check_chef);
        txt_check_hair_style = findViewById(R.id.txt_check_hair_style);
      /*  checkbox_lunch = findViewById(R.id.checkbox_lunch);
        checkbox_pizza = findViewById(R.id.check_box_pizza);
        checkbox_nails = findViewById(R.id.checkbox_nails);
        checkbox_color_hair = findViewById(R.id.checkbox_color_hair); */
        price_service = findViewById(R.id.txt_price_service);
        price_ticket = findViewById(R.id.txt_price_ticket);
    }

    public void registerServiceWorker(View view)
    {
//        String serviceOptions = "";

      /*  if(checkbox_cake.isChecked())
        {
            serviceOptions+= (txt_check_cake.getText().toString()+ "\n");
        }
        if(checkbox_chef.isChecked())
        {
            serviceOptions+= (txt_check_chef.getText().toString()+ "\n");
        }
        if(checkbox_hair_style.isChecked())
        {
            serviceOptions+= (txt_check_hair_style.getText().toString()+ "\n");
        }

        if(serviceOptions!= "" || serviceOptions!= " ")
        {
            DatabaseReference dbReference = database.getReference("service");

            ServiceApp serviceApp = new ServiceApp();
            serviceApp.setPriceService(price_service);
            serviceApp.setPriceTicket(price_ticket);
            serviceApp.setTypeService(type_service);
            serviceApp.setId(dbReference.push().getKey());

            dbReference.child(serviceApp.getId()).setValue(serviceApp);

            Intent intenet = new Intent(RegisterServiceActivity.this, MainActivity.class);
            intenet.putExtra("sucess", "Serviço Cadastrado com sucesso!");
            startActivity(intenet);
        }
        else
        {
            Toast.makeText(this, "Preencha todos os campos obrigatórios", Toast.LENGTH_SHORT).show();
        }
        */
        DatabaseReference dbReferenceInstance = database.getReference();
        DatabaseReference dbReference = dbReferenceInstance.child("service");
       // Snackbar successPopUp = Snackbar.make(view, R.string.success_pop_up, BaseTransientBottomBar.LENGTH_LONG);

        /* Parsing Data of price service and price ticket data from String to Double */
        Double double_price_service = Double.parseDouble(price_service.getText().toString());
        Double double_price_ticket = Double.parseDouble(price_ticket.getText().toString());

        ServiceApp serviceApp = new ServiceApp();
        serviceApp.setName(name.getText().toString());
        serviceApp.setSurname(surname.getText().toString());
        serviceApp.setAddress(address.getText().toString());
        serviceApp.setEmail(email.getText().toString());
        serviceApp.setPhone(phone.getText().toString());
        serviceApp.setPriceService(double_price_service);
        serviceApp.setPriceTicket(double_price_ticket);
      //  serviceApp.setTypeService(type_service);
        serviceApp.setId(dbReference.push().getKey());

        dbReference.child(serviceApp.getId()).setValue(serviceApp);

        Intent intenet = new Intent(RegisterServiceActivity.this, MainActivity.class);
        startActivity(intenet);
       // successPopUp.make(findViewById(R.id.activity_main), R.string.success_pop_up, Snackbar.LENGTH_LONG).show();
    }
}
