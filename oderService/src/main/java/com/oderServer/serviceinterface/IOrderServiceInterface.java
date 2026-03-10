package com.oderServer.serviceinterface;

import org.springframework.stereotype.Service;

import com.oderServer.request.RequestPojo;

@Service
public interface IOrderServiceInterface {
	
	public String placingOderService(RequestPojo requestpojo );

}
