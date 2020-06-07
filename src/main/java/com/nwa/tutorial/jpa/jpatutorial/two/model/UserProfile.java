package com.nwa.tutorial.jpa.jpatutorial.two.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserProfile {
    @Id
    @GeneratedValue
    private Integer id;
    private int age;
    private String gender;
    private String favoriteColor;
    @OneToOne
    private User user;

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", favoriteColor='" + favoriteColor + '\'' +
                ", user=" + user +
                '}';
    }
}
