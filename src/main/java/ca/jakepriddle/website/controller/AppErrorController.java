package ca.jakepriddle.website.controller;

import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
class AppErrorController implements ErrorController {


  public AppErrorController(ErrorAttributes errorAttributes) {
  }

  @GetMapping("/error")
  public String index() {
    return "404";
  }
}