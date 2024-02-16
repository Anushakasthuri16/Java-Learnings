package com.example.spring.SpringAutoWiring;

public class car {
	Engine eng;

	public car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public car(Engine eng) {
		super();
		this.eng = eng;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "car [eng=" + eng + "]";
	}
	

}
