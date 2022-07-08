
public class Ramka {

	private int id;
    private boolean czyWolna;
    private Strona strona;

    public Ramka(int id)
    {
        this.id=id;
        czyWolna=true;
        strona=null;
    }

    public void zaladujStrone(Strona strona)
    {
        if(czyWolna)
        {
            this.strona=strona;
            czyWolna=false;
        }
    }

    public void zdejmijStrone()
    {
        if(!czyWolna)
        {
            strona=null;
            czyWolna=true;
        }
    }

    public int getId() {
        return id;
    }

    public boolean isCzyWolna() {
        return czyWolna;
    }

    public Strona getStrona()
    {
        return strona;
    }

    public void setCzyWolna(boolean czyWolna) {
        this.czyWolna = czyWolna;
    }
}
