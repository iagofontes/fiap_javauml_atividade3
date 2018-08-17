import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.Timer;
import java.util.WeakHashMap;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.text.ChangedCharSetException;

public class Exercicio3 {

	public static Integer max = 1000000;
	public static ArrayList<Integer> arrayList = new ArrayList<>();
	public static LinkedList<Integer> linkedList = new LinkedList<>();
	public static Stack<Integer> stack = new Stack<>();
	public static HashSet<Integer> hashSet = new HashSet<>();
	public static HashMap<Integer, Integer> hashMap = new HashMap<>();
	public static WeakHashMap<Integer, Integer> weakHashMap = new WeakHashMap<>();
	
	
	public static void main(String[] args) {
		
		popularLista(arrayList);
		popularLista(linkedList);
		popularLista(stack);
		popularLista(hashSet);
		popularMap(hashMap);
		popularMap(weakHashMap);

		System.out.println(compareArrayListToLinkedList(arrayList, linkedList));
		System.out.println(compareStackToHashSet(stack, hashSet));
		System.out.println(compareHashMapToWeakHashMap(hashMap, weakHashMap));
		
	}
	
	public static String compareArrayListToLinkedList(ArrayList<Integer> arr, LinkedList<Integer> link) {
		
		String message = "Inicio";
		Long time1;
		Long time2;
		
		time1 = System.currentTimeMillis();
		procurarNaLista(arr);
		time2 = System.currentTimeMillis();
		Long dif1 = checarDiferenca(time1, time2);
		
		time1 = System.currentTimeMillis();
		procurarNaLista(link);
		time2 = System.currentTimeMillis();
		Long dif2 = checarDiferenca(time1, time2);		
		
		if(dif1 < dif2) {
			message = "Busca em ArrayList foi mais rápida.";
		} else {
			message = "Busca em LinkedList foi mais rápida.";
		}
		
		return message;
	}
	
	public static String compareStackToHashSet(Stack<Integer> stack, HashSet<Integer> hashSet) {
		
		String message = "Inicio";
		Long time1;
		Long time2;
		
		time1 = System.currentTimeMillis();
		procurarNaLista(stack);
		time2 = System.currentTimeMillis();
		Long dif1 = checarDiferenca(time1, time2);
		
		time1 = System.currentTimeMillis();
		procurarNaLista(hashSet);
		time2 = System.currentTimeMillis();
		Long dif2 = checarDiferenca(time1, time2);		
		
		if(dif1 < dif2) {
			message = "Busca em Stack foi mais rápida.";
		} else {
			message = "Busca em HashSet foi mais rápida.";
		}
		
		return message;
	}
	
	public static String compareHashMapToWeakHashMap(HashMap<Integer, Integer> hashMap, WeakHashMap<Integer, Integer> weakHashMap) {
		
		String message = "";
		Long time1;
		Long time2;
		
		time1 = System.currentTimeMillis();
		procurarNoMap(hashMap);
		time2 = System.currentTimeMillis();
		Long dif1 = checarDiferenca(time1, time2);
		
		time1 = System.currentTimeMillis();
		procurarNoMap(weakHashMap);
		time2 = System.currentTimeMillis();
		Long dif2 = checarDiferenca(time1, time2);		
		
		if(dif1 < dif2) {
			message = "Busca em HashMap foi mais rápida.";
		} else {
			message = "Busca em WeakHashMap foi mais rápida.";
		}
		
		return message;
	}	
	public static long checarDiferenca(Long t1, Long t2) {
		return ((t2-t1)/1000);
	}
	
	public static void popularLista(Collection<Integer> lista) {
		Integer i = 1;
		while(i <= max) {
			lista.add(i);
			i++;
		}
	}
	
	public static boolean procurarNaLista(Collection<Integer> lista) {
		
		boolean find = false;

		for(Integer i : lista) {
			if(i == 500000) {
				find = true;
				break;	
			}
		}
		
		return find;
	}
	
	public static void popularMap(Map<Integer, Integer> map) {
		Integer i = 1;
		while(i <= max) {
			map.put(i, i);
			i++;
		}
	}
	
	public static boolean procurarNoMap(Map<Integer, Integer> map) {
		boolean find = false;

		for(Map.Entry<Integer, Integer> store : map.entrySet()) {
			if(store.getValue() == 500000) {
				find = true;
				break;
			}			
		}

		return find;
	}
}
