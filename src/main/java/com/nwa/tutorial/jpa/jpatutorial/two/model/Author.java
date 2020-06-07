package com.nwa.tutorial.jpa.jpatutorial.two.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    // mappedBy identifies an inversed side of the relationship.
    // Here the relationship is owned by Book class
    @OneToMany(mappedBy = "author")
    private Set<Book> books = new HashSet<>();

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
