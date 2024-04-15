package com.Project.JobApplication1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Component
    @Entity
    public class JobPost {

        
        @Id
        @Column(name = "postId", unique = true, nullable = false)
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer postId;
        private String postProfile;
        private String postDesc;
        private Integer reqExperience;
        private List<String> postTechStack;
        public JobPost save(JobPost updatepost) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'save'");
        }


    }

