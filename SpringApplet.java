package wektory;

import javax.swing.JApplet;

public class SpringApplet extends JApplet {

	
	public void init(){
		
		
		Vector2D wek1 = new Vector2D(3.5,1.8); //stworzenie dwóch obiektów klasy Vector2D
		Vector2D wek2 = new Vector2D(6.2,2.5);

		System.out.println("Wektor 1 : " + wek1.x + ", " + wek1.y);
		System.out.println("Wektor 2 : " + wek2.x + ", " + wek2.y);		
		
		
		Vector2D suma = new Vector2D();  //stworzenie obiektu sumy
		suma = wek1.dodawanie(wek2);
		System.out.println("Suma wektorów wynosi : " + suma.x + ", " + suma.y);
		
		Vector2D roz = new Vector2D();//stworzenie obiektu ró¿nicy
		roz = wek1.odejmowanie(wek2);
		System.out.println("Ró¿nica wektorów wynosi : " + roz.x + ", " + roz.y);
		
		System.out.println("Wartoœæ wektora 1 : " + wek1.x + ", " + wek1.y);
		wek1.przyklad(wek1);

		System.out.println("Wartoœæ wektora 1 : " + wek1.x + ", " + wek1.y);
		
		Vector2D norma1 = new Vector2D(); //wektor znormalizowany 1
		norma1 = wek1.norm();
		
		Vector2D norma2 = new Vector2D();  //wektor znormalizowany 2
		norma2 = wek2.norm();
		
		System.out.println("Wektor znormalizowany 1  : " + norma1.x + ", " + norma1.y);
		System.out.println("Wektor znormalizowany 2  : " + norma2.x + ", " + norma2.y);		
		
		double dlugosc1;  //dlugosc wektora 1
		dlugosc1 = wek1.dlugosc();
		
		double dlugosc2; //d³ugosc wektora 2
		dlugosc2 = wek2.dlugosc();

		System.out.println("D³ugoœæ wektora 1 : " + dlugosc1);
		System.out.println("D³ugoœæ wektora 2 : " + dlugosc2);		
		
		Vector2D mn = new Vector2D(); //mnozenie
		mn = wek1.mnozenie(2.4);
		System.out.println("Wektor 1 przemno¿ony przez sta³¹ : " + mn.x + ", " + mn.y);		
		
	}
	
	public void paint(){
		
		
	}
	
}
