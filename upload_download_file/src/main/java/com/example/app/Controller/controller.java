package com.example.app.Controller;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.tomcat.util.file.ConfigurationSource.Resource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
//import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.app.ResponseBody;

@RestController
@RequestMapping("/files")
public class controller {
	
	@PostMapping
	@RequestMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file){
		System.out.println("file name "+file.getName());
		System.out.println("file size "+file.getSize());
		return ResponseEntity.ok("file got");
	}
	
	
	//send content 
	@GetMapping
	@RequestMapping("/download")
	public ResponseEntity<InputStreamResource> downloadFile() throws FileNotFoundException{
		 File initialFile = new File("src/main/resources/application.yml");
		 MultipartFile f;
		 InputStream targetStream = new FileInputStream(initialFile);
		 InputStreamResource resource = new InputStreamResource(targetStream);
System.out.println("OK -------------------------");
		    return ResponseEntity.ok()
		            .contentType(MediaType.APPLICATION_OCTET_STREAM)
		            .body(resource);		
	}
	
	//send content 
		@GetMapping
		@RequestMapping("/getError")
		public ResponseEntity<ResponseBody> error() {
			ResponseBody rb= new ResponseBody();
			rb.setStatus("failed");
			//rb.setError(em);
			return ResponseEntity.ok(rb);
			
		}

}
