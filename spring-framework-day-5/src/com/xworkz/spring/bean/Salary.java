package com.xworkz.spring.bean;

public class Salary {

	private double gross;

	private double net;

	private double pt;

	private double pf;

	private double bonus;

	private double hra;

	private double ot;

	private double variable;

	public Salary() {
		System.out.println(getClass().getSimpleName());
	}

	public Salary(double gross, double net, double pt, double pf, double bonus, double hra, double ot,
			double variable) {
		super();
		this.gross = gross;
		this.net = net;
		this.pt = pt;
		this.pf = pf;
		this.bonus = bonus;
		this.hra = hra;
		this.ot = ot;
		this.variable = variable;
	}

	@Override
	public String toString() {
		return "Salary [gross=" + gross + ", net=" + net + ", pt=" + pt + ", pf=" + pf + ", bonus=" + bonus + ", hra="
				+ hra + ", ot=" + ot + ", variable=" + variable + "]";
	}

}
