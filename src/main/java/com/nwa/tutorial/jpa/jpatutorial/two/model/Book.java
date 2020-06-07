package com.nwa.tutorial.jpa.jpatutorial.two.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String isbn;
    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID",
            nullable = false,
            referencedColumnName = "ID")
    private Author author;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author=" + author +
                '}';
    }
}
