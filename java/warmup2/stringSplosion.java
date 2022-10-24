/*
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/
public String stringSplosion(String str) {
  String result = "";
  for(int a = 0;a<str.length();a++){
    result += str.substring(0,a+1);
  }

  return result;
}

