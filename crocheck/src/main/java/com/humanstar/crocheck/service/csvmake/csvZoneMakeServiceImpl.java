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

import com.humanstar.crocheck.model.policy.dao.dhcpPolicyDAOImpl;
import com.humanstar.crocheck.model.policy.dao.dnspolicyDAOImpl;
import com.humanstar.crocheck.model.policy.dto.dhcpPolicyVO;
import com.humanstar.crocheck.model.policy.dto.dhcpRentVO;
import com.humanstar.crocheck.model.policy.dto.dhcpSubVO;
import com.humanstar.crocheck.model.policy.dto.dnspolicyVO;
import com.humanstar.crocheck.model.setting.dao.accessorsDAOImpl;
import com.humanstar.crocheck.model.setting.dao.operatorsDAOImpl;
import com.humanstar.crocheck.model.setting.dto.accessorsVO;
import com.humanstar.crocheck.model.setting.dto.operatorsVO;

@Service
public class csvZoneMakeServiceImpl implements csvZoneMakeService{
	private static final Logger logger = LoggerFactory.getLogger(csvZoneMakeServiceImpl.class);
	
	@Inject
	dnspolicyDAOImpl dnsPolicyDAO;
	@Inject
	dhcpPolicyDAOImpl dhcpPolicyDAO;
	@Inject
	operatorsDAOImpl operatorsDAO;
	@Inject
	accessorsDAOImpl accessorsDAO;
	
	@Override
	public String csvZoneMake() throws Exception {
		List<dnspolicyVO> dnsZoneList = new ArrayList<dnspolicyVO>();
		String file_name ="";
		BufferedWriter br = null;
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyymmddhhmm");
		String str = dayTime.format(new Date(time));
		
		file_name = "dns_" + str + ".csv";

	//	String title_line = "zone,ttl,type,host,mx_priority,data,primary_ns,resp_contact,serial,refresh,retry,expire,minimum,comment,modified";
		try {
			dnsZoneList = dnsPolicyDAO.dnsBackupData();
			br = Files.newBufferedWriter(Paths.get("/home/jun/git/crocheck/crocheck/src/main/webapp/WEB-INF/views/download", file_name));
			Charset.forName("UTF-8");
			
//			br.write(title_line);
			br.write("[");
			for(int i =0; i< dnsZoneList.size() ; i++) {
				br.write("{" +dnsZoneList.get(i).csvString());
				if(i == dnsZoneList.size() -1) {
					br.write("}");
				}else {
					br.write("},");
				}
				br.newLine();
			}
			br.write("]");
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

	@Override
	public String csvZone() throws Exception {
		List<dnspolicyVO> dnsZoneList = new ArrayList<dnspolicyVO>();
		String csvZone = "";
		
		csvZone += "[";
		try {
			dnsZoneList = dnsPolicyDAO.dnsBackupData();
			
			for(int i =0; i< dnsZoneList.size(); i++) {
				csvZone += "{";
				csvZone += dnsZoneList.get(i).csvString();
				if(i == dnsZoneList.size() -1) {
					csvZone += "}";
				}else {
					csvZone += "},";
				}
			}
			csvZone += "]";
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return csvZone;
	}

	@Override
	public String csvDhcp() throws Exception {
		List<dhcpPolicyVO> dhcpList = new ArrayList<dhcpPolicyVO>();
		
		String dhcpZone = "";
		
		dhcpZone += "[";
		try {
			dhcpList = dhcpPolicyDAO.dhcpPolicyList();
			
			for(int i =0; i< dhcpList.size(); i++) {
				dhcpZone += "{";
				dhcpZone += dhcpList.get(i).csvString();
				if(i == dhcpList.size() -1) {
					dhcpZone += "}";
				}else {
					dhcpZone += "},";
				}
			}
			dhcpZone += "]";
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dhcpZone;
	}

	@Override
	public String csvDhcpSub() throws Exception {
		// TODO Auto-generated method stub
		List<dhcpSubVO> dhcpList = new ArrayList<dhcpSubVO>();
		
		String dhcpZone = "";
		
		dhcpZone += "[";
		try {
			dhcpList = dhcpPolicyDAO.backupDhcpSub();
			
			for(int i =0; i< dhcpList.size(); i++) {
				dhcpZone += "{";
				dhcpZone += dhcpList.get(i).csvString();
				if(i == dhcpList.size() -1) {
					dhcpZone += "}";
				}else {
					dhcpZone += "},";
				}
			}
			dhcpZone += "]";
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		return dhcpZone;
	}

	@Override
	public String csvDhcpRent() throws Exception {
		// TODO Auto-generated method stub
		List<dhcpRentVO> dhcpList = new ArrayList<dhcpRentVO>();
	
		String dhcpZone = "";
		
		dhcpZone += "[";
		try {
			dhcpList = dhcpPolicyDAO.backupDhcpRent();
			
			for(int i =0; i< dhcpList.size(); i++) {
				dhcpZone += "{";
				dhcpZone += dhcpList.get(i).csvString();
				if(i == dhcpList.size() -1) {
					dhcpZone += "}";
				}else {
					dhcpZone += "},";
				}
			}
			dhcpZone += "]";
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dhcpZone;
	}

	@Override
	public String csvOperators() throws Exception {
		List<operatorsVO> operatorList = new ArrayList<operatorsVO>();
		
		String operatorCSV = "";
		
		operatorCSV += "[";
		try {
			operatorList = operatorsDAO.operatorList();
			
			for(int i =0; i< operatorList.size(); i++) {
				operatorCSV += "{";
				operatorCSV += operatorList.get(i).csvString();
				if(i == operatorList.size() -1) {
					operatorCSV += "}";
				}else {
					operatorCSV += "},";
				}
			}
			operatorCSV += "]";
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return operatorCSV;
	}

	@Override
	public String csvAccessors() throws Exception {
		List<accessorsVO> accessorsList = new ArrayList<accessorsVO>();
		
		String accessorsCSV = "";
		
		accessorsCSV += "[";
		try {
			accessorsList = accessorsDAO.accessList();
			
			for(int i =0; i< accessorsList.size(); i++) {
				accessorsCSV += "{";
				accessorsCSV += accessorsList.get(i).csvString();
				if(i == accessorsList.size() -1) {
					accessorsCSV += "}";
				}else {
					accessorsCSV += "},";
				}
			}
			accessorsCSV += "]";
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return accessorsCSV;
	}
	
}
