package pro.home;

import java.io.IOException;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.Studentdao;
import dto.Studentdto;

public class Controller extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException  {
		String s2=arg0.getParameter("studentid");
		int sid=Integer.parseInt(s2);
		String sname=arg0.getParameter("studentname");
		String sdob=arg0.getParameter("dob");
		String sgender=arg0.getParameter("gender");
		String scountry=arg0.getParameter("country");
	Studentdto studentdto=new Studentdto();
	studentdto.setStudentid(sid);
	studentdto.setStudentname(sname);
	studentdto.setDob(sdob);
	studentdto.setGender(sgender);
	studentdto.setCountry(scountry);
	
	Studentdao studentdao=new Studentdao();
	 studentdao.insert(studentdto);
		
	}

}
