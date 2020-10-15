import java.util.Scanner;

public class hadiahPert4{
	public static void main(String[] args)
	{
		String nama;
		int n1, n2, n3, nMid, nFinal;
		char nHuruf ;

		Scanner input = new Scanner(System.in);		
		
		System.out.print("Masukkan Nama : ");
		nama= input.nextLine();
		System.out.print("Masukkan Nilai Tugas 1 : ");
		n1= input.nextInt();
	    System.out.print("Masukkan Nilai Tugas 2 : ");
		n2= input.nextInt();
	    System.out.print("Masukkan Nilai Tugas 3 : ");
		n3= input.nextInt();
		System.out.print("Masukkan Nilai MID : ");
		nMid= input.nextInt();
		System.out.print("Masukkan Nilai FINAL : ");
		nFinal= input.nextInt();		
		
		double nRata2 = (n1 + n2 + n3)/3;
		double nAkhir = (nRata2 * 0.3) + (nMid * 0.3) + (nFinal * 0.4);
		
		
    	
		if(nAkhir>=80)
		{
			 nHuruf = 'A';	
				
		}
		else if(nAkhir>=60)
		{
			 nHuruf = 'B';
			
		}else if(nAkhir>=50)
		{
			 nHuruf = 'C';
			 
		}
		else if(nAkhir >=40)
		{
		     nHuruf = 'D';
		     
		}
		else
		{
			 nHuruf = 'E';
			 
		}
		
		System.out.println("");
		System.out.println(" #----------------# ");
		System.out.println("Nama : " + nama);
		System.out.println("Nilai Akhir : " + nAkhir);
		System.out.println("Nilai Huruf : " + nHuruf);		
	}
}