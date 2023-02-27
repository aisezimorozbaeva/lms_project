package aisezim.lmsproject.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "companies")
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "located_country")
    private String locatedCountry;

    @OneToMany(fetch = FetchType.EAGER,
            cascade = {CascadeType.REMOVE,CascadeType.REFRESH},mappedBy = "company")
    private List<Course>courses;
}

