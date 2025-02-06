package CdTeca_Remastered;

import java.util.ArrayList;

public class CdTeca {
    private ArrayList<Cd> cdTeca;

    public CdTeca(){
        this.cdTeca = new ArrayList<Cd>(2);
    }

    public ArrayList<Cd> getCdTeca() {
        return cdTeca;
    }

    public void aggiungiCd(Cd cd){
        cdTeca.add(cd);
    }

    public void aggiungiCd(String titolo, Autore autore, int numeroBrani, double durata){
        cdTeca.add(new Cd(titolo, autore, numeroBrani, durata));
    }
    
    public double durataTotale(){
        double out = 0;
        for (Cd cd : cdTeca) {
            out += cd.getDurata();
        }
        return out;
    }

    public int numeroBraniTotale(){
        int out = 0;
        for (Cd cd: cdTeca) {
            out += cd.getNumeroBrani();
        }
        return out;
    }

    public double mediaDuarataBrani(){
        return Math.floor((durataTotale() / numeroBraniTotale()) * 100) / 100;
    }

    public String cdPiuCorto(){
        Cd out = new Cd(null, null, 0, 1000000004);
        for (Cd cd : cdTeca) {
            if(cd.getDurata() < out.getDurata()){
                out = cd;
            }
        }
        return out.getTitolo();
    }
}
