package es.ieslavereda.mychess2122.model;

import java.util.ArrayList;
import java.util.List;

import es.ieslavereda.mychess2122.model.Pieces.Piece;

public class StorageRemovedPieces implements IDeletedPieceManager {

    private final List<Piece> pieces;

    public StorageRemovedPieces(){
        pieces = new ArrayList<>();
    }
    @Override
    public void add(Piece piece) {
        pieces.add(piece);
    }

    @Override
    public void remove(Piece piece) {
        pieces.remove(piece);
    }

    @Override
    public int count(ChessType chessType) {
        return (int) pieces.stream().filter(p->p.getChessType().equals(chessType)).count();
    }
}
