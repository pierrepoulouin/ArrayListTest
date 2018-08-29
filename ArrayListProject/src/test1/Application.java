package test1;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {

		//Création de l'instance listePersonne de la Class ArrayList
		ArrayList <Personne> listePersonne = new ArrayList<Personne>();

		//On crée une instance de la Classe Personne
		Personne p1 = new Personne();
		
		//On affecte les valeurs à l'objet p1
		p1.setNom("Poulouin");
		p1.setPrenom("Pierre");
		p1.setAge(23);
		p1.setTelephone("privé");
		p1.setEmail("PierreDuChnord@gmail.com");

		listePersonne.add(p1);

		Personne p2 = new Personne();
		
		//On affecte les valeurs à l'objet p2
		p2.setNom("Bordes");
		p2.setPrenom("Constance");
		p2.setAge(20);
		p2.setTelephone("public");
		p2.setEmail("ConstanceZeBest@gmail.com");
		
		listePersonne.add(p2);
		
		for(int i = 0; i < listePersonne.size(); i++) {
			System.out.print(listePersonne.get(i).getPrenom());
			System.out.print(" " +listePersonne.get(i).getNom());
			System.out.print(" " +listePersonne.get(i).getAge());
			System.out.print(" " +listePersonne.get(i).getTelephone());
			System.out.println(" " +listePersonne.get(i).getEmail());
		}



	}

}
