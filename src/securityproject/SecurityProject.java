package securityproject;



import java.math.BigInteger;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SecurityProject {
//initialize
BigInteger pmath,qmath,nmath,zmath,Emath,dmath,plainmath,c;
static ArrayList<Character>  alphabetic =new ArrayList();
static ArrayList<Character> notInAlpha = new ArrayList<>();
StringBuilder cipher = new StringBuilder();
StringBuilder notInAlph ;
int plain;
String[] splitter;

    public SecurityProject(String p,String q,String e) {
      pmath = new BigInteger(p); 
     qmath = new BigInteger(q);
     Emath = new BigInteger(e);
     
    }

    public SecurityProject() {
    }

//get language from user      
    void getalphabet(){
        String whatuserentered = JOptionPane.showInputDialog("Entrer votre alphabet");
       /*whatuserentered.replace("a", "");
       whatuserentered.replace("m", "");
       whatuserentered.replace("n", "");*/
         for(int i=0;i<whatuserentered.length();i++){
           alphabetic.add(whatuserentered.charAt(i));
        }
        System.out.println(alphabetic.size());
    }

//get values    
    public void check(){
         if(pmath.gcd(qmath).intValue()==1&&pmath.isProbablePrime(2)&&qmath.isProbablePrime(2)){
           nmath = pmath.multiply(qmath);
           zmath = pmath.subtract(BigInteger.ONE).multiply(qmath.subtract(BigInteger.ONE));
           /*Emath = new BigInteger("4");
           while(Emath.gcd(zmath).intValue()!=1){
               Emath = Emath.add(new BigInteger("1"));
           }*/
           dmath = Emath.modInverse(zmath);
           
       } 
      if(Emath.equals(dmath)){
              dmath = dmath.add(zmath);
              dmath = dmath.mod(nmath);
               System.out.println(dmath);
           }
        System.out.println(nmath+"   "+zmath+"   "+Emath+"   "+dmath);
    }
    
 
    void getMessageandEncrypt(String message){ 
        for(int y=0;y<message.length();y++){
            if(!alphabetic.contains(message.charAt(y))){
                notInAlpha.add(message.charAt(y));
            }else{
           plain = alphabetic.indexOf(message.charAt(y));
            System.out.println(plain);
            plainmath = new BigInteger(String.valueOf(plain));
            c = plainmath.modPow(Emath, nmath);
            cipher.append(c).append(" ");
            }
        }
        if(notInAlpha.size()>0){
            notInAlph = new StringBuilder();
            for(int x=0;x<notInAlpha.size();x++){
                notInAlph.append(notInAlpha.get(x)).append(",");
            }
            JOptionPane.showMessageDialog(new design(), "ces caractère ne sont pas de lalphabet "+notInAlph);
        }
    }
          

   void getMessageandDecrypt(String message){
    splitter = message.split(" ");
    for (String splitter1 : splitter) {
        // plain = alphabetic.indexOf(message.charAt(y));
        //  System.out.println(plain);
        plainmath = new BigInteger(splitter1);
        c = plainmath.modPow(dmath, nmath);
        
        cipher.append(alphabetic.get(c.intValue()));
    }
    }
    
    public static void main(String[] args) {
       
    }
    
    
}
