public class Ulamek {
    int licznik;
    int mianownik;
    Ulamek(int licznik,int mianownik)
    {
        this.licznik = licznik;
        this.mianownik=mianownik;
    }
    public String toString(){
        return"[licznik : "+licznik +" mianownik: "+mianownik+"]";
    }   
    double rozwDziesietne(){
        return (float)licznik/mianownik;}
}
    