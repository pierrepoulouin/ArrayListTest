package test1;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {

		//Cr�ation de l'instance listePersonne de la Class ArrayList
		ArrayList <Personne> listePersonne = new ArrayList<Personne>();

		//On cr�e une instance de la Classe Personne
		Personne p1 = new Personne();
		p1.setNom("Poulouin");
		p1.setPrenom("Pierre");
		p1.setAge(23);
		p1.setTelephone("priv�");
		p1.setEmail("PierreDuChnord@gmail.com");
		
		listePersonne.add(p1);



	}

}
