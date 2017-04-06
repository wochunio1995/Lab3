package wektory;

public class Vector2D {
		
	public double x; 
	public double y; 
	public Vector2D(){ // konstruktor domyœlny
		
	}
	
	public Vector2D(double x, double y){// konstruktor z parametrami
		
		this.x=x;
		this.y=y;
	}
	
	
	public Vector2D dodawanie(Vector2D v){ //zwracanie obiektu sumy
		
		Vector2D w = new Vector2D(x + v.x,y + v.y);
		return w;
		
	}
	
	
	public Vector2D odejmowanie(Vector2D v){ //zwracanie obiektu ró¿nicy
		
		Vector2D w = new Vector2D(x - v.x,y - v.y);
		return w;
		
	}


	public Vector2D mnozenie(double k){ //zwracanie biektu przemno¿onego przez parametr
		
		Vector2D w = new Vector2D(x *k, y *k);
		return w;
		
	}	


	public double dlugosc(){ //zwracanie d³ugoœci
		
		return Math.sqrt(x*x+y*y);
		
	}
	

	public Vector2D norm(){ //metoda zwracaj¹ca obiekt znormalizowany
		
		double a,b;
	
		a=x/(Math.sqrt(x*x+y*y));
		b=y/(Math.sqrt(x*x+y*y));
		Vector2D w = new Vector2D(a,b);
		return w;
		
	}
	
}
