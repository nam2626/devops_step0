package kr.koreatect.devops_step0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @RequestMapping("/")
  public String index() {
    return "index.html";
  }
}
