package com.example;

public class Test {
    public static void main(String[] args) {
        Repertoire R = new Repertoire(200);

        Abonne abonne_Mohamed = new Abonne("Mohamed", true, "98123456");
        Abonne abonne_Ali = new Abonne("Ali", false, "22123456");
        Abonne abonne_Fatma = new Abonne("Fatma", true, "50123456");
    
        R.addAbonne(abonne_Mohamed);
        R.addAbonne(abonne_Ali);
        R.addAbonne(abonne_Fatma);

        System.out.print("R.getNumero(\"Mohamed\") : ");
        System.out.println(R.getNumero("Mohamed"));

        System.out.println(R.getFavoris());
        System.out.println(R.getFavoris().getTabAbonne().length);
        
        Abonne abonne_de_ND_22123456 = R.getAbonne("22123456");  
        boolean addition_succeeded =  abonne_de_ND_22123456.addNum("55654789");
        System.out.println("addition_succeeded : " + addition_succeeded);
        
        abonne_de_ND_22123456.setNumDef(1);
        
        // abonne_Fatma.modifNum(abonne_Fatma.getNumDef(),"98123456");
        
        R.addFavoris(abonne_Ali.getNumDefault());

        System.out.println(R.getFavoris());
        System.out.println(R.getFavoris().getTabAbonne().length);
    }
}
