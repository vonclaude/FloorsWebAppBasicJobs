package floorswebappjobs;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by vonclaude on 4/22/2017.
 */

@RestController
public class JobController {

    @CrossOrigin(origins = "*")
    @GetMapping("/job")
    public String parseQuery(@RequestParam(required=false) String job) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        System.out.println(job);

        String jobReference = "floorswebappjobs." + job.substring(0, 1).toUpperCase() + job.substring(1).toLowerCase();

        Class<Job> requestedJobClass = (Class<Job>) Class.forName(jobReference);
        Constructor<Job> requestedJobConstructor = requestedJobClass.getConstructor();
        Job requestedJob = requestedJobConstructor.newInstance();

        return requestedJob.convertToJSON();
    }
}
