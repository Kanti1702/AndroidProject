package com.example.chintandalal.serverapi;

import java.util.ArrayList;
import java.util.HashMap;

public class ServerResponse {

	boolean success, dataFound;
	HashMap<String, String> data;
	ArrayList<String> rows;
	String code, text;
	HashMap<String, String> messageInfo;
	
	
	public ServerResponse(boolean success, boolean dataFound,
			HashMap<String, String> data, ArrayList<String> rows, String code,
			String text, HashMap<String, String> messageInfo) {
		super();
		this.success = success;
		this.dataFound = dataFound;
		this.data = data;
		this.rows = rows;
		this.code = code;
		this.text = text;
		this.messageInfo = messageInfo;
	}
	
	
	
}
