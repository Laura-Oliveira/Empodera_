package com.empodera;

import android.widget.EditText;

public class ServiceApp
{
    private String id;
    private String name, surname;
    private String address, email, phone;
    private String typeService;
    private double priceService, priceTicket;

    public ServiceApp()
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.priceService = priceService;
        this.priceTicket = priceTicket;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.typeService = typeService;

    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public double getPriceService()
    {
        return priceService;
    }

    public void setPriceService(double priceService)
    {
        this.priceService = priceService;
    }

    public double getPriceTicket()
    {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket)
    {
        this.priceTicket = priceTicket;
    }

    public String getTypeService()
    {
        return typeService;
    }

    public void setTypeService(String typeService)
    {
        this.typeService = typeService;
    }

}
