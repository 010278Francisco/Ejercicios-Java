import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
	public static void main(String[] args) {
		//Las collecciones  nos sirven para almacenar un conjunto de objetos
		
		//La diferencia de las collecciones y los objetos
		//las colecciones son dinamicas, pueden cambiar
		//el numero de objetos agregados
		
		//SET caracteristicas
		//Set tiene 3 implmentaciones
		//estos no puede contener elementos repetidos
		/*HashSet, Treeset, LinkedHashSet*/
		
		//HashSet--
		///Los elementos no mantienen un orden
		/*
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");*/
		
		/*
		// foreach puede recorrer una coleccion y en cada
		recorrido recupera el valor y los podemos almacenar
		en una variable
		for(tipoDeDatoElemento variable : elementiARecorrer)
		*/
		/*for(String fruta : frutas) {
			System.out.println(fruta);*/
		
		
		//TREESET
		//Esta implementacion ordena
		//la implementacion es mas lenta
		/*
		Set<String> frutas = new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("Piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		
			
		}*/
		
		//lINKEDHASHSET
		//Ordena los elementos en orden de inserccion
		//es mas costoso que hashSet
		/*
		Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("Piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		
		*/	
		
		
		
		
		//LIST
		//Se permiten elementos duplicados
		//acceder a elementos especificos
		//buscar elementos
		
		
		
		//ArrayList
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("chicorita");
		pokemones.add("Eevee");
		pokemones.add("Psyduck");
		pokemones.add("DDragonite");
		pokemones.add("Charizard");
		pokemones.add("Genzar");
		pokemones.add("Flygon");
		
		//add si agrgamos un indice y un elemento, posiciona
		//el elemento en el idice y realiza un desplazamiento
		//es decir no borra el elmento si no que lo recorre
		pokemones.add(2, "Pikachu");
		
		//remove: remueve el elemento de la posicion especificada
		pokemones.remove(0);
		
		
		//set reemplaza el elemento en la posicio especificada
		pokemones.set(0, "CHIKORITA");
		for (String pokemon : pokemones) {
			System.out.println(pokemon);
			
		}
		
		System.out.println("**************");
		System.out.println(pokemones.get(4));
		
		
		//indexOf
		// nos va a devolver la pasicion del elemento
		// y si el elmento no se encuentra nos devuelve -1
		
		System.out.println(pokemones.indexOf("Genzar"));
		System.out.println("****************************");
		//LINKEDLIST
		//Es una lista doblememnte enlazada
		//Es mas rapido para insertar y remover elementos
		List<String> digimones =new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		
		
		//MAP
		/*Asocia claves a valores
		 * No puede conter llaves duplicadas
		 * solo puede tener un valor asociado*/
		
		//HashMap
		/*Tiene mejor rendimiento pero no garantuza un orden
		 * a la hora de hacer las iteraciones*/
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Carlos Eduardo");
		usuarios.put(2, "Raul");
		usuarios.put(2, "Carlos");
		usuarios.put(3, "Rodrigo");
		System.out.println("///////////////////////////");
		System.out.println(usuarios.get(2));
		
		
		//KEYSET
		//Nos permite recuperar el nombre de la clave 
		System.out.println(usuarios.keySet());
		//values
		//nos permite recuperar el vallor directamente
		System.out.println(usuarios.values());
		
		
		//TreeMap
		Map<Integer, String> tamales = new TreeMap<Integer, String>();
		tamales.put(5, "Mole Rojo");
		tamales.put(9, "Mole Verde");
		tamales.put(100, "Gansito");
		tamales.put(1, "Cocinita");
		System.out.println("***************");
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		System.out.println("888888888888");	
		System.out.println(tamales);
		System.out.println("////////////////////");
		tamales.entrySet().forEach(elemento ->{//funcion lambda
			System.out.println(elemento.getKey());
			System.out.println(elemento.getValue());
			
			
		});
		

		//LINKEDHASMAP
		//Guarda los elementos segun el orden en que se inseten
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		
		carros.put(1, "Volvo");
		carros.put(567, "Pointer");
		carros.put(8, "Mustang");
		
		System.out.println("--------------------------");
		System.out.println("hay"+ carros.keySet());
		System.out.println("hay"+ carros.values());;
		
	}
		
		
		
		
		
	
	}


