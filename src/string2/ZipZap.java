package string2;

public class ZipZap {
	
	
	public String zipZap(String str) {
		   if(str.length()<3){
				    return str;
				  }
				  StringBuilder strb = new StringBuilder();
				  for(int i=0; i<str.length();i++){
				    if(i<str.length()-2){
				        String cstr = str.substring(i,i+3);
				        if(cstr.charAt(0)=='z' && cstr.charAt(2)=='p'){
				          strb.append("zp");
				          i = i+2;
				          //str = strb.toString().concat(str.substring(i+3));
				          //System.out.println(i+str);
				          if(i==str.length()-2){
				            break;
				          }
				        }
				        else{
				          strb.append(String.valueOf(str.charAt(i)));
				        }
				      }
				      else{
				        strb.append(String.valueOf(str.charAt(i)));
				      }
				    }
				  return strb.toString();
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZipZap o =new ZipZap();
		System.out.println(o.zipZap("zipXzap"));
	}

}
