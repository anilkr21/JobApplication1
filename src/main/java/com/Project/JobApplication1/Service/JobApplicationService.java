package com.Project.JobApplication1.Service;

import com.Project.JobApplication1.Repository.JobApplicationRepository;
import com.Project.JobApplication1.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

        @Autowired
       private JobApplicationRepository repository;



    public List<JobPost> getposts() {
            return repository.getposts();
    }

    public JobPost getpost(int postId) {
            return repository.getpost(postId);

    }

    public JobPost addjob(JobPost jobpost) {
        return repository.addjob(jobpost);
    }

    public JobPost update(int postId, JobPost updatepost) {
        return   repository.update(postId ,updatepost);

    }
}
