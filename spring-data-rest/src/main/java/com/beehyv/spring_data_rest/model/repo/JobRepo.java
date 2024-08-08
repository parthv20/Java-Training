package com.beehyv.spring_data_rest.model.repo;

import com.beehyv.spring_data_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository <JobPost,Integer>{



    }



