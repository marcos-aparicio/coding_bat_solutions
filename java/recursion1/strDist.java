/*
 *
Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.


strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
 *
 *
 */

public int strDist(String str, String sub) {
  
 if(!str.contains(sub) ) return 0;
 
 if( !str.startsWith(sub) ) str = str.substring(1);
 
 if( !str.endsWith(sub) ) str = str.substring(0,str.length()-1);
  
 if( str.startsWith(sub) && str.endsWith(sub) ) return str.length();

 return strDist(str,sub);
  
}
