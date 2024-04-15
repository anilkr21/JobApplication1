package com.Project.JobApplication1.Service;

import com.Project.JobApplication1.Repository.JobApplicationRepository;
import com.Project.JobApplication1.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobApplicationService {

        @Autowired
       private JobApplicationRepository repository;



    public List<JobPost> getposts() {
            return repository.findAll();
    }

    public JobPost getpost(int postId) {
            return repository.findById(postId).orElse(new JobPost());

    }

    public JobPost addjob(JobPost jobpost) {
        return repository.save(jobpost);
    }

    public JobPost update(int postId, JobPost updatepost) {
        JobPost post = repository.findById(postId).get();
            post.setPostId(updatepost.getPostId());
            post.setPostProfile(updatepost.getPostProfile());
            post.setPostDesc(updatepost.getPostDesc());
            post.setReqExperience(updatepost.getReqExperience());
            post.setPostTechStack(updatepost.getPostTechStack());
            return repository.save(post);

    }

    public String loaddata(JobPost jobPost) {

            
   List<JobPost> job =new ArrayList<>(List.of(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
   List.of("Core Java", "J2EE","Spring Boot", "Hibernate")),
   // Frontend Developer Job Post
   new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
   3, List.of("HTML", "CSS", "JavaScript", "React")),
   
// Data Scientist Job Post
   new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
   List.of("Python", "Machine Learning", "Data Analysis")),
   // Network Engineer Job Post
   new JobPost(4, "Network Engineer",
   "Design and implement computer networks for efficient data communication", 5,
   List.of("Networking", "Cisco", "Routing", "Switching")),
   // Mobile App Developer Job Post
   new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
    3, List.of("iOS Development", "Android Development", "Mobile App")))
);

  repository.saveAll(job);
return null;
            

       


    }
}
