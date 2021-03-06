 

import java.util.ArrayList;

public abstract class Pokemon extends Card
{

    /**
      *Would love to use final, especially for ArrayLists, but, final would mostly be useless
      *and it'd be annoying to be inconcsistent, even if it's sort of consistent
      *If that explanation is confusing, send all hate mail to my GitHub, and I'll try to respond
      *in a timely fashion
    */
    protected int maxHP;
    protected String name;
    protected ArrayList<Attribute> attributes;
    protected ArrayList<Type> type;
    protected int retreatCost;
    protected Type weakness;
    protected Type resistance;
    protected int currentHP;
    protected ArrayList<Energy> attachedEnergy;
    protected ArrayList<Tool> attachedTools;
    protected ArrayList<Pokemon> attachedPokemon;
    protected int damageMod = 0;
    
    public Pokemon()
    {
    }
    
    
    public Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis) 
    {
        maxHP = maxhp;
        name = n;
        attributes = allattributes;
        type = t;
        retreatCost = retreatcost;
        weakness = weak;
        resistance = resis;

        attachedEnergy = new ArrayList<Energy>();
        attachedTools = new ArrayList<Tool>();
        attachedPokemon = new ArrayList<Pokemon>();
    }

    public Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes)
    {
        this(maxhp, n, allattributes, t, retreatcost, weak, resis);
        attachedPokemon = attachedPokes;

        attachedEnergy = new ArrayList<Energy>();
        attachedTools = new ArrayList<Tool>();
    }

    public Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts)
    {
        this(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes);
        attachedTools = ts;

        attachedEnergy = new ArrayList<Energy>();
    }

    public Pokemon(int maxhp, String n, ArrayList<Attribute> allattributes, ArrayList<Type> t, int retreatcost, Type weak, Type resis, ArrayList<Pokemon> attachedPokes, ArrayList<Tool> ts, ArrayList<Energy> attachedE)
    {
        this(maxhp, n, allattributes, t, retreatcost, weak, resis, attachedPokes, ts);
        attachedEnergy = attachedE;
    }

    public void setMaxHP(int hp)
    {
        maxHP = hp;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setRetreatCost(int rc)
    {
        retreatCost = rc;
    }

    public void setWeakness(Type t)
    {
        weakness = t;
    }

    public void setResistance(Type t)
    {
        resistance = t;
    }

    public void setCurrentHP(int chp)
    {
        currentHP = chp;
    }

    public void addAttribute(Attribute a)
    {
        attributes.add(a);
    }

    public void addType(Type t)
    {
        type.add(t);    
    }

    public void addEnergy(Energy e)
    {
        attachedEnergy.add(e);
    }

    public void addTool(Tool t)
    {
        attachedTools.add(t);
    }

    public void removeAttribute(Attribute a)
    {
        attributes.add(a);
    }

    public void removeType(Type t)
    {
        type.add(t);
    }
    

    public void removeEnergy(Energy e)
    {
        attachedEnergy.remove(e);
    }

    public void removeTool(Tool t)
    {
        attachedEnergy.remove(t);
    }

    public int getMaxHP()
    {
        return maxHP;
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Attribute> getAttributes()
    {
        return attributes;
    }

    public ArrayList<Type> getTypes()
    {
        return type;
    }

    public int getRetreatCost()
    {
        return retreatCost;
    }

    public Type getWeakness()
    {
        return weakness;
    }

    public Type getResistance()
    {
        return resistance;
    }

    public int getCurrentHP()
    {
        return currentHP;
    }

    public ArrayList<Energy> getEnergy()
    {
        return attachedEnergy;
    }

    public ArrayList<Tool> getTools()
    {
        return attachedTools;
    }

    public ArrayList<Pokemon> getPokemon()
    {
        return attachedPokemon;
    }

    
    public void setPokemon(ArrayList<Pokemon> ps)
    {
        attachedPokemon = ps;
    }
    
    public void setEnergy(ArrayList<Energy> es)
    {
        attachedEnergy = es;
        
    }
    
    public void setTools(ArrayList<Tool> ts)
    {
        attachedTools = ts;
    }
    
    
    public int getDamageMod()
    {
        return damageMod;
    }
    
    public void setDamageMod(int newMod)
    {
        damageMod = newMod;
    }
    
    
    
    
            
    
    
    
}
