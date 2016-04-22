package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.Results;

@Controller
public class SQLWebGUIController {

	@Autowired
	private Results results;

	@RequestMapping("process.do")
	public ModelAndView query(@RequestParam("request") String qry) {

		ArrayList<ArrayList> response = results.getBasicQuery(qry);
//		System.out.println("This is my qry" + qry);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("response", response);
//		System.out.println("I love my Controller");
//		System.out.println("response is" + response);
		return mv;
	}
}
