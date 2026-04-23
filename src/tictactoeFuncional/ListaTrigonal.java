package tictactoeFuncional;

public class ListaTrigonal {

	int renglones;
	int columnas;
	int[][] tablero;

	
	public ListaTrigonal(int renglones, int columnas){
		
		tablero =new int[renglones][columnas];
		/*
		for(int i=0; i<renglones;i++) {
			for(int z=0; z<columnas;z++) {
				tablero[i][z]=0;
			}
		}
		*/
		
		this.renglones=renglones;
		this.columnas=columnas;
	}
	
	public void vaciarArray() {
		for(int i=0; i<renglones;i++) {
			for(int z=0; z<columnas;z++) {
				tablero[i][z]=0;
			}
		}
	}
	
	public void setNodo(int x, int y, boolean equis) {
		if(equis&&(getNodo(x,y))==0) {
			tablero[x][y]=1;
		}else if((getNodo(x,y))==0){
			tablero[x][y]=2;
		}
	}
	
	public int getNodo(int x, int y) {
		return tablero[x][y];
	}
	
	
	public int jugadaHorizontal(int x){
		int jugada=0;
		for(int i=0; i<3; i++) {
			if(tablero[x][i]==1) {
				jugada++;
			}
		}
		if(jugada==3) {
			return 1;
		}
		jugada=0;
		
		for(int i=0; i<3; i++) {
			if(tablero[x][i]==2) {
				jugada++;
			}
		}
		if(jugada==3) {
			return 1;
		}
				
		return 0;
	}
	
	
	public int jugadaVertical(int x){
		int jugada=0;
		for(int i=0; i<3; i++) {
			if(tablero[i][x]==1) {
				jugada++;
			}
		}
		if(jugada==3) {
			return 1;
		}
		
		jugada=0;
		for(int i=0; i<3; i++) {
			if(tablero[i][x]==2) {
				jugada++;
			}
		}
		if(jugada==3) {
			return 1;
		}
				
		return 0;
	}
	
	public int jugadaDiagonal(int x) {
		int jugada=0,z=0;
		for(int i=0; i<=2;) {
			if(tablero[i][z]==1) {
				jugada++;
			}
			z++;
			i++;
		}
		if(jugada==3) {
			return 1;
		}
		z=0;
		jugada=0;
		for(int i=2; i>=0;) {
			if(tablero[i][z]==1) {
				jugada++;
			}
			z++;
			i--;
		}
		if(jugada==3) {
			return 1;
		}
		jugada=0;
		z=0;
		for(int i=0; i<=2;) {
			if(tablero[i][z]==2) {
				jugada++;
			}
			z++;
			i++;
		}
		if(jugada==3) {
			return 1;
		}
		z=0;
		jugada=0;
		for(int i=2; i>=0;) {
			if(tablero[i][z]==2) {
				jugada++;
			}
			z++;
			i--;
		}
		if(jugada==3) {
			return 1;
		}
		return 0;
	}
	
	

	@Override
	public String toString() {
		String lista="";
		for(int i=0; i<renglones;i++) {
			for(int z=0; z<columnas;z++) {
				lista+=tablero[i][z];
			}
			lista+="\n";
		}
		return lista;
	}
	
	
	
	
	
}
