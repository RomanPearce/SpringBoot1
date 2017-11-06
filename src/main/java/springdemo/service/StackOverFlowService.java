package springdemo.service;

import org.springframework.stereotype.Service;
import springdemo.model.StackoverflowWebsite;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackOverFlowService {
    private static List<StackoverflowWebsite> items = new ArrayList<>();

    static {
        items.add(new StackoverflowWebsite("stackoverflow", "https://stackoverflow.com",
                "https://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico",
                "1", "1"));
        items.add(new StackoverflowWebsite("Android Enthusiasts", "https://android.stackexchange.com",
                "https://cdn.sstatic.net/Sites/android/img/favicon.ico",
                "1", "1"));
        items.add(new StackoverflowWebsite("apple", "https://stackoverflow.com",
                "https://cdn.sstatic.net/Sites/apple/img/favicon.ico",
                "1", "1"));
    }

    public List<StackoverflowWebsite> findAll() {
        return items;
    }
}
