public class Fenster
{
    private String  material;
    private int     preis;
    private boolean kippbar;
    
    //constructor
    public Fenster(String neuMaterial,int neuPreis,boolean neuKippbar)
    {
        setMaterial(neuMaterial);
        setPreis (neuPreis);
        setKippbar (neuKippbar);
    }
    
    //Mischform constructor
    public Fenster(int neuPreis)
    {
        setMaterial("Alu");
        setPreis (neuPreis);
        setKippbar (true);
    }
    
    //default constructor
    public Fenster()
    {
        setMaterial("Alu");
        setPreis(499);
        setKippbar(true);
    }
    
    public String getMaterial()
    {
        return material;
    }
    
    public int getAnzahl()
    {
        return preis;
    }
    
    public boolean getKippbar()
    {
        return kippbar;
    }
    
    public void setMaterial(String neuMaterial)
    {
        material = neuMaterial;
    }
    
    public void setPreis(int neuPreis)
    {
        preis =  neuPreis;
    }
    
    public void setKippbar(boolean neuKippbar)
    {
        kippbar = neuKippbar;
    }
    
    public void printFenster()
    {
        System.out.println(material + " Fenster: " + preis + " EUR - " + kippbar);
    }

}

