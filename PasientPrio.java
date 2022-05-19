public class PasientPrio extends PasientAdm{

    Pasient[] Startprio = new Pasient[Pasient.MAXPASPRIO + 1 ];
    Pasient[] Sluttprio = new Pasient[Pasient.MAXPASPRIO + 1 ];
    
    
    @Override 
    public void settInnPasient(Pasient p){
        if(Startprio[p.prioritet] == null){
            Startprio[p.prioritet] = p;
            Sluttprio[p.prioritet] = p;
        } else{
            Sluttprio[p.prioritet].neste = p;
            Sluttprio[p.prioritet] = p;
        }
    }

    @Override 
    public Pasient hentUt(Pasient p){
        return null;
    }
    @Override 
    public Pasient hentUt(int i){
        return null;
    }
}
