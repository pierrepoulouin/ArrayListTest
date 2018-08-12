package test;


import java.io.IOException;
import java.util.ArrayList;

 class Nombres {

	public static void main(String[] args) throws IOException  {
		//on donne une taille à la liste
		int n= 10;
		// on crée l'instance number via la classe ArrayList
		ArrayList<Integer> number = new ArrayList<>();
		// Ajout du nouvel élément à la fin de la liste
		for(int i=0; i <=n; i++) {
			number.add(i);
		}
		//affiche la list
		System.out.println(number);
		
		//Supprime l'élement 6 de l'index
		number.remove(6);
		
		//Affiche la nouvelle liste après suppression 
		System.out.println(number);
		
		//Affiche les elements de la liste un par un
		for(int i=0; i<= number.size(); i++) {
			System.out.print(number.get(i) + " ");
		}
		

	}

}
