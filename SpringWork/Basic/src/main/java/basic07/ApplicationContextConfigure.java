package basic07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextConfigure {
	
	@Bean
	public MessageBean getMessageKr() {
		MessageBeanKr kr = new MessageBeanKr();
		kr.setAge(20);
		kr.setName("순자");
		kr.setOutputter(output());
		return kr;
	}
	
	@Bean
	public MessageBean getMessageEn() {
		MessageBeanEn en = new MessageBeanEn();
		en.setAge(20);
		en.setName("SZ");
		en.setOutputter(output());
		return en;
	}
	
	@Bean
	public Outputter output() {
		return new FileOutputter();
	}
}
