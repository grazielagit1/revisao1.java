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



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteBotao {

    public void testeBotao() {

        // Primeiro vamos fazer uma janela para colocar o botao
        JFrame janela = new JFrame();

        // Agora vamos criar o botao e colocar na janela
        JButton botao = new JButton("Botao Teste");
        janela.add(botao);

        // Agora vamos criar a acao usando inner class
        // (poderia ser criada de qualquer jeito, desde que implemente ActionListener)
        AcaoBotao acaoBotao = new AcaoBotao();

        // Vamos inserir a acao no botao
        botao.addActionListener(acaoBotao);

        // Agora vamos fazer algumas configuracoes que vamos aprender mais adiante para que servem
        // 1 - redimensiona para caber todos componentes
        janela.pack();
        // 2 - configura para terminar o programa quando a janela for fechada
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // 3 - torna a janela visivel
        janela.setVisible(true);

    }

    // Este eh o ActionListener que vai ser inserido no botao
    class AcaoBotao implements ActionListener{

        // Um action listener deve ter um actionPerformed
        // esta eh a acao que sera acionada quando o botao (evento) for pressionado
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("O botão foi pressionado!");
        }

    }

    public static void main(String[] args) {
        new TesteBotao().testeBotao();
    }

}
