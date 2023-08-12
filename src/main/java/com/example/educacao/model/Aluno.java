package com.example.educacao.model;

/* Como a matricula foi criada no BD como (serial) já que é PK, ao inserir um novo aluno, a marícula não pode ser modificada, 
portanto ela tem q ser Null. Para isso, ao criar a classe aluno, a matrícua precisa receber NULL e 
o (int) não pode ser aplicado, por ser primitivo. Portanto, é necessário o uso do INTEGER.*/

public class Aluno {
    private Integer matricula;
    private String nome;
    private double nota1, nota2, nota3;
    
    public Integer getMatricula() {
        return matricula;
    }
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calculaMedia(){
        return (nota1 + nota2 + nota3)/3;
    }
    
}
