package entities;

public class entity
{
    protected double HP;
    protected String Name;
    public entity()
    {}

    public void Damage (Double damage)
    {
        this.HP -= damage;
        if (this.HP < 0 )
        {
            this.die();
        }
    }

    protected void die()
    {

    }
}