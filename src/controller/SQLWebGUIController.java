package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.CompanyDBDao;
import data.CompanyDao;
import data.Department;
import data.Employee;
import data.Results;

@Controller
public class SQLWebGUIController {


	//private Results results;
	@Autowired
	private CompanyDao empDao;
		
	@RequestMapping("process.do")
	public ModelAndView query(@RequestParam("request") String qry) {
		ArrayList<ArrayList> response = empDao.getBasicQuery(qry);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("response", response);
		return mv;
	}
	
	@RequestMapping(path = "update.do", method = RequestMethod.POST)
	public ModelAndView updateQuery(@RequestParam("query") String sqltext) {
		empDao.update(sqltext);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("indexsql.jsp");
		mv.addObject("rowsUpdated", CompanyDBDao.uc);
		return mv;
	}
	
	
	@RequestMapping(path = "listAll.do", method = RequestMethod.GET)
	public ModelAndView listEmployees(){
		String qry = "SELECT * FROM employees;";		
		ArrayList<ArrayList> response = empDao.getBasicQuery(qry);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("response", response);
		return mv;
		
	}
	
	@RequestMapping(path = "GetEmployeeById.do", method = RequestMethod.POST)
	public ModelAndView getEmployeeById(@RequestParam("id") int id) {
		Employee emp = empDao.getEmpById(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ViewEmployee.jsp");   //need to build a ViewEmployee.jsp
		mv.addObject("employee", emp);
		List<Department> depts = empDao.getDepartments();
		mv.addObject("departments", depts);
		return mv;
	}
	
	@RequestMapping(path = "UpdateEmployee.do", method = RequestMethod.POST)
	public ModelAndView updateEmployee(@RequestParam("id") int id, Employee emp) {
		empDao.updateEmployee(emp);
		
		//THIS WORKS
		ArrayList<ArrayList> arrayListEmp = empDao.getEmployees();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ViewEmployee.jsp");
		mv.addObject("queryArray", arrayListEmp);
		return mv;
		
		//THIS IS AN EXPERIMENT
//		String qry = "SELECT * FROM employees;";		
//		ArrayList<ArrayList> response = empDao.getBasicQuery(qry);		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result.jsp");
//		mv.addObject("response", response);
//		return mv;
		
	}
	
	//THIS WORKS
//	@RequestMapping(path = "deleteEmployee.do", method = RequestMethod.POST)
//	public ModelAndView deleteEmployee(@RequestParam("id") int id, Employee emp) {
//		empDao.deleteEmployee(emp);
//		ArrayList<ArrayList> arrayListEmp = empDao.getEmployees();
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result.jsp");
//		mv.addObject("queryArray", arrayListEmp);
//		return mv;
		
	//THIS IS AN EXPERIMENT
	@RequestMapping(path = "deleteEmployee.do", method = RequestMethod.POST)
	public ModelAndView deleteEmployee(@RequestParam("id") int id, Employee emp) {
		empDao.deleteEmployee(emp);
		
		String qry = "SELECT * FROM employees;";		
		ArrayList<ArrayList> response = empDao.getBasicQuery(qry);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("response", response);
		return mv;
	}
	
	@RequestMapping(path = "addEmployee.do", method = RequestMethod.POST)
	public ModelAndView addEmployee(@RequestParam("firstname") String firstname, Employee emp) {
		empDao.addEmployee(emp);
//		ArrayList<ArrayList> arrayList3 = empDao.getEmployees();
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("ViewEmployee.jsp");
//		mv.addObject("queryArray", arrayList3);
//		return mv;
		
		String qry = "SELECT * FROM employees;";		
		ArrayList<ArrayList> response = empDao.getBasicQuery(qry);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("response", response);
		return mv;
		
		
	}			
}