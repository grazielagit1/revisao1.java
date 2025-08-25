public class Array {
    public static void main(String[] args) {
       String[] ninja = new String[4]; // Aqui

       ninja[0] = "Naruto Uzumaki";
       ninja[1] = "Sasuke Uchiha";
       ninja[2] = "Sakura Haruno";
       ninja[3] = "Hinata";

       System.out.println(ninja[0]);
        
       // Sempre quando quisermos adicionar um novo elemento ao array, precisamos mudar la em cima:
    
    }

}

// Mais um exemplo de Array List:

public interface AcaoVoar {
    
    public void fazVoar();   
}


public class AcaoVoarConcreta implements AcaoVoar {
    @Override
    public void fazVoar(){
        System.out.println(">>> Classe concreta que definine acao: faz voar");
    }

}




import java.util.ArrayList;
import java.util.List;

public class Pato {


  List<AcaoVoar> acaoVoarList = new ArrayList<>();
    public void addAcaoVoar(AcaoVoar aAcaoVoar){
        this.acaoVoarList.add(aAcaoVoar);
    }

    public void voar() {
        for(AcaoVoar acaoVoar : this.acaoVoarList) {
            acaoVoar.fazVoar();
        }
    }

}


public class TestaPato {
    public void testaPato() {

        Pato pato = new Pato();


        pato.addAcaoVoar(new AcaoVoarConcreta());
        System.out.println("\n1) Pato voando");
        pato.voar();
        System.out.println("\n");


        pato.addAcaoVoar(new AcaoVoarInnerClass());
        System.out.println("\n2) Pato voando");
        pato.voar();
        System.out.println("\n");


        pato.addAcaoVoar(new AcaoVoar() {
            @Override
            public void fazVoar() {
                System.out.println("Acao de classe anonima: faz voar");
            }
        });
        System.out.println("\n3) Pato voando");
        pato.voar();
        System.out.println("\n");


        pato.addAcaoVoar(() -> System.out.println("Acao como expressao lambda: faz voar"));
        System.out.println("\n4) Pato voando");
        pato.voar();
        System.out.println("\n");


    }

    // Definicao de inner class (uma classe dentro de outra classe)
    class AcaoVoarInnerClass implements AcaoVoar{
        @Override
        public void fazVoar() {
            System.out.println("Acao definida em classe interna: faz voar");
        }
    }



    public static void main(String[] args) {
        new TestaPato().testaPato();
    }

}
