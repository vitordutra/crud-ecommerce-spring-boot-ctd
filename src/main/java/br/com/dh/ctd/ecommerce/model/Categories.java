package br.com.dh.ctd.ecommerce.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @OneToMany(mappedBy = "categories", fetch = FetchType.LAZY)
    private Set<Products> products = new HashSet<>();

    public Categories() {
    }

    public Categories(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Categories(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
