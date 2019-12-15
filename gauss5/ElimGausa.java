package gauss5;

//Metoda Eliminacji Gaussa
//www.algorytm.org
 
import java.io.IOException;
 
public class ElimGausa {
 
public void oblicz(){
 
//rozmiar tablicy
int n=4;
 
//macierz do rozwiazania
//double macierz [][] = {{3, 1, 0},
 //                       {1, 2, -1},
 //                       {0, -1, 3}}; 
 
 
double macierz [][] = { {  3, -4,   4, -4},
                        {1.5, -1,   2, -2},
                        {1.5, -0.5, 0, -3}, 
                        {4.5, -5.5, 4, -9}};
 
//macierz wynikowa
double macWyn [][] = new double [macierz.length][macierz.length];
 
//kopiuj macierz do rozwiazania do macierzy wynikowej
for (int i = 0; i<macierz.length; i++)
for (int j = 0; j<macierz.length; j++)
macWyn[i][j]=macierz[i][j];
 
//wektor w wynikami
double wynik [] = {   -9,
                    -3.5, 
                      -2, 
                     -14};
 
//kopiuj wektor
double wCopy [] = new double [wynik.length];
for (int i=0; i<wynik.length; i++){
wCopy[i]=wynik[i];
}
 
//wyswietl  macierz do rozwiazania
for (int j = 0; j<n; j++){    
for (int k=0; k<n; k++){
System.out.print(macierz[j][k]+"\t");
}
System.out.println("");
}
System.out.println("");
 
//Metoda Eliminacji Gaussa
for (int i = 0; i<n-1; i++){
for (int j = i+1; j<=n-1; j++){
for (int k = 0; k<n; k++){
macWyn[j][k]=macierz[j][k]-(macierz[i][k]*(macierz[j][i]/macierz[i][i]));
}
 
wCopy[j]=wynik[j]-(wynik[i]*(macierz[j][i]/macierz[i][i]));               
 
for (int ii = 0; ii<macWyn.length; ii++){
for (int jj = 0; jj<macWyn.length; jj++){
macierz[ii][jj]=macWyn[ii][jj];                       
}
wynik[ii]=wCopy[ii];
}               
}           
}
 
//Wypisanie wyniku    
System.out.println("");       
System.out.println("");
for (int j = 0; j<n; j++){    
for (int k=0; k<n; k++){
System.out.print(macierz[j][k]+"\t");
}
System.out.println("\t"+wynik[j]);
}
}
};




//kazdy wieszkochek to jakas operacja
// kazdy wierzcholek to jakiz zboior lokow
//chemy przedstawic w postaci 2 tabel
/*wierzcholek mozna przedstawic wspolrzednymi, jest gdziesz okresolny wspolerzndymi j k 
        po kazdym wykonaniu jakiejs operacji jak zaczniemy zpaisywac jakis wspolrzedne j k i numer
                notowac jakie wartosci przyjmuja nasze i j k
                        
                        u nas autoamtycznie otrzymana zostatnie liczba wierzcholkow
                                
                                luk mozna opisac poprzez wierzcholek poczatkowy i wierzecholek koncowy
                                        
                                        zeby zrobic 2ga czesc musimy oddac pare procedur
                                                
                                                wygeneorwac liste lukow i liste wierzcholkow
                                                       mozna zrobic to jakas metoda z wykladow tego co jest co 2 tyg
                                                               
                                                               LISTA WIERZCHOKOW I LSITA LUKOW
                                                                       
                                                                       musimy zaprojektowac 2 metofy
                                                                               1 to rodzielic nasz program na niezlaezne gnaizda/proste
                                                                                       niewazne ile forow my mamy, ma byc pojedyncze cialo petli
                                                                                               dla takiego ciala rysujemy graf
                                                                                                       
                                                                                                       zlozone to for for for
                                                                                                               
                                                                                                               jak masz zlozone to masz rozbic na proste
                                                                                                                       ilosc wymiarow gnaizda zlezy od zmiennych jak jest for od i j k to jest 3wymairowe
                                                                                                                               (k1 u na to i, k2 u nat to j)
w naszym przykaldzie i=i i1=j i2=k
wystarczy dodac potrojna petle for
licnzik ktore byedzie wypluwal numerki wiercholkow






wCopy[j]=wynik[j]-(wynik[i]*(macierz[j][i]/macierz[i][i]));               
 
for (int ii = 0; ii<macWyn.length; ii++){
for (int jj = 0; jj<macWyn.length; jj++){
macierz[ii][jj]=macWyn[ii][jj];                       
}
wynik[ii]=wCopy[ii];
}               
}           
}
 
//Wypisanie wyniku    
System.out.println("");       
System.out.println("");
for (int j = 0; j<n; j++){    
    for (int k=0; k<n; k++){
        System.out.print(macierz[j][k]+"\t");
    }   
    System.out.println("\t"+wynik[j]);
}


}
}


*/
//i k j