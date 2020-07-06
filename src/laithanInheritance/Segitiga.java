package laithanInheritance;


// bangunDatar = superclass = parent;
// segitiga = subclass = child
public class Segitiga extends BangunDatar {
//	private Integer alas;
	
	@Override
	public void getKeliling() {
		// TODO Auto-generated method stub
		System.out.println("Ini adalah keliling segitiga : ");
	}
	
	@Override
	public void getLuas() {
		System.out.println("Ini adalah luas segitiga : " + luas);
	}
	
	public static void main(String [] args) {
		Segitiga s = new Segitiga();
		s.luas = 7;
		s.getLuas();
		
		
	}

	
}
