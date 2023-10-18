package com.example;

public class Labo {
	private int num;
	private String specialite;
	private Ordinateur[] listeOrdi;
	private int nbreOrdi;
	
	public Labo(int num, String specialite,int capacite) {
		this.num = num;
		this.specialite = specialite;
		listeOrdi=new Ordinateur[capacite];
		nbreOrdi=0;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Ordinateur[] getListeOrdi() {
		return listeOrdi;
	}

	public int getNbreOrdi() {
		return nbreOrdi;
	}

	@Override
	public String toString() {
		return "Labo [num=" + num + ", specialite=" + specialite + ", nbreOrdi=" + nbreOrdi + "]";
	}
	
	public void AfficheOrdi()
	{
		//System.out.println(Arrays.toString(listeOrdi));
		
		for(int i=0;i<nbreOrdi;i++)
			System.out.println(listeOrdi[i]);
		
		//OU bien
		/*
		for(Ordinateur o:listeOrdi)
		{
			if(o==null)
				break;
			System.out.println(o);
		}*/
	}
	
	public double coutTotal()
	{
		double total=0;
		for(int i=0;i<nbreOrdi;i++)
			total+=listeOrdi[i].cout();
		return total;
	}
	
	
	public int RechercheIndice(String numSerie)
	{
		for(int i=0;i<nbreOrdi;i++)
		{
			if(listeOrdi[i].getNumSerie().equals(numSerie))
				return i;
		}
		
		return -1;
	}
	
	public Ordinateur RechercheOrdi(String numSerie)
	{
		for(int i=0;i<nbreOrdi;i++)
		{
			if(listeOrdi[i].getNumSerie().equals(numSerie))
				return listeOrdi[i];
		}
		
		return null;
		/*
		if(RechercheIndice(numSerie)==-1)
			return null;
		return(listeOrdi[RechercheIndice(numSerie)]);
		*/
	}
	
	public void AjoutOrdi(Ordinateur o)
	{
		if(nbreOrdi==listeOrdi.length)
			System.out.println("Tableau saturee!!!");
		else
		{
			//if(RechercheIndice(o.getNumSerie())!=-1)
			if(RechercheOrdi(o.getNumSerie())!=null)
				System.out.println("existe déja!!");
			else
				listeOrdi[nbreOrdi++]=o;
			
		}
	}
	
	public void AjoutOrdi(String numSerie, String marque, double prix, double coutInstallation)
	{
		//AjoutOrdi(new Ordinateur(numSerie,marque,prix,coutInstallation));
		//OU bien
		
		if(nbreOrdi==listeOrdi.length)
			System.out.println("Tableau saturee!!!");
		else
		{
			//if(RechercheIndice(numSerie)!=-1)
			if(RechercheOrdi(numSerie)!=null)
				System.out.println("existe déja!!");
			else
				listeOrdi[nbreOrdi++]=new Ordinateur(numSerie,marque,prix,coutInstallation);
			
		}
	}
	
	public void SuppOrdi(int indice)
	{
		if(indice>=0&&indice<nbreOrdi)
		{
			for(int i=indice;i<nbreOrdi-1;i++)
				listeOrdi[i]=listeOrdi[i+1];
			listeOrdi[nbreOrdi-1]=null;
			nbreOrdi--;
		
		}
	}
	
	public void SuppOrdi(String numSerie)
	{
		SuppOrdi(RechercheIndice(numSerie));
	}
	
	public Ordinateur[] listeMarque(String marque)
	{
		Ordinateur[] tab=new Ordinateur[nbreOrdi];
		int j=0;
		for(int i=0;i<nbreOrdi;i++)
		{
			if(listeOrdi[i].getMarque().equals(marque))
				tab[j++]=listeOrdi[i];
		}
		return tab;
	}
	
	public void viderLabo()
	{
		for(int i=0;i<nbreOrdi;i++)
			listeOrdi[i]=null;
		nbreOrdi=0;
	}

}
