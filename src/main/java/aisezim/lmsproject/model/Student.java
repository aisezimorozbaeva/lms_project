package aisezim.lmsproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "first_name")
        private String firstName;
        @Column(name = "last_name")
        private String lastName;
        @Column
        private String email;
        @Enumerated
        private StudyFormat studyFormat;

        @Transient
        private Long groupId;

        @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.REMOVE})
        private Group group;

}

