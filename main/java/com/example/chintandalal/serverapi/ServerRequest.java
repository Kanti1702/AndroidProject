package com.example.chintandalal.serverapi;

import java.util.HashMap;

public class ServerRequest 
{
	String operation;
	HashMap<String, String> data, headers;
	
	public ServerRequest(String operation, HashMap<String, String> data,
			HashMap<String, String> headers) 
	{
		super();
		this.operation = operation;
		this.data = data;
		this.headers = headers;
	}
	
	
	public static ServerRequest requestWithOperation(String operation)
	{
		return ServerRequest.requestWithOperation(operation, null, null);
	}
	
	public static ServerRequest requestWithOperation(String operation, HashMap<String, String> data)
	{
		return ServerRequest.requestWithOperation(operation, data, null);
	}
	
	public static ServerRequest requestWithOperation(String operation, HashMap<String, String> data, HashMap<String, String> headers)
	{
		return new ServerRequest(operation, data, headers);
	}
	
}
