public class Interfaces{
	public static void main(String[] args) {
		Queen q = new Queen();
		q.moves();
	}
}

interface ChessPlayer{
	void moves();
}

class Queen implements ChessPlayer{
	public void moves(){
		System.out.println("up, Down, right, left, diagonal");
	}
}

class Rook implements ChessPlayer{
	public void moves(){
		System.out.println("up, Down, right, left");
	}
}

class king implements ChessPlayer{
	public void moves(){
		System.out.println("up, Down, right, left, diagonal");
	}
}