package io.github.springbootcourse.produtosapi.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "products") // Mapear para qual essa entidade vai ser enviada para a tabela do banco de dados, opcional se o nome na tabela do banco de dados for o mesmo da entidade, como é nesse exemplo.
@Getter
@Setter
public class Products {

    @Id
    @Column(name = "id") // @Column opcional se o nome do campo for igual ao nome do atributo da minha entidade(classe). Mapeia a coluna do banco de dados a coluna da entidade
    private String id;

    @Column
    private String name;

    @Column
    private String desc;

    @Column
    private Double price;

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }
}
