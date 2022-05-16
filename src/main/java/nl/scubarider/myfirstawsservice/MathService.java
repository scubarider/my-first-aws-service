package nl.scubarider.myfirstawsservice;

import org.springframework.stereotype.Service;

@Service
public class MathService {
  public Result doAddition(int i1, int i2) {
    return new Result(i1 + i2, "addition success");
  }
}
