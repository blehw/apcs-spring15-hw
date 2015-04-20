import java.io.*;
import java.util.*;

public class Node {
    private int x,y;
    private Node prev;
    private int exitX,exitY;
    private int priority;
    private int aPriority;
    private int stepsSoFar;

    public Node(int x, int y){
	this.x = x;
	this.y = y;
    }
    /*	
    public Node(int x, int y, int exitX, int exitY){
	this.x = x;
	this.y = y;
	this.exitX = exitX;
	this.exitY = exitY;
	priority = ((x - exitX) * (x - exitX)) + ((y - exitY) * (y - exitY));
    }
    */
    public Node(int x, int y, int exitX, int exitY){
	this.x = x;
	this.y = y;
	this.exitX = exitX;
	this.exitY = exitY;
	priority = ((x - exitX) * (x - exitX)) + ((y - exitY) * (y - exitY)) 
	    + stepsSoFar;
    }

    public void addSteps() {
	stepsSoFar++;
    }

    public Node getPrev() {
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }
		
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public int getPriority() {
	return priority;
    }
		
}










