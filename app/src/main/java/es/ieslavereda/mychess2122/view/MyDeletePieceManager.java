package es.ieslavereda.mychess2122.view;

import java.util.ArrayList;
import java.util.List;

import es.ieslavereda.mychess2122.model.ChessType;
import es.ieslavereda.mychess2122.model.IDeletedPieceManager;
import es.ieslavereda.mychess2122.model.Pieces.Piece;
import es.ieslavereda.mychess2122.model.Pieces.PieceColor;

public class MyDeletePieceManager implements IDeletedPieceManager {
    private List<Piece> pieceList;
    private Deletedpanel whitePanel, blackPanel;

    public MyDeletePieceManager(Deletedpanel whitePanel, Deletedpanel blackPanel){
        pieceList = new ArrayList<>();
        this.whitePanel = whitePanel;
        this.blackPanel = blackPanel;
    }


    @Override
    public void add(Piece piece) {
        if(piece.getPieceColor() == PieceColor.WHITE){
            whitePanel.add(piece);
        }
        else{
            blackPanel.add(piece);
        }
    }

    @Override
    public void remove(Piece piece) {

    }

    @Override
    public int count(ChessType chessType) {
        return 0;
    }
}
