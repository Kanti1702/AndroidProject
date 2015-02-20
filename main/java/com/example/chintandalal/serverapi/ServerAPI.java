package com.example.chintandalal.serverapi;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

public class ServerAPI 
{
	public static final String NOTIFICATION_LOG_OUT = "notificationLogOut";
	public static final String SERVER_API_METHOD_JSON = "JSON";
	public static final String SERVER_API_METHOD_POST = "POST";

	ServerAPIDataStorage instance = ServerAPIDataStorage.sharedInstance();
	
		
	void sendRequest(HttpRequest requests){
		boolean error = false;
		String errorMessage = null;
		if(instance.getAPIURL()!=null){
			error = true;
			errorMessage = "API URL not set";
		}
		else if (instance.getRequestMethod().length()!= 0){
			error = true;
			errorMessage = "HTTP Method not set";
		}
		if (error){
			errorMessage = "serverAPI error";
		}
		HttpRequest request = requests;
		//this->sendRequest(request);
	}
	//implement this method
	void sendRequest(HttpRequest request, ExecutorService queue){
		
		HashMap<String, String> info = new HashMap<String, String>();
		info.put(request.toString(), "URL");
	//	info.put(request.getAllHeaders(), "Headers");
		
		if(request.equals(info)){
			Error jsonError;
		}
		
	}
	
	void serverReponse(HttpResponse response, HttpRequest request, String operation){
		
	}
	//optional method
	void serverConnectionFailed(Error error){
		
	}
	
	
	
//	public static Runnable allNetworkOperationsQueue(){
//		return allNetworkOperationsQueue;
//		
//	}
//	public static Runnable allDataOperationsQueue(){
//		return allDataOperationsQueue;
//	}
//	
//	public static ServerAPI getInstance(){
//		//long once;
//		return instance;
//	}

//	public URL getApiURL() {
//		return apiURL;
//	}
//
//	public void setApiURL(URL apiURL) {
//		this.apiURL = apiURL;
//	}
//
//	public URL getImageURL() {
//		return imageURL;
//	}
//
//	public void setImageURL(URL imageURL) {
//		this.imageURL = imageURL;
//	}
//
//	public String getAccessToken() {
//		return token;
//	}
//
//	public void setAccessToken(String token) {
//		this.token = token;
//	}
//	public String getRequestMethod() {
//		return method;
//	}
//	public void setRequestMethod(String method) {
//		this.method = method;
//	}
//
//	public String getUserID() {
//		return UserID;
//	}
//
//	public void setUserID(String userID) {
//		UserID = userID;
//	}
}
