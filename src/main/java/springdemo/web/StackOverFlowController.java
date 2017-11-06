package springdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springdemo.model.StackoverflowWebsite;
import springdemo.service.StackOverFlowService;

import java.util.List;

@RestController
@RequestMapping("/api/stackoverflow")
public class StackOverFlowController {
    @Autowired
    private StackOverFlowService stackOverFlowService;

    @RequestMapping
    public List<StackoverflowWebsite> getListOfProviders() {
        return stackOverFlowService.findAll();
    }

}
