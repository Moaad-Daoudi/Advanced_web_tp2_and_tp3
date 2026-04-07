package ma.ensah.tp2.models;

public class Reservation {
    private Client client;
    private String type;
    private double prix;
    private String vue;

    public Reservation(Client client, String type, double prix, String vue) {
        this.client = client; 
        this.type = type; 
        this.prix = prix; 
        this.vue = vue;
    }

    public String getType() {
        return type;
    }

    public double getPrix() {
        return prix;
    }

    public String getVue() {
        return vue;
    }
}