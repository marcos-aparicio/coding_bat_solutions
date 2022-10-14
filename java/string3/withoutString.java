/*
 *
 *
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".


withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
 *
 *
 */
public String withoutString(String base, String remove) {
  remove = remove.toLowerCase();
  String result = "";
  
  for(int a = 0; a<base.length(); a++){
    
    result += base.charAt(a);
    
    if( a-1>=base.length()-remove.length() ) continue;
    
    String toRemove = base.substring(a,a+remove.length() ).toLowerCase();
    
    if(!toRemove.equals(remove) ) continue;
    
    a += remove.length()-1;
    result = result.substring(0,result.length()-1);
   
  }
  
  return result;
  
}

