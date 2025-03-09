package org.example.anisonmanage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class RubyAnnotation {
    @Id
    @GeneratedValue
    private Long id;
    private String rubyText;
    private Boolean isModified;
    @OneToOne
    private LyricLine line;
}
