package wektory;

public class Vector2D {
		
	public double x; 
	public double y; 
	public Vector2D(){ // konstruktor domyślny
		
	}
	
	public Vector2D(double x, double y){// konstruktor z parametrami
		
		this.x=x;
		this.y=y;
	}
	
	
	public Vector2D dodawanie(Vector2D v){ //zwracanie obiektu sumy
		
		Vector2D w = new Vector2D(x + v.x,y + v.y);
		return w;
		
	}
	
	
	public Vector2D odejmowanie(Vector2D v){ //zwracanie obiektu różnicy
		
		Vector2D w = new Vector2D(x - v.x,y - v.y);
		return w;
		
	}


	public Vector2D mnozenie(double k){ //zwracanie biektu przemnożonego przez parametr
		
		Vector2D w = new Vector2D(x *k, y *k);
		return w;
		
	}	


	public double dlugosc(){ //zwracanie długości
		
		return Math.sqrt(x*x+y*y);
		
	}
	

	public Vector2D norm(){ //metoda zwracająca obiekt znormalizowany
		
		double a,b;
	
		a=x/(Math.sqrt(x*x+y*y));
		b=y/(Math.sqrt(x*x+y*y));
		Vector2D w = new Vector2D(a,b);
		return w;
		
	}
	
}
