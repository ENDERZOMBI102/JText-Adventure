package entities;

import java.util.ArrayList;

import entities.entity;

class player extends entity
{
    private ArrayList<Object> inventory = new ArrayList<>();

    public player (String Name)
    {
        this.Name = Name;
    }

    @Override
    public void die()
    {
        
    }
}
