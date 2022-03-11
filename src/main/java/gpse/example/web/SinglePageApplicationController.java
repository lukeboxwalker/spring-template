package gpse.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Responsible for serving the SPA.
 * <p>
 * Serves the single page application (the vue frontend).
 */
@Controller
public class SinglePageApplicationController {

    /**
     * Redirects neccacery routes to frontend.
     * <p>
     * Redirects all routes not starting with '/api' to the frontend index.html.
     * Explicitly excludes '/index.html' to avoid self looping callback.
     * <p>
     * Other backend routes not starting with '/api' can be added by expanding the
     * regex. Example: if there are backend routes needed starting with '/rest' this would
     * result in a regex '{_:^(?!index\.html|api|rest).*$}'.
     *
     * @return forwarding route '/' which results in serving frontend index.html
     * located under classpath:public/index.html (resources/public/index.html).
     */
    @RequestMapping("{_:^(?!index\\.html|api).*$}")
    public String redirect() {
        return "forward:/";
    }
}
