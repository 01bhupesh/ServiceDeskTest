package com.anr.service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

import com.anr.entities.ServiceRequest;
import com.google.gson.Gson;
import com.sun.jersey.spi.resource.Singleton;
@Path("/dashboard")
@Singleton
public class DashboardController {
	
	List<ServiceRequest> listData=new ArrayList<ServiceRequest>();	

	@POST
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)

	public List<ServiceRequest> getData(String reqData){
		System.out.println("service methos is called");
		
		JSONObject obj=new JSONObject(reqData.trim().toString());
	    Gson gson = new Gson();
		System.out.println(obj.toString());		  
		JSONObject  jsonObject = obj.getJSONObject("data");
		ServiceRequest serviceRequest = gson.fromJson(jsonObject.toString(), ServiceRequest.class);
         listData.remove(serviceRequest);

			 listData.add(serviceRequest);
		return listData;
	
       
	}

}
