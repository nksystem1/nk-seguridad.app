package com.nkseguridad.app.Controller;

import java.io.Console;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkseguridad.app.Entity.Log;
import com.nkseguridad.app.Entity.Zona;
import com.nkseguridad.app.Service.ILogService;
import com.nkseguridad.app.Service.IZonaService;

@RestController
@RequestMapping("api")
public class ZonaController {

	
	
	@Autowired
	private IZonaService ZonaService;
	
	@Autowired
	private ILogService LogService;
	
	@Autowired
    private HttpServletRequest response;
	
	@GetMapping("zona")
	public ResponseEntity<?> ListarZonas(){		
		
		//String uri = request.getRequestURI();
		List<Zona> LstZonas = ZonaService.findAll();
		if (LstZonas!=null) {
			if (LstZonas.size()!=0) {
				Log logguer= new Log();
				logguer.setDate(new Date());
				logguer.setUrl(response.getRequestURL().toString());
				logguer.setDetails(response.getMethod());
						LogService.save(logguer);
				return new ResponseEntity<>(LstZonas, HttpStatus.OK);					
			}
			else {
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
}
