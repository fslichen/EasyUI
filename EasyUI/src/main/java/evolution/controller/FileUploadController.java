package evolution.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
	@PostMapping("/upload")
    public void upload(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		System.out.println("File Name = " + file.getName() + " File Size = " + file.getSize());
		file.transferTo(new File("/home/chen/Desktop/Buffer/" + file.getName()));
    }
	
	@PostMapping("/submit")
    public void submit(@RequestParam("name") String name, @RequestParam("email") String email) {
		System.out.println("Name = " + name + " Email = " + email);
    }
}
