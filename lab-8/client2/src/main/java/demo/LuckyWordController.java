package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// TODO: Add @ConfigurationProperties here.
@RefreshScope
public class LuckyWordController {
	
	@Value("${wordConfig.luckyWord}")
	String luckyWord;
	@Value("${wordConfig.preamble}")
	String preamble;
	String fullStatement;
	
	@PostConstruct
	public void init() {
		fullStatement = preamble + luckyWord;
	}
	
	@GetMapping("/lucky-word")
	public String showLuckyWord() {
		return fullStatement;
	}

	public String getLuckyWord() {
		return luckyWord;
	}

	public void setLuckyWord(String luckyWord) {
		this.luckyWord = luckyWord;
	}

	public String getPreamble() {
		return preamble;
	}

	public void setPreamble(String preamble) {
		this.preamble = preamble;
	}
}
