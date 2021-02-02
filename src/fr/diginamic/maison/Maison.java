package fr.diginamic.maison;

public class Maison {
	
	private Piece[] piecesMaison = new Piece[0];
	
	public Piece[] getPiecesMaison() {
		return piecesMaison;
	}

	public void ajouterPiece(Piece piece) {
		Piece[] newPiecesMaison = new Piece[this.piecesMaison.length + 1];
		
		for (int i = 0; i < newPiecesMaison.length; i++) {
			if (piece != null && piece.getEtage() >= 0 && piece.getSuperficie() >= 0) {
				if (i != this.piecesMaison.length) {
					newPiecesMaison[i] = this.piecesMaison[i];
				} else {
					newPiecesMaison[i] = piece;
				}
			} else {
				System.out.println("Les données renseignées n'ont pas été validées - Erreur");
			}
		}
		
		this.piecesMaison = newPiecesMaison;
	}
	
	public int superficieTotale() {
		int superficieTotale = 0;
		
		if(this.piecesMaison.length > 0) {
			for (int i = 0; i < this.piecesMaison.length; i++) {
				superficieTotale += this.piecesMaison[i].getSuperficie();
			}
		}		
		
		return superficieTotale;
	}
	
	public int superficieEtage(int etage) {
		int superficieEtage = 0;
		
		for (int i = 0; i < this.piecesMaison.length; i++) {
			if (this.piecesMaison[i].getEtage() == etage) {
				superficieEtage += this.piecesMaison[i].getSuperficie();
			}
		}
		
		return superficieEtage;
	}

}
