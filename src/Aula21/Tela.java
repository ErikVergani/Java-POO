package Aula21;

import java.util.ArrayList;

/**
 * @author ErikVergani
 * @date 18/05/2021
 **/
/*
* esenvolver um programa que leia os nomes dos alunos da turma de POO 2021A e organize os alunos em grupos
* (o sistema gera os grupos) de forma aleatória. O programa deve solicitar o número de membros desejados em
* cada grupo e sugerir os grupos para o professor. Se o número de membros desejado (informado pelo professor)
* é três, por exemplo, os grupos poderão eventualmente ter 2 ou 4 (um a menos ou uma a mais), caso o número de
*  alunos da turma não seja múltiplo de 3. Essa regra vale para qualquer tamanho de grupo, ou seja, pode ter um
* membro a menos ou um membro a mais.

Requisitos necessários:
- a entrada de dados não será digitada pelo usuário via teclado, será feita a partir de leitura de um arquivo texto;
- utilizar a classe Arquivo;
- gravar o resultado (os grupos gerados) em um arquivo texto;
- desenvolver usando paradigma de programação OO.
*/

public class Tela {
    private Gerador gerador;

    public Tela(Gerador gerador) {
        this.gerador = gerador;
    }
    public void show(){
        gerador.addAlunos();
        gerador.gerarGrupos();
    }
}

