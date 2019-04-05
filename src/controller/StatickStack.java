package controller;

public class StatickStack {
	public Object[] pilha;
	public int topo;
	/* Método Construtor */
	public StatickStack(int n) {
	this.topo = -1;
	this.pilha = new Object[n];
	}

	public boolean isEmpty() {
		if (this.topo == -1) {
		return true;
		}
		return false;
		}
	public boolean isFull() {
		if (pilha.length == topo + 1) {
		return true;
		}
		return false;
		}
	public int getSize() {
		return this.topo + 1;
		}
	public Object showTop() {
		if (this.isEmpty()) {
		return null;
		}
		return this.pilha[this.topo];
		}
	public void empilhar(Object element) {
		// push
		if (this.topo < this.pilha.length - 1) {
		this.pilha[++topo] = element;
		}
		}
	public Object desempilhar() {
		// pop
		if (isEmpty()) {
		return null;
		}
		return this.pilha[this.topo--];
		}
	
}
