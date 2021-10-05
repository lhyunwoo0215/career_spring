package career.life.Board.PersonBoard;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/v1/test")
@Slf4j
public class BoardRestController {

	@GetMapping("test")
	public String getRead(){
		return "test";
	}


	
	

	
	

}
