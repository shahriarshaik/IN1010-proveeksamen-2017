public class Sykehus {


    void skrivInn(Pasient p, Avdeling avdeling){
        avdeling.settInn(p);
    }

    void skrivUt(Pasient p, Avdeling avdeling){
        avdeling.hentUt(p);
    }

    void overfor(Pasient p, Avdeling fra, Avdeling til){
        fra.hentUt(p);
        til.settInn(p);
    }

    public static void main(String[] args) {
        Sykehus sykehus = new Sykehus();
        Akutten akutt = new Akutten();
        Sengepost seng = new Sengepost(2);
        Pasient arne = new Pasient("Arne", "idk", 2);
        Pasient peter = new Pasient("Peter", "idk", 5);

        sykehus.skrivInn(arne, akutt);

        sykehus.skrivInn(peter, akutt);

        sykehus.overfor(arne,akutt , seng);
        

    }
}
