package nl.scubarider.myfirstawsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @Autowired
  private MathService mathService;

  @PostMapping("/")
  public Result getAdditionResult(@RequestParam(name="i1") int i1, @RequestParam(name="i2") int i2){
    return mathService.doAddition(i1, i2);
  }
}
