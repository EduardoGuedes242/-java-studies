package org.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("Estamos Gerando os seus lutadores");

    Lutador[] lutadores = new Lutador[6];

    lutadores[0] = new Lutador("Pretty boy",
            "França",
            31,
            1.75,
            68.9,
            11,
            2,
            1);

    lutadores[1] = new Lutador("Putscript",
            "Brasil",
            29,
            1.68,
            68.9,
            14,
            2,
            3);

    lutadores[2] = new Lutador("Snapshadow",
            "EUA",
            35,
            1.65,
            80.9,
            12,
            2,
            1);

    lutadores[3] = new Lutador("Dead code",
            "Austrália",
            28,
            1.93,
            81.6,
            13,
            0,
            2);

    lutadores[4] = new Lutador("Ufocobol",
            "Brasil",
            37,
            1.70,
            119.3,
            5,
            4,
            3);

    lutadores[5] = new Lutador("Nerdaard",
            "EUA",
            30,
            1.81,
            105.7,
            12,
            2,
            4);

    Luta luta1 = new Luta(lutadores[1], lutadores[0]);
    luta1.marcarLuta();
    luta1.lutar(4);
    luta1.lutar(4);
    luta1.lutar(4);
    luta1.lutar(4);
    luta1.lutar(4);
    luta1.lutar(4);

  }
}