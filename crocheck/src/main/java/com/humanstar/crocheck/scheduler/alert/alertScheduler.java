package com.humanstar.crocheck.scheduler.alert;

import java.util.Date;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import com.humanstar.crocheck.model.alert.dto.alertNowVO;
import com.humanstar.crocheck.model.alert.dto.alertVO;
import com.humanstar.crocheck.model.alertmessage.dto.alertMessageVO;
import com.humanstar.crocheck.service.alert.alertListServiceImpl;
import com.humanstar.crocheck.service.alert.alertNowServiceImpl;
import com.humanstar.crocheck.service.alertmessage.alertMessageServiceImpl;

public class alertScheduler {
	private static final Logger logger = LoggerFactory.getLogger(alertScheduler.class);
	
	
	@Inject 
	alertListServiceImpl alertListService;
	@Inject
	alertNowServiceImpl alertNowService;
	@Inject 
	alertMessageServiceImpl alertMessageService;
	
	
	// 5분마다 check 
	@Scheduled(cron="0 */12 * * * *")
	public void alertCheck() {
		alertVO alertList = new alertVO();
		alertNowVO alertNowList = new alertNowVO();
		alertMessageVO alertMessage  = new alertMessageVO();
		
		try {
			alertList = alertListService.alertList();
			alertNowList = alertNowService.alertNow();
			
			if(alertList.getCpu_critical() < alertNowList.getCpu_pct()) {
				alertMessage.setMessage("CPU value is critical : " + alertNowList.getCpu_pct());
				alertMessageService.insertMessage(alertMessage);
			}else if(alertList.getCpu_critical() > alertNowList.getCpu_pct()  && alertList.getCpu_warning() < alertNowList.getCpu_pct()) {
				alertMessage.setMessage("CPU value is warning : " + alertNowList.getCpu_pct());
				alertMessageService.insertMessage(alertMessage);
			}
			
			if(alertList.getMemory_critical() < alertNowList.getMemory_pct()) {
				alertMessage.setMessage("Memory value is critical : " + alertNowList.getMemory_pct());
				alertMessageService.insertMessage(alertMessage);
			}else if(alertList.getMemory_critical() > alertNowList.getMemory_pct()  && alertList.getMemory_warning() < alertNowList.getMemory_pct()) {
				alertMessage.setMessage("Memory  value is warning : " + alertNowList.getMemory_pct());
				alertMessageService.insertMessage(alertMessage);
			}
			
			if(alertList.getDisk_critical() < alertNowList.getDisk_pct()) {
				alertMessage.setMessage("Disk value is critical : " + alertNowList.getDisk_pct());
				alertMessageService.insertMessage(alertMessage);
			}else if(alertList.getDisk_critical() > alertNowList.getDisk_pct()  && alertList.getDisk_warning() < alertNowList.getDisk_pct()) {
				alertMessage.setMessage("Disk value is warning : " + alertNowList.getDisk_pct());
				alertMessageService.insertMessage(alertMessage);
			}
			
			if(alertList.getDns_critical() < alertNowList.getDns_count()) {
				alertMessage.setMessage("Dns value is critical : " + alertNowList.getDns_count());
				alertMessageService.insertMessage(alertMessage);
			}else if(alertList.getDns_critical() > alertNowList.getDns_count()  && alertList.getDns_warning() < alertNowList.getDns_count()) {
				alertMessage.setMessage("Dns value is warning : " + alertNowList.getDns_count());
				alertMessageService.insertMessage(alertMessage);
			}
			
			if(alertList.getDdos_critical() < alertNowList.getDdos_count()) {
				alertMessage.setMessage("Ddos value is critical : " + alertNowList.getDdos_count());
				alertMessageService.insertMessage(alertMessage);
			}else if(alertList.getDdos_critical() > alertNowList.getDdos_count()  && alertList.getDdos_warning() < alertNowList.getDdos_count()) {
				alertMessage.setMessage("Ddos value is warning : " + alertNowList.getDdos_count());
				alertMessageService.insertMessage(alertMessage);
			}
			
			logger.info(" " + new Date());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
