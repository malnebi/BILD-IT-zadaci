package zadaci_01_08_2016;

import java.util.ArrayList;

public class Z1metodaArrayListVracaNajvecuVr {

	public static void main(String[] args) {
		//kreiranje liste
		ArrayList<Integer> list = new ArrayList<Integer>();
		// dodavanje elemenata u istu 
		list.add(1);
		 list.add(20);
		 list.add(11);
		 list.add(4);
		 list.add(25);
// ispis rezultata
		System.out.print("Najveca vrijednost je: " + max(list));

	}
/**metoda koja vraca vrijednost najveceg broja**/
	public static Integer max(ArrayList<Integer> list) {
// pocetna vrijednost varijable maxim
		Integer maxim = list.get(0);

		if (list.isEmpty()) {
			return null;
		} else {
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i - 1) < list.get(i)) {
					maxim = list.get(i);
				}
			}
		}
		return maxim;
	}

}
