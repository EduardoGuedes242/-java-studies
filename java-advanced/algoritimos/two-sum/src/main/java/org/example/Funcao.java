package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Funcao {
  public int[] twoSum(int[] nums, int target) {
    int[] indecesEcontrados = new int[2];
    for(int i = 0; i < nums.length; i++)
    {
      for (int j = 0; j < nums.length; j++) {
        if(i != j && nums[i] + nums[j] == target)
        {
          indecesEcontrados[0] = i;
          indecesEcontrados[1] = j;
          System.out.println("A soma dos indeces [" + indecesEcontrados[0] + "," + indecesEcontrados[1] + "] é igual: " + target);
          return indecesEcontrados;
        }
      }
    }
    return null;
  }
}
