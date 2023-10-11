package GestCom;

public class Product {
    private String reference;
    private int quantite;
    private double prix;
    private double taux;

    public void initProd(String r,int q,double p,double t){
        this.reference = r;
        this.quantite = q;
        this.prix = p;
        if(t >= 0 && t <=100){
            this.taux = t;
        }
    }

    public void ChangerTaux(double t){
        if(t >= 0 && t <=100){
            this.taux = t;
        }else{
            this.taux=0;
        }
    }

    public double CalculPrix(){
        return  this.prix + (this.prix * this.taux) / 100;
    }

    public void Affiche(){
        System.out.println("[ "
                +"reference:"+this.reference+" , "
                +"quantite:"+this.quantite+" , "
                +"prix:"+String.format("%.2f",this.prix)+" , "
                +"Taux de taxe:"+String.format("%.2f", this.taux)
                +" ]");
    }
}
