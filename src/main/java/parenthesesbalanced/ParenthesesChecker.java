package parenthesesbalanced;

import java.util.Stack;

/*
Zadanie
The goal is to implement the areParenthesesBalanced function with an efficient algorithm that checks
if the parentheses in the input string are balanced. Keep in mind different types of parentheses ('(', ')', '{', '}', '[', ']') must be properly nested.

Rozwiazanie:
Kluczem jest analiza w ktorej zostanie odkryta regula (reguly)
Nastepnie mozna zadac pytanie: jaka struktura (struktury) danych moga byc pomocnicze w rozwiazaniu?

Rozwiazanie sklada sie wiec z dwoch etapow:
1. Etap analityczny -  Analiza najprostszych nietrywialnych przypadkow danych wejsciowych w celu odkrycia kluczowej reguly (regul)
    Strategie:
        analiza przypadkow dla ktorych algorytm ma zwrocic wartosc A (np. True gdy nawiasowanie jest poprawne)
        analiza przypadkow dla ktorych algorytm ma zwrocic wartosc B (np. False gdy nawiasowanie jest niepoprawne)

   Wynikiem powinien byc scisly opis reguly (regul) w jezyku naturalnym i / albo jako funkcja rekurencyjna

2. Etap kostruktywny
   Pomocnicze pytania:
   Jak wykorzystac pamiec (zmienne, tablice, struktury danych) do implementacji rozwiazania aby zlozonosc czasowa byla jak najepsza?
   Jaka strukture danych mozna wykorzystac?
        Jakie w ogole sa struktury danych? (Stos, Kolejka, kopiec (kolejka priorytetowa), HashSet, TreeSet, HashMap, LinkedHashMap, TreeMap

() - true
([]) - true
{{}}[(())]
[(){}]
Kluczowe spostrzezenie:
Zastanowmy sie jaka jest kluczowa regula w dowolnym wyrazeniu, w ktorym jest poprawne nawiasowanie.
    W kazdym takim wyrazeniu, na pewnym poziomie musi wystapic podwyrazenie najprostsze np. "()", "[]", albo "{}"
    W najbardziej zagniezdzonym podwyrazeniu (np. w "{}" ktore jest podwyrazeniem "[(){}]")  jesli zostal przeczytany nawias zamykajacy, to wczesniej przeczytany nawias musial
        byc otwierajacy - odpowiadajacy wlasnie przeczytanemu nawiasowi zamykajacemu

   Scislej, kazde poprawne wyrazenie mozna opisac rekurencyjnie:
   W = W1W2...Wn    gdzie n>=1
   Wi = OWZ     gdzie O i Z to odpowiednie nawiasy np. O={ i Z=}   albo    O=[  i  Z=]

Jaka strukture danych mozna wykorzystac do spamietywania "historii" nawiasow otwierajacych?
    Stos
 */
public class ParenthesesChecker {
    public static boolean areParenthesesBalanced(String s) {
        Stack<Character> st = new Stack<Character>();

        for(char c : s.toCharArray()) {
            if(c == '[' || c == '(' || c == '{') {
                st.push(c);
            } else if (c == ']') {
                if(st.empty()) {
                    return false;
                }
                Character c2 = st.pop();
                if(c2.charValue() != '[') {
                    return false;
                }
            }
            else if (c == ')') {
                if(st.empty()) {
                    return false;
                }
                Character c2 = st.pop();
                if(c2.charValue() != '(') {
                    return false;
                }
            }
            else if (c == '}') {
                if(st.empty()) {
                    return false;
                }
                Character c2 = st.pop();
                if(c2.charValue() != '{') {
                    return false;
                }
            }
        }

        return st.empty();
    }

}