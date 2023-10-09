package jp.co.samples;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  @Test
  public void BothNaturalNumber() {
    
    int result = Calculator.absAdd(3, 5);
    
    assertThat(result, is(8));
    
  }
  
  @Test
  public void OnlyAIsNaturalNumber() {
    
    int result = Calculator.absAdd(3, -2);
    
    assertThat(result, is(5));
    
  }
}