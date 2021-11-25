package Capitulo_3.ejercicios;

public class Ejercicios_for_tarea_bucles_2 {

	public static void main(String[] args) {
int num = 0 , m = 0;

do {
	num++;
	m= 0;
	while(m<10) {
		m++;
		System.out.println(num + " * " + m + " = " +(num*m));
	}

	}
while(num<15);
}
}