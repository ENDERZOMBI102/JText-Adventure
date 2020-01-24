package entities;

import java.util.ArrayList;

class player extends entity
{
    private ArrayList<Object> inventory = new ArrayList<>();

    public player ()
    {}

    public void setNome(String name)
    {
        this.Name = name;
    }
    
    @Override
    public void die()
    {
        
    }
}
