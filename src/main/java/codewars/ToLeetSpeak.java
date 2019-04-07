package codewars;

public class ToLeetSpeak {
    static String toLeetSpeak(final String speak) {


       char znak ;
       String answer="";
       for (int i =0; i <speak.length();i++){
       switch (speak.toCharArray()[i])

           {
              case 'A' :

                  answer+='@' ;

              break;
               case       'B' :
                   answer+='8'; break;
               case   'C' :
                   answer+='('; break;
               case    'D' :
                   answer+='D'; break;
               case    'E' :
                   answer+= '3'; break;
               case  'F' :
                   answer+='F'; break;
               case    'G' :
                   answer+= '6'; break;
               case    'H' :
                   answer+= '#'; break;
               case   'I' :
                   answer+= '!'; break;
               case   'J' :
                   answer+= 'J'; break;
               case    'K' :
                   answer+='K'; break;
               case    'L' :
                   answer+= '1'; break;
               case    'M' :
                   answer+= 'M'; break;
               case    'N' :
                   answer+= 'N'; break;
               case    'O' :
                   answer+= '0'; break;
               case    'P' :
                   answer+= 'P'; break;
               case     'Q' :
                   answer+= 'Q'; break;
               case    'R' :
                   answer+= 'R'; break;
               case    'S' :
                   answer+= '$'; break;
               case    'T' :
                   answer+= '7'; break;
               case     'U' :
                   answer+= 'U'; break;
               case    'V' :
                   answer+= 'V'; break;
               case     'W' :
                   answer+= 'W'; break;
               case     'X' :
                   answer+= 'X'; break;
               case     'Y' :
                   answer+= 'Y'; break;
               case     'Z' :
                   answer+= '2'; break;
                   default: answer+=speak.toCharArray()[i];
           }


       }


        return answer;
    }
}
