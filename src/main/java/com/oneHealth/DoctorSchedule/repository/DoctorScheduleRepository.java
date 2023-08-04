package com.oneHealth.DoctorSchedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oneHealth.DoctorSchedule.entity.DoctorSchedule;

/**
 * The DoctorScheduleRepository interface extends JpaRepository to perform CRUD operations on DoctorSchedule entity.
 * 
 * This repository provides the necessary methods to interact with the database and manage doctor schedule data.
 * It inherits basic CRUD operations from JpaRepository and supports additional custom queries if needed.
 
 * @author Madhavi
 * @version 1.0
 */
@Repository
public interface DoctorScheduleRepository extends JpaRepository<DoctorSchedule, Long>{

}
