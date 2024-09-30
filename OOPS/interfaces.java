package OOPS;

public class interfaces {
    public static void main(String args[]) {
        queen q1 = new queen();
        q1.move();
        rook r1 = new rook();
        r1.move();
    }
}

interface ChessPlayer {
    void move();
}

class queen implements ChessPlayer {
    public void move() {
        System.out.println("left,right,up,down,diagonal(all direction)");
    }
}

class rook implements ChessPlayer {
    public void move() {
        System.out.println("left,right,up down");
    }
}
