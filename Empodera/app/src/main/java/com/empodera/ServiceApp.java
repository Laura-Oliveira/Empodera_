package com.empodera;

import android.widget.TextView;

public class ServiceApp
{
    private String id;
    private TextView name, surname;
    private TextView address, email, phone;
    private TextView typeService, priceService, priceTicket;

    public ServiceApp()
    {
        this.id = id;
        this.typeService = typeService;
        this.priceService = priceService;
        this.priceTicket = priceTicket;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public TextView getName()
    {
        return name;
    }

    public void setName(TextView name)
    {
        this.name = name;
    }

    public TextView getSurname()
    {
        return surname;
    }

    public void setSurname(TextView surname)
    {
        this.surname = surname;
    }

    public TextView getAddress()
    {
        return address;
    }

    public void setAddress(TextView address)
    {
        this.address = address;
    }

    public TextView getEmail()
    {
        return email;
    }

    public void setEmail(TextView email)
    {
        this.email = email;
    }

    public TextView getPhone()
    {
        return phone;
    }

    public void setPhone(TextView phone)
    {
        this.phone = phone;
    }

    public TextView getTypeService()
    {
        return typeService;
    }

    public void setTypeService(TextView typeService)
    {
        this.typeService = typeService;
    }

    public TextView getPriceService()
    {
        return priceService;
    }

    public void setPriceService(TextView priceService)
    {
        this.priceService = priceService;
    }

    public TextView getPriceTicket()
    {
        return priceTicket;
    }

    public void setPriceTicket(TextView priceTicket)
    {
        this.priceTicket = priceTicket;
    }
}
