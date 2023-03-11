/*NIM  : 13020210231
  NAMA : INDRIANA TAIB
  SELASA, 7 MARET 2023
 */
package oper4;
public class Oper4 {
int i; 
int j;
  
    public static void main(String[] args) {
int i = 10; 
int j = 20;

char c = 8; char d = 10;
int e = (((int)c > (int)d) ? c: d);
int k = ((i>j) ? i: j);

System.out.print ("Nilai e = "+ e); 
System.out.print ("\nNilai k = "+ k); 
i = 2;
j = 3;
k = ((i++>j++) ? i: j) ;
System.out.print ("\nNilai k = "+ k);
    }
    
}
