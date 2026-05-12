package com.channoufi.jobportal.services;

import org.springframework.stereotype.Service;

import com.channoufi.jobportal.entity.JobPostActivity;
import com.channoufi.jobportal.repository.JobPostActivityRepository;

@Service
public class JobPostActivityService {

	private final JobPostActivityRepository jobPostActivityRepository;

	public JobPostActivityService(JobPostActivityRepository jobPostActivityRepository) {
		super();
		this.jobPostActivityRepository = jobPostActivityRepository;
	}
	
	public JobPostActivity addNew(JobPostActivity jobPostActivity) {
		return jobPostActivityRepository.save(jobPostActivity);
	}
}
