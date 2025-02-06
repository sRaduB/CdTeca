package CdTeca_Remastered;

public class Cd {
    private String titolo;
    private Autore autore;
    private int numeroBrani;
    private double durata;
    
    public Cd(String titolo, Autore autore, int numeroBrani, double durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroBrani = numeroBrani;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public int getNumeroBrani() {
        return numeroBrani;
    }

    public void setNumeroBrani(int numeroBrani) {
        this.numeroBrani = numeroBrani;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Cd [Titolo = " + getTitolo() + ", Autore = " + getAutore() + ", getNumeroBrani = " + getNumeroBrani() + ", getDurata = " + getDurata() + "]";
    }

    public String compareDurata(Cd cd){
        if(this.getDurata() < cd.getDurata()){
            return this.getTitolo();
        }
        else if(this.getDurata() > cd.getDurata()){
            return cd.getTitolo();
        }
        else{
            return null;
        }
    }
    
}
