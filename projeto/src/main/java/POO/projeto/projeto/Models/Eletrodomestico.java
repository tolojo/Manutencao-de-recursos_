package POO.projeto.projeto.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "eletrodomestico")
public class Eletrodomestico {
    @Id@GeneratedValue
    (strategy = GenerationType.IDENTITY)
    @Column(name = "eletro_id") int eletro_id;
    @Column(name = "eletro_nome") private String eletro_nome;
    @Column(name = "eletro_potencia") private double eletro_potencia;
    @ManyToOne @JoinColumn(name = "eletro_utilizador_id")
    private Utilizador utilizador;

    public Eletrodomestico() {
    }

    public int getEletro_id() {
        return eletro_id;
    }

    public void setEletro_id(int eletro_id) {
        this.eletro_id = eletro_id;
    }

    public String getEletro_nome() {
        return eletro_nome;
    }

    public void setEletro_nome(String eletro_nome) {
        this.eletro_nome = eletro_nome;
    }

    public double getEletro_potencia() {
        return eletro_potencia;
    }

    public void setEletro_potencia(double eletro_potencia) {
        this.eletro_potencia = eletro_potencia;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

   
}
