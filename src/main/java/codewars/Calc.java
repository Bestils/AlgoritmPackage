package codewars;

import java.util.LinkedList;
import java.util.Stack;

public class Calc {

    public double evaluate(String expr) {
        boolean stan=true;
        if (expr.isEmpty()){
            return 0;
        }

        Stack<Double> liczby = new Stack<Double>();

   for(int i=0;i<expr.length();i++)
        {

if (expr.charAt(i)==' '){
    System.out.println(expr.indexOf(i));
    stan=true;
    continue;}
if (expr.charAt(i)=='+'||expr.charAt(i)=='*'||expr.charAt(i)=='-'||expr.charAt(i)=='/'||expr.charAt(i)=='.'){

    switch (expr.charAt(i)){
        case '-':
            double zmienna3 = liczby.pop();
            double zmienna4 = liczby.pop();
            liczby.push(zmienna4-zmienna3);
            break;
        case '+':
            liczby.push(liczby.pop()+liczby.pop());
            break;
        case '/':

            double zmienna1 = liczby.pop();
            double zmienna2 = liczby.pop();
            liczby.push(zmienna2/zmienna1);
            break;
        case '*':
            liczby.push(liczby.pop()*liczby.pop());
            break;
        case '.':
            double reszta =(Double.parseDouble(String.valueOf(expr.charAt(i+1))))/10.0;
            liczby.push(liczby.pop()+reszta);
            i++;
            break;


    }

}
else
{
    if (stan){
        liczby.push(new Double(Double.parseDouble(String.valueOf(expr.charAt(i)))));
    stan=false;
}
else {
        liczby.push(new Double(liczby.pop()*10+Double.parseDouble(String.valueOf(expr.charAt(i)))));
        stan=false;
    }

}

        }
        return liczby.pop();
    }
}