package nl.scubarider.myfirstawsservice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {
  private int mathResult;
  private String message;

  public Result(int mathResult, String message) {
    this.mathResult = mathResult;
    this.message = message;
  }
}