package com.graey.spring_boot_rest.service;

import java.util.List;

import com.graey.spring_boot_rest.model.JobPost;
import com.graey.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class JobService {
    @Autowired
    public JobRepo repo;

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

    public JobPost getJob(int id) {
        return repo.getJob(id);
    }

    public void addJobPost(JobPost jobPost) {
        repo.addJobPost(jobPost);
    }

    public void addJob(JobPost jobPost) {
        repo.addJobPost(jobPost);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}