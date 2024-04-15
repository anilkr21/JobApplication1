package com.Project.JobApplication1;

import com.Project.JobApplication1.Service.JobApplicationService;
import com.Project.JobApplication1.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class jobApplicationRestController {

    @Autowired
    public JobApplicationService service;

    @GetMapping("/JobPosts")
    public List<JobPost> getposts() {
        return service.getposts();
    }
    @GetMapping("Posts/{postId}")
    public JobPost getpost(@PathVariable("postId") int postId){
        return service.getpost(postId);
    }

    @PostMapping("/JobPost")
    public JobPost addjob(@RequestBody JobPost jobpost){
        return service.addjob(jobpost);
    }

    @PutMapping("/JobPost/{postId}")
    public JobPost update(@PathVariable("postId") int postid , @RequestBody JobPost updatepost){
      return  service.update(postid,updatepost);
    }
@GetMapping("/load")
    public String loadData(JobPost jobPost){
        return service.loaddata(jobPost);
    }
}
