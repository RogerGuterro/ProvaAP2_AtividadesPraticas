package ProvaAP2;
import java.awt.*;
import javax.swing.*;
public class TelaCovid extends JFrame{
    JLabel lbltitulo = new JLabel("Como estamos vivendo hoje?");
    JLabel lblEstaComSintomas = new JLabel("Voc� est� apresentando sintomas do COVID-19?");
    JButton sintomaSim = new JButton("Sim");
    JButton sintomaNao = new JButton("Nao");
    JLabel pergSintomas = new JLabel("Se sua resposta foi sim, descreva quais os sintomas.");
    JTextField descSintomas = new JTextField();
    JLabel lblFamiliaComSintomas = new JLabel("Alguem de sua proximidade est� apresentando sintomas do COVID-19?");
    JButton familiaSim = new JButton("Sim");
    JButton familiaNao = new JButton("Nao");
    JLabel lblQuaisSintomas = new JLabel("Voc� conhece os sintomas da COVID-19?");
    JButton sintomasSim = new JButton("Sim");
    JButton sitomasNao = new JButton("Nao");
    JLabel lblRecomendacoes = new JLabel("Voc� esta seguindo todas as recomenda��es da OMS?");
    JButton recomendaSim = new JButton("Sim");
    JButton recomendaNao = new JButton("Nao");
    JLabel lblNome = new JLabel("Nome Completo");
    JTextField nometext = new JTextField();
    JLabel lblIdade = new JLabel("Idade");
    JSpinner idadecont = new JSpinner();
    JLabel lblProfiss�o = new JLabel("Profiss�o");
    JTextField descProfiss�o = new JTextField();

    public TelaCovid(){
        setLayout(new GridLayout(25,2));
        Container c = getContentPane();
        setTitle ("Question�rio sobre 'Como estamos vivendo hoje?' em meio a essa Pandemia");
        c.add(lbltitulo);
        c.add(lblEstaComSintomas);
        c.add(sintomaSim);
        c.add(sintomaNao);
        c.add(pergSintomas);
        c.add(descSintomas);
        c.add(lblFamiliaComSintomas);
        c.add(familiaSim);
        c.add(familiaNao);      
        c.add(lblQuaisSintomas);
        c.add(sintomasSim);
        c.add(sitomasNao); 
        c.add(lblRecomendacoes);
        c.add(recomendaSim);
        c.add(recomendaNao);         
        c.add(lblNome);
        c.add(nometext);        
        c.add(lblIdade);
        c.add(idadecont);
        c.add(lblProfiss�o);
        c.add(descProfiss�o);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}