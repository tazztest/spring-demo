package info.solidsoft.training.jenkins.springdemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kubernetes")
public class KubernetesController {

    @GetMapping(value = "/status", produces = MediaType.TEXT_PLAIN_VALUE)
    public String status() {
        return System.getenv("KUBERNETES_SERVICE_HOST") != null ? "Welcome from Kubernetes!" : "Kubernetes not found :(";
    }
}
