package com.Project.JobApplication1.Repository;

import com.Project.JobApplication1.model.JobPost;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@SuppressWarnings("unused")
@Repository
public interface JobApplicationRepository extends JpaRepository<JobPost, Integer>{




//
       
//    }
//    public List<JobPost> getposts() {
//        return job;
//    }
//    public JobPost getpost(int postId) {
//        for(JobPost jobs: job){
//            if(jobs.getPostId()==postId)
//                return jobs;
//        }
//        return null;
//    }
//
//    public JobPost addjob(JobPost jobpost) {
//        job.add(jobpost);
//        return new JobPost();
//    }
// //
//    public JobPost update(int postId, JobPost updatepost) {

//        for( JobPost post:job) {
//            if(post.getPostId()==postId){
//            post.setPostId(updatepost.getPostId());
//            post.setPostProfile(updatepost.getPostProfile());
//            post.setPostDesc(updatepost.getPostDesc());
//            post.setReqExperience(updatepost.getReqExperience());
//            post.setPostTechStack(updatepost.getPostTechStack());
//            }
//        }
//
//       return null;
//    }
}
