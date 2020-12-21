package com.example.demo;

import com.example.demo.exception.ConfigurationException;
import com.example.demo.exception.NotFoundException;
import com.example.demo.impl.loggerServiceimpl;
import com.example.demo.service.IloggerService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoggeraplicationApplicationTests {




	@Test
	void loggerwarnning() throws Exception {
		Map<String,String> config = new HashMap<String, String>();
		config.put("logFileFolder", "logs");
		IloggerService logger = new loggerServiceimpl(true, false, false, false, true, false, config);
		logger.logMessage("Ejemplos de logger advertencias", true, false, false);
		File logFile = new File("/home/user/Escritorio/logs/logFile.txt");
		assertTrue(logFile.exists());
		logFile.deleteOnExit();
	}

	@Test
	void loggernotfound() throws Exception {
		assertThrows(NotFoundException.class, () -> {
			IloggerService logger = new loggerServiceimpl(false, false, false, false, false, false, null);
			logger.logMessage("Ejemplos de logger advertencias", true, false, false);
		});
	}


	@Test
	void loggerconfiguration() throws Exception {
		assertThrows(ConfigurationException.class, () -> {
			IloggerService logger = new loggerServiceimpl(false, true, false, true, false, false, null);
			logger.logMessage("Example logging warning", false, false, false);
		});
	}


}
