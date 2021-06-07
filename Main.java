package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.cadastro.model.Contato;

public class Main {

	public static void main(String[] args) {
		ContatoDAO contatoDAO = new ContatoDAO();
Contato contato = new Contato();
contato.setNome("Joao Pedro");
contato.setIdade(22);
contato.setDataCadastro(new Date());



Contato c1= new Contato();
c1.setNome("Joao pedro tavares");
c1.setId(45);
c1.setDataCadastro(new Date());
c1.setId(1);

contatoDAO.update(c1);
for(Contato c: contatoDAO.getContatos()) {
	System.out.println("Contato: " + c.getNome());
	
}
	}

}
