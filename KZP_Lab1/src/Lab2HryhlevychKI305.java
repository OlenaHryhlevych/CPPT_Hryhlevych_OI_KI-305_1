import java.io.*;
import java.util.*;
/**
 * Клас Lab2HryhlevychKI305 реалізує програму до лабораторної №2
 * 
 * @author Hryhlevych Olena
 * @version 1.0
 * @since version 1.0
 * 
 */
public class Lab2HryhlevychKI305 {
	/**
	 * Статичний метод main є точкою входу в програму
	 * 
	 * @param args 
	 * @throws FileNotFoundException 
	 * 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		int nRows;
		char[][] arr;
		String filler;
		Scanner in = new Scanner(System.in);
		File dataFile = new File("MyFile.txt");
		PrintWriter fout = new PrintWriter(dataFile);
		
		System.out.print("Enter size of matrix: ");//вводимо розмір матриці з клавіатури
		nRows = in.nextInt();
		in.nextLine();
		
		System.out.print("\nEnter symbol for filling: ");//вводимо символ-заповнювач з клавіатури
		filler = in.nextLine();
		
		int half = nRows/2;
		
		if(nRows % 2 == 0) {
			arr = new char[half][];
			for(int i = 0; i < half; i++) {
				for(int i2 = 2; i2 <= nRows; i2 = i2 + 2) {
					arr[i] = new char[i2];
				}
			}
		}
		
		else {
			arr = new char[half+1][];
			for(int i = 0; i < half+1; i++) {
				for(int i2 = 1; i2 <= nRows; i2 = i2 + 2) {
					arr[i] = new char[i2];
				}
			}
		}
		
		
		for(int i = 0; i < half; i++) {//оскільки для завдання необхідно заповнити лише нижню частину матриці, відступаємо кількість рядків яка рівна половині рядків матриці
			System.out.print("\n");
			fout.print("\n");
		}
		int gap, symb;//надаємо значення змінним в залежності від того, парне чи непарне число введено
		if(nRows % 2 == 0) {
			gap = half - 1; 
			symb = 2;
		}
		else {
			gap = half;
			symb = 1;
		}
		
		
	exit:
		for(int a = 0; a < half; a++) {//заповнюємо матрицю згідно з завданням
					
			int j = 0, b = 0;
					
			while(j < gap) {
				System.out.print(" ");
				fout.print(" ");
				j++;
			}
					
			while(b < symb && b < nRows) {
				if(filler.length() == 1) {
					arr[a][b] = (char) filler.codePointAt(0);
					System.out.print(arr[a][b]);
					fout.print(arr[a][b]);
					b++;	
				}
				else if (filler.length() == 0) {
					System.out.print("\nSymbol for filling is not found");
					break exit;
				}
				
				else {
					System.out.print("\nToo many symbols for filling");
					break exit;
				}		
			}
			System.out.print("\n");
			fout.print("\n");
			gap--;
			symb = symb + 2;
		}
	
		System.out.print("\n");
		fout.print("\n");
		fout.flush();
		fout.close();
	}
	
}
	


