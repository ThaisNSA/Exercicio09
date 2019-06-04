package Quest1eQuest2;
public class TestaAnimais {
    public static void main(String [] args){
        
        Papagaio p = new Papagaio("Zezin",true,"Dá o pé Loro");
        p.talk();
        p.imprime();
        
        Arara a = new Arara("Sarah",true);
        a.talk();
        a.imprime();
        
        Cachorro c = new Cachorro("Aslan",4,true);
        c.talk();
        c.imprime();
        
        Vaca v = new Vaca("Mococa",4,true);
        v.talk();
        v.imprime();
    }    
}