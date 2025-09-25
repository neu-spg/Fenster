public class Fenster
{
    private String  material;
    private int     preis;
    private boolean kippbar;
    
    //constructor
    public Fenster(String material,int preis,boolean kippbar)
    {
        setMaterial(material);
        setPreis (preis);
        setKippbar (kippbar);
    }
    
    //Mischform constructor
    public Fenster(int preis)
    {
        setMaterial("Alu");
        setPreis (preis);
        setKippbar (true);
    }
    
    //default constructor
    public Fenster()
    {
        setMaterial("Alu");
        setPreis(499);
        setKippbar(true);
    }
    
    //Fenster int
    // Signatur BEREITS VORHANDEN!!!!, Reihenfolge auch wichtig!
    /*
    public Fenster(int neuAnz)
    {
        
    }
    */
   
    // getMaterial
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
    
    public void setMaterial(String material)
    {
        //Die Eigenschaft material wird mit dem Wert des Parameters neuMaterial überschrieben
        this.material = material;
    }
    
    public void setPreis(int preis)
    {
        this.preis =  preis;
    }
    
    public void setKippbar(boolean kippbar)
    {
        this.kippbar = kippbar;
    }
    
    public void printFenster()
    {
        if (kippbar == true)
        {
            System.out.println(material + "Fenster: " + preis + " EUR - " + "KIPPBAR");
        }
        else
        {
            System.out.println(material + "Fenster: " + preis + " EUR - " + "nicht KIPPBAR");
        }
    }
    
}