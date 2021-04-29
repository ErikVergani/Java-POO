package Aula14.AgendaTelefonica;

import java.util.ArrayList;
import java.util.Locale;

/*Desenvolver uma classe denominada AgendaTelefonica que contém registros de contatos contendo nome e telefone.
 Deve ser possível, no mínimo, incluir um novo contato, obter todos os contatos, obter apenas os contatos com
 determinado conteúdo (todos os “paulo”, por exemplo), obter o nome do contato com determinado número de telefone,
  excluir um determinado contato. Utilize a coleção de objetos ArrayList para armazenar as informações necessárias.
 */
public class AgendaTelefonica {

    private ArrayList<Contato> agendaDeContatos;

    public AgendaTelefonica() {
        this.agendaDeContatos = new ArrayList();
    }

    public void adicionarContato(String nome, float tel) {
        Contato contato = new Contato(nome, tel);
        agendaDeContatos.add(contato);
    }

    public ArrayList<Contato> getAgendaDeContatos() {
        return agendaDeContatos;
    }
}