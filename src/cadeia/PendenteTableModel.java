/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mateus
 */
public class PendenteTableModel extends AbstractTableModel {

    private static final int Nome = 0;
    private static final int Tempo = 1;
    //private static final int Saida = 2;


    private List<Preso> lista;

    //Esse é um construtor, que recebe a nossa lista de Clientes
    public PendenteTableModel(List<Preso> lista) {
        this.lista = new ArrayList<Preso>(lista);
    }

    public void setLista(List<Preso> l) {
        this.lista = new ArrayList<Preso>(l);
    }

    public int getRowCount() {
        //Quantas linhas tem na tabela. Uma para cada item da lista.  
        return lista.size();
    }

    public int getColumnCount() {
        return 2;
    }

    public String getColumnName(int column) {
        //Qual é o nome das nossas colunas?  
        /*if (column == Id) {
            return "Codigo";
        }*/
        if (column == Nome) {
            return "Nome do procurado";
        }
        if (column == Tempo) {
            return "Tempo de prisão";
        }


        return ""; //Nunca deve ocorrer  
    }

    public Object getValueAt(int row, int column) {
        //Precisamos retornar o valor da coluna column e da linha row.  
        Preso cli = lista.get(row);
        /*if (column == Id) {
            return cli.getId();
        } else*/ if (column == Nome) {
            return cli.getNome();
        } if (column == Tempo) {
            return cli.getTempo();
        } else

        return ""; //Nunca deve ocorrer  
    }

    /*public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
     Fornecedor titulo = lista.get(rowIndex);
     //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
     //Note que vc poderia alterar 2 campos ao invés de um só.  
     if (columnIndex == COL_TITULO) {
     titulo.setTitulo(aValue.toString());
     } else if (columnIndex == COL_AUTOR) {
     titulo.getAutor().setNome(aValue.toString());
     }
     }*/
    public Class<?> getColumnClass(int columnIndex) {
        //Qual a classe das nossas colunas? Como estamos exibindo texto, é string.  
        return String.class;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }
    //Já que esse tableModel é de livros, vamos fazer um get que retorne um livro inteiro.  
    //Isso elimina a necessidade de chamar o getValueAt() nas telas.   

    public Preso get(int row) {
        return lista.get(row);
    }
}

