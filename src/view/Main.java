package view;

import br.edu.fateczl.lista.listaObj.Lista;
import br.edu.fateczl.pilhaint.*;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();

		try {
			lista.addFirst(10); // pos 0
			lista.addLast(5); // pos 1
			lista.addLast(8); // pos 2
			lista.addLast(1); // pos 3
			lista.addLast(9); // pos 4
			lista.addLast(2); // pos 5
			lista.addLast(4); // pos 6
			lista.addLast(7); // pos 7
			lista.addLast(3); // pos 8
			lista.addLast(6); // pos 9

			for (int i = 0; i < 10; i++) {
				int v = (int) lista.get(i);
				System.out.print(v + " -> ");
			}
			System.out.print("null\n");

			Lista listaOrdenada = new Lista();
			Pilha pilha = new Pilha();

			pilha.push((int) lista.get(3));
			pilha.push((int) lista.get(5));
			pilha.push((int) lista.get(8));
			pilha.push((int) lista.get(6));
			pilha.push((int) lista.get(1));
			pilha.push((int) lista.get(9));
			pilha.push((int) lista.get(7));
			pilha.push((int) lista.get(2));
			pilha.push((int) lista.get(4));
			pilha.push((int) lista.get(0));

			while (!pilha.isEmpty()) {
				int v = pilha.pop();
				listaOrdenada.addFirst(v);
			}

			for (int i = 0; i < 10; i++) {
				int v = (int) listaOrdenada.get(i);
				System.out.print(v + " -> ");
			}
			System.out.print("null\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
