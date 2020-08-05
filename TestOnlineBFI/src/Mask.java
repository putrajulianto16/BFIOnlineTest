
public class Mask {
	public Object mask(String original) {
		// TODO Auto-generated method stub
		String returnWord = "";
		String replaced = "*";
		String spacing="";
		
		//Split word
		String[] arrayOriginal = original.split(" ");
		
		
		for(String word : arrayOriginal){
			//check kata lebih dari 2
			if(word.length()>2){
				String wordMasked = "";
				for (int j = 0; j < word.length(); j++) {
					//check apakah kata pertama/terakhir
		            if (j == 0 || j == word.length()-1 ) {
		            	//tidak mengganti kata
		            	wordMasked += word.charAt(j);
		            }else{
		            	//replace kata
		            	wordMasked += replaced;
		            }
		        }
		         returnWord+=spacing+wordMasked;   
			}else{
				returnWord +=spacing+ word;
			}
			//adding space for the next word
			spacing = " ";
		}
		return returnWord;
	}

}
