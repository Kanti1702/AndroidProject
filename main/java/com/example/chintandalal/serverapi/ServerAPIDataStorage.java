package com.example.chintandalal.serverapi;

import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;



public class ServerAPIDataStorage {
	private URL apiURL, imageURL;
	private String token, method, UserID;
	public ExecutorService allNetworkOperationsQueue;
	public ExecutorService allDataOperationsQueue;
	
	private static ServerAPIDataStorage instance = null;
	
	static public ServerAPIDataStorage sharedInstance()
	{	
		if(instance == null)
		{
			instance = new ServerAPIDataStorage();
		}
		return instance;
	}
	
	public ExecutorService allNetworkOperationsQueue()
	{			
		if(this.allNetworkOperationsQueue == null)
		{
			this.allNetworkOperationsQueue = new ExecutorService() {
				
				@Override
				public void execute(Runnable command) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public <T> Future<T> submit(Runnable task, T result) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Future<?> submit(Runnable task) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public <T> Future<T> submit(Callable<T> task) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public List<Runnable> shutdownNow() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public void shutdown() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public boolean isTerminated() {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean isShutdown() {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public <T> T invokeAny(Collection<? extends Callable<T>> tasks,
						long timeout, TimeUnit unit) throws InterruptedException,
						ExecutionException, TimeoutException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public <T> T invokeAny(Collection<? extends Callable<T>> tasks)
						throws InterruptedException, ExecutionException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public <T> List<Future<T>> invokeAll(
						Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
						throws InterruptedException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks)
						throws InterruptedException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public boolean awaitTermination(long timeout, TimeUnit unit)
						throws InterruptedException {
					// TODO Auto-generated method stub
					return false;
				}
			};
		}
		return this.allNetworkOperationsQueue;
	}
	
	public ExecutorService allDataOperationsQueue()
	{
		if(this.allDataOperationsQueue == null)
		{
			this.allDataOperationsQueue = new ExecutorService() {
				
				@Override
				public void execute(Runnable command) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public <T> Future<T> submit(Runnable task, T result) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Future<?> submit(Runnable task) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public <T> Future<T> submit(Callable<T> task) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public List<Runnable> shutdownNow() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public void shutdown() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public boolean isTerminated() {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean isShutdown() {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public <T> T invokeAny(Collection<? extends Callable<T>> tasks,
						long timeout, TimeUnit unit) throws InterruptedException,
						ExecutionException, TimeoutException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public <T> T invokeAny(Collection<? extends Callable<T>> tasks)
						throws InterruptedException, ExecutionException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public <T> List<Future<T>> invokeAll(
						Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
						throws InterruptedException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks)
						throws InterruptedException {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public boolean awaitTermination(long timeout, TimeUnit unit)
						throws InterruptedException {
					// TODO Auto-generated method stub
					return false;
				}
			};
		}
		return  this.allDataOperationsQueue;
	}
	public URL getAPIURL() {
		return apiURL;
	}

	public void setAPIURL(URL apiURL) {
		this.apiURL = apiURL;
	}

	public URL getImageURL() {
		return imageURL;
	}

	public void setImageURL(URL imageURL) {
		this.imageURL = imageURL;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String token) {
		this.token = token;
	}

	public String getRequestMethod() {
		return method;
	}

	public void setRequestMethod(String method) {
		this.method = method;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}
	
}
