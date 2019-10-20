package com.demosecurity.serviceimplementation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demosecurity.doa.DashboardRepo;
import com.demosecurity.model.DashboardModel;
import com.demosecurity.service.DashboardService;


@Service
@Transactional
public class DashboardServiceImpl implements DashboardService{

	@Autowired
	private DashboardRepo dashboardRepo;
	
	@Override
	public List<DashboardModel> getAllModel() {
		
		return (List<DashboardModel>) this.dashboardRepo.findAll();
	}

	@Override
	public DashboardModel saveModel(DashboardModel dashboardModel) {
		// TODO Auto-generated method stub
		return this.dashboardRepo.save(dashboardModel);
	}

	@Override
	public DashboardModel updateModel(Integer emp_id) {
		return this.dashboardRepo.findById(emp_id).get();
	}

	@Override
	public DashboardModel deleteModel(Integer emp_id) {
		 this.dashboardRepo.deleteById(emp_id);
		return null;
	}

}
