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
	@Scheduled(cron="0 * * * * *")
	public void alertCheck() {
		alertVO alertList = new alertVO();
		alertNowVO alertNowList = new alertNowVO();
		alertMessageVO alertMessage  = new alertMessageVO();
		
		try {
			alertList = alertListService.alertList();
			alertNowList = alertNowService.alertNow();
			
			if(alertList.getCpu_critical() < alertNowList.getCpu_pct()) {
				alertMessage.setMessage("CPU 사용량이 높습니다. (CPU 수치 : " + alertNowList.getCpu_pct() + ")");
				alertMessageService.insertMessage(alertMessage);
			}else if(alertList.getCpu_critical() > alertNowList.getCpu_pct()  && alertList.getCpu_warning() < alertNowList.getCpu_pct()) {
				alertMessage.setMessage("CPU 사용량이 경고 수준입니다. (CPU 수치 : " + alertNowList.getCpu_pct() + ")");
				alertMessageService.insertMessage(alertMessage);
			}
			
			if(alertList.getMemory_critical() < alertNowList.getMemory_pct()) {
				alertMessage.setMessage("MEMORY 사용량이 높습니다. (MEMORY 수치 : " + alertNowList.getMemory_pct() +")");
				alertMessageService.insertMessage(alertMessage);
			}else if(alertList.getMemory_critical() > alertNowList.getMemory_pct()  && alertList.getMemory_warning() < alertNowList.getMemory_pct()) {
				alertMessage.setMessage("MEMORY 사용량이 경고 수준입니다. (MEMORY 수치 : " + alertNowList.getMemory_pct());
				alertMessageService.insertMessage(alertMessage);
			}
			
			if(alertList.getDisk_critical() < alertNowList.getDisk_pct()) {
				alertMessage.setMessage("DISK 사용량이 높습니다. (DISK 수치 : " + alertNowList.getDisk_pct() +")");
				alertMessageService.insertMessage(alertMessage);
			}else if(alertList.getDisk_critical() > alertNowList.getDisk_pct()  && alertList.getDisk_warning() < alertNowList.getDisk_pct()) {
				alertMessage.setMessage("DISK 사용량이 경고 수준입니다. (DISK 수치 : " + alertNowList.getDisk_pct() +")");
				alertMessageService.insertMessage(alertMessage);
			}
			
			if(alertList.getDns_critical() < alertNowList.getDns_count()) {
				alertMessage.setMessage("DNS QUERY 처리량이 기준치를 초과합니다 (DNS : " + alertNowList.getDns_count()+")");
				alertMessageService.insertMessage(alertMessage);
			}else if(alertList.getDns_critical() > alertNowList.getDns_count()  && alertList.getDns_warning() < alertNowList.getDns_count()) {
				alertMessage.setMessage("DNS QUERY 처리량이 경고 수치를 초과합니다. (DNS : " + alertNowList.getDns_count() + ")");
				alertMessageService.insertMessage(alertMessage);
			}
			
			if(alertList.getDdos_critical() < alertNowList.getDdos_count()) {
				alertMessage.setMessage("DDOS 공격이 모니터링 되었습니다. (DDOS COUNT : " + alertNowList.getDdos_count() +")");
				alertMessageService.insertMessage(alertMessage);
			}else if(alertList.getDdos_critical() > alertNowList.getDdos_count()  && alertList.getDdos_warning() < alertNowList.getDdos_count()) {
				alertMessage.setMessage("DDOS 공격이 경고 수준입니다. (DDOS COUNT : " + alertNowList.getDdos_count() + ")");
				alertMessageService.insertMessage(alertMessage);
			}
			
			logger.info(" " + new Date());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
