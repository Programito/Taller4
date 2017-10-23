package logic;

import java.util.ArrayList;

public class SuperWord {

	private String word;
	
	public SuperWord(String Word){
		word=Word;
	}
	
	public ArrayList<Vocal> numberVocal(){
		ArrayList<Vocal> list= new ArrayList<>();
		int a,e,i,o,u;
		a=e=i=o=u=0;
		
		for(int j=0;j<word.length();j++){
			char c=word.charAt(j);
			
			switch (c) {
				case 'a': a++;
						break;
				case 'e':e++;
						break;
				case 'i':i++;
						break;
				case 'o':o++;
						break;
				case 'u':u++;
						break;
				case 'A': a++;
						break;
				case 'E':e++;
						break;
				case 'I':i++;
						break;
				case 'O':o++;
						break;
				case 'U':u++;
						break;
			}
	
		}
		if(a>0){
			list.add(new Vocal('a',a));
		}
		if(e>0){
			list.add(new Vocal('e',e));
		}
		if(i>0){
			list.add(new Vocal('i',i));
		}
		if(o>0){
			list.add(new Vocal('o',o));
		}
		if(u>0){
			list.add(new Vocal('u',u));
		}
		
		return list;
	}
	
	public boolean isPalindrom(){
	    int inc = 0;
	    String wordParcial="";
	    wordParcial=word.replace(" ","");
	    wordParcial=wordParcial.toLowerCase();
	    int des = wordParcial.length()-1;
	    boolean bError = false;
	    while ((inc<des) && (!bError)){
	        
	    	if (wordParcial.charAt(inc)==wordParcial.charAt(des)){				
	    		inc++;
	    		des--;
	    	} else {
	    		bError = true;
	    	}
	    }
	    
	    return !bError;
	}
	
	public String reflect(){
		String refl="";
		for(int i=word.length()-1;i>=0;i--){
			refl=refl+word.charAt(i);
		}
		return refl;
	}
	
	//Clase interna
	public static class Vocal{
		final private char c;
		final private int number;
		
		public Vocal (char c,int number){
			this.c= c;
			this.number=number;
		}
		
		public int getNumber(){
			return number;
		}
		
		public char getC(){
			return c;
		}
	}
}
