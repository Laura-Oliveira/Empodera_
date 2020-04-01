package com.empodera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterServiceActivity extends AppCompatActivity
{
    View view;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();

    private TextView name, surname, type_service, price_service, price_ticket;
    private TextView address, email, phone;
    private CheckBox checkbox_cake, checkbox_hair_style, checkbox_chef;
    private TextView txt_check_cake, txt_check_hair_style, txt_check_chef;
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
        type_service = findViewById(R.id.txt_type_service);

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


        ServiceApp serviceApp = new ServiceApp();
        serviceApp.setName(name);
        serviceApp.setSurname(surname);
        serviceApp.setAddress(address);
        serviceApp.setEmail(email);
        serviceApp.setPhone(phone);
        serviceApp.setPriceService(price_service);
        serviceApp.setPriceTicket(price_ticket);
        serviceApp.setTypeService(type_service);
        serviceApp.setId(dbReference.push().getKey());

        dbReference.child(serviceApp.getId()).setValue(serviceApp);

        Intent intenet = new Intent(RegisterServiceActivity.this, MainActivity.class);
        intenet.putExtra("sucess", "Serviço Cadastrado com sucesso!");
        startActivity(intenet);
    }
}
