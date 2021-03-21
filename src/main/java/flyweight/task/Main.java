package flyweight.task;

import flyweight.task.chessfly.*;

public class Main {

    public static void main(String[] args) {

        ChessPiece blackPawn = new BlackPiece("Czarny pionek", "7", "a");
        ChessPiece whitePawn = new WhitePiece("Biały pionek", "2", "a");
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biała Królowa");

        System.out.println(blackPawn.getColor() == blackQueen.getColor());
        System.out.println(whitePawn.getColor() == whiteQueen.getColor());

    }
}
