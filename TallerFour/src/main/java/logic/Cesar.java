package logic;

public class Cesar {

	public static String cesar(String texto, int opcion,int codigo) {
		
	    StringBuilder cifrado = new StringBuilder();
		codigo=codigo%26;
	      for (int i = 0; i < texto.length(); i++) {
			if (opcion == 0) {
				if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
					if ((texto.charAt(i) + codigo) > 'z') {
						cifrado.append((char) (texto.charAt(i) + codigo - 26));
					} else {
						cifrado.append((char) (texto.charAt(i) + codigo));
					}
				} else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
					if ((texto.charAt(i) + codigo) > 'Z') {
						cifrado.append((char) (texto.charAt(i) + codigo - 26));
					} else {
						cifrado.append((char) (texto.charAt(i) + codigo));
					}
				} else {
					cifrado.append(texto.charAt(i));
				}
	    	  }
			
			else{
		          if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
		                if ((texto.charAt(i) - codigo) < 'a') {
		                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
		                } else {
		                    cifrado.append((char) (texto.charAt(i) - codigo));
		                }
		            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
		                if ((texto.charAt(i) - codigo) < 'A') {
		                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
		                } else {
		                    cifrado.append((char) (texto.charAt(i) - codigo));
		                }
		            }else {
						cifrado.append(texto.charAt(i));
					}
			}
	      }
	      return cifrado.toString();
		
	}
}
