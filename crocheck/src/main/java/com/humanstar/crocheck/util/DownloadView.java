package com.humanstar.crocheck.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

public class DownloadView  extends AbstractView{
	private static final Logger logger = LoggerFactory.getLogger(DownloadView.class);
	
	 public DownloadView() {
		 logger.info("Download VIew Start");
		    setContentType("applicaiton/download;charset=utf-8");
		  }

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		   File file = (File) model.get("downloadFile");
		     
		    response.setContentType(getContentType());
		    response.setContentLength((int)file.length());
		     
		   // String fileName = java.net.URLEncoder.encode(file.getName(), "UTF-8");
		   // String fileName = java.net.URLEncoder.encode("dns_201819250519.csv", "UTF-8");
		   String fileName = file.getName();
		    
		    logger.info(fileName);
		    response.setHeader("Content-Disposition", "attachment;filename=\""+fileName+"\";");
		    response.setHeader("Content-Transfer-Encoding", "binary");
		     
		    OutputStream out = response.getOutputStream();
		    FileInputStream fis = null;
		     
		    try {
		      fis = new FileInputStream(file);
		      FileCopyUtils.copy(fis, out);
		    } catch (Exception e) {
		      e.printStackTrace();
		    } finally {
		      if (fis != null) { try { fis.close(); } catch (Exception e2) {}}
		    }
		    out.flush();
	}
}
