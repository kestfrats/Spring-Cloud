package demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.domain.Word;

@FeignClient(name = "SUBJECT")
public interface SubjectClient {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Word getWord();
}
