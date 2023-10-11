package com.example.robot;

public class Robot {
	private int orientation;
	private int abs;
	private int ord;
	private int Num;

	private static int Count;

	public Robot(int orientation, int abs, int ord) {
		this.orientation = orientation;
		this.abs = abs;
		this.ord = ord;
		Robot.Count++;
		this.Num=Robot.Count;
	}

	public int getOrientation() {
		return this.orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}

	public int getAbs() {
		return this.abs;
	}

	public void setAbs(int abs) {
		this.abs = abs;
	}

	public int getOrd() {
		return this.ord;
	}

	public void setOrd(int ord) {
		this.ord = ord;
	}

	public int getNum() {
		return this.Num;
	}

	public static int getCount(){
		return Robot.Count;
	}

	@Override
	public String toString() {
		return "{" +
			" orientation='" + getOrientation() + "'" +
			", abs='" + getAbs() + "'" +
			", ord='" + getOrd() + "'" +
			", Num='" + getNum() + "'" +
			"}";
	}

	public void Avancer(){
		Avancer(1);
	}

	public void Avancer(int a){
			switch (this.getOrientation()) {
			case 1:
				this.abs+=a;
				break;
				
				case 2:
				this.ord+=a;
				break;
				
				case 3:
				this.abs-=a;
				
				break;
				
				case 4:
				this.ord-=a;
				break;
		
			default:
				break;
		}
	}

	public void Tourner(int x){
		int direction = this.getOrientation() +  x % 4;
		
		if(direction > 4){
			direction-=4;
		}
		
		this.orientation = direction;
	}

	public void Affiche(){
		System.out.println(this);
	}

}
