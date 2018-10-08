package com.humanstar.crocheck.service.csvmake;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.humanstar.crocheck.model.policy.dao.dnspolicyDAOImpl;
import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;

@Service
public class csvZoneMakeServiceImpl implements csvZoneMakeService{
	private static final Logger logger = LoggerFactory.getLogger(csvZoneMakeServiceImpl.class);
	
	@Inject
	dnspolicyDAOImpl dnsPolicyDAO;
	
	@Override
	public String csvZoneMake() throws Exception {
		List<dnspolicyVO> dnsZoneList = new ArrayList<dnspolicyVO>();
		String file_name ="";
		BufferedWriter br = null;
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyymmddhhmm");
		String str = dayTime.format(new Date(time));
		
		file_name = "test_" + str + ".csv";

		String title_line = "zone,ttl,type,host,mx_priority,data,primary_ns,resp_contact,serial,refresh,retry,expire,minimum,comment,modified";
		try {
			dnsZoneList = dnsPolicyDAO.dnsBackupData();
			br = Files.newBufferedWriter(Paths.get("/home/jun/", file_name));
			Charset.forName("UTF-8");
			
			br.write(title_line);
			for(int i =0; i< dnsZoneList.size() ; i++) {
				br.write(dnsZoneList.get(i).csvString());
				br.newLine();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
					br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return file_name;
	}
	
}
