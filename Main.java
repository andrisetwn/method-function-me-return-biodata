/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    // objek highschool and univesity
    String x = "SMKN 4 Jakarta";
    String y = "universitas Nasional";

	public static void main(String[] args) {
	    //String (nama dan alamat)
	    String name = "Name :";
	    String address = "Address :";
	   
	    //Array (hobi)
        String[] hobi = new String[2];
	    hobi[0] = "Futsal & ";
	    hobi[1] = "Basket";

	    //Boolean(Menikah = true(iya)/false(belum))
	    Boolean iya = true;
	    Boolean tidak = false;

	    //obj (school) key highschool and univesity
	    Main highschool= new Main();
	    Main univesity= new Main();
	    

	    System.out.println(name + " Andri Setiawan");
	    System.out.println(address + " JL. Pulo Gebang RT12/04 No.145, Kel.Pulo Gebang Kec.Cakung, Jakarta Timur");
       	System.out.println("Hobbies : "+hobi[0]+hobi[1]);
        System.out.println("Married : "+tidak+" (Belum Menikah)");
        System.out.println("High School : "+highschool.x);
        System.out.println("College : "+univesity.y);
        
        //Array of obj
	    String[] nama = {"Auto Cad ", "Microsoft Office ", "Desain Grafis ", "Mengerti dasar Java & PHP "};
	    for(int i = 0; i < nama.length; i++){
        System.out.println("Skill -" + i + ": "+ nama[i]);
        }
	}
}