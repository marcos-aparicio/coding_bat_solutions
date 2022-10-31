/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"

*/
public String stringYak(String str) {
  String newS = "";
  for(int a = 0; a < str.length(); a++){
    
    if(a<str.length()-2&& str.charAt(a)=='y' && str.charAt(a+2)=='k'){
      a+= 2;
      continue;
    }
    
    newS += str.charAt(a);
    
  }
  return newS;
}

