package com.humanstar.crocheck.controller.script;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class scriptController {
	private static final Logger logger = LoggerFactory.getLogger(scriptController.class);

	public static final String RESULT = "result";
	public static final String RESULT_SUCCESS = "success";
	public static final String RESULT_ERROR = "error";
	public static final String SUCCESS_MESSAGE = "successMsg";
	public static final String ERROR_MESSAGE = "errorMsg";
	
	
	@RequestMapping(value = "/nslookupscript", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> testScript(@ModelAttribute String Msg) {
        Process process = null;
        Runtime runtime = Runtime.getRuntime();
        StringBuffer successOutput = new StringBuffer(); // 성공 스트링 버퍼
        StringBuffer errorOutput = new StringBuffer(); // 오류 스트링 버퍼
        BufferedReader successBufferReader = null; // 성공 버퍼
        BufferedReader errorBufferReader = null; // 오류 버퍼
        String msg = null; // 메시지
		Map<String, Object> resultMap = new HashMap<String, Object>();
 
        List<String> cmdList = new ArrayList<String>();

        cmdList.add("/bin/sh");
        cmdList.add("-c");
        
        msg = "nslookup " + Msg + " localhost";
        logger.info(Msg);
        cmdList.add(msg);
        String[] array = cmdList.toArray(new String[cmdList.size()]);

		try {
	           // 명령어 실행
            process = runtime.exec(array);
 
            // shell 실행이 정상 동작했을 경우
            successBufferReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
 
            while ((msg = successBufferReader.readLine()) != null) {
                successOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // shell 실행시 에러가 발생했을 경우
            errorBufferReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "UTF-8"));
            while ((msg = errorBufferReader.readLine()) != null) {
                errorOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // 프로세스의 수행이 끝날때까지 대기
            process.waitFor();
 
            // shell 실행이 정상 종료되었을 경우
            if (process.exitValue() == 0) {
            	logger.info(successOutput.toString());
                resultMap.put("commandMsg",successOutput.toString());
            } else {
                // shell 실행이 비정상 종료되었을 경우
            	logger.error(successOutput.toString());
            }
 
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}finally {
            try {
                process.destroy();
                if (successBufferReader != null) successBufferReader.close();
                if (errorBufferReader != null) errorBufferReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return resultMap;
	}
	
	
	@RequestMapping(value = "/dnsupdatescript", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dnsupdatescript() {
        Process process = null;
        Runtime runtime = Runtime.getRuntime();
        StringBuffer successOutput = new StringBuffer(); // 성공 스트링 버퍼
        StringBuffer errorOutput = new StringBuffer(); // 오류 스트링 버퍼
        BufferedReader successBufferReader = null; // 성공 버퍼
        BufferedReader errorBufferReader = null; // 오류 버퍼
        String msg = null; // 메시지
		Map<String, Object> resultMap = new HashMap<String, Object>();
 
        List<String> cmdList = new ArrayList<String>();

        cmdList.add("/bin/sh");
        cmdList.add("-c");
        
        cmdList.add("sh /crocheck/script/zonelist-4-update.sh >> /home/human/logfile");
        String[] array = cmdList.toArray(new String[cmdList.size()]);

		try {
	           // 명령어 실행
            process = runtime.exec(array);
 
            // shell 실행이 정상 동작했을 경우
            successBufferReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
 
            while ((msg = successBufferReader.readLine()) != null) {
                successOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // shell 실행시 에러가 발생했을 경우
            errorBufferReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "UTF-8"));
            while ((msg = errorBufferReader.readLine()) != null) {
                errorOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // 프로세스의 수행이 끝날때까지 대기
            process.waitFor();
 
            // shell 실행이 정상 종료되었을 경우
            if (process.exitValue() == 0) {
            	logger.info("SCRIPT ERROR");
            	logger.info(successOutput.toString());
                resultMap.put("commandMsg",successOutput.toString());
            } else {
                // shell 실행이 비정상 종료되었을 경우
            	logger.error(successOutput.toString());
            }
 
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}finally {
            try {
                process.destroy();
                if (successBufferReader != null) successBufferReader.close();
                if (errorBufferReader != null) errorBufferReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return resultMap;
	}
	
	
	@RequestMapping(value = "/dhcpupdatescript", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpupdatescript() {
        Process process = null;
        Runtime runtime = Runtime.getRuntime();
        StringBuffer successOutput = new StringBuffer(); // 성공 스트링 버퍼
        StringBuffer errorOutput = new StringBuffer(); // 오류 스트링 버퍼
        BufferedReader successBufferReader = null; // 성공 버퍼
        BufferedReader errorBufferReader = null; // 오류 버퍼
        String msg = null; // 메시지
		Map<String, Object> resultMap = new HashMap<String, Object>();
 
        List<String> cmdList = new ArrayList<String>();

        cmdList.add("/bin/sh");
        cmdList.add("-c");
        
        cmdList.add("sh /crocheck/script/dhcp-makeconf.sh");
        String[] array = cmdList.toArray(new String[cmdList.size()]);

		try {
	           // 명령어 실행
            process = runtime.exec(array);
 
            // shell 실행이 정상 동작했을 경우
            successBufferReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
 
            while ((msg = successBufferReader.readLine()) != null) {
                successOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // shell 실행시 에러가 발생했을 경우
            errorBufferReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "UTF-8"));
            while ((msg = errorBufferReader.readLine()) != null) {
                errorOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // 프로세스의 수행이 끝날때까지 대기
            process.waitFor();
 
            // shell 실행이 정상 종료되었을 경우
            if (process.exitValue() == 0) {
            	logger.info(successOutput.toString());
                resultMap.put("commandMsg",successOutput.toString());
            } else {
                // shell 실행이 비정상 종료되었을 경우
            	logger.error(successOutput.toString());
            }
 
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}finally {
            try {
                process.destroy();
                if (successBufferReader != null) successBufferReader.close();
                if (errorBufferReader != null) errorBufferReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return resultMap;
	}
	
	@RequestMapping(value = "/ntpstartscript", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> ntpstartscript() {
        Process process = null;
        Runtime runtime = Runtime.getRuntime();
        StringBuffer successOutput = new StringBuffer(); // 성공 스트링 버퍼
        StringBuffer errorOutput = new StringBuffer(); // 오류 스트링 버퍼
        BufferedReader successBufferReader = null; // 성공 버퍼
        BufferedReader errorBufferReader = null; // 오류 버퍼
        String msg = null; // 메시지
		Map<String, Object> resultMap = new HashMap<String, Object>();
	
		msg = "sh /crocheck/script/ntp-start.sh";
		
        List<String> cmdList = new ArrayList<String>();

        cmdList.add("/bin/sh");
        cmdList.add("-c");
        
        cmdList.add(msg);
        String[] array = cmdList.toArray(new String[cmdList.size()]);

		try {
	           // 명령어 실행
            process = runtime.exec(array);
    		logger.info("test");
            // shell 실행이 정상 동작했을 경우
            successBufferReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));

            while ((msg = successBufferReader.readLine()) != null) {
                successOutput.append(msg + System.getProperty("line.separator"));
            }


            // shell 실행시 에러가 발생했을 경우
            errorBufferReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "UTF-8"));
            while ((msg = errorBufferReader.readLine()) != null) {
                errorOutput.append(msg + System.getProperty("line.separator"));
            }


            // 프로세스의 수행이 끝날때까지 대기
            process.waitFor();

            // shell 실행이 정상 종료되었을 경우
            if (process.exitValue() == 0) {
            	logger.info(successOutput.toString());
                resultMap.put("commandMsg",successOutput.toString());
            } else {
                // shell 실행이 비정상 종료되었을 경우
            	logger.error(successOutput.toString());
            }


			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}finally {
            try {
                process.destroy();
                if (successBufferReader != null) successBufferReader.close();
                if (errorBufferReader != null) errorBufferReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return resultMap;
	}
	
	@RequestMapping(value = "/ntpstopscript", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> ntpstopscript() {
        Process process = null;
        Runtime runtime = Runtime.getRuntime();
        StringBuffer successOutput = new StringBuffer(); // 성공 스트링 버퍼
        StringBuffer errorOutput = new StringBuffer(); // 오류 스트링 버퍼
        BufferedReader successBufferReader = null; // 성공 버퍼
        BufferedReader errorBufferReader = null; // 오류 버퍼
        String msg = null; // 메시지
		Map<String, Object> resultMap = new HashMap<String, Object>();
	

		msg = "sh /crocheck/script/ntp-stop.sh";
		
        List<String> cmdList = new ArrayList<String>();

        cmdList.add("/bin/sh");
        cmdList.add("-c");
        
        cmdList.add(msg);
        String[] array = cmdList.toArray(new String[cmdList.size()]);

        logger.info(msg);
		try {
	           // 명령어 실행
            process = runtime.exec(array);
            // shell 실행이 정상 동작했을 경우
            successBufferReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
             while ((msg = successBufferReader.readLine()) != null) {
                successOutput.append(msg + System.getProperty("line.separator"));
            }

            // shell 실행시 에러가 발생했을 경우
            errorBufferReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "UTF-8"));
            while ((msg = errorBufferReader.readLine()) != null) {
                errorOutput.append(msg + System.getProperty("line.separator"));
            }

            // 프로세스의 수행이 끝날때까지 대기
            process.waitFor();

            // shell 실행이 정상 종료되었을 경우
            if (process.exitValue() == 0) {
            	logger.info(successOutput.toString());
                resultMap.put("commandMsg",successOutput.toString());
            } else {
                // shell 실행이 비정상 종료되었을 경우
            	logger.error(successOutput.toString());
            }

			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}finally {
            try {
                process.destroy();
                if (successBufferReader != null) successBufferReader.close();
                if (errorBufferReader != null) errorBufferReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return resultMap;
	}
	
	@RequestMapping(value = "/ntpstatusscript", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> ntpstatusscript() {
        Process process = null;
        Runtime runtime = Runtime.getRuntime();
        StringBuffer successOutput = new StringBuffer(); // 성공 스트링 버퍼
        StringBuffer errorOutput = new StringBuffer(); // 오류 스트링 버퍼
        BufferedReader successBufferReader = null; // 성공 버퍼
        BufferedReader errorBufferReader = null; // 오류 버퍼
        String msg = null; // 메시지
		Map<String, Object> resultMap = new HashMap<String, Object>();
		

        List<String> cmdList = new ArrayList<String>();

        cmdList.add("/bin/sh");
        cmdList.add("-c");
        msg = "sh /crocheck/script/ntp-result.sh";
        cmdList.add(msg);
        String[] array = cmdList.toArray(new String[cmdList.size()]);

		try {
	           // 명령어 실행
            process = runtime.exec(array);

            // shell 실행이 정상 동작했을 경우
            successBufferReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));

            while ((msg = successBufferReader.readLine()) != null) {
                successOutput.append(msg + System.getProperty("line.separator"));
            }

            // shell 실행시 에러가 발생했을 경우
            errorBufferReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "UTF-8"));
            while ((msg = errorBufferReader.readLine()) != null) {
                errorOutput.append(msg + System.getProperty("line.separator"));
            }

            // 프로세스의 수행이 끝날때까지 대기
            process.waitFor();

            // shell 실행이 정상 종료되었을 경우
            if (process.exitValue() == 0) {
            	logger.info(successOutput.toString());
                resultMap.put("commandMsg",successOutput.toString());
            } else {
                // shell 실행이 비정상 종료되었을 경우
            	logger.error(successOutput.toString());
            }

            logger.info(successOutput.toString());
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}finally {
            try {
                process.destroy();
                if (successBufferReader != null) successBufferReader.close();
                if (errorBufferReader != null) errorBufferReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return resultMap;
	}

	
	@RequestMapping(value = "/dnstartscript", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dnsstartscript(@ModelAttribute String Msg) {
        Process process = null;
        Runtime runtime = Runtime.getRuntime();
        StringBuffer successOutput = new StringBuffer(); // 성공 스트링 버퍼
        StringBuffer errorOutput = new StringBuffer(); // 오류 스트링 버퍼
        BufferedReader successBufferReader = null; // 성공 버퍼
        BufferedReader errorBufferReader = null; // 오류 버퍼
        String msg = null; // 메시지
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		msg = "sh /crocheck/script/dns-start.sh";
		
        List<String> cmdList = new ArrayList<String>();

        cmdList.add("/bin/sh");
        cmdList.add("-c");
        
        cmdList.add(msg);
        String[] array = cmdList.toArray(new String[cmdList.size()]);

		try {
	           // 명령어 실행
            process = runtime.exec(array);
 
            // shell 실행이 정상 동작했을 경우
            successBufferReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
 
            while ((msg = successBufferReader.readLine()) != null) {
                successOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // shell 실행시 에러가 발생했을 경우
            errorBufferReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "UTF-8"));
            while ((msg = errorBufferReader.readLine()) != null) {
                errorOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // 프로세스의 수행이 끝날때까지 대기
            process.waitFor();
 
            // shell 실행이 정상 종료되었을 경우
            if (process.exitValue() == 0) {
            	logger.info(successOutput.toString());
                resultMap.put("commandMsg",successOutput.toString());
            } else {
                // shell 실행이 비정상 종료되었을 경우
            	logger.error(successOutput.toString());
            }
 
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}finally {
            try {
                process.destroy();
                if (successBufferReader != null) successBufferReader.close();
                if (errorBufferReader != null) errorBufferReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return resultMap;
	}
	
	@RequestMapping(value = "/dnsstopscript", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dnsstopscript(@ModelAttribute String Msg) {
        Process process = null;
        Runtime runtime = Runtime.getRuntime();
        StringBuffer successOutput = new StringBuffer(); // 성공 스트링 버퍼
        StringBuffer errorOutput = new StringBuffer(); // 오류 스트링 버퍼
        BufferedReader successBufferReader = null; // 성공 버퍼
        BufferedReader errorBufferReader = null; // 오류 버퍼
        String msg = null; // 메시지
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		msg = "sh /crocheck/script/dns-stop.sh";

		
        List<String> cmdList = new ArrayList<String>();

        cmdList.add("/bin/sh");
        cmdList.add("-c");
        
        cmdList.add(msg);
        String[] array = cmdList.toArray(new String[cmdList.size()]);

		try {
	           // 명령어 실행
            process = runtime.exec(array);
 
            // shell 실행이 정상 동작했을 경우
            successBufferReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
 
            while ((msg = successBufferReader.readLine()) != null) {
                successOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // shell 실행시 에러가 발생했을 경우
            errorBufferReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "UTF-8"));
            while ((msg = errorBufferReader.readLine()) != null) {
                errorOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // 프로세스의 수행이 끝날때까지 대기
            process.waitFor();
 
            // shell 실행이 정상 종료되었을 경우
            if (process.exitValue() == 0) {
            	logger.info(successOutput.toString());
                resultMap.put("commandMsg",successOutput.toString());
            } else {
                // shell 실행이 비정상 종료되었을 경우
            	logger.error(successOutput.toString());
            }
 
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}finally {
            try {
                process.destroy();
                if (successBufferReader != null) successBufferReader.close();
                if (errorBufferReader != null) errorBufferReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return resultMap;
	}
	
	
	@RequestMapping(value = "/dhcpstartscript", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpstartscript(@ModelAttribute String Msg) {
        Process process = null;
        Runtime runtime = Runtime.getRuntime();
        StringBuffer successOutput = new StringBuffer(); // 성공 스트링 버퍼
        StringBuffer errorOutput = new StringBuffer(); // 오류 스트링 버퍼
        BufferedReader successBufferReader = null; // 성공 버퍼
        BufferedReader errorBufferReader = null; // 오류 버퍼
        String msg = null; // 메시지
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		msg = "sh /crocheck/script/dhcp-start.sh";

		
        List<String> cmdList = new ArrayList<String>();

        cmdList.add("/bin/sh");
        cmdList.add("-c");
        
        cmdList.add(msg);
        String[] array = cmdList.toArray(new String[cmdList.size()]);

		try {
	           // 명령어 실행
            process = runtime.exec(array);
 
            // shell 실행이 정상 동작했을 경우
            successBufferReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
 
            while ((msg = successBufferReader.readLine()) != null) {
                successOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // shell 실행시 에러가 발생했을 경우
            errorBufferReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "UTF-8"));
            while ((msg = errorBufferReader.readLine()) != null) {
                errorOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // 프로세스의 수행이 끝날때까지 대기
            process.waitFor();
 
            // shell 실행이 정상 종료되었을 경우
            if (process.exitValue() == 0) {
            	logger.info(successOutput.toString());
                resultMap.put("commandMsg",successOutput.toString());
            } else {
                // shell 실행이 비정상 종료되었을 경우
            	logger.error(successOutput.toString());
            }
 
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}finally {
            try {
                process.destroy();
                if (successBufferReader != null) successBufferReader.close();
                if (errorBufferReader != null) errorBufferReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return resultMap;
	}
	
	@RequestMapping(value = "/dhcpstopscript", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> dhcpstopscript(@ModelAttribute String Msg) {
        Process process = null;
        Runtime runtime = Runtime.getRuntime();
        StringBuffer successOutput = new StringBuffer(); // 성공 스트링 버퍼
        StringBuffer errorOutput = new StringBuffer(); // 오류 스트링 버퍼
        BufferedReader successBufferReader = null; // 성공 버퍼
        BufferedReader errorBufferReader = null; // 오류 버퍼
        String msg = null; // 메시지
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		msg = "sh /crocheck/script/dhcp-stop.sh";

		
        List<String> cmdList = new ArrayList<String>();

        cmdList.add("/bin/sh");
        cmdList.add("-c");
        
        cmdList.add(msg);
        String[] array = cmdList.toArray(new String[cmdList.size()]);

		try {
	           // 명령어 실행
            process = runtime.exec(array);
 
            // shell 실행이 정상 동작했을 경우
            successBufferReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
 
            while ((msg = successBufferReader.readLine()) != null) {
                successOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // shell 실행시 에러가 발생했을 경우
            errorBufferReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "UTF-8"));
            while ((msg = errorBufferReader.readLine()) != null) {
                errorOutput.append(msg + System.getProperty("line.separator"));
            }
 
            // 프로세스의 수행이 끝날때까지 대기
            process.waitFor();
 
            // shell 실행이 정상 종료되었을 경우
            if (process.exitValue() == 0) {
            	logger.info(successOutput.toString());
                resultMap.put("commandMsg",successOutput.toString());
            } else {
                // shell 실행이 비정상 종료되었을 경우
            	logger.error(successOutput.toString());
            }
 
			resultMap.put(RESULT, RESULT_SUCCESS);
			resultMap.put(SUCCESS_MESSAGE, "connect_seccess!");
		} catch (Exception e) {
			resultMap.put(RESULT, RESULT_ERROR);
			resultMap.put(ERROR_MESSAGE, "connect_faled!");
			logger.error(e.toString());

		}finally {
            try {
                process.destroy();
                if (successBufferReader != null) successBufferReader.close();
                if (errorBufferReader != null) errorBufferReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return resultMap;
	}
}
