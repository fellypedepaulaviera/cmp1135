package exemplos.swing.tabela;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import exemplos.swing.entidade.EAluno;

public class TAlunos extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5160021473752754084L;

	private String[] colunasTabela = { "Nome", "Nota 1", "Nota 2", "Media" };

	private ArrayList<EAluno> linhasTabela;

	public TAlunos() {
		
		linhasTabela = new ArrayList<EAluno>();

		EAluno aluno1 = new EAluno();
		aluno1.setNome("Heider Taguatinga Farias");
		aluno1.setN1(5.6);
		aluno1.setN2(6.7);

		try {
			linhasTabela.add(aluno1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getColumnCount() {
		return colunasTabela.length;
	}

	@Override
	public int getRowCount() {
		return linhasTabela.size();
	}

	@Override
	public Class<?> getColumnClass(int coluna) {
		switch (coluna) {
		case 0:
			return String.class;
		case 1:
			return Double.class;
		case 2:
			return Double.class;
		case 3:
			return Double.class;
		default:
			throw new IndexOutOfBoundsException("Coluna esta fora da faixa");
		}
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		// TODO Auto-generated method stub
		EAluno aluno = linhasTabela.get(linha);
		switch (coluna) {
		case 0:
			return aluno.getNome();
		case 1:
			return aluno.getN1();
		case 2:
			return aluno.getN2();
		case 3:
			return aluno.getMedia();
		default:
			throw new IndexOutOfBoundsException("Coluna esta fora da faixa");
		}
	}
	
	@Override
	public void setValueAt(Object object, int linha, int coluna) {
		EAluno aluno = linhasTabela.get(linha);
		switch (coluna) {
		case 1:
			aluno.setN1((Double) object);
			break;
		case 2:
			aluno.setN2((Double) object);
			break;
		}
		fireTableDataChanged();
	}
	
	public String getColumnName(int col) {
		return colunasTabela[col];
	}

	public boolean isCellEditable(int linha, int coluna) {
		switch (coluna) {
		case 0:
			return false;
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return false;
		default:
			throw new IndexOutOfBoundsException("Coluna esta fora da faixa");
		}
	}

}
