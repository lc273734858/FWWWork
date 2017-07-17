package FWW.com.RibbonConsumer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
//    	System.out.println(name);
        return restTemplate.getForObject("http://HiService/hi?name="+name,String.class);
    }
    public String hiError(String name) {
        return "sorry,"+name+",the service was busy!";
    }
}
