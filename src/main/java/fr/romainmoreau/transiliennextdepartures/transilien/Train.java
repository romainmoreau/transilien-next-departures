package fr.romainmoreau.transiliennextdepartures.transilien;

import javax.xml.bind.annotation.XmlElement;

public class Train {
	private Date date;

	private String num;

	private String miss;

	private String term;

	private Etat etat;

	@XmlElement(required = true)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@XmlElement(required = true)
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@XmlElement(required = true)
	public String getMiss() {
		return miss;
	}

	public void setMiss(String miss) {
		this.miss = miss;
	}

	@XmlElement(required = false)
	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	@XmlElement(required = false)
	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}
}
