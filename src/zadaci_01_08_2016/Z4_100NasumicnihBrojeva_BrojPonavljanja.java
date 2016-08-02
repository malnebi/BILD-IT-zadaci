package zadaci_01_08_2016;

public class Z4_100NasumicnihBrojeva_BrojPonavljanja {

	public static void main(String[] args) {
		// niz od 10 elemenata tipa int
		int[] array = new int[100];
		// niz koji sluzi kao brojac brojeva koji se pojavljuju
		int[] count = new int[10];

		// for petljom se popunjava niz count[]
		for (int i = 0; i < array.length; i++) {
			int num = (int) (Math.random() * 10);
			array[i] = num;
			// svaki put kad je elemenat niza jednak nasumicnom broju elemenat
			// niza count se uvecava za broj na tom indeksu
			count[num]++;
		}

		//ispis broja ponavljanja za svaku cifru
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				//ako vrijednost elemenat niza count[] nije nula ispisuje se  
				System.out.println(" Broj " + i + " se ponavlja " + count[i]
						+ (count[i] == 1 ? " put." : " puta."));
				// ternarni operator, ispisuje "put" ili "puta" zavisno od broja pojavljivanja cifara
			}
		}

	}

}
