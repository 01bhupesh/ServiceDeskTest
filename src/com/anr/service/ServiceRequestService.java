package com.anr.service;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;













import com.anr.entities.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet(
		urlPatterns = { "/MyServlet" })
public class ServiceRequestService extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	 StringBuilder sb = new StringBuilder();
    	
         BufferedReader br = request.getReader();
         String str = null;
         while ((str = br.readLine()) != null) {
             sb.append(str);
         }
         JSONObject jObj = new JSONObject(sb.toString());
         System.out.println("daujiii--------"+jObj.toString());
                  
         response.setContentType("text/plain");
         response.setCharacterEncoding("UTF-8");
         response.getWriter().write("hello from java. you entered : ");
  
    }
 
}