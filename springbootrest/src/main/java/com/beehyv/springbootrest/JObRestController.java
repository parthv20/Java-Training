package com.beehyv.springbootrest;


import com.beehyv.springbootrest.model.JobPost;
import com.beehyv.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class JObRestController {

    @Autowired
    private JobService service;


    @GetMapping("jobPosts")
    @ResponseBody// not needed if restcontroller component is used
    public List<JobPost> getAllJobs() {

        return service.getAllJobs();
    }


    @GetMapping("jobPost/{postId}")
    public  JobPost getjob(@PathVariable("postId") int postId){
    return service.getjob(postId);
        }


        @PostMapping("jobPost")
      public void addJob(@RequestBody  JobPost jobPost){
        service.addJob(jobPost);
    }
    @PutMapping("jobPost")
    public void  updateJob(@RequestBody  JobPost jobPost){
        service.updateJob(jobPost);
       // return service.getjob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId){
        service.deleteJob(postId);
        return "Deleted";
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
        return service.search(keyword);
    }
@GetMapping("load")
    public String loadData(){
        service.load();
        return "success";
    }

}
