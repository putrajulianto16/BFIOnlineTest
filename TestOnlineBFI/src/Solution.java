import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
  public Object solution(Integer[] a) {
	Integer returnNumber = 0;
	List<Integer> listNegative = new ArrayList<Integer>();  
	//mengumpulkan bilangan negatif
	for(Integer dataNumber : a){
		if(dataNumber < 0){
			listNegative.add(dataNumber);
		}
	}
	
	//pengecekan dari negatif terbesar
	if(!listNegative.isEmpty()){
		Integer param = -1;
		while(returnNumber == 0){
			if(!listNegative.contains(param)){
				returnNumber = param;
			}
			param--;
		}
	}else{
		returnNumber = -1;
	}
	
	return returnNumber;
    // write the solution
  }
}
