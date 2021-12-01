
public class Ex3 {


    public static void main(String[] args) {

        String s= "054210411";
        String takin= telNum(s);
        System.out.println("correct= "+takin);

    }

    public static String telNum (String tel){
        String kidomet= "05";
        String rest = "";
        char c;
        if(tel.length() == 10){
            if (tel.charAt(0)!='0' || tel.charAt(1)!='5')
                return "";
            for (int i = 2; i < tel.length(); i++) {
                c= tel.charAt(i);
                if (c<'0' || c>'9')
                    return "";
                else{
                    if (i<3)
                        kidomet = kidomet + c;
                    else
                        rest= rest+c;
                }
            }

            return kidomet+"-"+rest;
        }

        else if (tel.length() == 11){
            if (tel.charAt(0)!='0' || tel.charAt(1)!='5')
                return "";
            for (int i = 2; i < tel.length(); i++) {
                c= tel.charAt(i);
                if(i==3){
                    if(c!='-')
                        return "";
                }
                else{
                    if (c<'0' || c>'9')
                        return "";
                }
            }
            return tel;
        }

        else if (tel.length() == 12){
            if (tel.charAt(0)!='9' || tel.charAt(1)!='7'|| tel.charAt(2)!='2'|| tel.charAt(3)!='5')
                return "";
            for (int i = 4; i < tel.length(); i++) {
                c= tel.charAt(i);
                if (c<'0' || c>'9')
                    return "";
                else{
                    if (i<5)
                        kidomet = kidomet + c;
                    else
                        rest= rest+c;
                }
            }
            return kidomet+"-"+rest;
        }

        else
            return "";
    }
}
