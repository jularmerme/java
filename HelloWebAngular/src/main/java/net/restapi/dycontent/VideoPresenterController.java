package net.restapi.dycontent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoPresenterController {
	
	@Autowired
	VideoRepositoryController videoRepositoryController;

	@RequestMapping(method = RequestMethod.GET, path = "/getvideos/{videoTopic}")
	public String getVideos (@PathVariable String videoTopic) {
		switch(videoTopic) {
		case "python":
			return String.format("This is all our Python videos.");
		case "java":
			return String.format("This is all our Java videos.");
		default:
			return String.format("Sorry, wrong request");
		}
		
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/webinfo")
	public String getInfo() {
		return String.format("This website is about learning videos.");
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/getallvideos")
	public List<Videos> getAllVideos() {
		return videoRepositoryController.getAllVideos();
	}
	
}
