package Jour01.Job08;

public class Facture {
    public static void main(String[] args) {
        float prix = 49.99f;
        int quantite = 3;
        float tarifHT = prix * quantite;
        int tva = 20;
        float tarifTTC = tarifHT * (1 + tva / 100f);
        System.out.println("Le montant total est : " + tarifHT);
        System.out.println("Le montant de la taxe est : " + (tarifTTC - tarifHT));
        System.out.println("Le montant total à payer est : " + tarifTTC);
    }
}
