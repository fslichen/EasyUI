package evolution.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
	@PostMapping("/upload")
    public void upload(@RequestParam("file") MultipartFile file) {
		System.out.println("File Name = " + file.getName() + " File Size = " + file.getSize());
    }
	
	@PostMapping("/submit")
    public void submit(@RequestParam("name") String name, @RequestParam("email") String email) {
		System.out.println("Name = " + name + " Email = " + email);
    }
}
