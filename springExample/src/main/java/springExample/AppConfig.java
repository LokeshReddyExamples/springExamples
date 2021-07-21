package springExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="dataBean")
	public DataAccessBean getDataAccess() {
		return new DataAccessBean();
	}
	
	
	
	

}
