package presentation;

import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import metier.Client;

public class ClientModele extends AbstractTableModel {

	// definir les colonnes du modele de tableau
	private String[] tableColumnNames = new String[] { "ID", "NOM", "PRENOM", "YEUX" };
	
	// définir les lignes de ma table (sorte de collection contenant des
	// tableaux). Ligne de tableau
	private Vector<String[]> tableValues = new Vector<String[]>();

	// redefinition des methodes de la classe mere

	// nombre de colonnes
	@Override
	public int getColumnCount() {
		return tableColumnNames.length;
	}

	// nombre de lignes
	@Override
	public int getRowCount() {
		return tableValues.size();
	}

	// affiche la valeur d'une cellule en fonction de la ligne et du numero
	// de colonne
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return tableValues.get(rowIndex)[columnIndex];
	}

	// retourne le nom de la colonne
	public String getColumnName(int column) {
		return tableColumnNames[column];
	}

	// remplir le tableau avec les données de la bdd
	public void setData(List<Client> clients) {
		tableValues = new Vector<String[]>();

		for (Client c : clients) {
			tableValues.add(new String[] { String.valueOf(c.getId()), c.getNom(), c.getPrenom(), c.getCouleuryeux() });
		}
		fireTableChanged(null);
	}

}
