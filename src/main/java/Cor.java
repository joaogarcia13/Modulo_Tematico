package main.java;

import java.awt.*;

public class Cor {

    private Color cor;

    public Cor (String cor){
        switch(cor){
            case "azul_escuro":
                this.cor= new Color(60, 94, 115);
                break;
            case "amarelo":
                this.cor= new Color(239, 177, 74);
                break;
            case "vermelho":
                this.cor= new Color(217, 86, 74);
                break;
            case "azul_claro":
                this.cor= new Color(169, 202, 221);
                break;
            case "branco":
                this.cor= new Color(235, 244, 249);
                break;
            default:
                System.out.println("Nome de cor errado.");
        }
    }

}
