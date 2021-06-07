package com.animalhospital.restful.repository;

import com.animalhospital.restful.dao.Hospital;
import org.springframework.data.repository.CrudRepository;

public interface HospitalRepository extends CrudRepository<Hospital, Long> {
}
