package com.xworkz.songs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/songs", initParams= {
		@WebInitParam(name="key", value="Gaana"),
})
public class SongsServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("key");
		System.out.println(name);
		
		String songName = req.getParameter("songName");
		String featuring = req.getParameter("featuring");
		String singer = req.getParameter("singer");
		String duration = req.getParameter("duration");
		String lang = req.getParameter("lang");
		String lyricist = req.getParameter("lyricist");
	
	
		PrintWriter printWriter = res.getWriter();
		res.setContentType("text/html");
		printWriter.write("thank you for selecting "+ songName);
		printWriter.print("<html><body bgcolor>"
				+"<form action ='songslist'>"+"<table>");
	}
}
