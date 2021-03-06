package com.example.servingwebcontent.domain.dnd.characters;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
public class CharacteristicBuff  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mod")
    private int mod;

    CharacteristicBuff(){


    }

    public CharacteristicBuff(String name, int mod) {
        this.name = name;
        this.mod = mod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }
}
