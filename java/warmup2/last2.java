/*
 *
 *

Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 *
 * /
public int last2(String str) {
  if(str.length()<2) return 0;
  
  int count = 0;
  String last2 = str.substring(str.length()-2);
  
  
  for(int a = 0; a<str.length()-2; a++){

    if(str.substring(a,a+2).equals(last2) ) count+=1;

  }

  return count;
}
