package com.demosecurity.service;


import java.util.List;

import com.demosecurity.model.DashboardModel;



public interface DashboardService {
	
	public List<DashboardModel> getAllModel();
	public  DashboardModel saveModel(DashboardModel dashboardModel);
	public DashboardModel updateModel(Integer emp_id);
	public DashboardModel deleteModel(Integer emp_id);
}
