package com.demosecurity.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demosecurity.model.DashboardModel;
import com.demosecurity.service.DashboardService;

@Controller
public class MainController {
	
	
	@Autowired
	private DashboardService dashboardService;

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
    
    @RequestMapping(value="/modellist" , method = RequestMethod.GET)
	public String getModelList(Model model) {
		
		List<DashboardModel> listModel = this.dashboardService.getAllModel();
		model.addAttribute("listModel" , listModel);
		return "modelpage";
	}
    
    
    @RequestMapping(value="/add")
	public String addModel(Model model) {
		DashboardModel dashboardModel = new DashboardModel();
		model.addAttribute("dashboardModel", dashboardModel);
		return "newModel";
	}
	
	@RequestMapping(value="/save" , method = RequestMethod.POST)
	public String saveModel(@ModelAttribute("dashboardModel") DashboardModel dashboardModel) {
		this.dashboardService.saveModel(dashboardModel);
		return "redirect:/modellist";
	}
	 
	@RequestMapping("/edit/{emp_id}")
	public ModelAndView editModel(@PathVariable(name = "emp_id") Integer emp_id) {
		ModelAndView mav = new ModelAndView("update");
		DashboardModel dashboardModel= this.dashboardService.updateModel(emp_id);
		mav.addObject("dashboardModel", dashboardModel);
		
		return mav;
	}
	
	@RequestMapping("/delete/{emp_id}")
	public String deleteModel(@PathVariable(name = "emp_id") Integer emp_id) {
		this.dashboardService.deleteModel(emp_id);
		return "redirect:/modellist";		
	}
    
    
    
}
