package com.demosecurity.doa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demosecurity.model.DashboardModel;


@Repository
public interface DashboardRepo extends JpaRepository<DashboardModel, Integer> {

}
