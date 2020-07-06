package laithanInheritance;


// perhatikan access modifier
// private hanya bisa class itu saja
// protected hanya bisa untuk class itu dan turunannya
// public bisa digunakan di class lain
// default bisa digunakan di class itu saja

public abstract class BangunDatar {

	public Integer luas;
	Integer keliling;
	
	public void getLuas() {
		System.out.println("Ini adalah luas bangun datar : " + luas);
	}
	
	// method yang tidak memiliki body
	public abstract void getKeliling() ;

}
