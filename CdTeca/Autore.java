package CdTeca_Remastered;

import java.time.LocalDate;

public class Autore {
    private String nome;
    private String cognome;
    private LocalDate bDay;

    public Autore(String nome, String cognome, LocalDate bDay) {
        this.nome = nome;
        this.cognome = cognome;
        this.bDay = bDay;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getbDay() {
        return bDay;
    }

    public void setbDay(LocalDate bDay) {
        this.bDay = bDay;
    }

    @Override
    public String toString() {
        return "Autore [getNome()=" + getNome() + ", getCognome()=" + getCognome() + ", getbDay()=" + getbDay() + "]";
    }

    public boolean compareAutore(Autore autore){
        return this.toString().equals(autore.toString());
    }
    
}
